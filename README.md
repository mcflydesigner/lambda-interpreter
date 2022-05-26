# lambda-interpreter
Interpreter and type checker for our "nk" lambda language :)

Our language syntax and semantics are going to be similar to functional language.
The syntax of our language is not obvious at some moments, but we inspired by lambda calculus in our design 
and hope that future developers will encourage with this interesting solutions.

## Important links
* Documentation for grammar is available [./bnf/doc/hardtyped.pdf](./bnf/doc/hardtyped.pdf).
* Documentation for the project is available [./docs/nk_language.pdf](./docs/nk_language.pdf).

## Pre-requirements: 
* JDK - 17 (language level 17)
* Maven - 3.6.3
* BNFC - 2.9.4
* Latexmk - 4.77(or latest)

## How to build?
1) Clone project and open the folder with it
2) Run bash script in your terminal `build_project.sh`:
```shell=bash
./build_project.sh
```
3) Create a file with your extension ```test.nk```, and write your program there.
4) Run your program in the terminal(passing the last argument as path to your file with program):
```shell=bash
java -jar ./target/lambda-interpreter-1.0-SNAPSHOT-jar-with-dependencies.jar ./test.nk
```

## List of features:
* Type Checker
* Base Types (integer, real, boolean, string, unit)
* User-defined Terms and Types (records and type aliases)
* Standard Library (std, math)
* First-class functions (anonymous functions)
* Nested Definitions (nested functions, local variables)
* Simple Constraint-Based Type Inference (e.g. support auto types)
* Functions with multiple (but fixed amount) arguments
* General Recursion
* Simple modules and imports 
* Records 
* Subtyping (Any type)

## Examples:

### User types
```shell=bash
// Alias for record with 3 keys x1, x2 and x3
lettype Vector3d = {x1: Real, x2: Real, x3: Real};

// Alias for basic type real
lettype Money = Real; 

// Function that takes Int as an argument and returns string as a result
lettype IntToStringFunc = (Int -> String);
```

### Variable declarations
```shell=bash
-| "std";

let n: Int = 5;
let r: Real = 10.5;
let b: Boolean = true;
let s: String = "Simple string";
let x: Int = 10 in 100 + x;
let u: Unit = print (s);
```

### Type inference
```shell=bash
-| "std";

// Type of x is Int
let x = 5 + 1;

// Type of y is Real
let y = 5.0 + intToReal(2);
```

### Expressions
```shell=bash
let x = 5 + 5; // 10
let y = (true and false) or true; // true
let z = (2 + 2) * 2; // 8
let k = (10 >= 6) and (2 == 3); // false
```

### Modules and Imports

You can import any modules in any scope, all global definitions from the 
specified file will be available automatically inside your program file. 
For it just use construction ```*-| "modulename"```.

```shell=bash
-| "std";

let f = /\ x: Real. {
    -| "math";
    print(sqrt(x));
};

f(4.0); // Outputs: 2.0
// However, if you try to call sqrt() here, the error will be raised.
// sqrt(4.0);
```

For now, you may only import libraries(\emph{std, math}), but we have an interesting thing. 
Our modules may be written using Java language via following the contract defined by our API. 
To know more about it, please, visit the package *com.interpreter.shared.libs* in the source files of the project.

### Records
```shell=bash
-| "std";

lettype Vector3d = {x1: Real, x2: Real, x3: Real};
// Defining record
let v: Vector3d = {x1=1.1, x2=2.2, x3=3.3};
let r = v.x1;

// Output:
// 3.3
print (v.x3);

lettype NestedRecord = {x1:{a:Int, b:Int}, x2:Int, x3:Int};
let n: NestedRecord = {x1 = {a = 1, b = 2} , x2 = 2 , x3 = 3};

print(n.x1.a); // Output: 1
```

### Functions

The simplest function:
```shell=bash
let id = /\ x:Any.{
    x;
};
```

In addition, when you define a function, its outer context(all scopes) is captured. 
When you invoke it, then this context will be used. It is done for state-safe programming approach 
to disallow developers to see unexpected behaviour.

Correct example:
```shell=bash
-| "std";

let m = 5;
let f = /\ x: Unit. {
print(m);
};

f(unit); // Output: 5
```

Incorrect example:
```shell=bash
-| "std";

let f = /\ x: Unit. {
print(m);
};

let m = 5;
f(unit); // Error: m is not declared in the scope
```

#### Nested functions

This is the function that is defined within another function and can be used only 
inside of inner function. If you want to define nested function you should use let in construction, 
because you need to define this function in local scope:

```shell=bash
-| "std";
    
// Output:
// S
// S
/\ x: String. {
    let nested_func = /\ y: String. {
        print (y);
    } in nested_func (x);
    print (x);
} ("S");
```

#### First-class functions

You may pass function as argument to another function, return them as the values from other functions, 
and assign them to variables.

```shell=bash
-| "std";

let first_class_function = /\ x: String. {
    /\ y: String. {
       print (x + y);
    };
};
let result_function = first_class_function ("Hello, ");
result_function ("World!");
// Output:
// "Hello, World!"
```

#### Recursive Functions

For this kind of function we need to use special construction *letrec*, instead of just *let*. 
Another significant moment of recursive functions is that it is mandatory to define the returned 
type of such function, since we do not support recursive types. In addition, an attempt to 
use of *let* construction for the recursion, you will get error showing your function is not declared in the scope.

```shell=bash
-| "std";

letrec factorial =
/\ n: Int. {
    |  (n == 1): n
    |:  n * factorial (n-1);
} -> Int;

print(factorial(3)); // Output: 6
```

### Subtyping

The following function accepts argument that has type *Any*. Then we can pass inside it all types that inherited 
from it. It is important to note that all types are inherited from *Any* by default.

```shell=bash
-| "std";
-| "math";

lettype Vector3d = {x1: Real, x2: Real, x3: Real};

let length3d = /\ v: Vector3d. {
    // Output: 2.5605261936270534
    print(sqrt (sqrt (v.x1) + (sqrt (v.x2) + sqrt (v.x3))));
} in (length3d ({x1 = 1.1, x2 = 5.5, x3 = 10.0, x4 = 1.7}));
```

#### Function subtyping

```shell=bash
// In this example, func2 is subtype of func1
lettype func1 = {x1:Int, x2:Int, x3:Int}->{x1:Int, x2:Int};

lettype func2 = {x1:Int, x2:Int}->{x1:Int, x2:Int, x3:Int};
```

### Conditions

```shell=bash
/\ n: Int. {
    | ((n > 1) and (n < 5)): (n + 5) * 10
    | ((n >= 10) or (n < 0)): n * (3 + 5)
    |:  n * (n+1);
};
```

### Standard Library(-| "std";)

I/O and converting functions are part of the standard library ```std```:

* readReal(unit) - read real number from the user's console;  
* readString(unit) - read string from the user's console;  
* readBool(unit) - read bool value from the user's console;  
* readInt(unit) - read integer number from the user's console;    
* print(any) - prints to the console passed value;
* intToReal(int) - convert integer to real
* intToString(int) - convert integer to string
* realToInt(real) - convert real to int
* realToString(real) - convert real to string
* stringToReal(string) - convert string to real
* stringToInt(string) - convert string to int

### Math Library("-| "math";)

I/O and converting functions are part of the standard library ```std```:

* sqrt(real) -> real - math `sqrt` operation;
* abs(real) -> real - math `abs` operation;
* pow(real, real) -> real - math `pow` operation(base and exponent);
* round(real) -> int - math `round` operation;
* getPi(unit) -> real - get const `Pi`;
* getE(unit) -> real - get const `E`;


## Contribution
You can contribute to our project - we are glad to new ideas and probably some fixes! :) 

Just open pull requests. However, be sure to follow our style guids for the code.

## Credits
This project is developed by:
* [@mcflydesigner, interpreter dev](https://github.com/mcflydesigner)
* [@e2xen, type checker dev](https://github.com/e2xen)
* [@dmitriipolushin, QA and automated testing](https://github.com/dmitriipolushin)
* [@gaijinsupertrapper, BNF writer](https://github.com/gaijinsupertrapper)

## License
The project is released and distributed under [MIT License](https://en.wikipedia.org/wiki/MIT_License).


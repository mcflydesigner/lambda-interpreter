# lambda-interpreter
Interpreter for our lambda language :)

### Pre-requirements: 
* Inteliji idea
* JDK - 1.8
* Maven - 3.6.3
* BNFC - 2.9.4
* Latexmk - latest

### How to build?
Simply run script `build_project.sh`:
```
./build_project.sh
```

### How to test?
After building the project you should see the following jar file `./target/lambda-interpreter-1.0-SNAPSHOT-jar-with-dependencies.jar`,
then to run test simply use the following command:
```
echo "let x: Integer = 1;" | java -jar ./target/lambda-interpreter-1.0-SNAPSHOT-jar-with-dependencies.jar
```
package com.interpreter.runtime.imports;

import com.interpreter.runtime.env.Environment;
import com.interpreter.shared.exceptions.LineColPair;
import hardtyped.Absyn.Expr;

import java.util.List;
import java.util.Map;

public interface ImportManager {

    Map<String, List<Expr>> loadModuleDefinitions(String name, LineColPair lineColPair);

    Map<String, List<Expr>> loadModuleRuntime(String name, Environment environment, LineColPair lineColPair);

}

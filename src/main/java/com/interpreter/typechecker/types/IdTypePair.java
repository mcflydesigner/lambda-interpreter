package com.interpreter.typechecker.types;

import org.antlr.v4.runtime.misc.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IdTypePair extends Pair<String, ExprType> {
    public IdTypePair(String s, ExprType exprType) {
        super(s, exprType);
    }

    public static Map<String, ExprType> listToMap(List<IdTypePair> list) {
        Map<String, ExprType> map = new HashMap<>();
        for (IdTypePair p : list) {
            map.put(p.a, p.b);
        }
        return map;
    }
}

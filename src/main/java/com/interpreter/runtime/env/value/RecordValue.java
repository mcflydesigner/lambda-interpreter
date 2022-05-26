package com.interpreter.runtime.env.value;

import com.interpreter.exception.IncorrectDeclarationException;
import org.antlr.v4.runtime.misc.Pair;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecordValue implements Serializable {

    private Map<String, Value> map = new HashMap<>();

    public RecordValue(List<Pair<String, Value>> entries) {
        for (Pair<String, Value> entry : entries) {
            if (map.containsKey(entry.a)) {
                throw new IncorrectDeclarationException(String.format(
                        "Record cannot have non-unique identifiers, but got %s",
                        entry.a
                ));
            }

            map.put(entry.a, entry.b);
        }
    }

    public Value getValue(String identifier) {
        if (!map.containsKey(identifier)) {
            throw new IllegalArgumentException(String.format(
               "Key '%s' in record is not found",
               identifier
            ));
        }

        return map.get(identifier);
    }

    @Override
    public String toString() {
        return map.toString();
    }
}

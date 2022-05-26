package com.interpreter.typechecker.types;

import com.interpreter.exception.IdentifierNotFoundException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static com.interpreter.typechecker.types.IdTypePair.listToMap;

public class RecordType extends ExprType {

    private final Map<String, ExprType> recordElems;

    protected RecordType(List<IdTypePair> recordElems) {
        super(Type.RECORD);
        if (recordElems == null) {
            throw new IllegalArgumentException();
        }
        this.recordElems = listToMap(recordElems);
    }

    public ExprType getRecordElem(String name) {
        if (!recordElems.containsKey(name)) {
            throw new IdentifierNotFoundException(String.format("Record has no label by name %s", name));
        }
        return recordElems.get(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RecordType that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(recordElems, that.recordElems);
    }

    public boolean isSubtypeOf(ExprType that) {
        if (this == that || that.getType() == Type.ANY) {
            return true;
        }
        if (!(that instanceof RecordType other)) {
            return false;
        }
        for (var e : other.recordElems.entrySet()) {
            if (!(recordElems.containsKey(e.getKey()) && recordElems.get(e.getKey()).isSubtypeOf(e.getValue()))) {
                return false;
            }
        }
        return true;
    }

    public boolean containsLabel(String id) {
        return recordElems.containsKey(id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), recordElems);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{");
        for (var e : recordElems.entrySet()) {
            s.append(e.getKey());
            s.append(":");
            s.append(e.getValue().toString());
            s.append(",");
        }
        s.deleteCharAt(s.length()-1);
        s.append("}");
        return s.toString();
    }
}

package com.interpreter.shared.exceptions;

import java.io.Serializable;

public class LineColPair implements Serializable {

    private final Integer lineNum;
    private final Integer colNum;

    private LineColPair(Integer lineNum, Integer colNum) {
        this.lineNum = lineNum;
        this.colNum = colNum;
    }

    public static LineColPair of(Integer lineNum, Integer colNum) {
        return new LineColPair(lineNum, colNum);
    }

    public Integer getLineNum() {
        return lineNum;
    }

    public Integer getColNum() {
        return colNum;
    }
}

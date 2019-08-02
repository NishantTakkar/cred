package com.company.condition.evaluator.impl;

import com.company.condition.evaluator.Evaluator;

public class GreaterThanEvaluator<T> implements Evaluator<T> {
    @Override
    public boolean evaluate(T v1, T v2) {
        if (v1 instanceof Float && v2 instanceof Float)
            return (Float) v1 > (Float) v2;
        else if (v1 instanceof Double && v2 instanceof Double)
            return (Double) v1 > (Double) v2;
        else if (v1 instanceof Integer && v2 instanceof Integer)
            return (Integer) v1 > (Integer) v2;
        else if (v1 instanceof Long && v2 instanceof Long)
            return (Long) v1 > (Long) v2;
        else return false;
    }
}

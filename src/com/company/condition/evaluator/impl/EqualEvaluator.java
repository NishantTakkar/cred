package com.company.condition.evaluator.impl;

import com.company.condition.evaluator.Evaluator;

public class EqualEvaluator<T> implements Evaluator<T> {
    @Override
    public boolean evaluate(T v1, T v2) {
        return v1 == v2;
    }
}

package com.company.condition;

import com.company.condition.evaluator.impl.EqualEvaluator;
import com.company.condition.evaluator.Evaluator;
import com.company.condition.evaluator.impl.GreaterThanEqualToEvaluator;
import com.company.condition.evaluator.impl.GreaterThanEvaluator;

import java.util.HashMap;
import java.util.Map;

public enum ConditionType {
    EQUAL,
    GREATER_THAN,
    //    LESS_THAN,
//    LESS_THAN_EQUAL_TO,
    GREATER_THAN_EQUAL_TO;
//    NOT_EQUAL


    public static Map<ConditionType, Evaluator> typeEvaluatorMap = new HashMap<>();

    static {
        typeEvaluatorMap.put(EQUAL, new EqualEvaluator());
        typeEvaluatorMap.put(GREATER_THAN, new GreaterThanEvaluator());
        typeEvaluatorMap.put(GREATER_THAN_EQUAL_TO, new GreaterThanEqualToEvaluator());
    }

    public static Evaluator getEvaluator(ConditionType type){
        return typeEvaluatorMap.get(type);
    }
}

package com.company;

import com.company.condition.Condition;

import java.util.List;

public class ConjunctionEvaluator<T> {

    public boolean evaluate(Feature feature, T object){
        boolean result = true;
        for(Condition condition: feature.getConditions()){
            result = result && condition.evaluate(object);
            if (!result)
                return result;
        }
        return result;
    }
}

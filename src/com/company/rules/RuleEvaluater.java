package com.company.rules;

import com.company.Feature;
import com.company.User;

public class RuleEvaluater {

    public boolean evaluate(User user, Feature feature){
        return RuleUtil.getCompositeRuleBuilder(feature.getRules()).evaluate(user);
    }
}

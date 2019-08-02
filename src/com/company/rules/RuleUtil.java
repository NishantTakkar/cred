package com.company.rules;

import com.company.engine.RuleBuilder;

import java.util.List;

public class RuleUtil {


    // can specify and or anything
    public static RuleBuilder getCompositeRuleBuilder(List<RuleBuilder> ruleBuilders) {
        RuleBuilder ruleBuilder = null;

        if (!ruleBuilders.isEmpty()) {
            ruleBuilder = ruleBuilders.get(0);
        }

        for (int i = 1; i < ruleBuilders.size(); i++) {
            ruleBuilder = ruleBuilder.and(ruleBuilders.get(i));
        }

        return ruleBuilder;
    }
}

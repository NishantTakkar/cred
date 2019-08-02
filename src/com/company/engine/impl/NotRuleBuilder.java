package com.company.engine.impl;

import com.company.engine.RuleBuilder;

/**
 * Created by 21216 on 11/10/17.
 */
public class NotRuleBuilder<T> extends AbstractRuleBuilder<T> {

    private RuleBuilder<T> ruleBuilder;

    public NotRuleBuilder(final RuleBuilder<T> ruleBuilder) {
        this.ruleBuilder = ruleBuilder;
    }

    @Override
    public boolean evaluate(T t) {
        return !ruleBuilder.evaluate(t);
    }
}
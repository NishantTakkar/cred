package com.company.engine.impl;

import com.company.engine.RuleBuilder;

/**
 * Created by 21216 on 11/10/17.
 */
public abstract class AbstractRuleBuilder<T> implements RuleBuilder<T> {

    public abstract boolean evaluate(T t);

    public RuleBuilder<T> and(final RuleBuilder<T> ruleBuilder) {
        return new AndRuleBuilder<T>(this, ruleBuilder);
    }

    public RuleBuilder<T> or(final RuleBuilder<T> ruleBuilder) {
        return new OrRuleBuilder<T>(this, ruleBuilder);
    }

    public RuleBuilder<T> not(final RuleBuilder<T> ruleBuilder) {
        return new NotRuleBuilder<T>(ruleBuilder);
    }

}
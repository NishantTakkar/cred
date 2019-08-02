package com.company.engine.impl;

import com.company.engine.RuleBuilder;

/**
 * Created by 21216 on 11/10/17.
 */
public class OrRuleBuilder<T> extends AbstractRuleBuilder<T> {

    private RuleBuilder<T> ruleBuilder1;
    private RuleBuilder<T> ruleBuilder2;

    public OrRuleBuilder(final RuleBuilder<T> ruleBuilder1, final RuleBuilder<T> ruleBuilder2) {
        this.ruleBuilder1 = ruleBuilder1;
        this.ruleBuilder2 = ruleBuilder2;
    }

    @Override
    public boolean evaluate(T t) {
        return ruleBuilder1.evaluate(t) ||  ruleBuilder2.evaluate(t);
    }
}
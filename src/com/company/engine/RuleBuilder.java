package com.company.engine;

public interface RuleBuilder<T>{

    boolean evaluate(T t);

    RuleBuilder<T> and(RuleBuilder<T> c);

    RuleBuilder<T> or(RuleBuilder<T> c);

    RuleBuilder<T> not(RuleBuilder<T> c);
}

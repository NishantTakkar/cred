package com.company.rules;

import com.company.User;
import com.company.engine.impl.AbstractRuleBuilder;

public class AgeRule extends AbstractRuleBuilder<User> {

    private final int MIN_AGE = 25;
    @Override
    public boolean evaluate(User user) {
        return user.getAge() >= MIN_AGE;
    }
}

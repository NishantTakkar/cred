package com.company.rules;

import com.company.Gender;
import com.company.User;
import com.company.engine.impl.AbstractRuleBuilder;

public class GenderRule extends AbstractRuleBuilder<User> {
    @Override
    public boolean evaluate(User user) {
        return user.getGender() == Gender.MALE;
    }
}

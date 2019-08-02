package com.company.rules;

import com.company.User;
import com.company.engine.impl.AbstractRuleBuilder;

public class TransactionAmountRule extends AbstractRuleBuilder<User> {
    private double MIN_VALUE = 100000d;

    @Override
    public boolean evaluate(User user) {
        return user.getTransactionAmount() > MIN_VALUE;
    }
}

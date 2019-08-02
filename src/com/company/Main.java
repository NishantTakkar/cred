package com.company;

import com.company.condition.Condition;
import com.company.condition.ConditionType;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        User u1 = new User().setAge(20).setGender(Gender.MALE).setTransactionAmount(50000d)
                , u2 = new User().setAge(25).setGender(Gender.FEMALE).setTransactionAmount(1000001d)
                , u3 = new User().setAge(29).setGender(Gender.MALE).setTransactionAmount(1000002d);

//        List<RuleBuilder> rules = Arrays.asList(new AgeRule(), new TransactionAmountRule(), new GenderRule());
//        Feature featureX = new Feature("X", rules);
//
//        RuleEvaluater ruleEvaluater = new RuleEvaluater();
//
//        System.out.println(ruleEvaluater.evaluate(u1, featureX));
//        System.out.println(ruleEvaluater.evaluate(u2, featureX));
//        System.out.println(ruleEvaluater.evaluate(u3, featureX));

        List<Condition> conditions = Arrays.asList(new Condition("Age", ConditionType.GREATER_THAN_EQUAL_TO, 25)
                , new Condition("TransactionAmount", ConditionType.GREATER_THAN, 100000d)
                , new Condition("Gender", ConditionType.EQUAL, Gender.MALE));


        Feature featureX = new Feature("X", conditions);

        ConjunctionEvaluator<User> userConjunctionEvaluator = new ConjunctionEvaluator<User>();
        System.out.println(userConjunctionEvaluator.evaluate(featureX, u3));
        System.out.println(userConjunctionEvaluator.evaluate(featureX, u1));
        System.out.println(userConjunctionEvaluator.evaluate(featureX, u2));
    }
}

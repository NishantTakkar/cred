package com.company;

import com.company.condition.Condition;
import com.company.engine.RuleBuilder;

import java.util.List;

public class Feature {
    String type;

    List<RuleBuilder> rules;

    List<Condition> conditions;

    public Feature(String type, List<Condition> conditions) {
        this.type = type;
        this.conditions = conditions;
    }

    public String getType() {
        return type;
    }

    public Feature setType(String type) {
        this.type = type;
        return this;
    }

    public Feature setRules(List<RuleBuilder> rules) {
        this.rules = rules;
        return this;
    }

    public List<RuleBuilder> getRules() {
        return rules;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public Feature setConditions(List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }
}

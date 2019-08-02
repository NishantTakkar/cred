package com.company.condition;

import java.lang.reflect.InvocationTargetException;

public class Condition<T> {

    String attributeName;

    ConditionType type;

    T value;

    public Condition(String attributeName, ConditionType type, T value) {
        this.attributeName = attributeName;
        this.type = type;
        this.value = value;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public ConditionType getType() {
        return type;
    }

    public T getValue() {
        return value;
    }

    public boolean evaluate(Object object) {
        try {
            T currValue = (T) object.getClass().getMethod("get" + attributeName).invoke(object);
            return ConditionType.getEvaluator(type).evaluate(currValue, value);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return false;
    }
}

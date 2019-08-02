package com.company;

public class User {

    private Integer age;

    private Double transactionAmount;

    private Gender gender;

    public Integer getAge() {
        return age;
    }

    public User setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Double getTransactionAmount() {
        return transactionAmount;
    }

    public User setTransactionAmount(Double transactionAmount) {
        this.transactionAmount = transactionAmount;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public User setGender(Gender gender) {
        this.gender = gender;
        return this;
    }
}

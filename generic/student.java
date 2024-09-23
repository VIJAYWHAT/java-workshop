package com.techatpark.practices.generic;

public class student {
    public static void main(String[] args) {

        Pair<String, Integer> student1 = new Pair<>();

        student1.setKey("Vj");
        student1.setValue(44);

        System.out.println("Student Name: " + student1.getKey() + " ID: 23USC0" + student1.getValue());
    }
}

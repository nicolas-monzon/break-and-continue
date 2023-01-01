package com.core.challenges.challenges._03;

public class GenericProblems {

    public void swap() {

    }

    public void counter() {

    }

    public void added() {

    }

    public void composition() {

    }

    public void application() {

    }

    public void mathClazzReview() {

    }

    public void reduce(int a, int b, int c) {
        if(a > b) {
            if(b > c) {
                System.out.println("OK");
            }
        }
    }

    public void reduce2(int a, int b, int c) {
        if(a > b) {
            System.out.println("OK");
        }
        if(b > c) {
            System.out.println("OK");
        }
    }

    public void reduce3(int a, int b) {
        if(a > b) {
            System.out.println("OK");
            System.out.println("OK1");
        } else {
            System.out.println("OK");
            System.out.println("OK2");
        }
    }

    public void reduce4(int a, int b) {
        if(a > b || a <= b) {
            System.out.println("OK");
            System.out.println("OK1");
        } else {
            System.out.println("OK");
            System.out.println("OK2");
        }
    }

    public void reduce5(int a, int b) {
        if(a > b && a <= b) {
            System.out.println("OK");
            System.out.println("OK1");
        } else {
            System.out.println("OK");
            System.out.println("OK2");
        }
    }

    public void invertBooleanExpression() {

    }

    public void useNeutralElement() {

    }

    public void useIdempotentElement() {

    }

    public void morgansLaw() {

    }
}

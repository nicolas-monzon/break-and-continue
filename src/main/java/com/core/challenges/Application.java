package com.core.challenges;


import com.core.challenges.challenges._04.Homework;

public class Application {

    public static void main(String[] args) {

        Homework homework = new Homework();
        int result = homework.identity(8);
        System.out.println(result); // Debería imprimir 8
    }

}

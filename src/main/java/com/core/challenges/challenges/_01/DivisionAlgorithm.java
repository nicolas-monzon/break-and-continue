package com.core.challenges.challenges._01;

public class DivisionAlgorithm {

    public void review(int a, int b) {
        int cociente = a / b;
        int resto = a % b;
        System.out.println("El cociente es: " + cociente + ", el resto es: " + resto);
    }

    public boolean isEven(int a) {
        return a % 2 == 0;
    }

    public int sumOfDigits(int a) {

        // Pongo en 0 para que la que primera vez no afecte la suma.
        // El 0 es el elemento neutro de la suma.
        int sum = 0;
        while(a != 0) {
            sum = sum + (a % 10);
            a = a / 10;
        }

        return sum;
    }

    public boolean isMultipleOf3(int a) {
        int b = this.sumOfDigits(a);
        while(b > 10) {
            b = this.sumOfDigits(b);
        }
        return b == 3 || b == 6 || b == 9;
    }

    public boolean isMultipleOf4(int a) {
        return this.isEven(a) && this.isEven(a / 2);
    }

    public boolean isMultipleOf5(int a) {
        return a % 10 == 0 || a % 10 == 5;
    }

    public boolean isMultipleOf6(int a) {
        return this.isEven(a) && this.isMultipleOf3(a);
    }

    public boolean isMultipleOf7(int a) {
        if(a == 0) {
            return true;
        }
        if(a < 7) {
            return false;
        }
        return this.isMultipleOf7(a - 7);
    }

    public boolean isMultipleOf9(int a) {
        int b = this.sumOfDigits(a);
        while(b > 10) {
            b = this.sumOfDigits(b);
        }
        return b == 9;
    }

    public boolean isMultipleOf10(int a) {
        return a % 10 == 0;
    }

    public boolean isMultipleOf11(int a) { // 747883   1->7   2-> 4   3-> 7 ....   121
        int evens = 0;
        int odds = 0;
        int i = 1;
        while(a != 0) {
            if(i % 2 == 0) {
                evens = evens + (a % 10);
            } else {
                odds = odds + (a % 10);
            }
            a = a / 10;
            i  = i + 1;
        }

        int subtraction = evens - odds;
        if(subtraction == 0) {
            return true;
        }
        if(subtraction < 11) {
            return false;
        }

        return this.isMultipleOf11(a - 11);
    }

    public boolean isMultipleOf100(int a) {
        return this.isMultipleOf10(a) && this.isMultipleOf10(a/10);
    }

    public boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        int i = 2;
        while(i < n) {
            if(n % i == 0) {
                return false;
            }
            i = i + 1;
        }

        return true;
    }
}

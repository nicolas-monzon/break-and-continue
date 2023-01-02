package com.core.challenges.challenges._03;

public class GenericProblems {

    public void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a + ", b: " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("a: " + a + ", b: " + b);
    }

    public void counter() {
        final int UNIT = 2;
        final int MAX = 100;

        int i = 0;
        while(i < MAX) {
            System.out.println(i);
            i = i + UNIT;
        }
    }

    public void added() {
        // review sum of digits
    }

    public void composition() {
        int result = f(g(1));
        System.out.println(result);
    }

    public int f(int x) {
        return x + 1;
    }

    public int g(int x) {
        return x + 2;
    }

    public void application() {
        f(8); // aplico el 8 a la f
    }

    public void reduce(int a, int b, int c) {
        if(a > b) {
            if(b > c) {
                System.out.println("OK");
            }
        }

        // Es equivalente a:
        if(a > b && b > c) {
            System.out.println("OK");
        }
    }

    public void reduce2(int a, int b, int c) {
        if(a > b) {
            System.out.println("OK");
        }
        if(b > c) {
            System.out.println("OK");
        }

        // Es equivalente a:
        if(a > b || b > c) {
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

        // Es equivalente a:
        System.out.println("OK");
        if(a > b) {
            System.out.println("OK1");
        } else {
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

        // Es equivalente a:
        System.out.println("OK");
        System.out.println("OK1");
    }

    public void reduce5(int a, int b) {
        if(a > b && a <= b) {
            System.out.println("OK");
            System.out.println("OK1");
        } else {
            System.out.println("OK");
            System.out.println("OK2");
        }

        // Es equivalente a:
        System.out.println("OK");
        System.out.println("OK2");
    }

    public boolean invertBooleanExpression(boolean p) {
        return !p;
    }

    public void useNeutralElement(boolean p, int a) {
        boolean q = true && p; // Siempre es p
        boolean r = false || p; // Siempre es p
        int b = 1 * a; // Siempre da a
        int c = 0 + a; // Siempre da a
        System.out.println(q);
        System.out.println(r);
        System.out.println(b);
        System.out.println(c);
    }

    public void useIdempotentElement(boolean p, int a) {
        boolean q = false && p; // Siempre es false, independientemente de cuanto vale p
        boolean r = true || p; // Siempre da true, independientemente de cuanto vale p
        int b = 0 * a; // Siempre da 0, independientemente de cuanto vale a
        System.out.println(q);
        System.out.println(r);
        System.out.println(b);
    }

    public void morgansLaw(boolean p, boolean q) {
        boolean morgans = (!(p && q)) == (!p || !q); // !(p && q) es equivalente a !p || !q
        boolean morgans2 = (!(p || q)) == (!p && !q); // !(p || q) es equivalente a !p && !q
        System.out.println(morgans);
        System.out.println(morgans2);
    }
}

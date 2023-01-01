package com.core.challenges.challenges._04;

public class Homework {

    /*
    Se recibe como parámetro 4 números que corresponden al tamaño de los lados de un polígono. Devolver true si la
    figura es un cuadrado.
    Dificultad: ⭐
     */
    public boolean isSquare(int a, int b, int c, int d) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Dada la siguiente función, recibe 3 tamaños que corresponden a los lados de un triángulo. Devolver true si
    es posible formar un triangulo, de lo contrario falso.
    Dificultad: ⭐⭐⭐⭐
     */
    public boolean isTriangle(int a, int b, int c) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Los números vampiros son números que al multiplicarlos, su producto tiene de dígitos los mismos dígitos de los
    factores. No necesariamente están en la misma posición. Ejemplo: 21 x 60 = 1.260, entonces 21 y 60 son vampiros.
    Se reciben dos números, indicar si son números vampiros.
    Dificultad: ⭐⭐⭐
     */
    public boolean vampireNumber(int a, int b) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Dada un número natural, imprimir en pantalla todos sus divisores.
    Dificultad: ⭐⭐
     */
    public void printDivisors(int n) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Retornar true si el número es positivo.
    Dificultad: ⭐
     */
    public boolean isPositive(int a) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Devolvere el mayor estricto de los parámetros. Devolver -1 si no es posible.
    Dificultad: ⭐
     */
    public boolean biggest(int a, int b) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Devolvere el mayor estricto de los parámetros. Devolver -1 si no es posible.
    Dificultad: ⭐*
     */
    public boolean biggest(int a, int b, int c) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Indicar si el año recibido por parámetro es bisiesto.
    Dificultad: ⭐*
     */
    public boolean isLeapYear(int year) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Considere un 0 <= n <= 100, imprima el valor en números romanos.
    Dificultad: ⭐⭐
     */
    public void mapsToRomanNumeral(int n) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Dos números se consideran amigos, si los divisores del primer número suman el segundo, y viceversa.
    Indicar si los números recibidos por parámetro son amigos.
    Dificultad: ⭐⭐⭐
     */
    public boolean areAmicableNumbers(int a, int b) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Devolver true si el número es un primo de fermat. Es primo de fermat si tiene la forma 2^(2^n) + 1
    Dificultad: ⭐⭐
     */
    public boolean fermatNumber(int a) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Invertir el número recibido como parámetro. Ejemplo: Si el número es 321 devolver 123.
    Tip: No siempre es posible con este tipo de dato. En el caso de no poderse, devolver -1.
    Dificultad: ⭐⭐
     */
    public int reverse(int n) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Devolver el valor absoluto del número recibido como parámetro.
    Dificultad: ⭐
     */
    public int unsigned(int a) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Imprimir en pantalla los números primos de la criba de Eratóstenes.
    Dificultad: ⭐
     */
    public void sieveOfEratosthenes() {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Si tenemos la función f(a) = a + 1, y g(b) = b + 2, entonces f(g(b)) = b + 2 + 1, y por otro lado,
    g(f(a)) = a + 1 + 2. Estas funciones representan lo mismo. Pensar un ejemplo en computación, donde
    esta conmutatividad no sera verdadera y desarrollarlo.
    Dificultad: ⭐**
     */
    public void noCommutativityComposition() {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Desarrollar una función tirar, que dado dos parámetros "tira" el segundo, y se "queda" con el primero.
    Nota histórica: La función "tirar" fue importante para buscar contraejemplos en muchas situaciones de la
    computación moderna, para el desarrollo de lenguajes probabilísticos.
    Dificultad: ⭐
     */
    public int throwSecondParameter(int a, int b) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Desarrollar una función sucesor, que devuelve el "sucesor" del número que recibe como parámetro.
    Nota histórica: La función sucesor es una de las funciones fundamentales para poder dar una definición a
    conjuntos infinitos de números. Por ejemplo, los números naturales se pueden definir como:
    n := 1 | succ(n). Por ejemplo: succ(succ(1)) es válido, y esto es igual a 3. El 3 es un símbolo usado para
    representar el número 3, pero acá, succ(succ(1)) representa el 3 sin necesidad de definir su símbolo.
    Con esto se pueden empezar a hacer diversas demostraciones a una escala muy detallada en computación.
    Dificultad: ⭐
     */
    public int successor(int a) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Devolver el resultado de hacer el "implica" de la lógica binaria.
    Dificultad: ⭐⭐
     */
    public boolean then(boolean p, boolean q) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Devolver el resultado de hacer el "o exluyente" de la lógica binaria.
    Dificultad: ⭐
     */
    public boolean xor(boolean p, boolean q) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Devolver el resultado de hacer el "nand" de la lógica binaria.
    Dificultad: ⭐
     */
    public boolean nAnd(boolean p, boolean q) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Devolver el resultado de hacer el "nor" de la lógica binaria.
    Dificultad: ⭐
     */
    public boolean nOr(boolean p, boolean q) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Devolver -1 si el número es deficiente, 1 si es abundante y 0 si es perfecto.
    Es abuntante si la suma de sus divisores es más grande que el número en sí, y deficiente si no llega.
    Es perfecto si sus divisores suman el mismo número. Ejemplo: Los divisores de 10 son 1, 2 y 5, sumados da 8
    que es menor a 10, por ende es definiciente. Los divisores de 6 son 1, 2 y 3, que suman 6. Entonces 6 es perfecto.
    Dificultad: ⭐⭐⭐
     */
    public int isPerfect(int n) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Un número es narcisista si cada dígito elevado a la cantidad de dígitos del número, sumados, da el mismo número.
    Ejemplo: 1^3 + 5^3 + 3^3 = 153, entonces 153 es narcisista. Lo mismo va a suceder con números de un solo dígito.
    Dificultad: ⭐⭐⭐
     */
    public boolean isNarcissistic(int n) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Imprimir de 0 hasta max, todos los primos gemelos.
    Dificultad: ⭐⭐⭐
     */
    public boolean printTwinPrimeNumbers(int max) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Usando prints, dibujar una pirámide de asteríscos de tamaño n.
    Ejemplo: Si n es 4, entonces se debe imprimir en pantalla:
    *
    **
    ***
    ****
    Dificultad: ⭐⭐⭐
     */
    public boolean triangle(int n) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Esta función debe calcular el factorial de un número natural.
    Ejemplo: 4! = 4*3*2*1, 7! = 7*6*5*4*3*2*1.
    Dificultad: ⭐
     */
    public int factorial(int n) {
        throw new RuntimeException("Not yet implemented");
    }

    /*
    Esta función debe calcular el doble factorial de un número natural.
    Ejemplo: 4! = 4*2, 7! = 7*5*3*1.
    Dificultad: ⭐
     */
    public int doubleFactorial(int n) {
        throw new RuntimeException("Not yet implemented");
    }
}


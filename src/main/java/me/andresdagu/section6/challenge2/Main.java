package me.andresdagu.section6.challenge2;

public class Main {

    void main() {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        boolean result = !(a || b && c || !d) || (a && b || c);

        IO.println(result);
    }

    /* Guess:
    True
     */

}

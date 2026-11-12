package me.andresdagu.section6.challenge1;

public class Main {

    void main() {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        boolean result = a || b && c || !d;

        IO.println(result);
    }

    /* Guess:
    True
     */
}

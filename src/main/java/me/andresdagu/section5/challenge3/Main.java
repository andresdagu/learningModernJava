package me.andresdagu.section5.challenge3;

public class Main {

    void main() {
        String a = "A";
        String b = "B";

        b = a;
        a = b;
        b = a;
        a = b;

        IO.println(a);
        IO.println(b);
    }

    /* Guess:
    A
    A
     */

}

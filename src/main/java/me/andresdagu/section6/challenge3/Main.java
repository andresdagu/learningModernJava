package me.andresdagu.section6.challenge3;

public class Main {

    void main() {
        // Change these two variables to test your solution
        boolean hasIceCream = true;
        boolean hasCookie = false;

        boolean validChoice = !( !(hasIceCream || hasCookie) || (hasIceCream && hasCookie));

        IO.println(validChoice);
    }

}

package me.andresdagu.section8.challenge5;

public class Main {

    void main() {
        // For this one in particular, you should output
        // -3.5811388300842 and -0.41886116991581
        // but your code should work with these three numbers changed to
        // represent any given quadratic equation.
        double a = 2;
        double b = 8;
        double c = 3;

        double resultOne = (-b + Math.sqrt(b*b - 4*a*c))/(2 * a);
        double resultTwo = (-b - Math.sqrt(b*b - 4*a*c))/(2 * a);

        IO.println(resultOne);
        IO.println(resultTwo);
    }


}

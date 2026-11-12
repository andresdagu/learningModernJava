package me.andresdagu.section8.challenge4;

public class Main {

    void main() {
        double resultOne = (int) 5.0 / 2 + 5.0 / 2;
        double resultTwo = (int) (5.0 / 2 + 5.0 / 2);

        IO.println(resultOne);
        IO.println(resultTwo);
    }

    /*
    The first one will evaluate as 5/2 + 5.0/2; 2 + 2.5; 4.5
    The second one as (int) (2.5 + 2.5); (int) (5.0); 5, but saved as double, which is 5.0
     */

}

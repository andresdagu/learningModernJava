package me.andresdagu.section5.challenge2;

public class Main {

    void main() {
        String fruit;
        fruit = "apple";

        IO.println(fruit);

        String vegetable = "carrot"; // wrong line: final String vegetable = "carrot";

        IO.println(fruit);
        IO.println(vegetable);

        fruit = "orange";
        vegetable = "celery";

        IO.println(fruit);
        IO.println(vegetable);
    }

}

package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        for (int i = 0; i < 4; i++) {
            zofka.turnRight(90);
            zofka.move(180);}

        zofka.turnRight(45);
        zofka.move(130);
        zofka.turnRight(90);
        zofka.move(130);

        zofka.penUp();
        zofka.turnRight(135);
        zofka.move(360);
        zofka.penDown();

        for (int i = 0; i < 4; i++) {
            zofka.turnRight(90);
            zofka.move(180);}

        zofka.turnRight(45);
        zofka.move(130);
        zofka.turnRight(90);
        zofka.move(130);


        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnLeft(135);
        zofka.move(180);

        zofka.turnLeft(135);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);

    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}

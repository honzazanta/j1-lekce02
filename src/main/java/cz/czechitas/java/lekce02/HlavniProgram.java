package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        for (int i = 0; i < 4; i++) {
            zofka.turnRight(90);
            zofka.move(180);}

        // střecha domu
        zofka.turnRight(45);
        zofka.move(130);
        zofka.turnRight(90);
        zofka.move(130);

        //posunutí k nakreslení prasátka
        zofka.penUp();
        zofka.turnRight(135);
        zofka.move(480);
        zofka.penDown();

        for (int i = 0; i < 4; i++) {
            zofka.turnRight(90);
            zofka.move(180);}

        //střecha domu
        zofka.turnRight(45);
        zofka.move(130);
        zofka.turnRight(90);
        zofka.move(130);

        //1. noha prasátka
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.turnLeft(180);
        zofka.move(40);

        //přesunutí mezi nohami
        zofka.turnLeft(135);
        zofka.move(180);

        // 2. noha prasátka
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

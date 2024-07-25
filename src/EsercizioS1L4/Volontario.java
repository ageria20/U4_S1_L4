package EsercizioS1L4;

import interfaces.Worker;

import java.util.Date;

public class Volontario implements Worker {

    private String name;
    private int age;
    private boolean cv;

    public Volontario(String name, int age, boolean cv) {
        this.name = name;
        this.age = age;
        this.cv = cv;
    }

    @Override
    public void checkIn() {
        System.out.println("Checked In: " + new Date() + " del Volontario " + this.name);
    }
}

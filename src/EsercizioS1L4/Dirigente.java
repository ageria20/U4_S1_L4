package EsercizioS1L4;

import enums.Department;

import java.util.Date;

public class Dirigente extends Dipendente {
    public Dirigente(int matricola, double salary, Department department) {
        super(matricola, salary, department);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Il salario della matricola " + this.getMatricola() + " e':" + this.getSalary());
    }

    @Override
    public void checkIn() {
        System.out.println("Checked In: " + new Date() + " della matricola: " + this.getMatricola());
    }

//    public double calculateSalary(Dipendente dirigente) {
//        return dirigente.getSalary() / 12;
//
//    }
}

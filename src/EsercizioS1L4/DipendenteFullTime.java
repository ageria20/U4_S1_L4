package EsercizioS1L4;

import enums.Department;

import java.util.Date;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(int matricola, double salary, Department department) {
        super(matricola, salary, department);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Il salario della matricola " + this.getMatricola() + " e': " + this.getSalary() / 12 + " al mese");
    }


    @Override
    public void checkIn() {
        System.out.println("Checked In: " + new Date() + " della matricola: " + this.getMatricola());
    }
}

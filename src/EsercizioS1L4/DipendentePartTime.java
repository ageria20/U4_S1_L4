package EsercizioS1L4;

import enums.Department;

import java.util.Date;

public class DipendentePartTime extends Dipendente {


    public DipendentePartTime(int matricola, double salary, Department department, double workedHours) {
        super(matricola, salary, department, workedHours);
    }

    @Override
    public void calculateSalary() {
        System.out.println("Il salario della matricola " + this.getMatricola() + " e': " + this.getSalary() / this.getWorkedHours() + " l'ora");
    }


    @Override
    public void checkIn() {
        System.out.println("Checked In: " + new Date() + " della natricola: " + this.getMatricola());
    }
}

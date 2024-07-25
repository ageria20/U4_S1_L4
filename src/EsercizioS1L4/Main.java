package EsercizioS1L4;

import enums.Department;

import static EsercizioS1L4.DipendenteFullTime.calculateSalary;
import static EsercizioS1L4.DipendentePartTime.calculateSalaryPartTime;

public class Main {
    public static void main(String[] args) {

        Dipendente dipFt = new DipendenteFullTime(1, 20000, Department.ADMINISTATION);
        Dipendente dipPt = new DipendentePartTime(2, 10000, Department.SALES, 30);
        Dipendente dir = new Dirigente(3, 30000, Department.PRODUCTION);
        Dipendente[] dipendenti = {dipFt, dipPt, dir};
//
//        for (Dipendente dipendente : dipendenti) {
//            System.out.println("Matricola nr: " + dipendente.getMatricola());
//        }
        for (int i = 0; i < dipendenti.length; i++) {
            if (dipendenti[i] instanceof DipendentePartTime) {
                System.out.println("Il salario della Dipendente con matricola " + dipendenti[i].getMatricola() + " e': " + calculateSalaryPartTime(dipendenti[i]));
            } else
                System.out.println("Il salario della Dipendente con matricola " + dipendenti[i].getMatricola() + " e': " + calculateSalary(dipendenti[i]));

        }


    }
}
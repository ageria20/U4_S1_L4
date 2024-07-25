package EsercizioS1L4;

import enums.Department;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(int matricola, double salary, Department department) {
        super(matricola, salary, department);
    }


    public static double calculateSalary(Dipendente dipendente) {
        return dipendente.getSalary() / 12;
    }


}

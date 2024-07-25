package EsercizioS1L4;

import enums.Department;

public class DipendentePartTime extends Dipendente {


    public DipendentePartTime(int matricola, double salary, Department department, double workedHours) {
        super(matricola, salary, department, workedHours);
    }

    public static double calculateSalaryPartTime(Dipendente dipendente) {
        return dipendente.getSalary() / dipendente.getWorkedHours();
    }


}

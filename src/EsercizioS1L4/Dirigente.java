package EsercizioS1L4;

import enums.Department;

public class Dirigente extends Dipendente {
    public Dirigente(int matricola, double salary, Department department) {
        super(matricola, salary, department);
    }

    public double calculateSalary(Dipendente dirigente) {
        return dirigente.getSalary() / 12;

    }
}

package EsercizioS1L4;

import enums.Department;
import interfaces.Worker;

public abstract class Dipendente implements Worker {

    //Attributi
    private int matricola;
    private double salary;
    private Department department;
    private double workedHours;


    public Dipendente(int matricola, double salary, Department department) {
        this.matricola = matricola;
        this.salary = salary;
        this.department = department;
    }

    public Dipendente(int matricola, double salary, Department department, double workedHours) {
        this(matricola, salary, department);
        this.workedHours = workedHours;
    }


    public int getMatricola() {
        return matricola;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    public abstract void calculateSalary();
}

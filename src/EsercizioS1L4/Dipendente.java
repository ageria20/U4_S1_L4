package EsercizioS1L4;

import enums.Department;

public abstract class Dipendente {

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
        this.matricola = matricola;
        this.salary = salary;
        this.department = department;
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
}

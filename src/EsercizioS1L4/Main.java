package EsercizioS1L4;

import enums.Department;

public class Main {
    public static void main(String[] args) {

        DipendenteFullTime dipFt = new DipendenteFullTime(1, 20000, Department.ADMINISTATION);
        DipendentePartTime dipPt = new DipendentePartTime(2, 300, Department.SALES, 30);
        Dirigente dir = new Dirigente(3, 30000000, Department.PRODUCTION);
        Dipendente[] dipendenti = {dipFt, dipPt, dir};

        for (int i = 0; i < dipendenti.length; i++) {
            dipendenti[i].calculateSalary();
            dipendenti[i].checkIn();
        }

        Volontario vol1 = new Volontario("Andrea", 29, true);
        Volontario vol2 = new Volontario("Mirko", 27, false);
        Volontario vol3 = new Volontario("Desiree", 30, false);
        Volontario[] volontari = {vol1, vol2, vol3};

        for (Volontario volontario : volontari) {
            volontario.checkIn();
        }
    }
}
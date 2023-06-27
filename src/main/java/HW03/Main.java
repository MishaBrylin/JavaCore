package HW03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employe> employes = new ArrayList<>();
        employes.add(new Employe("Василий", 3000, 35));
        employes.add(new Manager("Анатолий", 5000, 40));
        employes.add(new Employe("Вадим", 7000, 25));
        employes.add(new Employe("Матвей", 2000, 35));
        employes.add(new Employe("Григорий", 4000, 65));

        Manager.salaryUp(employes, 100);
        Collections.sort(employes, new CompareSalary());
        for (Employe employe : employes) {
            System.out.println(employe);
        }
        System.out.println();

        Collections.sort(employes, new CompereAge());
        for (Employe employe : employes) {
            System.out.println(employe);
        }



    }
}

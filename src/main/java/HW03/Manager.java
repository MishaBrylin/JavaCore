package HW03;


import java.util.List;

public class Manager extends Employe {


    public Manager(String name, double salary, int age) {
        super(name, salary, age);
    }
    public static void salaryUp(List<Employe> employes, double up){
        for (Employe employe: employes) {
            if (!(employe instanceof Manager)){
                employe.salaryUp(up);
            }
        }
            }
}

package HW03;

import java.util.Comparator;

public class CompareSalary implements Comparator<Employe> {
    @Override
    public int compare (Employe employe1, Employe employe2)
    {
        if (employe1.salary == employe2.salary) {
            return 0;
        } else if (employe1.salary < employe2.salary) {
            return -1;
        } else {
            return 1;
        }
    }
}

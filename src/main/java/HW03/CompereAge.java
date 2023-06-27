package HW03;


import java.util.Comparator;

public class CompereAge implements Comparator<Employe> {
    @Override
    public int compare (Employe employe1, Employe employe2)
    {
        if (employe1.age == employe2.age) {
            return 0;
        } else if (employe1.age < employe2.age) {
            return -1;
        } else {
            return 1;
        }
    }
}

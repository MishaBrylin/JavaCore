package HW03;

public class Employe {

    private String name;
    protected double salary;
    protected int age;


    public Employe(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void salaryUp(double amount) {

        salary += amount;
    }



    @Override
    public String toString() {
        return "Сотрудник{" +
                "имя='" + name + '\'' +
                ", ЗП=" + salary +
                ", Возраст =" + age +'}';
    }
}
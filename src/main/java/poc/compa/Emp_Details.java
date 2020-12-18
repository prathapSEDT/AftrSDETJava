package poc.compa;

public class Emp_Details implements Comparable<Emp_Details> {

    private String name;
    private String place;
    private int salary;

    public Emp_Details(String name, String place, int salary) {
        this.name = name;
        this.place = place;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp_Details{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Emp_Details o) {
        return this.salary-o.salary;
    }
}

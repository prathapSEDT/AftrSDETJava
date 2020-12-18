package pojo;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name = "emp_details")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Cacheable

public class Employee {
    @Id
    @Column(name = "emp_id")
    private int id;
    @Column(name = "emp_name")
   private String name;

    @Column(name = "emp_place")
    private String place;
    @Column(name = "emp_salary")
   private  double salaray;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", salaray=" + salaray +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getSalaray() {
        return salaray;
    }

    public void setSalaray(double salaray) {
        this.salaray = salaray;
    }
}

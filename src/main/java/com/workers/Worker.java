package com.workers;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@Cacheable
public class Worker {
    @Id
    private int id;
    private String name;
    private String place;
    private double salaray;

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

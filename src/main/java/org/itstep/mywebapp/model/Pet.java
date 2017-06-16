package org.itstep.mywebapp.model;


import java.util.Date;

public class Pet {

    private Integer id;

    private String name;

    private Date dataOfBorn;

    private int age;

    private boolean graft; // привита ли собака

    private double weight;


    public Pet(String lucky, Date date){}

    public Pet(int id,String name, Date dataOfBorn, int age, boolean graft, double weight) {
        this.id=id;
        this.name = name;
        this.dataOfBorn = dataOfBorn;
        this.age = age;
        this.graft = graft;
        this.weight = weight;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDataOfBorn() {
        return dataOfBorn;
    }

    public void setDataOfBorn(Date dataOfBorn) {
        this.dataOfBorn = dataOfBorn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGraft() {
        return graft;
    }

    public void setGraft(boolean graft) {
        this.graft = graft;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dataOfBorn=" + dataOfBorn +
                ", age=" + age +
                ", graft=" + graft +
                ", weight=" + weight +
                '}';
    }
}

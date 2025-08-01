package domain;

public sealed abstract class Employee permits Manager, Salesman {

    protected String code;

    protected String name;

    protected String adress;

    protected int age;

    protected double salary;

    public Employee(String code, String name, String adress, int age, double salary) {
    }

    public Employee() {

    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return this.adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double getFullSalary();

    public double getFullSalary(double extra) {
        return this.getFullSalary() + extra;
    }

}

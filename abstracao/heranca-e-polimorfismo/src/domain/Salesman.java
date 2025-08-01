package domain;

public non-sealed class Salesman extends Employee {

    private double percentPerSold;

    private double soldAmount;

    public Salesman(String code, String name, String adress, int age, double salary, double percentPerSold, double soldAmount) {
        super(code, name, adress, age, salary);
        this.percentPerSold = percentPerSold;
        this.soldAmount = soldAmount;
    }

    public Salesman() {
    }

    @Override
    public String getCode() {
        return "SL-" + this.code;
    }

    public double getPercentPerSold() {
        return this.percentPerSold;
    }

    public void setPercentPerSold(double percentPerSold) {
        this.percentPerSold = percentPerSold;
    }

    public double getSoldAmount() {
        return this.soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    public double getFullSalary() {
        return this.salary + ((this.soldAmount * this.percentPerSold) / 100);
    }

}

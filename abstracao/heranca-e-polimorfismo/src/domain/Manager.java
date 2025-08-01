package domain;

public non-sealed class Manager extends Employee {

    private String login;

    private String password;

    private double commission;

    public Manager(String code, String name, String adress, int age, double salary, String login, String password, double commission) {
        super(code, name, adress, age, salary);
        this.login = login;
        this.password = password;
        this.commission = commission;
    }

    public Manager() {
    }

    @Override
    public String getCode() {
        return "MN-" + this.code;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCommission() {
        return this.commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public double getFullSalary() {
        return this.salary + this.commission;
    }

}

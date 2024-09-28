package second_module.interfaces;

public class Programmer implements Worker {
    int id;
    String nickname;
    int salary;
    int bonusSalary;
    double KPIvalue;

    public Programmer(int id, String nickname, int salary, int bonusSalary, double KPIvalue) {
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.KPIvalue = KPIvalue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getKPIvalue() {
        return KPIvalue;
    }

    public void setKPIvalue(double KPIvalue) {
        this.KPIvalue = KPIvalue;
    }

    @Override
    public String getWorkerData() {
        return "ID: " + id + ". NICKNAME: " + nickname + ". SALARY: " + salary + ". BONUS SALARY: " + bonusSalary +
                ". KPI VALUE: " + KPIvalue;
    }

    @Override
    public int getSalary() {
        return salary + bonusSalary;
    }
}

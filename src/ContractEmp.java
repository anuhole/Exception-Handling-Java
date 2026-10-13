public class ContractEmp extends Employee{
    int hour;
    double rph;

    public ContractEmp(int hour, double rph) {
        this.hour = hour;
        this.rph = rph;
    }

    public ContractEmp(int id, String name, double phNo, String email, String dept, String des, String doj, int hour, double rph) {
        super(id, name, phNo, email, dept, des, doj);
        this.hour = hour;
        this.rph = rph;
    }

    @Override
    double calculatesalary() {
        return hour*rph;
    }
}

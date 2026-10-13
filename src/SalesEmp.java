public class SalesEmp extends Employee{
    double monthSal;

    public SalesEmp(double monthSal) {
        this.monthSal = monthSal;
    }

    public SalesEmp(int id, String name, double phNo, String email, String dept, String des, String doj, double monthSal) {
        super(id, name, phNo, email, dept, des, doj);
        this.monthSal = monthSal;
    }

    @Override
    double calculatesalary() {
        return monthSal*0.10;
    }
}

package src;

public class SalariedEmp extends Employee {
    double basicSal;



    public SalariedEmp(int id, String name, double phNo, String email, String dept, String des, String doj, double basicSal) {
        super(id, name, phNo, email, dept, des, doj);
        this.basicSal = basicSal;
    }

    @Override
    double calculatesalary() {
        double da=0.08*basicSal;
        double hra=0.07*basicSal;
        double pf=0.12*basicSal;

        return (basicSal+da+hra-pf);
    }
}

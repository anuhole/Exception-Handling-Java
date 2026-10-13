abstract class Employee {
    int id;
    String name,email,dept,des,doj;
    double phNo;
    public Employee() {
    }

    public Employee(int id, String name, double phNo, String email, String dept, String des, String doj) {
        this.id = id;
        this.name = name;
        this.phNo = phNo;
        this.email = email;
        this.dept = dept;
        this.des = des;
        this.doj = doj;
    }
    void displayEmpDeatails(){
        System.out.println("ID "+id);
        System.out.println("Emp name "+name);
        System.out.println("Phone number "+phNo);
        System.out.println("email "+email);
        System.out.println("Department"+dept);
        System.out.println("Designation "+des);
        System.out.println("Date of Join "+doj);

    }
    abstract double calculatesalary();

}

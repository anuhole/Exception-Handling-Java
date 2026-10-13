public class TestEmpl {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees [0]=new SalariedEmp(1,"Anushka",283758732,"edgiujr","HR","manger","23/49/400",5700);

        employees [1]=new SalesEmp(2,"tanvi",1237658723,"evfkhg","iT","Tester","325476",4500);
        employees [2]=new ContractEmp(3,"prajakta",2357665,"ehgtjhj","Technical","coder","3298547",54,100);

        for(Employee e:employees){
            e.displayEmpDeatails();

        }
    }


}

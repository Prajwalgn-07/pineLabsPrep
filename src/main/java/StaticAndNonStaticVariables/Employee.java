package StaticAndNonStaticVariables;



public class Employee {
    public static String Name;
    public int EmployeeCode;
    public static int Salary;
    //We can access both static and nonStatic Variables inside nonStatic method
    public void changeEmployeeDetails(String name, int salary,int EmployeeCode){
        Name=name;
        Salary=salary;
        this.EmployeeCode=EmployeeCode;
    }
    //We cannot access  nonStatic variables inside static method
    public static void AccessingNonStatic(){
//        System.out.println(this.EmployeeCode);
    }
}

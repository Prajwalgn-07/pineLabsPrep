package StaticAndNonStaticVariables;

public class Employer {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        //Since EmployeeCode is not static we can access it by object only
        employee1.EmployeeCode=11;
        //Name and salary is static, so we can access it directly using class name
        Employee.Name="Tom";
        Employee.Salary=25;
    }
}

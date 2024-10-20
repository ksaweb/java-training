public class Employee implements Payable {
    // TODO fix class declaration and declare variables here
    private String employeeId;
    private String name;
    protected double averageMonthlySalary;

    public Employee(String employeeId, String name) {
        // TODO fill in code here
        this.employeeId = employeeId;
        this.name = name;
        this.averageMonthlySalary = 0;
    }

    public String getEmployeeId() {
        // TODO fill in code here and replace the return statement
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        // TODO fill in code here
        this.employeeId = employeeId;
    }

    public String getName() {
        // TODO fill in code here and replace the return statement
        return name;
    }

    public void setName(String name) {
        // TODO fill in code here
        this.name = name;
    }

    public double getAverageMonthlySalary() {
        // TODO fill in code here and replace the return statement
        return averageMonthlySalary;
    }
    @Override
    public void calculatePay() {
        // This will be implemented in subclasses
    }
    @Override
    public String toString() {
        // TODO fill in code here and replace the return statement, be sure to format double value
        return "Employee ID: " + employeeId + ", Name: " + name + ", Average Monthly Salary: " + String.format("%.2f", averageMonthlySalary);
    }
}
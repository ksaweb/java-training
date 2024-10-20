public class ContractedEmployee extends Employee {
    // TODO fix class declaration and declare variables here
    private String federalTaxId;
    private double hourlyRate;
    private double numberOfHoursWorked;


    public ContractedEmployee(String employeeId, String name, String federalTaxId) {
        // TODO fill in code here
        super(employeeId, name);
        this.federalTaxId = federalTaxId;
    }

    public String getFederalTaxId() {
        // TODO fill in code here and replace the return statement
        return federalTaxId;
    }

    public void setFederalTaxId(String federalTaxId) {
        // TODO fill in code here
        this.federalTaxId = federalTaxId;
    }

    public double getHourlyRate() {
        // TODO fill in code here and replace the return statement
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        // TODO fill in code here
        this.hourlyRate = hourlyRate;
    }

    public double getNumberOfHoursWorked() {
        // TODO fill in code here and replace the return statement
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        // TODO fill in code here
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    // TODO fill in code here
    @Override
    public void calculatePay() {
        averageMonthlySalary = hourlyRate * numberOfHoursWorked;
    }

    private void setAverageMonthlySalary(double averageMonthlySalary) {
        super.averageMonthlySalary = averageMonthlySalary;
    }

    @Override
    public String toString() {
        return super.toString() + ", Federal Tax ID: " + federalTaxId;
    }
}
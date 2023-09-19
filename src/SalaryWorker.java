public class SalaryWorker extends Worker{
    private double annualSalary;
    public SalaryWorker(String ID, String firstName, String lastName, String title, int yob, double hourlyPayRate, double annualSalary) {
        super(ID, firstName, lastName, title, yob, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary/52;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        double totalPay = annualSalary/52;


        return super.getFirstName() + " " + super.getLastName() + "'s " + "weekly pay is " + calculateWeeklyPay(hoursWorked) + "; " +
                "annual salary is " + annualSalary;
    }
}
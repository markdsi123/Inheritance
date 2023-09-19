public class Worker extends Person {

    private double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int yob, double hourlyPayRate) {
        super(ID, firstName, lastName, title, yob);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public String toString() {
        return "Worker{" + "ID='" + this.getID() + '\'' +
                ", firstName='" + this.getFirstName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", title='" + this.getTitle() + '\'' +
                ", yob=" + this.getYob() + '\'' +
                ", hourlyPayRate=" + hourlyPayRate +
                '}';
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double totalPay = 0;
        double hoursOverTime = 0;
        if (hoursWorked > 40) {
            hoursOverTime = hoursWorked - 40;
            totalPay = (hourlyPayRate * 40) + hoursOverTime * 1.5 * hourlyPayRate;
        } else {
            totalPay = hoursWorked * hourlyPayRate;
        }
        return totalPay;
    }

    public String displayWeeklyPay(double hoursWorked) {
        double totalPay = 0;
        double hoursOverTime = 0;
        if (hoursWorked > 40) {
            hoursOverTime = hoursWorked - 40;
            totalPay = (hourlyPayRate * 40) + hoursOverTime * 1.5 * hourlyPayRate;
        } else {
            totalPay = hoursWorked * hourlyPayRate;
        }
        return "Your overtime pay is: " + hoursOverTime * 1.5 * hourlyPayRate + "\n" +
                "Your total pay is: " + totalPay;
    }
}
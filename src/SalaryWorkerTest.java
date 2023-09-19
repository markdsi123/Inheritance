public class SalaryWorkerTest {
    public static void main(String[] args) {
        SalaryWorker worker = new SalaryWorker("123", "Mark", "Dsilva", "mr", 2004, 50, 5000);
        System.out.println(worker.calculateWeeklyPay(500));
        System.out.println(worker.displayWeeklyPay(500));

    }
}
public class WorkerTest {
    public static void main(String[] args) {
        Worker worker = new Worker("123", "Mark", "Dsilva", "mr", 2004, 50);

        System.out.println(worker.calculateWeeklyPay(41));
        System.out.println(worker.displayWeeklyPay(41));

    }
}
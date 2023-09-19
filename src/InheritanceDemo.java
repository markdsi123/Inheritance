import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workerList = new ArrayList<>();
        Worker worker1 = new Worker("001", "Bilbo","Baggins", "Mr.",1982, 15);
        Worker worker2 = new Worker("002", "Frodo","Baggins", "Mrs.",1986, 17);
        Worker worker3 = new Worker("003", "Samwise","Gamgee", "Mr.",1990, 13);
        SalaryWorker worker4 = new SalaryWorker("004", "Peregrin","Took", "Mr.",1992, 20, 50000);
        SalaryWorker worker5 = new SalaryWorker("005", "Meridoc","Brandybuck", "Ms.",2000, 19, 45000);
        SalaryWorker worker6 = new SalaryWorker("006", "Mark","Dsilva", "Mr.",2004, 19, 46000);
        workerList.add(worker1);
        workerList.add(worker2);
        workerList.add(worker3);
        workerList.add(worker4);
        workerList.add(worker5);
        workerList.add(worker6);


        for (int week =1; week <4; week ++) {

            System.out.printf("%8s%8s%15s%15s%10s%10s%15s%20s", "Week" + week, "ID", "First Name", "Last Name", "Title", "YOB", "Pay Rate", "Weekly Pay");
            System.out.println();
            for (int i = 0; i < 101; i++) {
                System.out.printf("=");
            }
            System.out.println();

            if(week == 1)
            {
                for(Worker w : workerList)
                {
                    System.out.printf("%8s%8s%15s%15s%10s%10s%12s%18s"," ", w.getID(), w.getFirstName(), w.getLastName(), w.getTitle(), w.getYob(), w.getHourlyPayRate(), Math.round(w.calculateWeeklyPay(40)));
                    System.out.println();
                }
                System.out.println();
            }
            if(week == 2)
            {
                for(Worker w : workerList)
                {
                    System.out.printf("%8s%8s%15s%15s%10s%10s%12s%18s"," ", w.getID(), w.getFirstName(), w.getLastName(), w.getTitle(), w.getYob(), w.getHourlyPayRate(), Math.round(w.calculateWeeklyPay(50)));
                    System.out.println();
                }
                System.out.println();
            }
            if(week == 3)
            {
                for(Worker w : workerList)
                {
                    System.out.printf("%8s%8s%15s%15s%10s%10s%12s%18s"," ", w.getID(), w.getFirstName(), w.getLastName(), w.getTitle(), w.getYob(), w.getHourlyPayRate(), Math.round(w.calculateWeeklyPay(40)));
                    System.out.println();
                }
                System.out.println();
            }
        }

    }
}
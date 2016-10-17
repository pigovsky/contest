import com.Fenovka.lab1.model.Worker;
import com.Fenovka.lab1.util.WorkerBuilder;

public class Main {
    public static void main(String[] args) {
        Worker slayers[] = WorkerBuilder.generateWorkers(100000);

        for (Worker slayer:slayers) {
            System.out.println("----------SLAYER-----------");
            System.out.println(slayer.toString());
            System.out.println("---------------------------");
            System.out.println();
        }


    }
}

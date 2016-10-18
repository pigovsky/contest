import com.viktor.model.Worker;
import util.WorkerBuilder;

public class App
{
    public static void main(String[] args)
    {
        Worker worker[] = WorkerBuilder.generateWorkers();
        for (Worker w:worker)
        {
            System.out.println(w.toString());
        }
    }
}

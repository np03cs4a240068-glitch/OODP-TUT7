import java.util.LinkedList;
import java.util.Queue;

public class PrintQueueManager {

    public static void main(String[] args) {

        Queue<String> printQueue = new LinkedList<>();

        printQueue.add("Document1");
        printQueue.add("Document2");
        printQueue.add("Document3");

        String printedJob = printQueue.poll(); 
        System.out.println("Printed: " + printedJob);
        printQueue.add("Document4");
        printQueue.add("Document5");
        String nextJob = printQueue.peek(); 
        System.out.println("Next job in queue: " + nextJob);

        System.out.println("Current print queue: " + printQueue);
    }
}

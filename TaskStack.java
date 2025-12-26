import java.util.Stack;

public class TaskStack {

    public static void main(String[] args) {

        Stack<String> tasks = new Stack<>();

        tasks.push("Read");
        tasks.push("Write");
        tasks.push("Code");

        String poppedTask = tasks.pop();
        System.out.println("Popped task: " + poppedTask);

        tasks.push("Debug");
        tasks.push("Test");

        String topTask = tasks.peek();
        System.out.println("Top task: " + topTask);

        System.out.println("Current Stack: " + tasks);
    }
}

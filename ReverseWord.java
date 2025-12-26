import java.util.Stack;

public class ReverseWord {

    public static void main(String[] args) {
        // Input sentence
        String sentence = "Hello World";

        // Create a stack to store words
        Stack<String> stack = new Stack<>();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Push each word onto the stack
        for (String word : words) {
            stack.push(word);
        }

        // Pop the words from the stack and form the reversed sentence
        StringBuilder reversedSentence = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedSentence.append(stack.pop()).append(" ");
        }

        System.out.println(reversedSentence.toString().trim());
    }
}

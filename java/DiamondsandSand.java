import java.util.Scanner;
import java.util.Stack;

public class DiamondsandSand {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
        
            String input = in.next();
            Stack<Character> stack = new Stack<>();
             int count = 0 ;
            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);
                if (c == '<') {
                    stack.push(c);
                } else if (c == '>' && !stack.isEmpty()) {
                    stack.pop();
                    count++;

                }
            }

            System.out.println(count);
        }
    }
}

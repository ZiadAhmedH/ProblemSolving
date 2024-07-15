import java.util.Scanner;

public class ACreatingWords{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int size = in.nextInt();

        for(int i =0  ; i < size ; i++){
            String word1 = in.next();
            String word2 = in.next();

            char[] word1A = word1.toCharArray();
            char[] word2A = word2.toCharArray();
            char holder = word1A[0];

            word1A[0] = word2A[0];
           
            word2A[0] = holder;

            word1 = new String(word1A);
            word2 = new String(word2A);


            System.out.println(word1 + " " + word2);

        }
        
    }
}
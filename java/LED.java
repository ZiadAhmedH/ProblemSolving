import java.util.Scanner;

public class LED {
       
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int testCases = in.nextInt();

         for(int i = 0 ;i< testCases ; i++){
                String text = in.next();
                long ledCounter = 0 ;
                for(int j = 0 ; j< text.length() ; j++){
                     if(text.charAt(j) == '1'){
                        ledCounter +=2;
                     }
                     else if(text.charAt(j) == '7'){
                        ledCounter +=3;
                     } 
                     else if(text.charAt(j) == '4'){
                       ledCounter +=4;
                     }
                     else if(text.charAt(j) == '2' || text.charAt(j) == '3' || text.charAt(j)== '5'){
                       ledCounter +=5;
                     }
                     else if(text.charAt(j) == '6' || text.charAt(j) == '9' ||text.charAt(j) == '0' ){
                       ledCounter +=6;
                     }
                     else if(text.charAt(j) == '8'){
                        ledCounter +=7;
                     }
                }
                System.out.println(ledCounter + " leds");
         }

    

    }
}

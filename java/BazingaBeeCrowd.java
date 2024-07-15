import java.util.Scanner;

class BazingaBeeCrowd{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();

        for(int i = 0; i < testCases; i++){
            String Sheldon = in.next();
            String Raj = in.next();
        if (Sheldon.toString().equals(Raj.toString())) {
            System.out.println("Caso #" + (i + 1) + ": De novo!");
        } else if (Sheldon.equals("tesoura") && (Raj.equals("papel") || Raj.equals("lagarto"))) {
            System.out.println("Caso #" + (i + 1) + ": Bazinga!");
        } else if (Sheldon.equals("papel") && (Raj.equals("pedra") || Raj.equals("Spock"))) {
            System.out.println("Caso #" + (i + 1) + ": Bazinga!");
        } else if (Sheldon.equals("pedra") && (Raj.equals("lagarto") || Raj.equals("tesoura"))) {
            System.out.println("Caso #" + (i + 1) + ": Bazinga!");
        } else if (Sheldon.equals("lagarto") && (Raj.equals("Spock") || Raj.equals("papel"))) {
            System.out.println("Caso #" + (i + 1) + ": Bazinga!");
        } else if (Sheldon.equals("Spock") && (Raj.equals("tesoura") || Raj.equals("pedra"))) {
            System.out.println("Caso #" + (i + 1) + ": Bazinga!");
        } else {
            System.out.println("Caso #" + (i + 1) + ": Raj trapaceou!");
        }
           
        }
    }

}
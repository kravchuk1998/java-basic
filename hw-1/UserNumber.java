import java.util.Random;
import java.util.Scanner;



public class UserNumber {
    public static void main(String[] args) {
        Random random= new Random(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Let the game begin!");



        while (true) {
            System.out.println ("Enter your number");
            int enterNumber = scanner.nextInt();
            if (enterNumber < random.nextInt() ){
                System.out.println("Your number is too small. Please, try again...");
            }else if(enterNumber > random.nextInt()){
                System.out.println("Your number is too big. Please, try again...");
            }else{
                System.out.println("Congratulations," + name +"!");
                break;
            }
        }



    }
}

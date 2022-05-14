import java.util.Arrays;
import java.util.Scanner;


public class Shooting {
    public static void main(String[] args) {
        String[][] cities = new String[5][5];

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities.length; j++) {
                cities[i][j] = "-";

            }
        }
        System.out.println("All set. Get ready to rumble!.");

        System.out.print("0 | 1 | 2 | 3 | 4 | 5 |");
        for (int i = 0; i < cities.length; i++) {
            System.out.println();
            System.out.print(i + 1 + " | ");
            for (int j = 0; j < cities.length; j++) {

                System.out.print(cities[i][j] + " | ");

            }
        }
        System.out.println();
        int x = (int) (Math.random() * 5);
        int y = (int) (Math.random() * 5);

        System.out.println(x);
        System.out.println(y);

        Scanner scanner = new Scanner(System.in);
        int userNumber1 = 0;
        int userNumber2 = 0;

        while (true) {
            while (true) {
                System.out.println();
                System.out.println("Please enter firs line");
                userNumber1 = scanner.nextInt();
                if (userNumber1 >= 1 && userNumber1 <= 5) {
                    break;

                }
            }
            while (true) {

                System.out.println("Please enter second line");
                userNumber2 = scanner.nextInt();
                if (userNumber2 >= 1 && userNumber2 <= 5) {
                    break;
                }
            }
            cities[userNumber1-1][userNumber2-1] = "*";

            if(userNumber1-1 == x && userNumber2-1 == y )
            {
                System.out.println("You have won!");
                break;
            }



            System.out.print("0 | 1 | 2 | 3 | 4 | 5 |");
            for (int i = 0; i < cities.length; i++) {
                System.out.println();
                System.out.print(i + 1 + " | ");
                for (int j = 0; j < cities.length; j++) {

                    System.out.print(cities[i][j] + " | ");

                }
            }


        }








    }

}






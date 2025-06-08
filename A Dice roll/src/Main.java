import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean diceRoll = true;
        int correctNum = 0;

        Scanner myObj = new Scanner(System.in);

        while (diceRoll) {
            System.out.println("Enter a number between 0 to 6: ");

            if (!myObj.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number from 0 to 6.");
                myObj.next(); // Clear invalid input
                continue;
            }

            int userDiceNumber = myObj.nextInt();

            if (userDiceNumber < 0 || userDiceNumber > 6) {
                System.out.println("Number out of range. Try again.");
                continue;
            }

            int randomNum = (int) (Math.random() * 7); // 0 to 6
            System.out.println("Rolling the dice...");

            if (userDiceNumber == randomNum) {
                correctNum = randomNum;
                diceRoll = false;
            } else {
                System.out.println("Ouch! It was " + randomNum + ", not " + userDiceNumber + ".");
            }
        }

        System.out.println("Congratulations! You correctly predicted " + correctNum + ".");
        myObj.close();
    }
}

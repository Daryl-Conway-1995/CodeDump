import java.util.Scanner;

public class CodeMain {

    public static void main(String args[]) {
        HotVCold hotVCold = new HotVCold();
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
        int option =1;
        while (playAgain) {
            hotVCold.runGame();
            System.out.println("Would you like to play again? [0]no [1]yes");
            option=scanner.nextInt();
            if (option !=1)
            {
                playAgain = false;
            }
        }
    }
}

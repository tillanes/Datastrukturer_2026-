import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {


    static int getIntInput(String question) {
        System.out.println(question);
        int int1;
        while (true) {
            Scanner userInput = new Scanner(System.in);
            try {
                int1 = userInput.nextInt();
                break;
            }
            catch (InputMismatchException e){
                System.out.println(question);
            }
        }
        return int1;

    }
}
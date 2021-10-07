import java.util.Scanner;

public class inputTutorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name :");
        String name = scanner.nextLine();

        System.out.println("Enter year of birth :");
        int year_of_birth = scanner.nextInt();

        if( year_of_birth > 2010){
            System.out.println("Year of birth is greater than 2010");
        }else {
            System.out.println("Good to go");
        }

    }
}

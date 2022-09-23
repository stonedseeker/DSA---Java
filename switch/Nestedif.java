import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Stonedseeker");
                break;
            case 2:
                System.out.println("Vaibhav");
                break;
            case 3:
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                }
                break;
        }

    }
}


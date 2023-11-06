import java.util.Scanner;
public class LinearEquationLogic {
    Scanner scan = new Scanner(System.in);

    private String coord1;
    private String coord2;
    private LinearEquation LinearEquation;


    public LinearEquationLogic() {

    }

    public void start() {
        
    }

    private void getCoords() {
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        coord1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        coord2 = scan.nextLine();
        LinearEquation = new LinearEquation(coord1, coord2);

    }
}

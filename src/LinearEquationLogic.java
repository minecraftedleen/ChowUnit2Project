import java.util.Scanner;
public class LinearEquationLogic {
    Scanner scan = new Scanner(System.in);

    private String coord1;
    private String coord2;
    private LinearEquation LinearEquation;
    private int x1;
    private int x2;
    private int y1;
    private int y2;


    public LinearEquationLogic() {

    }

    public void start() {
        getCoords();
        System.out.println(LinearEquation.lineInfo());
    }

    private void getCoords() {
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        coord1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        coord2 = scan.nextLine();
        int divideIndex1 = coord1.indexOf(",");
        int divideIndex2 = coord2.indexOf(",");
        x1 = Integer.parseInt(coord1.substring(1, divideIndex1));
        y1 = Integer.parseInt(coord1.substring(divideIndex1 + 2, coord1.length() - 1));
        x2 = Integer.parseInt(coord2.substring(1, divideIndex2));
        y2 = Integer.parseInt(coord2.substring(divideIndex2 + 2, coord2.length() - 1));
        LinearEquation = new LinearEquation(x1, y1, x2, y2);

    }
}

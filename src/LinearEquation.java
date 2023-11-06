import java.io.*;
public class LinearEquation  {

    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private String coord1;
    private String coord2;

    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        coord1 = "(" + x1 + ", " + y1 + ")";
        coord2 = "(" + x2 + ", " + y2 + ")";

    }

    public double distance() {
        return roundedToHundredth(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }

    public double yIntercept() {
        return roundedToHundredth(y1 - (x1 * slope()));
    }

    public double slope() {
        return roundedToHundredth((double) (y2 - y1) / (x2 - x1));
    }

    public String equation() {
        if (slope() != 0) {
            return "y = " + slope() + "x " + "+ " + yIntercept();
        }
        else {
            return "y = " + yIntercept();
        }
    }

    public String coordinateForX(double x) {
        double yCoord = roundedToHundredth(slope() * x + yIntercept());
        return "(" + roundedToHundredth(x) + ", " + yCoord + ")";
    }

    public String lineInfo() {
        String allLines = "The two points are: " + coord1 + " and " + coord2 + "\n";
        allLines += "The equation of the lines between these points is: " + equation() + "\n";
        allLines += "The slope of this line is: " + slope() + "\n";
        allLines += "The y inercept of this line is: " + yIntercept() + "\n";
        allLines += "The distance between these points is " + distance();
        return allLines;
    }

    public double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100) / 100.0;

    }

}

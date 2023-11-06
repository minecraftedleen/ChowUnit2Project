import java.io.*;
public class LinearEquation  {

    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private String coord1;
    private String coord2;

    public LinearEquation(String coord1, String coord2) {
        this.coord1 = coord1;
        this.coord2 = coord2;
        int divideIndex1 = coord1.indexOf(",");
        int divideIndex2 = coord1.indexOf(",");
        x1 = Integer.parseInt(coord1.substring(0, divideIndex1));
        y1 = Integer.parseInt(coord1.substring(divideIndex1 + 1));
        x2 = Integer.parseInt(coord2.substring(0, divideIndex2));
        y2 = Integer.parseInt(coord2.substring(divideIndex2 + 1));
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

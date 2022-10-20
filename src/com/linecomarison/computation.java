package com.linecomarison;

public class computation {
    public static void main(String[] args) {
        LineComputationComparison c = new LineComputationComparison();
        c.setFirstLineX1Coordinate(3);
        c.setFirstLineX2Coordinate(4);
        c.setFirstLineY1Coordinate(5);
        c.setFirstLineY2Coordinate(5);
        c.setSecondLineY1Coordinate(6);
        c.setSecondLineX1Coordinate(4);
        c.setSecondLineX2Coordinate(8);
        c.setSecondLineY2Coordinate(5);
        System.out.println("\nTwo Line Computation Comparison : " + c.toString());
        int LengthFirstLine = ((c.getFirstLineX2Coordinate() - c.getFirstLineX1Coordinate()) ^ 2 +
                (c.getFirstLineY2Coordinate() - c.getFirstLineY1Coordinate()) ^ 2);
        int LengthSecondLine = ((c.getSecondLineX2Coordinate() - c.getSecondLineX1Coordinate()) ^ 2
                + (c.getFirstLineY2Coordinate() - c.getSecondLineY1Coordinate()) ^ 2);
        System.out.println("\nLength of the first line: " + LengthFirstLine);
        System.out.println("Length of second line: " + LengthSecondLine);


        Boolean equality = Check_Equality(LengthFirstLine, LengthSecondLine); //Checking Equality of two lines
        if (equality == true)
            System.out.println("Lines Are Equal");
        else
            System.out.println("Lines are not equal\n");

        Integer result = Comparison(LengthFirstLine, LengthSecondLine); //Checking Comparison of two lines.
        if (result == 0)
            System.out.println("Length of first line = length of second line");
        else if (result < 0)
            System.out.println("Length of first line < length of second line");
        else
            System.out.println("Length of first line > length of second line");
    }

    public static Boolean Check_Equality(Integer first, Integer second) {

        Integer lengthfirstLine = first;
        Integer lengthsecondLine = second;
        Boolean result = lengthfirstLine.equals(lengthsecondLine);
        return (result);
    }

    public static int Comparison(Integer first, Integer second) {
        Integer lenfirstLine = first;
        Integer lensecondLine = second;
        Integer result = lenfirstLine.compareTo(lensecondLine);
        return (result);
    }
}
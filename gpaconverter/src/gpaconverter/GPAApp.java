package gpaconverter;

import java.util.Scanner;

public class GPAApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GPAConverter converter = new GPAConverter();

        System.out.print("Enter student's GPA (0.0 - 4.0): ");
        double gpa = input.nextDouble();

        String result = converter.convertGpaToPercent(gpa);

        System.out.printf("GPA: %.1f corresponds to %s%n", gpa, result);

        input.close();
    }
}

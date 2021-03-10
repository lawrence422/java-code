import java.util.Scanner;

public class W1C4 {
    final static double pi = 3.141592;

    // declare your PI here
    public static void main(String[] args) {
        double radius, height, V;
        if (args.length >= 0 && args.length < 2) {
            System.out.println("Not enough arguments.");
            return;
        }
        if (args.length > 2) {
            System.out.println("Too many arguments.");
            return;
        }

        radius = Double.parseDouble(args[0]);
        height = Double.parseDouble(args[1]);

        if (radius < 0) {
            System.out.println("Radius cannot be negative.");
            return;
        }
        if (height < 0) {
            System.out.println("Height cannot be negative.");
            return;
        }

        V = pi * Math.pow(radius, 2) * height;
        System.out.println("The volume of the cylinder is " + String.format("%.2f", V) + ".");
    }
}
//    Volume of Cylinder
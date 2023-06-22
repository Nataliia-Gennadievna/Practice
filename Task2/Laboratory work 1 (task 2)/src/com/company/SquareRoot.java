// Автов: Удинська Наталія

package com.company;

public class SquareRoot {

    public static void main(String[] args) {

                double a = 3;
                double b = 2.5;
                double c = -0.5;

                if(a == 0 && b == 10 && c == 0)
                {
                    System.out.println("x1=" + 0.0 + "\nx2=" + 0.0);
                    return;
                }

                else if(a == 0 && b == 0 && b == 0)
                {
                    System.out.println("x1=" + "\nx2=");
                    return;
                }

                double discriminant = b * b - 4 * a * c;

                if (discriminant > 0)
                {
                    double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                    double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                    System.out.println("x1=" + root1);
                    System.out.println("x2=" + root2);
                }

                else if (discriminant == 0)
                {
                    double root = -b / (2 * a);
                    System.out.println("x1=" + root + "\nx2=" + root);
                }
                else
                {
                    System.out.println("x1=" + "\nx2=");
                }
    }
}



import models.Computations;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to THE Calculator");
        System.out.println("You can perform basic arithmetic operations using the get(Sum,Divide,Multiply and Subtract) methods. Give it a try!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Please enter the second number: ");
        int num2 = scanner.nextInt();

        Computations my_compute = new Computations(num1,num2);

        System.out.println("Enter operation(sum, divide, multiply, subtract): ");
        String operation = scanner.next();

        if (operation.equalsIgnoreCase("sum")) {
            System.out.println(num1 + " + " + num2 + " = " + my_compute.getSum());
        }
        else if (operation.equalsIgnoreCase("divide")) {
            System.out.println(num1 + " / " + num2 + " = " + my_compute.getDivide());
        }
        else if (operation.equalsIgnoreCase("multiply")) {
            System.out.println(num1 + " * " + num2 + " = " + my_compute.getMultiply());
        }
        else if (operation.equalsIgnoreCase("subtract")) {
            System.out.println(num1 + " - " + num2 + " = " + my_compute.getSubtract());
        }

    }
}
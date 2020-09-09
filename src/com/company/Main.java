package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //Dev Note 1: Outputs keeps coming out on one line...need to fix

        System.out.print("Greetings, user.");
        System.out.print("What is your name?"); //Dev Note 2: Customer should be able to provide their name on the next line
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello " + name);
        System.out.print("FEIGNED INTEREST: Oh my, what a WONDERFUL name " + name);     //Dev Note3: Buildatron should then say the customer's name at the end of this sentence
        System.out.print("Do you want to order something now?");
        System.out.print("We have the following items available:");

        //Dev Note 4: Buildatron wants the following information for each item
        // The item SKU, the item name, the item cost, and the final cost for purchasing the entire stock. All money items should be represented with $ before the value.

        String item1SKU = ("REV-41-1595");
        String item1Name = ("Control Hub");
        double item1Cost = 5.50;
        double item1Quantity = 1.0;
        System.out.print("Control Hub costs $" + item1Cost);
        String item2SKU = ("REV-31-1425");
        String item2Name = ("Touch Sensor");
        double item2Cost = 11.00;
        double item2Quantity = 1.0;
        System.out.print("Touch Sensor costs $" + item2Cost);
        String item3SKU = ("REV-31-1557");
        String item3Name = ("Color Sensor V3");
        double item3Cost = 14.00;
        double item3Quantity = 1.0;
        System.out.print("Color Sensor V3 $" + item3Cost);
        String item4SKU = ("REV-39-1647");
        String item4Name = ("Logitech USB Gamepad");
        double item4Cost = 22.00;
        double item4Quantity = 1.0;
        System.out.print("Logitech USB Gamepad costs $" + item4Cost);
        String item5SKU = ("REV-31-1426");
        String item5Name = ("USB Female A to Micro USB Adapter ");
        double item5Cost = 3.00;
        double item5Quantity = 1.0;
        System.out.print("USB Female A to Micro USB Adapter costs $" + item5Cost);
        String item6SKU = ("REV-31-1408");
        String item6Name = ("4-Pin JST PH Sensor Cable, 50CM ");
        double item6Cost = 2.00;
        double item6Quantity = 4.0;
        System.out.print("4-Pin JST PH Sensor Cable, 50CM costs $" + item6Cost);
        double totalStock = (item1Cost * item1Quantity) + (item2Cost * item2Quantity) + (item3Cost * item3Quantity) + (item4Cost * item4Quantity) + (item5Cost * item5Quantity) + (item6Cost * item6Quantity);
        System.out.print("My entire stock costs $" + totalStock);

    }
}


/*

--------Items In Stock--------

Control System and Sensors:
QTY 1 - Control Hub (REV-41-1595)
QTY 1 - Android Driver's Station Device
QTY 1 - Touch Sensor (REV-31-1425)
QTY 1 - Color Sensor V3 (REV-31-1557)
QTY 1 - Logitech USB Gamepad (REV-39-1647)
QTY 1 - USB Female A to Micro USB Adapter (REV-31-1426)
QTY 4 - 4-Pin JST PH Sensor Cable, 50CM (REV-31-1408)

*/

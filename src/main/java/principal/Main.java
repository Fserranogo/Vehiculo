package principal;

import clases.Vehicle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TODO Auto-generated method stub

        Vehicle vehicle;

        String marcacoche;
        String modelocoche;
        int anycompracoche;
        float llitresdiposit;

        /*
         * Demanem totes les dades del coche,marca,model,etc...
         *
         */

        System.out.print("Marca del cotxe? ");
        Scanner sc = new Scanner(System.in);
        marcacoche = sc.next();

        System.out.print("Model del cotxe? ");
        sc = new Scanner(System.in);
        modelocoche = sc.next();

        System.out.print("Any de compra del cotxe? ");
        sc = new Scanner(System.in);
        anycompracoche= Integer.parseInt(sc.next());


        System.out.print("Numero de llitres que portes al diposit? ");
        sc = new Scanner(System.in);
        llitresdiposit= Float.parseFloat(sc.next());


        vehicle = new Vehicle(marcacoche,modelocoche, anycompracoche);

        marcacoche=vehicle.getMarca();
        modelocoche=vehicle.getModel();
        anycompracoche=vehicle.getAnycompra();

        llitresdiposit=Vehicle.autonomia(llitresdiposit);

        DecimalFormat df = new DecimalFormat("0.00"); 	//Mostrar nomes 2 decimals



        System.out.println("Marca del cotxe:"+ marcacoche);
        System.out.println("Modelo del cotxe:"+ modelocoche);
        System.out.println("Any de compra del cotxe:"+ anycompracoche);

        System.out.println("Numero de kilometres que es poden fer:"+df.format(llitresdiposit)+"Km");

    }
}
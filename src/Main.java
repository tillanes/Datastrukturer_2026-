import jdk.jshell.execution.Util;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        FileUtils.WriteTextFile("morjens","greeting.txt");
        System.out.println(FileUtils.readTextFile("greeting.txt"));


        System.exit(0);
        //int myInt = Utils.getIntInput("Mata in ett heltal");
        while(true) {

            Random random = new Random();

            int rand = random.nextInt(99);

            System.out.println(rand);

            System.out.println("Enter för nytt, q för att avsluta.");

            Scanner textInput = new Scanner(System.in);
            String str1 = textInput.nextLine();

            if (Objects.equals(str1, "q")){
                break;
            }

        }



        System.exit(0);



        BikeShop bikeShop = new BikeShop();


        bikeShop.addBike(new Bike("scott", 500));

        bikeShop.getBike(0).addSpec("Wheel-size", "29 inch");
        bikeShop.getBike(0).addSpec("suspension", "hardtail");

        System.out.println(bikeShop.getBike(0).getSpecsString());


        bikeShop.addBike(new Bike("Jopo", 45));
        bikeShop.addBike(new Bike("Specialized", 275));


        System.out.println("welcome to the bikeshop");

        for (int i = 0; i < bikeShop.getBikeCount(); i++) {


            System.out.println(bikeShop.getBike(i).getName());
        }

        /*
        Calculator calculator = new Calculator();

        System.out.println(calculator.multiply(4,5));
        */





    }

}

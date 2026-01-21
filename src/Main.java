import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

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

        Calculator calculator = new Calculator();

        System.out.println(calculator.multiply(4,5));

        System.exit(0);

        System.out.println("Hej");

        Shirt shirt = new Shirt("Nike");

        System.out.println(shirt.getName() +" is a "+shirt.clothingType);

        Shirt shirt2 = new Shirt("adidas");

        System.out.println(shirt2.getName() +" is a "+shirt.clothingType);



    }

}

public class Main {

    public static void main(String[] args) {
        System.out.println("Hej");

        Shirt shirt = new Shirt("Nike");

        System.out.println(shirt.getName() +" is a "+shirt.clothingType);

        Shirt shirt2 = new Shirt("adidas");

        System.out.println(shirt2.getName() +" is a "+shirt.clothingType);

    }

}

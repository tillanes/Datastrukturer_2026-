public class Shirt extends Clothing implements Shoppable{



    public Shirt(String name){
        super.name = name;
        super.clothingType = "T-shirt";

    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public int getStock() {
        return 0;
    }
}

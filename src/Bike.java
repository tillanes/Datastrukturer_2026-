import java.util.HashMap;

public class Bike extends Vehicle implements Shoppable{

    double price;

    private HashMap<String, String> specs = new HashMap<>();

    public Bike(String name, double price){
        super.name = name;
        this.price = (price);
    }

    public void addSpec (String key, String value) {
        specs.put(key, value);
    }

    public String getSpecsString(){
        String ret = "";
        for (String key: specs.keySet()) {
            ret += String.format("%s: %s",
                    key,
                    specs.get(key));
        }return ret;
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

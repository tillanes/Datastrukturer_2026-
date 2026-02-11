import java.util.ArrayList;
import java.util.Arrays;

public class StringArray {

    String[] values;

    public StringArray(String[] values) {
        this.values = values;
        System.out.println("New StringArray. length: "+values.length);
    }

    public void apppend(String newValue) {
       String[] newValues = new String [values.length+1];
        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }
       newValues[values.length] = newValue;
        values = newValues;
        //System.out.println("append: "+newValue);
    }

    public void insert(int index, String value){
        apppend(null);
        for (int i = values.length-1; i > index; i--) {
            values[i] = values[i -1];
        }
        values[index] = value;
        System.out.println("Insert: "+value +"at "+index);
    }

    public String toString(){

       return Arrays.toString(values);
    }

    public void reverse(){
        String[] newArray= new String [values.length];

        int len = values.length-1;

        for (int i = 0; i < values.length; i++) {

           newArray[i] = values[len];
           len --;


        }
        values = newArray;

    }



}

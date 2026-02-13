public class Stacky {
    int topOfStack = -1;
    int stackSize;

    String[] data;

    public Stacky(int stackSize) {
        this.stackSize = stackSize;
        data = new String[stackSize];
    }

    public void push(String elem){
        if(topOfStack +1 >= stackSize) {
            throw new StackOverflowError("Stacken är full");
        }
        topOfStack++;
        data[topOfStack] = elem;
    }

    public String pop(){
        String ret = data[topOfStack];
        topOfStack--;
        return ret;
    }

    public String toString() {
        String ret = "Stacky: [ ";

        for (int i = topOfStack; i >= 0; i--) {
            ret += " " + data[i];
        }
        ret += " ]";
        return ret;

    }


}

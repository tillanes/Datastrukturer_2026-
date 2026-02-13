public class Linky {
    private Node first;
    private Node last;


    private class Node{

        Person person;
        Node next;

        Node (Person person, Node next) {

            this.person = person;
            this.next = next;
        }
        public String getPersonName(){
            return this.person.getName();
        }
    }
    public void add(Person person){
        Node n = new Node(person, null);
        if (first == null) first = n;
        if (last != null) last.next = n;
        last = n;
    }
    public int size() {
        Node current = first;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }




    @Override
    public String toString() {
        Node current = first;
        String ret = "Linky: [ ";
        while(current != null){
            ret += " " + current.getPersonName();
            current = current.next;
        }
        ret += " ]";
        return ret;

    }

}

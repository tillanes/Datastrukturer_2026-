import jdk.jshell.execution.Util;

import java.io.File;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String [] testData = {"Walter","Jesse","Skyler","Hank","Marie","Saul","Gus","Mike","Walter","Lydia","Todd","Tuco","Hector","Steve","Jane","Skinny","Badger","Andrea","Brock","Gale","Ted","Tyrus","Victor","Combo","Emilio","Domingo","Eladio","Juan","Leonel","Marco","Carmen","Gretchen","Elliott","Bogdan","Huell","Patrick","Joe","Francesca","Ed","Declan"};

        Person p1 = new Person(testData[0]);
        Person p2 = new Person(testData[1], p1);
        Person p3 = new Person(testData[0], p2);
        Person p4 = new Person(testData[1], p3);

        Person pMid = new Person("Midperson", p2);
        p3.next = pMid;



        Person current = p4;
        while(current != null){
            System.out.println(current.getName());
            current = current.next;
        }


        System.exit(0);
        StringArray names = new StringArray(testData);

        System.out.println(names.toString());
        names.insert(1,"Marge");

        names.reverse();
        System.out.println(names);

        //new bigO();

    }

}

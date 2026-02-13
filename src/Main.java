import jdk.jshell.execution.Util;

import java.io.File;
import java.lang.reflect.Array;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        String[] weekDays = {"må", "ti", "ons", "to", "fre", "lö", "sö"};


        int today = 5;

        System.out.println(weekDays[today]);

        int future = 14;

        int futureDay = (future+today) % 7;

        System.out.println("Idag är det "+weekDays[today] +" om "+ future+ " dagar är det: "+ weekDays[futureDay]);


        */
        String [] testData = {"Walter","Jesse","Skyler","Hank","Marie","Saul","Gus","Mike","Walter","Lydia","Todd","Tuco","Hector","Steve","Jane","Skinny","Badger","Andrea","Brock","Gale","Ted","Tyrus","Victor","Combo","Emilio","Domingo","Eladio","Juan","Leonel","Marco","Carmen","Gretchen","Elliott","Bogdan","Huell","Patrick","Joe","Francesca","Ed","Declan"};


        Stacky stacky = new Stacky(5);
        stacky.push(testData[30]);
        stacky.push(testData[32]);
        stacky.push(testData[12]);
        stacky.push(testData[15]);
        stacky.push(testData[0]);
        System.out.println(stacky);
        stacky.pop();
        stacky.pop();
        System.out.println(stacky);


        Linky linky = new Linky();
        linky.add(new Person(testData[0]));
        linky.add(new Person(testData[1]));
        linky.add(new Person(testData[3]));
        linky.add(new Person(testData[4]));

        System.out.println(linky.toString());
        System.out.println(linky.size());

        Queuey q = new Queuey();
        q.enequeqe("Samuel");
        q.enequeqe("Mikale");
        q.enequeqe("Viktor");
        q.enequeqe("Ismo");

        System.out.println(q);
        q.dequeue();
        System.out.println(q);

        System.exit(0);
        StringArray names = new StringArray(testData);

        System.out.println(names.toString());
        names.insert(1,"Marge");

        names.reverse();
        System.out.println(names);

        //new bigO();

    }

}

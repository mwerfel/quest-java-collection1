import java.util.*;

public class Thanos {

    public static void main(String[] args) {


     // Create a new Heroes Array List and add Heroes and Heroins

     ArrayList<Hero> heroes = new ArrayList<Hero>();

        heroes.add(new Hero("Black Widow",34));
        heroes.add(new Hero("Captain America",100));
        heroes.add(new Hero("Vision",3));
        heroes.add(new Hero("Iron Men",48));
        heroes.add(new Hero("Scarlet Witch",29));
        heroes.add(new Hero("Thor",1500));
        heroes.add(new Hero("Hulk",49));
        heroes.add(new Hero("Doktor Strange",42));

        // It's Thor birthday, now he's 1501
         Hero birthday = new Hero("Thor",1501); 
         heroes.set(5,birthday);

   
        // Shuffle the heroes list
         //before shuffle
         System.out.println();
         System.out.println("Before shuffle...");
         for (Hero count : heroes) {
            System.out.println (count.getName() + " " + count.getAge());
           }

           // Shuffle
           Collections.shuffle(heroes);

           System.out.println();
           System.out.println("After the truffle shuffle...");
           for (Hero count : heroes) {
              System.out.println (count.getName() + " " + count.getAge());
             }

        // Keep only the half of the list
         for (int number = 7; number >3; number--) {
          heroes.remove(number);
         }

        // Loop throught the list and display the name of the remaining heroes

        System.out.println();
        System.out.println("Remaining participants...");        
        for (Hero count : heroes) {
         System.out.println (count.getName() + " " + count.getAge());
        }

    }
}

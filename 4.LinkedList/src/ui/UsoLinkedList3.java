package ui;

import java.util.Collections;
import java.util.LinkedList;
import entities.*;

public class UsoLinkedList3 {

    public static void main(String[] args) {

        LinkedList<Person> people = new LinkedList<>();

        Person p=new Person(11111111,"John","Doe");
        Person p1=new Person(22222222,"Juan","Perez");

        people.add(p);
        people.push(p1);
        people.add(new Person(33333333, "Fulano", "de Tal"));


        System.out.println("Uso de toString");
        System.out.println(people);

        System.out.println();System.out.println();

        System.out.println("people.get(1): "+people.get(1));
        System.out.println();System.out.println();



        Person pCopy=new Person(11111111,"Johny","Doe");

        System.out.println("Uso de equals");
        System.out.println("Contains pCopy: "+people.contains(pCopy));
        System.out.println();System.out.println();

        System.out.println("Uso de equals");
        System.out.println("Contains p: "+people.contains(p));
        System.out.println();System.out.println();



        people.add(pCopy);
        System.out.println("Uso de Comparable y compareTo");
        System.out.println("Unsorted:");
        System.out.println(people);
        System.out.println();System.out.println();
        Collections.sort(people);
        System.out.println("Sorted:");
        System.out.println(people);



        System.out.println("Uso de Comparators");
        System.out.println("Sorted by compareTo:");
        System.out.println(people);
        System.out.println();System.out.println();
        Collections.sort(people,new PersonLexicographicComparator());
        System.out.println("Sorted by comparator:");
        System.out.println(people);

        /**/

    }

}
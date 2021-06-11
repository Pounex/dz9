package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person pr1 = new Person( "Harry", "Potter",new Address("Minsk","LeonidaBedy",2));
        Person pr2 = new Person( "Arry", "Otter",new Address("Insk","EonidaBedy",3));
        Person pr3 = new Person( "Alex", "Goishik",new Address("Minsk","Lenina",5));

        System.out.println(pr1.toString());
        System.out.println(pr2.toString());
        System.out.println(pr3.toString());

        List<Person> list = new ArrayList<>();
        list.add(pr1);
        list.add(pr2);
        list.add(pr3);

        PersonIOUtil.writePersons("persons.txt" , list);
        List<Person> ls1 = PersonIOUtil.readPersons("persons.txt");

        for (Person item: ls1)
        {
            System.out.println(item);
        }


    }
}

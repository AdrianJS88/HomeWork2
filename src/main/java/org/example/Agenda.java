package org.example;

import java.util.*;

public class Agenda {
    static List<List<String>> phoneBook = new ArrayList<>();
    static List<String> name = new ArrayList<>();
    static List<String> number = new ArrayList<>();


    public static void print() {
        for (int i = 0; i < name.size(); i++) {
            System.out.println("Name: " + name.get(i) + " Number: " + number.get(i));
        }


    }

    public static void addName() {
        System.out.println("name:");
        String sc = new Scanner(System.in).nextLine();
        name.add(sc);
        System.out.println("number");
        String sc2 = new Scanner(System.in).nextLine();
        number.add(sc2);

    }

    //insertion method
    public static void replace()  {
        String sc = new Scanner(System.in).nextLine();
        String sc2 = new Scanner(System.in).nextLine();

        //to be continued

    }


    //delete method
    public static void delete(){
        System.out.println("Enter name to delete:");
        String sc = new Scanner(System.in).nextLine();
        for (int i = 0; i <= name.size() ; i++) {
            if (sc.equals(name.get(i))){
                name.remove(i);
                number.remove(i);
            }

        }
    }

    //searching  method
    public static  void search() {
        String sc = new Scanner(System.in).nextLine();
        try {
            for (int i = 0; i <= name.size(); i++) {
                if (name.get(i).equals(sc)) {
                    System.out.println(sc + "contact found!! \n Number:" + name.get(i));
                    break;
                }
            }
        } catch (IndexOutOfBoundsException m) {
            System.out.println(sc + " not found !!");
        }
    }
}
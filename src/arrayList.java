/*
import java.util.ArrayList;
import java.util.List;

public class arrayList {

        public static void main(String[] args) {
            //printUserData2("John",25);

            ArrayList<Integer> myList = new ArrayList<>();
            myList.add(42);
            myList.add(99);
            myList.add(1000);
            System.out.println(myList);

            ArrayList<Integer> myList2 = new ArrayList<>(){{
                add(42);
                add(99);
                add(1000);
            }};
            //System.out.println(myList2);
            //System.out.println(myList.get(1));

            myList.add(2,50);
            System.out.println(myList);
            myList.set(2,51);
            System.out.println(myList);

            List<Animal> animals = new ArrayList<>();
            Cat cat = new Cat();
            Dog dog = new Dog();
            animals.add(cat);
            animals.add(dog);

            System.out.println(myList.contains(42));
            System.out.println(myList.contains(200));
        }

        private static void printUserData(String name, int age) {
            //John is 25 years old!
            String textToPrint = String.format("%s is %d years old!",name,age);
            System.out.println(textToPrint);
        }

        private static void printUserData2(String name, int age){
            System.out.printf("%s is %d years old!",name,age);
        }
    }

    //Animal:
    public class Animal {
    }

    //Dog:
    public class Dog extends Animal{
    }

    //Cat:
    public class Cat extends Animal{
    }
*/
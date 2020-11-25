package igorkorapin;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
	task1();
	task2();
    }

    public static void task1 (){
        System.out.println("Задача 1");
        ArrayTask1<Integer> arr = new ArrayTask1<> (1,2,3,4,5,6,7);
        arr.print();
        try {
            arr.change (2,5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        arr.print();
    }

    public static void task2 (){
        System.out.println("\n Задача 2");
        Box<Orange> boxOrange = new Box<>();
        boxOrange.add(new Orange());
        boxOrange.add(new Orange());
        boxOrange.add(new Orange());
        boxOrange.add(new Orange());
        boxOrange.add(new Orange());
        boxOrange.add(new Orange());
        boxOrange.add(new Orange());
        boxOrange.add(new Orange());


    }
}

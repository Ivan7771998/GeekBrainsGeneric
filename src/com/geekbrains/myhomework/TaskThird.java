package com.geekbrains.myhomework;

import com.geekbrains.myhomework.taskthird.Apple;
import com.geekbrains.myhomework.taskthird.Box;
import com.geekbrains.myhomework.taskthird.Orange;

import java.util.ArrayList;

public class TaskThird {
    public TaskThird() {
        ArrayList<Apple> apples = new ArrayList<>();
        ArrayList<Apple> apples1 = new ArrayList<>();
        ArrayList<Orange> oranges = new ArrayList<>();
        ArrayList<Orange> oranges1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            oranges.add(new Orange());
            apples.add(new Apple());
            oranges1.add(new Orange());
            apples1.add(new Apple());
        }



        Box<Orange> boxOrange = new Box<>(oranges);
        Box<Orange> boxOrange2 = new Box<>(oranges1);
        Box<Apple> boxApple = new Box<>(apples);
        Box<Apple> boxApple2 = new Box<>(apples1);

        //g
        boxApple2.addFruit(new Apple());
        boxApple.addFruit(new Apple());
        boxOrange.addFruit(new Orange());

        //d
        System.out.println("Вес коробки с апельсинами равен: " + boxOrange.getWeight());
        System.out.println("Вес коробки с яблоками равен: " + boxApple.getWeight());

        //e
        System.out.println("Коробка апельсин равна по массе коробки с яблоками: " + boxOrange.compare(boxApple));
        System.out.println("Коробка1 апельсин равна по массе коробки2 апельсин: " + boxOrange.compare(boxOrange2));
        System.out.println("Коробка1 яблок равна по массе коробки2 яблок: " + boxApple.compare(boxApple2));

        //f
        System.out.println("Пересыпаем коробку1 с апельсинами в коробку2 с апельсинами:");
        boxOrange.pouring(boxOrange2);
        System.out.println("Вес пересыпаной коробки равен: " + boxOrange.getWeight());
        System.out.println("Вес коробки, в которую пересыпали равен: " + boxOrange2.getWeight());
    }
}

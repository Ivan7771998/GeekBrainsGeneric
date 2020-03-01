package com.geekbrains.myhomework.taskthird;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private T obj;
    private ArrayList<T> arrayFruit;

    public Box(ArrayList<T> arrayFruit) {
        this.arrayFruit = arrayFruit;
    }

    public float getWeight() {
        return arrayFruit.size() * getWeightOne();
    }

    private float getWeightOne() {
        if (obj instanceof Orange) {
            return new Orange().weight;
        } else {
            return new Apple().weight;
        }
    }

    public void addFruit(T itemFruit) {
        arrayFruit.add(itemFruit);
    }

    public boolean compare(Box t) {
        return arrayFruit.size() == t.arrayFruit.size();
    }

    public void pouring(Box<T> t) {
        t.arrayFruit.addAll(arrayFruit);
        arrayFruit.clear();
    }
}



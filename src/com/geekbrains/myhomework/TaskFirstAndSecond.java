package com.geekbrains.myhomework;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskFirstAndSecond {

    TaskFirstAndSecond(){
        // Входные данные задания #1
        Object[] obj = new Object[]{1, 2, 3, 4, 5, 6};
        obj = getChangedArr(obj, 2, 3);
        for (Object o : obj) {
            System.out.print(o + " ");
        }
        System.out.println();
        System.out.println("//////////////////////////////////////////////");
        //Входные данные задания #2
        Integer[] massInt = new Integer[]{1, 2, 3, 4, 5, 6};
        Float[] massFloat = new Float[]{1f, 2f, 3f, 4f, 5f, 6f};
        String[] massString = new String[]{"2", "4", "7", "8", "9"};
        printArrayListFromArr(massInt);
        printArrayListFromArr(massFloat);
        printArrayListFromArr(massString);
    }

    //Задание #1
    public  <T> T[] getChangedArr(T[] arr, int firstIndex, int lastIndex) {
        T temp;
        temp = arr[firstIndex];
        arr[firstIndex] = arr[lastIndex];
        arr[lastIndex] = temp;
        return arr;
    }
    //Задание #2
    public <T> void printArrayListFromArr(T[] arr) {
        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(arr));
        for (T t : arrayList) {
            System.out.print(t + " ");
        }
        System.out.print(arr.getClass());
        System.out.println();
    }
}

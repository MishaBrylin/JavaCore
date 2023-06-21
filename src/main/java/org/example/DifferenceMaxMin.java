package org.example;

//Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива
public class DifferenceMaxMin {
    public static int differenceMaxMin (int [] arr){

        int max = arr[0];
        int min = arr[0];
        for (int num: arr) {
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }

        }
        return max - min;
    }
}

package org.example;

//Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
public class DoubleZero {
    public static boolean doubleZero (int[] arr ){
        boolean res = false;

        for (int i=0; arr.length -1 > i; i++){
            if (arr[i] == 0 && arr[i+1] == 0){
                res = true;

            }

        }
        return res;

    }
}

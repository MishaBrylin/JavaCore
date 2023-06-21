package org.example;

public class Main {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 45, 765, 12 ,0 , 0};
        int [] arr2 = {1, 2, 3, 45, 765, 12 ,0 , 2};
        int [] arr3 = {1, 2, 2, 4, 76, 13 ,11 , 2};

        try {
            System.out.println(DifferenceMaxMin.differenceMaxMin(arr1));
        } catch (Exception e) {
            throw new RuntimeException("Ошибка задан неправильный массив");
        }
        try {
            System.out.println(DifferenceMaxMin.differenceMaxMin(arr2));
        } catch (Exception e) {
            throw new RuntimeException("Ошибка задан неправильный массив");
        }
        try {
            System.out.println(DifferenceMaxMin.differenceMaxMin(arr3));
        } catch (Exception e) {
            throw new RuntimeException("Ошибка задан неправильный массив");
        }        try {
            System.out.println(DoubleZero.doubleZero(arr1));
        } catch (Exception e) {
            throw new RuntimeException("Ошибка задан неправильный массив");
        }
        try {
            System.out.println(DoubleZero.doubleZero(arr2));
        } catch (Exception e) {
            throw new RuntimeException("Ошибка задан неправильный массив");
        }        try {
            System.out.println(DoubleZero.doubleZero(arr3));
        } catch (Exception e) {
            throw new RuntimeException("Ошибка задан неправильный массив");
        }        try {
            System.out.println(EvenElements.evenElements(arr1));
        } catch (Exception e) {
            throw new RuntimeException("Ошибка задан неправильный массив");
        }        try {
            System.out.println(EvenElements.evenElements(arr2));
        } catch (Exception e) {
            throw new RuntimeException("Ошибка задан неправильный массив");
        }        try {
            System.out.println(EvenElements.evenElements(arr3));
        } catch (Exception e) {
            throw new RuntimeException("Ошибка задан неправильный массив");
        }


    }
}
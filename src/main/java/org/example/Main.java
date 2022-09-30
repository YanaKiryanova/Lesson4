package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //exercise0();
        //exercise1();
        //exercise2();
        //exercise3();
        //exercise4();
        //exercise5();
        //exercise6();
        exercise7();
    }

    public static void exercise0() {
        int[] findNumber = {2, 5, 7, 4, 8, 10, 15, 25, 32};
        Scanner sc = new Scanner(System.in);
        Integer inNumber = null;
        if (sc.hasNextInt()) {
            inNumber = sc.nextInt();
        }
        int found = Arrays.binarySearch(findNumber, inNumber);
        System.out.printf("Цифра %d находиться в массиве под индексом %d%n", inNumber, found);
        sc.close();
    }

    public static void exercise1() {
        int[] deleteNumber = {2, 3, 4, 2, 3, 4, 2, 3, 4};
        int[] newNumber = new int[deleteNumber.length];
        int zero = 0;
        int indexFinish = 0;
        Scanner sc = new Scanner(System.in);
        Integer inNumber = null;
        if (sc.hasNextInt()) {
            inNumber = sc.nextInt();
        }
        for (int i = 0; i < deleteNumber.length; i++) {
            if (deleteNumber[i] != inNumber) {
                newNumber[i] = deleteNumber[i];
            } else {
                zero++;
            }
        }
        int[] finish = new int[newNumber.length - zero];
        for (int i = 0; i < newNumber.length; i++) {
            if (newNumber[i] != 0) {
                finish[indexFinish] = newNumber[i];
                indexFinish++;
            }
        }

        if (Arrays.equals(deleteNumber, newNumber)) {
            System.out.println("Этого числа нет");
        } else {
            System.out.println(Arrays.toString(finish));
        }
        sc.close();


    }

    public static void exercise2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int[] newArr = new int[0];
        if (sc.hasNextInt()) {
            newArr = new int[sc.nextInt()];
        }
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = (int) (Math.random() * 10);
        }
        int max = newArr[0];
        int min = newArr[0];
        int average = 0;
        for (int num : newArr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            average += num;
        }
        System.out.println("В массиве " + Arrays.toString(newArr) + " Минимальное число - " + min + " Максимальное число - "
                + max + " среднее значение - " + average / newArr.length);
        sc.close();
    }

    public static void exercise3() {
        int[] one = {2, 5, 3, 7, 8};
        int[] two = {4, 7, 5, 1, 0};
        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));
        int averageOne = 0;
        int averageTwo = 0;
        for (int i = 0; i < 5; i++) {
            averageOne += one[i];
            averageTwo += two[i];
        }
        averageOne /= 5;
        averageTwo /= 5;
        if (averageOne > averageTwo) {
            System.out.println(String.format("Среднее число первого массива %d больше среднего числа %d второго массива", averageOne, averageTwo));
        } else if (averageTwo > averageOne) {
            System.out.println(String.format("Среднее число второго массива %d больше среднего числа %d первого массива", averageTwo, averageOne));
        } else {
            System.out.println("Среднее числа двух массивов равны");
        }
    }

    public static void exercise4() {
        Scanner sc = new Scanner(System.in);
        int sizeArr = 0;
        boolean test = true;

        while (test) {
            if (sc.hasNextInt()) {
                sizeArr = sc.nextInt();
                if (sizeArr > 5 && sizeArr <= 10) {
                    System.out.printf("Размер массива равен %d%n", sizeArr);
                    test = false;
                } else {
                    System.out.println("Введите другое число");
                }
            }
        }
        int[] arr = new int[sizeArr];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));

        int chNumber = 0;
        int indexArr2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                chNumber++;
            }
        }
        int[] arr2 = new int[chNumber];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr2[indexArr2] = arr[i];
                indexArr2++;
            }
        }
        System.out.println(Arrays.toString(arr2));
        sc.close();
    }

    public static void exercise5() {
        int[] arr = {2, 4, 5, 8, 6, 5};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void exercise6() {
        String[] name = {"Mickey Mouse", "Donald Duck", "Minnie", "Goofy", "Pluto"};
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));
    }

    public static void exercise7() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int [] arr){
        int tmp;
        boolean test = false;
        while (!test) {
            test = true;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    test = false;
                }
            }
        }
    }
}


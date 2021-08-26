package com.company;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //get input
        System.out.println("input the number of Test cases: ");
        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            reduceArray();
        }

    }

    public static void reduceArray() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter size of array: ");
        int arraySize = sc.nextInt();


        sc.nextLine();
        System.out.println("Enter array elements separated by space");
        String num = sc.nextLine();
        String[] splitnum = num.split("\\s+");

        if (splitnum.length != arraySize){
            System.out.println("Incorrect array elements");
            System.exit(0);
        }

        int[] elements = new int[splitnum.length];

        for (int i = 0; i < splitnum.length; i++) {
            elements[i] = Integer.parseInt(splitnum[i]);
        }

        int[] sortedElements = elements.clone();
        Arrays.sort(sortedElements);


        int[] output = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            output[i] = indexOfNumber(sortedElements, elements[i]);
        }

        StringBuilder builder = new StringBuilder();
        for (int value : output) {
            builder.append(value + " ");
        }
        String text = builder.toString();

        System.out.println(text);
    }

    public static int indexOfNumber(int[] array, int no) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == no) {        // here you pass some value for example 77
                index = i;
            }
        }
        return index;
    }
}

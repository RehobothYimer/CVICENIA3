package sk.stuba.fei.uim.oop;

import static java.util.Arrays.sort;
import static sk.stuba.fei.uim.oop.Sort.printArray;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;
        org.example.Test robi = new org.example.Test();
        robi.setName("robi");
        robi.setAge(5);

        System.out.println("Hello its me " + robi.getName());
        System.out.println("my age is  " + robi.getAge());
        sort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n);

    }
}

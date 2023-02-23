/*Implement a Java program to create a class called as “Number” with a data
member called limit. A class called as “Compute” inherits this class and has a
method called “secLargest” to display the second largest of an array of
numbers. The limit for the array should be used from the “Number” class.*/

class NUMBER {
    protected int limit;

    public NUMBER(int limit) {
        this.limit = limit;
    }
}

class Compute extends NUMBER {
    public Compute(int limit) {
        super(limit);
    }

    public int secLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array length should be at least 2");
            return -1;
        }
        int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }
        return secMax;
    }
}

public class Q1Day2Batch1 {
    public static void main(String[] args) {
        Compute obj = new Compute(10);
        int[] arr = {2, 5, 3, 1, 7, 4};
        System.out.println("Second largest element in the array is " + obj.secLargest(arr));
    }
}

package com.durgaprasadmamidi;

public class Array {
    private int count = 0;
    private int[] numbers;

    public Array(int length) {
        numbers = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public void insert(int val) {
        if (numbers.length == count) {
            int[] newNumbers = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newNumbers[i] = numbers[i];
            }
            numbers = newNumbers;
        }
        numbers[count++] = val;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }
        for (int i = index; i < count; i++) {
            numbers[i] = numbers[i + 1];
        }
        count--;
    }

    public int indexOf(int value) {
        for(int i =0;i<count;i++){
            if(numbers[i] == value)
                return i;
        }
        return -1;
    }

    public int max(){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<count;i++){
            if(numbers[i]>max)
                max=numbers[i];
        }
        return max ;
    }
    
}

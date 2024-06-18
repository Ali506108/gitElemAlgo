package com.example.Easy;

public class SmallVel {

    public static void main(String[] args) {

        int[] arr = {3,4,6,3,2,65,7,90};



        for(int i = 0; i < arr.length; i++){
            SmallVel s = new SmallVel();
            s.findSmallest(arr);
            System.out.println(arr[i]);
        }
    }


    public void findSmallest(int[] arr){
        int small = arr[0];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (small > arr[i]) {
                small = arr[i];
                index = i;
            }
        }
    }
}

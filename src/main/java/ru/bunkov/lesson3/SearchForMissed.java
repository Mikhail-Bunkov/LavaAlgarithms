package ru.bunkov.lesson3;

public class SearchForMissed {
    public void search(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]-1 != i){
                System.out.println(i+1);
                return;
            }
        }
    }
}

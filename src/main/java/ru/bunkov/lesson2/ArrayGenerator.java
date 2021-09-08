package ru.bunkov.lesson2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayGenerator {

    public List<Notebook> generate(int n){
        List<Notebook> arr = new ArrayList<>();
        Random ran = new Random();
        Random priceRan = new Random();
        Random RAMRan = new Random();
        for (int i = 0; i < n; i++) {
            int a = priceRan.nextInt(500)+500;
            int c = ran.nextInt(5);
            int b = RAMRan.nextInt(8)+4;
            String logo = null;
            if(c == 0){
                logo = "Lenuvo";
            }else if(c == 1){
                logo = "Asos";
            }else if(c == 2){
                logo = "MacNote";
            }else if(c==3){
                logo = "Eser";
            }else{
                logo = "Xamiou";
            }
            arr.add(new Notebook(a,b, logo));
        }
        return arr;
    }
}

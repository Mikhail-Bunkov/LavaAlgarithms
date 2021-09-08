package ru.bunkov.lesson2;

import java.util.List;

public class BubbleSort {
    public void sort(List<Notebook> list, int n){
            for (int i = 0; i < n - 1; i++) {
                Notebook a = list.get(i);
                Notebook b = list.get(i+1);
                if(a.getPrice()-100>b.getPrice()){
                    Notebook c = b;
                    b = a;
                    a = c;
                    continue;
                }
                if(a.getRAM()-4 > b.getRAM()){
                    Notebook c = b;
                    b = a;
                    a = c;
                    continue;
                }
                if(a.convertLogoToInt(a.getLogo())>b.convertLogoToInt(b.getLogo())){
                    Notebook c = b;
                    b = a;
                    a = c;
                }
            }
//        return list;
    }
}

package ru.gorshckov;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        ArrayList <String> arr = new ArrayList<>();

        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        arr.add("green");
        arr.add("black");
        arr.add("yelow");
        arr.add("white");
        arr.add("blue");
        arr.add("brown");
        arr.add("green");
        arr.add("black");
        arr.add("mom");
        arr.add("dad");
        arr.add("sister");
        arr.add("brother");
        arr.add("mom");
        arr.add("mom");

        Integer count;

        for (String wrd : arr) {

            count = hm.get(wrd);

            if (count == null){
                hm.put(wrd, 1);
            }
            else{
                hm.put(wrd, count + 1);
            }

        }

        System.out.println("Всего слов " + arr.size());
        System.out.println("Всего уникальных слов " + hm.size());
        System.out.println("Слова и их колличество ");
        System.out.println(hm);
    }
}

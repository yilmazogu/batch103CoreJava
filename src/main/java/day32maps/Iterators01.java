package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {


    List<String> myList=new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("H");

    //for-each loop kullanarak her elemanin sonuna ! ekle
    //Note=loop'lar kendi baslarina "Collection"lari update edemzler bu yüzden Java "iterator" lari olusturdu
    //"iterator"lar Collection'lari update etmek icin kullanir
        for (String w:myList){
        w=w+"!";
    }
        System.out.println(myList);//[Z;K;A;J;M]


    ListIterator<String> itr=myList.listIterator();
        while(itr.hasNext()){
        String el=itr.next();
        itr.set(el+"!");
    }
        System.out.println(myList);
}
}


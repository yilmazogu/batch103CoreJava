package serbest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Srbst {
    public static void main(String[] args) {
        List<Integer> a= new ArrayList<>();
        a.add(12);
        a.add(31);
        a.add(15);
        a.add(13);
        a.add(54);
        Collections.sort(a);
        int minDiff=a.get(2)-a.get(1);

        for (int i=0; i<=a.size(); i++) {

            minDiff = Math.min(minDiff, a.get(i) - a.get(i + 1));
        }
        System.out.println(minDiff);


    }
}

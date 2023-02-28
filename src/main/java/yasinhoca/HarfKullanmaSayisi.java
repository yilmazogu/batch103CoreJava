package yasinhoca;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HarfKullanmaSayisi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Cumle giriniz");
        String cumle=input.nextLine();
        String cumle1= cumle.replaceAll(" ","");
        String[]harfler=cumle1.split("");
        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        String nikelaj="";
        for (String w: harfler){
            int counter=0;
            for(String u: harfler){
                if(w.equalsIgnoreCase(u)){
                    counter++;
                }



            }
            if(!nikelaj.contains(w)){
            nikelaj+=w+counter+" ";
        }


    }
        System.out.print(nikelaj);
}}

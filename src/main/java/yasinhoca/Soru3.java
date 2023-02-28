package yasinhoca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir string riniz");
        String str= input.nextLine();
        String str1=str.replaceAll("[^0-9]","");
       String[] rakam =str1.split("");
        System.out.println(Arrays.toString(rakam));


        int sum=0;
        for(int i=0; i< str1.length(); i++){
           sum+=Integer.valueOf(rakam[i]);
        }
        System.out.println(sum);

        }
    }



package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        /*
        kullanıcıya ay ismi sorunuz ve kullanıcının verdiği ay isminden son aya kadar ekrana yazdırınız
         */

        Scanner input =new Scanner(System.in);
        System.out.println("Ay ismi giriniz...");
        String ayIsmi =input.next();
        switch(ayIsmi){
            case "ocak":
                System.out.println("Ocak");
            case "subat":
                System.out.println("Subat");
            case "mart" :
                System.out.println("mart");
            case "nisan":
                System.out.println("nisan");
            case"mayıs":
                System.out.println("mayıs");
            case"haziran":
                System.out.println("haziran");
            case"temmuz":
                System.out.println("temmuz");
            case"agustos":
                System.out.println("agustos");
            case"eylül":
                System.out.println("eylül");
            case"ekim":
                System.out.println("ekim");
            case"kasım":
                System.out.println("kasım");
            case"aralık":
                System.out.println("aralık");
                break;
            default:
                System.out.println("gecerli bir ay ismi giriniz");
        }
    }
}
package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gun numarasini giriniz");
        byte gunno = input.nextByte();

        if(gunno==1) {
            System.out.println("Pazar");
        }else if(gunno==2){
            System.out.println("Pazartesi");
        }else if(gunno==3){
            System.out.println("Salı");
        }else if(gunno==4){
            System.out.println("Carsamba");
        }else if(gunno==5){
            System.out.println("Persembe");
        }else if(gunno==6){
            System.out.println("Cuma");
        }else if(gunno==7){
            System.out.println("Cumartesi");
        }else{
            System.out.println("Gecerlibir gun numarasi giriniz. Gecerli gun numarasi 1, 2, 3, 4, 5, 6, 7 den birisidir.");



        }
    }
}

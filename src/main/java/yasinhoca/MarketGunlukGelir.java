package yasinhoca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MarketGunlukGelir {

static List<String>gunler=new ArrayList<>(Arrays.asList("pazartesi", "sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
static List<Double>gunlukGelirler=new ArrayList<>();
static double toplamGelir=0;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gun=0;
        while(gun<7){
            System.out.println(gunler.get(gun) + " gelirlerini giriniz");
            double gununGelir= input.nextDouble();
            gunlukGelirler.add(gununGelir);
            toplamGelir+=gununGelir;
            gun++;
        }
        System.out.println(gunlukGelirler);
        System.out.println("ort gelir" + ortalamaGelir() );
    }
    static  double ortalamaGelir(){
        return toplamGelir/7;

            
        }


        static String ortalamaUstuGunler(){
        String str="";
        for(int i =0; i<gunler.size(); i++){
        if(gunlukGelirler.get(i)>ortalamaGelir()){
            str+= gunler.get(i);
        }
            System.out.println();
        }return str;
    }


}

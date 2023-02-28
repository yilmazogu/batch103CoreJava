package yasinhoca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RandomCiftSayi {
    public static void main(String[] args) {
        List<Object>tamSayi=new ArrayList<>();
        for (int i=0; i<10; i++){
            tamSayi.add((int)(Math.random()*21));
        }


        for(int j=0; j<tamSayi.size(); j++){
            if((int)tamSayi.get(j)%2==0){
                tamSayi.set(j,"cift sayi");
            }
        }
        System.out.println(tamSayi);
    }
}

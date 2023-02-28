package day18arraylistspassbyvalue;

public class PassByValue01 {

    /*
        1)Java variable'ların orijinal değerlerini korumak ister.
        2)Variable method'lar içinde kullanıldığında, Java method'un içine orijinal değeri koymaz, o değerin kopyasını üretir.
                ve method'a o kopyayı yollar. Method kopya üstünde değişiklik yapar, dolayısıyla variable'ın
                orijinal değer korunmuş olur.
                Bu sisteme "PassByValue" denir.
                Note: Java "Pass By Value" kullanır.
                Note: Bazı programlama dilleri orijinal değeri koruma altına almamıştır. Bu işi developer'lara bırakmıştır.
                Bu tarz diller "Pass By Reference" kullanır.
     */

    public static void main(String[] args) {

        int x = 5;
        System.out.println(x);

        //static method olan "main method" un içindeki her şey
        // static olmalıdır.
        change(x);//Öğrenci gömleği
        System.out.println(x);//Gomlek

        int ucret = 100;
        indirim(ucret);
        System.out.println(ucret);//90
    }
    public static void  change(int a){
        System.out.println(a*3);
    }

    //void dışındaki "return" type'larda method body'si içinde
    //"return" keyword kullanılmalıdır.
    public static int indirim(int gomlekUcreti){
        return gomlekUcreti - 10;
    }


}
package day18arraylistspassbyvalue;

public class Varargs01 {
    /*
    1) Farkli sayilarda ki parametrelerle calissa bilin bi method olusturmak isterseniz varargs kullanmalisiniz
    2)"Varargs" arka tarafta array kullanir. Bu yuzden varargs#larla calisirken array'lerle calisiyormus gibi davranabilirsinz
    3) "Varargs" olusturmak icin "<data Type>... <varargs ismi>" veya  "<data Type>  ...<varargs ismi>"
    4)Bir method'a "Vararg" in yanina baska bir parametre kullanilir mi?
    "varargs" en sonda olmak sartiyla kullanilir.
    5)Bir method'a birden fazla "Vararg" kullanilabilr mi?
    "Vararg" en sonda olmak zorunda oldugun, birden fazla kullanirsaniz en az biri sonda olmayacaktir. bu da 4. kuralla celisir
     */

    public static void main(String[] args) {

        int r1 = add(2, 3);
        System.out.println(r1);
        int r2 = add(0,1,1,2,3,5,8,13,21);
        System.out.println(r2);
    }
    /*
    //Iki sayinin toplamini return eden bir method olusturunuz.
    public static int add (int a ,  int b){

        return a+b;

    }
    //uc sayinin toplamini return eden bir method olusturunuz.
    public static int add (int a, int b,int c ){
        return a+b+c;
    }
    //dort sayinin toplamini return eden bir method olusturunuz.
    public static int add (int a, int b,int c, int d){
        return a+b+c+d;
    }

     */

    //Istedigimiz sayiyi tuplayabvilecegimiz sayiyi toplaya bilecegimiz method olusturalim
    public static int add(int... a){
        int sum=0;
        for(int w :a){
            sum = sum+w;
        }
        return sum;
    }
}
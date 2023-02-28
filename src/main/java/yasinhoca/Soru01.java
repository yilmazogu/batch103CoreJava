package yasinhoca;

public class Soru01 {
    public static void main(String[] args) {
        String s="";
        for (int i = 1; i <= 6; i++) {

            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int k=i; k<=6; k++){
                System.out.print(k+" ");
            }
            System.out.println();
            }

    }
}

package day12loops;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //while-loop için loop body'si içindeki kodun hiç çalıştırılmama ihtimali vardır.
        //zero execution mümkündür.
        int i = 1;
        while (i<1){
            System.out.println("While loop");
            i++;
        }

        //do-while-loop'un body'si içindeki kod her halükarda en az bir kere çalışır.
        //zero execution mümkün değildir.
        int k = 1;
        do {
            System.out.println("do-while loop");
            k++;
        }while (k<1);

        //Example 1: Bir ondalık sayının ondalık kısmındaki rakamlarının toplamını bulunuz.
        //           24.5673 ==> 5+6+7+3 = 21
        double num = 24.5673;
        System.out.println(num);

        //String.valueOf() methodu parantezin içine konulan datanın tipini String yapar.
        String str = String.valueOf(num);
        System.out.println(str);

        //Regex için nokta kullandığınızda önüne "\\" koyunuz. Yani nokta "\\." şeklinde kullanılır.
        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);//5673

        int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt);//5673

        int sum = 0;
        do {
            sum = sum + decimalInt%10;
            decimalInt =decimalInt/10;
        }while (decimalInt>0);
        System.out.println(sum);
    }
}
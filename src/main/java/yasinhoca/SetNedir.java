import java.util.*;

public class SetNedir {

    public static void main(String[] args) {

        /*
           Set : 1) unique(benzersiz tek) elemanlardan olusur, Set'lerin icinde bir eleman sadece bir kere kullanilabilir. mükerrer eleman olmaz.
                 2) sadece bir null değeri alabilir.(treeSet hariç).Java elementleri unique yapmak icin HASH ALGORITMASI kullanir.
                 Java her data icin hashing teknigini kullanarak bir code uretir.Bu code'u almak icin HashCode() methodu kullanilir.
                 Hashing, farklı büyüklükteki girdilerden sabit büyüklükte bir çıktı oluşturma sürecine verilen isimdir.
                  Universitelerdeki ogrenci numaralari gibi bir ogrenci ismi soruldugunda numarasini bulursaniz onunla ilgili tum bilgilere ulasabilirsiniz.
​
​
            Set     --> HashSet         : 1) HashSet, duplication’a(tekrarlı eleman) izin vermez.
                                            Eger bir elemani tekrar HashSet’e eklemek isterseniz eski olan silinip, yeni olan uzerine yazilir.
                                          2) Haset'ler Set'ler arasinda en hizli olanıdir. bir algoritmaya göre kayit eder.
                                           değerlerin giriş sırasına dikkat edilmez. (LinkedHashSet hariç)
                                          3) HashSet "null" object'ini eleman olarak kullanabilir.
                                          Ancak birden fazla null degerini bir HashSet’e eklemek isterseniz sadece bir tane null degeri olur.
​
                        LinkedHashset   : 1) Tekrarli eleman kabul etmezler. Elemanlari ekleme sirasina(insertion order) gore dizerler.
                                          2) LinkedHashSet, HashSet'den daha yavas calisir.
                                          3) Ekleme ve remove islemlerinde hizlidirlar.
​
                        TreeSet         : 1) TreeSet tekrarli eleman kabul etmez, cunku Set'dir.
		                                  2) Elemanlari natural Order'a(String ise alfabetik, sayi ise kucukten buyuge) gore dizer.
		 	                              3) TreeSet, setlerin en yavasidir. Bu yuzden TreeSet kullanirken dikkatli olunmalı...
​
​
         Set Methods :
            .add(eleman);-->Set’e eleman ekler
            .addAll(collection);-->istenen collection’in tum elemanlarini ekler
            .contains(eleman);-->istenen eleman sett’te varsa true, yoksa false dondurur.
            .containsAll(collection);-->istenen collection’in tumu aranan sette var ise true, yoksa false dondurur
            .remove(eleman);-->istenen eleman bulursa siler ve true dondurur, bulamazsa false dondurur
            .removeAll(collection);-->istenen collection’in tum elemanlarini bulursa siler ve true dondurur, bulamazsa false dondurur
            .equlas(set2);-->istenen set2’le tum elemanlar ayni ise true, yoksa false dondurur
            .retainAll(collection1);-->collection1’nin elemanlarinin disindaki tum elemanlari siler, silme islemi yapti ise true, yoksa false dondurur(kesişen ortak elemanları döndürür.)
            .clear();-->sett'teki Tum elemanlari siler
            .isEmpty();-->Sette hic eleman yoksa true, varsa false dondurur
            .size();-->set’in eleman sayisini verir
​
		 */
        System.out.println("*** 1.METHOD : Set tanımlama(declaration) ilk dğer atama(initialize)   ***");

        // 1. yol...set.add(eleman);
        HashSet<Integer> setNums = new HashSet<>();
        setNums.add(1);
        setNums.add(-2);
        setNums.add(2);//HashSet'e tekrarli eleman yollarsaniz ustune yazar.
        setNums.add(20);
        setNums.add(35);
        setNums.add(17);
        setNums.add(23);
        setNums.add(-34);

        // 2. yol...new HashSet<>(Arrays.asList(eleman));
        Set<Integer> setYear = new HashSet<>(Arrays.asList(76,-16,-99,21,101));
        Set setYear1 = new HashSet<>(Arrays.asList(76,-16,-99,21,101));//<> içinde wrapper class yazmadan da oldu

        // Collections'da esitligin sol tarafinda <>icinde data turu yazilmasa veya data turu olarak Object yazilsa collections calisir.
        // Ama boyle bir kullanimda surekli casting yapildigi icin zaman ve hafiza acisindan verimli degildir.

        HashSet<Object> set = new HashSet<>(Arrays.asList("beyaz","kırmızı",99,101));//farklı data type verdik
        System.out.println("farklı daat type ile Object(HZ.Adem) classından set :"+set);
        //yukarıdaki şartlar LinkedList için de geçerli...-->LinkedList<Object> set = new LinkedList<>(Arrays.asList("beyaz","kırmızı",99,101));
        HashSet<String> setStr = new HashSet<>(Arrays.asList("beyaz"+99+'a'));  //en hizlisı(concatanation)
        System.out.println(setStr);//[beyaz 99 a]

        // 3. yol...new HashSet<>(List.of(eleman));
        HashSet<String> setAnimal = new HashSet<>(List.of("kaplan","aslan","zurafa","fil","kedi"));
        HashSet<String> setColours = new HashSet<>(List.of("beyaz","kırmızı","sarı","yeşil"));
        System.out.println("***  2.METHOD :  Set yazdırma   ***");


        //1.yol...println(set);
        System.out.println("setNums  = " + setNums); //[1, -2, 17, -34, 2, 35, 20, 23]
        System.out.println("setYear  = " + setYear); //[-99, 21, 101, 76, -16]
        System.out.println("setAnimal  = " + setAnimal); //[zurafa, fil, aslan, kedi, kaplan]

        //2.yol ...forEach
        for(String s: setAnimal)
        {
            System.out.println("setAnimal = " + s);
        }

        //3.yol...Iterator Java iterator, collection elemanlarımızın arasında gezinmemize ve elemanlari degistirmemize yarar.
        //Collections’da her element index yapisini desteklemez, index olmadan tum elementlere ulasmak icin for-each loop kullanabiliriz.
        // ancak for-each loop ile elementleri kalici olarak degistirme veya silme imkani olmadigi icin Iterator kullanimini tercih edilir.
        Iterator yazdir=setNums.iterator(); // setNums isimli dizinin başına konumlanıyor
        while (yazdir.hasNext()) // Sonraki eleman var ise
        {
            System.out.println("Sıradaki Eleman = " + yazdir.next()+"\n"); // sıradaki elemanı yazdırır.
        }

        System.out.println("***   3.METHOD : Set' eleman ekleme set.add(eleman)   ***");

        setAnimal.add("güvercin");
        System.out.println("setAnimal güvercin eklendi : "+setAnimal);
        setAnimal.add("kartal");
        System.out.println("setAnimal kartal eklendi : "+setAnimal);
        setNums.add(45);
        System.out.println("setNums 45 eklendi : "+setNums);
        setNums.add(-10);
        System.out.println("setNums -10 eklendi : "+setNums);
        setYear.add(-60);
        System.out.println("setYear -60 eklendi : "+setYear);
        setYear.add(93);
        System.out.println("setYear 93 eklendi : "+setYear+"\n");


        System.out.println("******** Özel bir metod:Collections nCopies kullanimi... *********");
        // Özel bir metod:Collections nCopies kullanimi...
        // nCopies(int n, Object o);  n elemanli nums arrayi olusturur ve hepsini o ile doldurur
        // Collection.fill(List, o); ise tanimlanmis ve deger atanmis arrayList'in tüm elemanlarini o ile doldurur
        HashSet<Integer> nums = new HashSet<>(Collections.nCopies(10, 5));//tekrarlı eleman olduğu için HashSet'e tek eleman verir
        System.out.println("nums : 1 tane 5 den oluşan HashSet :" + nums + "\n");//[5] 1 tane 5 den oluşan HashSet

        System.out.println("setNums a setYear eklendi : "+setNums.addAll(setYear));//setNums e setYear eklenip eklenmediğini sorgukayıp true verir.
        setNums.addAll(setYear);

    }
}
package cw.test.Day16;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C01_Parameters {

     @Test
     @Parameters("isim")
    public void parameterrizedTest(String isim) {
         System.out.println("Hello "+isim);
    }
    //parametrenin sirasina gore xml in dosyasindan parametre ler okunur
    //parametreleri string disinda veri tipleri ile alabiliriz eger ki cevrilebiliyorsa

    @Test
    @Parameters({"isim", "soyisim","yas"})
    public void twotparameterrizedTest(String isim, String soyisim,int yas) {
        System.out.println("Hello "+isim+" "+soyisim);
        System.out.println(yas);
    }

}

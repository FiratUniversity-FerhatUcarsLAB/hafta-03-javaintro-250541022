public class IsimKarti {

    public static void main(String[] args) {
        
        // Buradaki bilgileri kendi bilgilerinizle değiştirebilirsiniz
        String ad = "Ahmet";
        String soyad = "Yılmaz";
        String ogrenciNo = "123456789";
        String bolum = "Bilgisayar Mühendisliği";

        System.out.println("4.1 - İsim Kartı:");
        System.out.println("*************************************************");
        System.out.println("* *");
        System.out.println("* ÖĞRENCİ BİLGİ KARTI            *");
        System.out.println("* -------------------            *");
        System.out.println("* *");
        
        // printf ile formatlı yazdırıyoruz:
        // %-12s: 12 karakterlik alanı kapla, metni sola yasla
        // %-30s: 30 karakterlik alanı kapla, metni sola yasla
        System.out.printf("* Ad         : %-30s *\n", ad);
        System.out.printf("* Soyad      : %-30s *\n", soyad);
        System.out.printf("* Öğrenci No : %-30s *\n", ogrenciNo);
        System.out.printf("* Bölüm      : %-30s *\n", bolum);
        System.out.println("* *");
        System.out.println("*************************************************");
    }
}

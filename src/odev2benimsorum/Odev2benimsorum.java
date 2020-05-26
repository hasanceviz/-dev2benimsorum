package odev2benimsorum;

import java.util.Scanner;

public class Odev2benimsorum {


     public static int kalemler(int a){
         Scanner giris = new Scanner(System.in);
         System.out.println("NEYİN FİYATINI İSTİYORSUNUZ");
         System.out.println("1=boya kalemi 2=dolma kalem 3=fosforlu kalem 4=keceli kalem 5=kursun kalem 6=tukenmez kalem 7=yazı tahtası kalemi 8=uclu kalem");
         int kalem = giris.nextInt();
            if (kalem == 1)
                return 5;
            if (kalem ==2)
                return 2;
            if (kalem ==3)
                System.out.println("fiyat = 6 TL");
            if (kalem ==4)
                System.out.println("fiyat = 7 Tl");
            if (kalem ==5)
                System.out.println("Fiyat = 2 TL");
            if (kalem ==6)
                System.out.println("Fiyat = 12 Tl");
            if (kalem ==7)
                System.out.println("Fiyat = 15 Tl");
            if (kalem ==8)
                System.out.println("Fiyat = 14 TL");
         return 0;
         
        
    }
     public void masaustu (int a){
         
     }
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("ne almak istiyorsunuz ? 1)kalem 2)masaüstü gerçekler");
        int a=giris.nextInt();
        if(a==1){
            System.out.println("fiyatı :"+kalemler(a));
        }
        if(a==2){
            System.out.println("fiyatı  :"+masa(a));
        }
        
        

    }
    public static int masa(int b){
        Scanner giris = new Scanner(System.in);
            System.out.println("Hangi urun ?");
            System.out.println("Lutfen Tuslama Yapiniz");
            System.out.println("1=atas 2=bant 3=delgec 4=makas 5=zımba 6=yapistirici 7=daksil 8=kalemtras 9=hesap makinesi");
            int masa=giris.nextInt();
            if (masa ==1)
                return 1;
            if ( masa ==2)
                return 1;
            if (masa ==3)
                return 3;
            if (masa ==4)
                return 3;
            if (masa ==5)
                return 5;
            if (masa ==6)
                return 6;
            if (masa ==7)
                return 7;
            if (masa ==8)
                return 2;
            if (masa ==9)
                return 55;
            
            return 0;
    }
    
}

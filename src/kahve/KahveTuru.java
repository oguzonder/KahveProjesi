package kahve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KahveTuru {
    static List<kahve> kahve=new ArrayList<>();
    static List<kahve>istenenKahve=new ArrayList<>();
    static String arrSut[]={"Sütsüz","Cok Az Sütlü","Normal Sütlü","Elini korkak alistirma"};
    static String arrSeker[]={"Sekersiz","Sekeri Koklat","Sekeri normal olsun","Sekeri doldur kardesim"};
    static String arrBardak[]={"Kücük olsun","Orta olsun","Buyuk olsun","Duble olsun"};
    static Scanner scan=new Scanner(System.in);
    static String no;
    static String sut;
    static String seker;
    static String bardak;

    public void kahveSec(){
        kahve kahve1=new kahve("1","Nescafe");
        kahve kahve2=new kahve("2","Latte");
        kahve kahve3= new kahve("3","Cafe Fransi");
        kahve kahve4=new kahve("4","Yemen Kahvesi");
        kahve kahve5=new kahve("5","Türk Kahvesi");
        kahve.add(kahve1);
        kahve.add(kahve2);
        kahve.add(kahve3);
        kahve.add(kahve4);
        kahve.add(kahve5);

        kahveSecim();
    }

    private void kahveSecim() {
        System.out.println("No\tKahve Adı");
        for (kahve k: kahve){
            System.out.println(k.getKahveNo()+ "\t"+ k.getKahveAdi());

        }
        System.out.println("Lutfen tercih ettiginiz kahve numarasnı giriniz");

        no=scan.nextLine();
        switch(no){
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            default:
                System.out.println("Hatalı giris yaptınız,Tekrar deneyiniz");
                kahveSecim();

        }
        System.out.println("Tercihiniz : " +kahve.get(Integer.valueOf(no)-1).getKahveAdi());

        bardakTercih();
    }

    private void bardakTercih() {
        System.out.println("Hangi  boy bardak istersiniz :\n 1-Kucuk Boy 2-Orta Boy 3-Buyuk Boy 4-Duble Olsun");
        bardak=scan.next();
        switch(bardak){
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            default:
                System.out.println("Hatalı giris yaptınız,Tekrar deneyininz");
                bardakTercih();

    }
    sekerTercih();
}

    private void sekerTercih() {
        System.out.println("Seker istiyor musunuz Evet ise 'E' Hayır ise 'H' giriniz : ");
        char secim=scan.next().toUpperCase().charAt(0);
        if (secim=='E'){
            System.out.println("Seker miktarını giriniz : \n 1-Az sekerli 2- Orta sekerli 3-Bol sekerli ");
            seker=scan.next();
        }else if (secim=='H'){
            seker="4";
        }else{
            System.out.println("Hatalı giris yaptınız,tekrar deneyiniz");
        }
        sutTercihi();

    }

    private void sutTercihi() {
        System.out.println("Sut ister misiniz? Evet icin 'E' Hayır icin 'H' girginiz");
        char secim=scan.next().toUpperCase().charAt(0);
        if (secim=='E'){
            System.out.println("Sut miktarını seciniz : \n 1-Az sutlu 2-Orta sutlu 3-Bol sutlu");
            sut=scan.next();
        }else if (secim=='H'){
            sut="0";
        }else{
            System.out.println("Hatalı girgis yaptınız tekrar deneyiniz");
            sutTercihi();
        }
    }
}

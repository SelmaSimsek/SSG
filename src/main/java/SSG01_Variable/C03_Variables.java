package SSG01_Variable;

import java.util.Scanner;

public class C03_Variables {
    public static void main(String[] args) {
        double kilo,yas=15,boy;
        String name="ali can";
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kilonuzu giriniz");
        kilo=scan.nextDouble();
        System.out.println("lutfen boyunuzu giriniz");
        boy= scan.nextDouble();
        System.out.println(name+"\n"+yas+"\n"+kilo+"\n"+boy);//
    }
}

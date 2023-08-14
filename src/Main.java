import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
public class Main {
    public static void main(String[] args){
        double para;
        Scanner input = new Scanner(System.in);
        System.out.print("KDV'siz Fiyat :");
        para = input.nextDouble();
        double kdvli = ((para * 18) / 100) + para;  
        System.out.println("KDV'li Fiyat :" + kdvli);
        double kdvTutar = ((para * 18) / 100);
        System.out.print("KDV tutari :" + kdvTutar); 
    }
}

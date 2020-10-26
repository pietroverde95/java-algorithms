package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci il numero in base 10: ");
        double num = sc.nextDouble();
        System.out.print("Inserisci la base di ritorno: ");
        byte base = sc.nextByte();
        sc.close();
        double n = num;
        int val;
        String ris = "0.";
        for  (byte i = 16; n != 0 && i > 0; i--) {
            n *= base;
            val = (int) (n % 10);
            ris += val;
            if (val != 0)
                n -= val;
            n = Math.round(n * 10000.0) / 10000.0;
        }
        System.out.println("Il numero " + num + " alla base " + base + " risulta: " + ris);
    }
}

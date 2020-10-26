import java.util.Scanner;
public class Sconto {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Inserisci il prezzo: ");
		double prezzo = sc.nextDouble();
		System.out.print("Inserisci lo sconto: ");
		double sconto = sc.nextDouble();
		double PrezzoFinale = prezzo - (prezzo / 100 * sconto);
		System.out.println("Il prezzo finale è: " + PrezzoFinale);	
	}
}

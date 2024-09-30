package a;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Contatore cont = new Contatore();
		Incrementatore inc = new Incrementatore(cont);
		
		int tn = 0;
		int t = 0;
		Scanner num = new Scanner(System.in);
		System.out.println("Quanti Thread vuoi creare oltre al Main?");
		try
		{
			t = num.nextInt();
			inc.getT(t);
		}
		catch(Exception e) {
			System.out.println("\nNon e' un numero");
			return;
		}
		
		System.out.println("Scrivi un numero?");
		try
		{
			int n = num.nextInt();
			inc.getN(n);
			
		}
		catch(Exception e) {
			System.out.println("\nNon e' un numero");
			return;
		}
		
		while(t>0) {
			t--;
			tn++;
			Thread thread = new Thread(inc, "Thread-" + tn);
			thread.start();
		}

	}

}

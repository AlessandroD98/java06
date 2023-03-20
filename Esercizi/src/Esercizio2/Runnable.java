package Esercizio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runnable {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		try {
			
			System.out.println("Inserisci il numero di kilometri");
			int km = s.nextInt();
			s.nextLine();
			
			System.out.println("Inserisci il numero di litri");
			int l = s.nextInt();
			s.nextLine();
			
			int result = km/l;
			System.out.println("Hai percorso " + result + " km");
		} catch (ArithmeticException e){
			System.out.println("Non puoi dividere per zero");
		} catch (InputMismatchException e) {
			System.out.println("Non puoi usare Stringhe");
		} catch (Exception e) {
			System.out.println("Error");
		}
	}

}

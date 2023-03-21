package Esercizi;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Runnable {

	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		
		
		int[] arr = new int[5];
		generateRandomArray(arr);
		System.out.println(Arrays.toString(arr));
		
		boolean exit = true;
		
		while(exit) {
			
			try {
				System.out.println("Inserisci un numero da 1 a 10 -- 0 per uscire");
				int n = scanner.nextInt();
				scanner.nextLine();
				if(n == 0) {
					exit = false;
				} else if ( n > 10) {
					throw new ArithmeticException("Inserisci un valore valido");
				} else {
					
					System.out.println("Seleziona la posizione dove inserire il numero da 1 a 5");
					int p = scanner.nextInt();
					scanner.nextLine();
					
					arrayModificato(arr, n, p);
				}
					
			} catch(InputMismatchException e){
				System.out.println("Non puoi inserire Stringhe di testo");
				scanner.nextLine();
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Utilizza un valore tra 1 e 5");
			}
		}
	}

	public static int[] generateRandomArray(int[] arr) {
		
			  for(int j = 0; j < arr.length; j++) {
				  arr[j] = getRandomNum();
			  }	
		return arr;
	}
	
	
	public static int getRandomNum() {
		
		int max = 10;
		int min = 1;
		int range = max - min +1;
		int randomNum = 0;
		
		for(int i = 0; i < 10; i++) {
		  randomNum = (int)(Math.random() * range) + min; 	
		}
		return randomNum;
	}
	
	public static void arrayModificato (int[] arr, int n, int p) {
		
	for(int i = 0; i < arr.length; i++) {
		if(i < p - 1) {
			arr[i] = arr[i];
		} else if(i == p - 1) {
			arr[i] = n;
		} else {
			arr[1] = arr[i - 1];
		}
	}
	System.out.println(Arrays.toString(arr));
	}
}

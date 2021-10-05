// Praktikum PBO nomor 2

import java.util.Scanner;
public class gift3_2 {
	
	public static void main(String[] args){
		final double pi = 3.14;
		Scanner input =  new Scanner(System.in);
		
		double jari,luas;
		System.out.print("Masukkan nilai jari-jari: ");
		jari = input.nextDouble();
		
		luas = pi*jari*jari;
		
		System.out.print("\n");
		System.out.println("Hasil nilai luas lingkaran: "+luas);
	}
}
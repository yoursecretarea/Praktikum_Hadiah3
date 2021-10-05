//Praktikum PBO nomor 1

import java.util.Scanner;
public class gift3_1 {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		double celcius, cindy;
		
		System.out.print("Masukkan Nilai Celcius: ");
		celcius= input.nextDouble();
		
		System.out.print("\n");
		cindy = ((celcius*9)/5)+32;
		
		System.out.println("Hasil Nilai Fahrenheit: "+cindy);
	}
	
}
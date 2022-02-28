package nothesaplama;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ýlk vize notunuzu giriniz:");
		double vize1= scanner.nextDouble();
		System.out.print("Ýkinci vize notunuzu giriniz:");
		double vize2= scanner.nextDouble();
		System.out.print("Final notunuzu giriniz:");
		double final1= scanner.nextDouble();
		
		vize1= (vize1*30d)/100d;
		vize2=(vize2*30d)/100d;
		final1=(final1*40d)/100d;
		
		double not=vize1+vize2+final1;
		
		if (not >= 90) {
			
			System.out.println("Notunuz"+ " " + not + " "+ "AA aldiniz");
		}
		
		else if (not >= 85) {
			
			System.out.println("Notunuz"+ " " + not + " " + "BA aldiniz");
		}
		
		else if(not >= 80) {
			
			System.out.println("Notunuz"+ " " + not + " " + "BB aldiniz");
		}
        
		else if(not >= 75) {
			
			System.out.println("Notunuz"+ " " + not + " " + "CB aldiniz");
		}
        else if(not >= 70) {
			
			System.out.println("Notunuz"+ " " + not + " " + "CC aldiniz");
		}
        else if(not >= 65) {
			
			System.out.println("Notunuz"+ " " + not + " " +"DC aldiniz");
		}
        else if(not >= 60) {
			
			System.out.println("Notunuz"+ " " + not + " " + "DD aldiniz");
		}				
        else {
			
			System.out.println("Notunuz"+ " " + not + " " + "Kaldiniz");
		}
		
		
		
		
	}
}

package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		method1();
		System.out.println("Fim do Programa");

	}

	public static void method1() {
		System.out.println("M�TODO 1 IN�CIO");
		method2();
		System.out.println("M�TODO 1 FIM");
	}

	public static void method2() {
		System.out.println("M�TODO 2 IN�CIO");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posi��o inv�lida !");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Valor inv�lido");
		}
		sc.close();
		System.out.println("M�TODO 2 FIM");
	}

}

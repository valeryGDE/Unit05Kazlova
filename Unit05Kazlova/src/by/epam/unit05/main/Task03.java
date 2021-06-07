package by.epam.unit05.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
//		Написать метод(методы), определяющий, в каком из данных двух чисел
//		больше цифр.

		int a;
		int b;
		int longest;

		a = inputIntFromConsole("Введите целое число: ");
		b = inputIntFromConsole("Введите целое число: ");

		longest = getTheLongestNumber(a, b);
		System.out.println("longest = " + longest);
	}

	public static int inputIntFromConsole(String message) {
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Неверный ввод. " + message);
		}

		value = sc.nextInt();
		return value;
	}

	public static char[] convertToCharArray(int a) {
		char[] ch = String.valueOf(a).toCharArray();
		return ch;
	}

	public static int getTheLongestNumber(int a, int b) {
		int longest;
		if (convertToCharArray(a).length > convertToCharArray(b).length) {
			longest = a;
		} else {
			longest = b;
		}

		return longest;
	}
}

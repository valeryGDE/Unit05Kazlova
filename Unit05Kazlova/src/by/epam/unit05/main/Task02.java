package by.epam.unit05.main;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
//		Написать метод(методы) для нахождения суммы большего и меньшего из
//		трех чисел.

		int[] array = new int[3];
		int min;
		int max;
		int sum;
		
		inputArrayValuesFromConsole (array);

		min = getLowestNumber(array);
		System.out.println("min = " + min);

		max = getHighestNumber(array);
		System.out.println("max = " + max);

		sum = addition(min, max);
		System.out.println("sum min and max = " + sum);

	}

	public static int[] inputArrayValuesFromConsole(int[] array) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("Введите целое число: ");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.print("Неверный ввод. Введите целое число: ");
			}
			array[i] = sc.nextInt();
		}
		return array;

	}

	public static int getLowestNumber(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	public static int getHighestNumber(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public static int addition(int a, int b) {
		int sum;
		sum = a + b;
		return sum;
	}

}

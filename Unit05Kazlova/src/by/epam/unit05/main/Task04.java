package by.epam.unit05.main;

import java.util.Random;
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
//		Задан массив D. Определить следующие суммы: D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//		Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.

		int[] mas = new int[7];
		int sumOfThree;

		randomInitialize(mas);

		sumOfThree = additionOfThreeIndexes(mas, 1);
		System.out.println("D[1] + D[2] + D[3] = " + sumOfThree);

		sumOfThree = additionOfThreeIndexes(mas, 3);
		System.out.println("D[3] + D[4] + D[5] = " + sumOfThree);

		sumOfThree = additionOfThreeIndexes(mas, 4);
		System.out.println("D[4] + D[5] + D[6] = " + sumOfThree);

	}

	public static int[] randomInitialize(int[] array) {
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
			System.out.println("mas[" + i + "]= " + array[i]);
		}
		return array;

	}

	public static int additionOfThreeIndexes(int[] a, int k) {
		int sum = 0;
		int m = 3;
		for (int i = k; i < k + m; i++) {
			sum = sum + a[i];
		}

		return sum;
	}

}

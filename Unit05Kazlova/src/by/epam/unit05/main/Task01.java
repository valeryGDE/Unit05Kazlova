package by.epam.unit05.main;

public class Task01 {

	public static void main(String[] args) {
//		Написать метод(методы) для нахождения наибольшего общего делителя и
//		наименьшего общего кратного двух натуральных чисел:

		int a = 50;
		int b = 180;

		int gcd = greatestCommonDivisorFind(a, b);
		int lcm = leastCommonMultipleFind(a, b);

		System.out.println("gcd = " + gcd);
		System.out.println("lcm = " + lcm);
	}

	public static int greatestCommonDivisorFind(int a, int b) {
		int gcd;
		int temp;
		int x = 0;

		if (a < b) {
			temp = a;
			a = b;
			b = temp;
		}

		if (a % b == 0) {
			gcd = b;
		} else {
			int key = a % b;
			while (key != 0) {
				x = key;
				key = b % x;
				b = x;
			}

			gcd = x;
		}

		return gcd;
	}

	public static int leastCommonMultipleFind(int a, int b) {
		int lcm = a * b / greatestCommonDivisorFind(a, b);
		return lcm;
	}

}

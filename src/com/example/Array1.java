package com.example;

public class Array1 {
	public static void main(String[] args) {
		int N = 98675;
		int t = N;
		int arr[] = new int[10];
		int i = 0;
		while (t > 0) {
			int remainder = t % 10;
			arr[i] = remainder;
			i++;
			t = t / 10;
		}
		for (i = 0; i < 10; i++) {
			System.out.println(arr[i]);
		}
	}
}

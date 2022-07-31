package com.greatlearning.main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FloorConstruction {

	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the total no of floors in the building :");

		n = sc.nextInt();

		int[] array = new int[n];
		int stop = 0;

		for (int i = 0; i < n; i++) {

			System.out.println("enter the floor size given on day :" + (i + 1));

			array[i] = sc.nextInt();

			for (int j = 0; j != i; j++) {

				if (array[i] == array[j]) {

					stop = 1;

				}

			}
		}
		sc.close();

		System.out.println("\n");

		if (stop == 1) {

			System.out.println("Enter a distinct floor size");

		} else {

			Queue<Integer> queue = new LinkedList<>();

			for (int i = 0; i < array.length; i++) {
				queue.add(array[i]);

			}

			System.out.println(queue);

		}
		System.out.println(array.length);
	}

}

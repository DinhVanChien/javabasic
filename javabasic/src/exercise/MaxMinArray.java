package exercise;

public class MaxMinArray {
/*
 * Cho mảng A, mảng B, tìm max mảng A, min mảng B
 * nếu min mảng B > max mảng A gán vị trí phần tử max mảng A = (Min B - Max A),
 * vị trí phần tử min mảng B = (Min B + Max A) 
 * Tính tổng hai mảng
 * VD mảng A[2, 3, 1, 4, 5] => max = 5
 * VD mảng A[9, 6, 8, 7] => min = 6
 * => kq: 46
 */
    static int indexMaxA = 0;
    static int indexMinB = 0;
	// function tìm max
	public static int findMax(int[] array) {
		int max = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
				indexMaxA = i;
			}
		}
		return max;
	}
	// function tìm min
	public static int findMin(int[] array) {
		int min = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
				indexMinB = i;
			}
		}
		return min;
	}
	
	// function tìm min
		public static int totalArray(int[] array) {
			int total = 0;
			for(int i = 0; i < array.length; i++) {
				total = total + array[i];
			}
			return total;
		}
	

	public static void main(String[] args) {
		int[] a = {2, 3, 1, 4, 5};
		int[] b = {9, 6, 8, 7};
		int maxA = findMax(a);
		int minB = findMin(b);
		if(minB > maxA) {
			a[indexMaxA] = minB - maxA;
			b[indexMinB] = minB + maxA;
		}
		int totalA = totalArray(a);
		int totalB = totalArray(b);
		System.out.println("Result: " + (totalA + totalB));
	}
	
}

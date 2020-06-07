package animesh.javacodes;

import java.util.Scanner;

public class ArraySearch {


	public static void linearSearch(Integer numArray[], Integer n, Integer searchNum) {
		int pos = -1;
		for(int j = 0; j < n; j++) {
			if(searchNum == numArray[j]) {
				pos = j;
			}
		}
		if(pos == -1) {
			System.out.println("Number not found");
		} else {
			System.out.println("Number found at : " + pos);
		}

	}

	public static void binarySearch(Integer numArray[], Integer n, Integer searchNum) {
		int beg = 0;
		int mid = (0 + n) / 2;
		int end = n-1;
		while(beg <= end) {
			if(numArray[mid] == searchNum) {
				System.out.println("Number found at : " + mid);
				beg++;
				end--;
			} else if(numArray[mid] > searchNum) {
				end = mid - 1;
			} else {
				beg = mid + 1;
			}
			mid = (beg + end) / 2;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Array Search Linear and Binary");
		Integer n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		n = sc.nextInt();
		System.out.println("Enter Array Elements");
		Integer num[] = new Integer[n];
		for(int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		System.out.println("Enter Element to be searched");
		int searchNum = sc.nextInt();
		System.out.println("Linear Search");
		linearSearch(num, n, searchNum);
		System.out.println("Binary Search");
		binarySearch(num, n, searchNum);
		sc.close();
	}

}

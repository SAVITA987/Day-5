package functionalprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfThree {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of integers (N): ");
	        int N = scanner.nextInt();

	        System.out.println("Enter the array of integers:");
	        int[] array = new int[N];
	        for (int i = 0; i < N; i++) {
	            array[i] = scanner.nextInt();
	        }

	        ArrayList<ArrayList<Integer>> triplets = findTripletsWithSumZero(array);
	        
	        System.out.println("Number of distinct triplets with sum zero: " + triplets.size());
	        
	        System.out.println("Distinct triplets with sum zero:");
	        for (ArrayList<Integer> triplet : triplets) {
	            System.out.println(triplet);
	        }
	    }

	    private static ArrayList<ArrayList<Integer>> findTripletsWithSumZero(int[] array) {
	        Arrays.sort(array);

	        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

	        for (int i = 0; i < array.length - 2; i++) {
	            if (i == 0 || (i > 0 && array[i] != array[i - 1])) {
	                int left = i + 1;
	                int right = array.length - 1;
	                int targetSum = -array[i];

	                while (left < right) {
	                    int currentSum = array[left] + array[right];

	                    if (currentSum == targetSum) {
	                        result.add(new ArrayList<>(Arrays.asList(array[i], array[left], array[right])));
	                        while (left < right && array[left] == array[left + 1]) left++;
	                        while (left < right && array[right] == array[right - 1]) right--;

	                        left++;
	                        right--;
	                    } else if (currentSum < targetSum) {
	                        left++;
	                    } else {
	                        right--;
	                    }
	                }
	            }
	        }

	        return result;
	    }
	}


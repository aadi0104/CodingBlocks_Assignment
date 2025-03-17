//Take as input N, the size of array. Take N more inputs and store that in an array. 
//Take N more inputs and store that in another array. 
//Write a function which gives the intersection of two arrays in an ArrayList of integers and Print the ArrayList.

//Sample Input
//7
//1 2 3 1 2 4 1
//2 1 3 1 5 2 2

package Assignment9;

import java.util.*;

public class Arrays_Intersection_Of_Two_Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Intersection(arr1, arr2);
	}

	public static void Intersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i])) {
				map.put(arr1[i], map.get(arr1[i]) + 1);
			} else {
				map.put(arr1[i], 1);
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i]) && map.get(arr2[i]) > 0) {
				ans.add(arr2[i]);
				map.put(arr2[i], map.get(arr2[i]) - 1);
			}
		}
		System.out.print(ans);
	}
	
}

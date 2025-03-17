//Given an array find the number which comes with maximum frequency. It must work in O(n) time complexity.

//Sample Input
//5
//1 2 2 2 3

package Assignment9;

import java.util.*;

public class Highest_Frequency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int data = sc.nextInt();
			if (map.containsKey(data)) {
				map.put(data, map.get(data) + 1);
			} else {
				map.put(data, 1);
			}
		}
		int maxkey = 0;
		int maxdata = 0;
		for (int key : map.keySet()) {
			if (map.get(key) > maxdata) {
				maxkey = key;
				maxdata = map.get(key);
			}
		}
		System.out.println(maxkey);
	}
	
}

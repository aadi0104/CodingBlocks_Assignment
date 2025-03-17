//Find the kth largest element in an unsorted array.
//Note:It is the kth largest element in the sorted order, not the kth distinct element.

//Sample Input
//6
//2
//3 2 1 5 6 4

package Assignment9;

import java.util.*;

public class Find_Kth_Largest_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return b - a;
			}
		});
		for (int i = 0; i < n; i++) {
			pq.add(sc.nextInt());
		}
		int ans = 0;
		for (int i = 0; i < k; i++) {
			ans = pq.poll();
		}
		System.out.print(ans);
	}
	
}

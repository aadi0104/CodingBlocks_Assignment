package Assignment9;

import java.util.*;

public class Merge_K_Sorted_Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < k; j++) {
				heap.add(sc.nextInt());
			}
		}
		Merge(heap, n, k);
	}

	public static void Merge(PriorityQueue<Integer> heap, int n, int k) {
		int[] ans = new int[n * k];
		int c = 0;
		while (!heap.isEmpty()) {
			ans[c] = heap.poll();
			c++;
		}
		for(int i = 0; i < n * k; i++) {
			System.out.print(ans[i] + " ");
		}
	}

}

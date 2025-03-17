//Given an array arr of n length. 
//You will be given Q queries for the array. 
//Each query contains a number N.
//You have to determine whether a number exist in the array or not

//Sample Input
//1
//6
//12 3 -67 67 34 2
//4
//4
//5
//67
//7

package Assignment9;

import java.util.*;

public class Exist_OR_Not {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int l = sc.nextInt();
			HashSet<Integer> set = new HashSet<>();
			for (int j = 0; j < l; j++) {
				set.add(sc.nextInt());
			}
			int q = sc.nextInt();
			for (int j = 0; j < q; j++) {
				if (set.contains(sc.nextInt())) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}
	}
	
}

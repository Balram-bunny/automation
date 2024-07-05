package Programms;

import java.util.HashSet;

public class programme1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,4,5,6};
//		HashSet set=new HashSet();
//		for(int a  : arr) {
//			set.add(a);
//		}
		int n = arr.length;
		int ans = 0;
		
		for(int i=0; i<n; i++) {
			ans ^= arr[i];
		}
		
		for(int i=1; i<=n+1; i++) {
			ans ^= i;
		}
		
		
//		for(int i=1; i<=n+1; i++) {
//			if(!set.contains(i)) {
//				ans = i;
//				break;
//			}
//		}
		
		System.out.println("missing num is: " + ans);

	}

}

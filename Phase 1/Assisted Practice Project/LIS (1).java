package practice;
import java.util.HashSet;

public class LIS {
	public static void main(String[] args) {
		int[] a= {4,10,2,11,5,21,3,12,13};
		HashSet<Integer>hs=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		int long_leng=0;
		for(int i=0;i<a.length;i++) {
			if(!hs.contains(a[i]-1)) {
				int no=a[i];
				while(hs.contains(no)) {
					no++;
				}
				if(long_leng<no-a[i]) {
					long_leng=no-a[i];
				}
				}
			}
		System.out.println("Longest Subsequence length is "+long_leng);
	}
}
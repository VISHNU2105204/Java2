/*Program3: Input array size ‘n’, input and store ‘n’ integers in an array, find the largest number in the array, also find the
sum of all the integers in the array.*/

import java.util.*;
public class LargestAndSumOfArray {

	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);
		System.out.println("Enter a Size: ");
		int n = Obj.nextInt();
		int[] a = new int[n];
		System.out.println("Enter Numbers: ");
		for(int i=0;i<a.length;++i) {
			a[i]=Obj.nextInt();
		}
		int max=a[0];
		for(int i=0;i<a.length;++i) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		int sum=0;
		for(int i=0;i<a.length;++i) {
			sum+=a[i];
		}
		System.out.println("Maximum No: "+max);
		System.out.println("Sum No: "+sum);
	}
}

/*Output: Enter a Size: 
5
Enter Numbers: 
1
2
3
4
5
Maximum No: 5
Sum No: 15*/

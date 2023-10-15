/*Program9: Input a string, if the data contained within the string is an integer then display its cube, if it is a double then
find its square root, if it neither then display it is a string.*/

import java.util.*;

public class ExceptionalHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("String: ");
		String s = sc.nextLine();
		try {
			int n = Integer.parseInt(s);
			int c = (int)Math.pow(n, 3);
			System.out.printf("%d cube is %d\n", n, c);
		} catch (NumberFormatException e1) {
			try {
				double d = Double.parseDouble(s);
				double r = Math.sqrt(d);
				System.out.printf("%f square root is %f\n", d, r);
			} catch (NumberFormatException e2) {
				System.out.printf("%s is a string\n", s);
			}
		}
	}
}

/*Output1: String: 24
24 cube is 13824
Output2: String: vishnu
vishnu is a string

*/

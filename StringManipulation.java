/*Program8: Input a string, count the number of vowels, consonants and digits in the string.*/

import java.util.*;
public class StringManiplation
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println ("String: ");
		String s = sc.nextLine ();
		int vowels = 0, consonants = 0, digits = 0;
		for(char ch: s.toCharArray()) {
			if(Character.isLetter(ch)) {
				if("aeiouAeiou".contains(ch + "")) {
					++vowels;
				}else {
					++consonants;
				}
			}
			else if(Character.isDigit(ch)) {
				++digits;
			}
		}

		System.out.println ("vowels:" + vowels);
		System.out.println ("consonents" + consonants);

		System.out.println ("digit" + digits);

	}
}

/*Output: String: 
vishnu
vowels:2
consonents4
digit0
*/

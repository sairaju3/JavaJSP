package advanceLevel_String_program;

import java.util.Scanner;

public class FirstUniqueChar 
{
	public static char[] toCharArray(String st) 
	{
		char[] ch = new char[st.length()];
		for (int i = 0; i <= st.length() - 1; i++) 
		
		{
			ch[i] = st.charAt(i);
		}
		return ch;
	}

	public static void frequencyOfChar(String st) {

		int index = -1;
		int maxCount = Integer.MAX_VALUE;
		char[] ch = toCharArray(st);
		char visited = Character.MIN_VALUE;
		for (int i = 0; i <= ch.length - 1; i++) {
			if (ch[i] != visited) 
			{
				int count = 0;
				for (int j = i + 1; j <= ch.length - 1; j++) 
				{
					if (ch[i] == ch[j]) 
					{
						count++;
						ch[j] = visited;
					}
				}
				if (count < maxCount) 
				{
					maxCount = count;
					index = i;
				}
			}
			
		}
		if (maxCount == 0)
			System.out.println("First unique Character :- " + ch[index]);
		else
			System.out.println("No Unique Character..");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String..");
		String st = sc.next();
		frequencyOfChar(st);
	}

}

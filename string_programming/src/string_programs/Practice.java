package string_programs;

import java.util.Scanner;

public class Practice 
{
    public static char[] toCharArray(String st)
    {
        char[] ch = new char[st.length()];
        for(int i = 0; i < st.length(); i++)
        {
            ch[i] = st.charAt(i);
        }
        return ch;
    }

    public static void freqOfChar(String st)
    {
        char[] ch = toCharArray(st);
        char visited = Character.MIN_VALUE;

        for(int i = 0; i < ch.length; i++)
        {
            if(ch[i] != visited)
               // continue;

            // check only vowels
            if(isVowel(ch[i]))  
            {
                int count = 1;

                for(int j = i + 1; j < ch.length; j++)
                {
                    if(ch[i] == ch[j])
                    {
                        count++;
                        ch[j] = visited;  // mark visited
                    }
                }

                System.out.println("Vowel " + ch[i] + " -> frequency " + count);
            }
        }
    }

    // ✔ corrected vowel check
    public static boolean isVowel(char ch)
    {
        ch = Character.toLowerCase(ch);
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.next();
        freqOfChar(st);
        sc.close(); 
    }
}

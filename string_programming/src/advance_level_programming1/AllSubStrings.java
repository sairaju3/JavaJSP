package advance_level_programming1;


import java.util.Scanner;

public class AllSubStrings 
{
    public static void findAllSubStrings(String st)
    {
        int n = st.length();

        for(int i = 0; i < n; i++)        // starting index
        {
        	String sub = "";
            for(int j = i; j < n; j++)    // ending index
            {
                
                // for(int k = i; k <= j; k++)   // build substring manually
                //{
                    sub = sub + st.charAt(j);
               // }
                System.out.println(sub);
            }
        }
    
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String st = sc.next();
        
        findAllSubStrings(st);
    }
}


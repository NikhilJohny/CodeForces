package CodeForces;

import java.util.*;
 
//Nikhil Johny
//CodeForces : https://www.codeforces.com/profile/NikhilJohny
 
public class LuckyDivision{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number % 7 == 0 || number % 4 == 0) System.out.println("YES");
        else {
            while(number != 0)
            {
                if(number % 10 != 4 && number % 10 != 7)
                {
                    System.out.println("NO");
                    break;
                }
                number /= 10;
            }
            System.out.println("YES");
        }
        sc.close();
    }
}
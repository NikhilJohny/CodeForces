
import java.util.*;

//Nikhil Johny
//CodeForces : https://codeforces.com/profile/NikhilJohny
public class Problem4A{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int melon = sc.nextInt();
        if(melon > 0)
        {
            if(melon % 2 == 0 && melon > 2) System.out.println("Yes");
            else System.out.println("No");
        }
        else System.out.println("No");
        sc.close();
    }
}
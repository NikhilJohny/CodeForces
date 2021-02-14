import java.util.*;
 
//Nikhil Johny
//CodeForces : https://www.codeforces.com/profile/NikhilJohny
 
public class Main{
    public static int max(int x, int y)
    {
        if(x > y) return x;
        else return y;
    }
    public static void main(String args[])
    {
        int result = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []x = new int[n];
        int []y = new int[n];
        for(int i = 0; i < n; i++)
            x[i] = sc.nextInt();
        for(int i = 0; i < n; i++)
            y[i] = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                int dx = x[i] - x[j];
                int dy = y[i] - y[j];
                result = max(result,dx * dx + dy * dy);
            }
        }
        System.out.println(result);
    }
}
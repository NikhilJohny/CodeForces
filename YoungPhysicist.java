package CodeForces;

import java.util.*;

//Nikhil Johny
//CodeForces : https://codeforces.com/profile/NikhilJohny

public class YoungPhysicist {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int one =0 , two =0 , three= 0;
        int [][]ForceVector = new int[n][3];
        for(int i = 0; i < n; i++)
        {
            ForceVector[i][0] = sc.nextInt();
            ForceVector[i][1] = sc.nextInt();
            ForceVector[i][2] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            one += ForceVector[i][0];
            two += ForceVector[i][1];
            three += ForceVector[i][2];
        }
        if(one == 0 && two == 0 && three == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}

package CodeForces;

import java.util.*;

//Nikhil Johny
//CodeForces : https://codeforces.com/profile/NikhiJohny
public class NextRound {
    public static void main(String args[])
    {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int marks[] = new int[n];
        for(int i = 0; i < n; i++)
            marks[i] = sc.nextInt();
        for(int i = 0; i < n; i++)
            if(marks[i] >= marks[k - 1] && marks[i] > 0) result++;
        System.out.println(result);
    }
}

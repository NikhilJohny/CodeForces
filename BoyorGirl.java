package CodeForces;

import java.util.*;

//Nikhil Johny
//CodeForces : https://codeforces.com/profile/NikhilJohny

public class BoyorGirl {
    public static void main(String args[])
    {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int letters[] = new int[26];
        for(int i = 0; i < name.length(); i++)
            if(++letters[name.charAt(i) - 97] == 1) result++;
        if(result % 2 == 0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}

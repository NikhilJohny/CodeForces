package CodeForces;

import java.util.*;

import javax.lang.model.util.ElementScanner14;

//Nikhil Johny
//CodeForces : https://codeforces.com/profile/NikhilJohny

public class StringTask {
    public static void main(String args[])
    {
        String result ="";
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'Y' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'y')
                continue;
            else if(Character.isUpperCase(str.charAt(i)))
                result += "." + Character.toLowerCase(str.charAt(i));
            else 
                result += "." + str.charAt(i);
        }
        System.out.println(result);
    }
}

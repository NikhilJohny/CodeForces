import java.util.*;
 
//Nikhil Johny
//CodeForces : https://codeforces.com/profile/NikhilJohny
 
public class Team{
    public static void main(String args[])
    {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[][] = new int[size][3];
        for(int i = 0; i < size; i++)
        {
            int counter = 0;
            arr[i][0] = sc.nextInt();
            if(arr[i][0] == 1) counter++;
            arr[i][1] = sc.nextInt();
            if(arr[i][1] == 1) counter++;
            arr[i][2] = sc.nextInt();
            if(arr[i][2] == 1) counter++;
            if(counter > 1) result++;
        }
        System.out.println(result);
        sc.close();
    }
}
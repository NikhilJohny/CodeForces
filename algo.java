import java.util.*;

//Nikhil Johny
//CodeForces : https://codeforces.com/profile/NikhilJohny

public class algo{
    public static void main(String args[])
    {
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int time[] = new int[n];
        for(int i = 0; i < n; i++)
            time[i] = sc.nextInt();
        Arrays.sort(time);
        for(int i : time)
        {
            if(i <= x){
                x -= i;
                counter++;
            }
            else break;
        }
        System.out.println(counter);
    }   
}
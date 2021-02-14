import java.util.*;
 
//Nikhil Johny
//CodeForces : https://codeforces.com/profile/NikhilJohny
 
public class BeforeAnExam
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int MinHours[] = new int[days];
		int MaxHours[] = new int[days];
		int sum = sc.nextInt();
		int s1 = 0 , s2 = 0;
		for(int i = 0; i < days; i++)
		{
		    MinHours[i] = sc.nextInt();
		    MaxHours[i] = sc.nextInt();
		    s1 += MinHours[i];
		    s2 += MaxHours[i];
		}
		if(s1 > sum || s2 < sum) System.out.println("NO");
		else{
    		System.out.println("YES");
    		sum -= s1;
    		for(int i = 0; i < days - 1; i++)
    		{
    		    if(MaxHours[i] - MinHours[i] < sum){
    		        System.out.print(MaxHours[i] + " ");
    		        sum -= MaxHours[i] - MinHours[i];
    		    } 
    		    else{
    		        System.out.print(MinHours[i] + sum + " ");
    		        sum = 0;
    		    }
    		}
    		System.out.println(MinHours[days - 1] + sum);
		}
		sc.close();
	}
}
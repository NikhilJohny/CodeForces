import java.util.*;

//Nikhil Johny
//CodeForces : https://codeforces.com/profile/NikhilJohny

public class WayTooLongWords{
    public static void main(String args[])
    {
        List<String> lists = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String words[] = new String[size];
        for(int i = 0; i < size; i++){
            words[i] = sc.nextLine();
            if(words[i].length() > 10)
            {
                lists.add(new String(words[i].charAt(0) + "" + (int)(words[i].length() - 2) + "" + words[i].charAt(words[i].length() - 1)));
            }
            else lists.add(words[i]);
        }
        for(int i = 0 ; i < lists.size(); i++)
            System.out.println(lists.get(i));
        sc.close();
    }
}
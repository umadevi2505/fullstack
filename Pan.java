import java.util.*;
class Pan
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter sentence");
	String s=sc.nextLine().toLowerCase();
	int c[]=new int[26];
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		if(ch>='a'&&ch<='z')
		{
			c[ch-'a']++;
		}
	}
	int m=0;
        for(int i=0;i<26;i++)
	{
         	if(c[i]==0)
		{
                	m++;
            	}
        }
	if(m==0)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
	}
}
import java.util.Deque;
import java.util.ArrayDeque;
class Palindrome
{
     	public static boolean isPalindrome(String str)
	{
        	Deque<Character> deque=new ArrayDeque<>();
        	for(char ch:str.toCharArray())
		{
           		deque.addLast(ch);
        	}
        	while(deque.size()>1)
		{
            		if (deque.pollFirst()!=deque.pollLast())
			{
                		return false;
            		}
        	}
        	return true;
    	}
    	public static void main(String[] args)
	{
        	String testStr="racecar";
        	System.out.println(isPalindrome(testStr));
        	System.out.println(isPalindrome("hello"));
    	}
}

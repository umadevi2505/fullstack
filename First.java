import java.util.LinkedHashMap;
import java.util.Map;

class First
{
    	public static char findFirstNonRepeating(String str)
	{
        	Map<Character, Integer> charCountMap = new LinkedHashMap<>();
        	for (char ch : str.toCharArray())
		{
            		charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        	}
        	for (Map.Entry<Character, Integer> entry : charCountMap.entrySet())
		{
            		if (entry.getValue() == 1)
			{
                		return entry.getKey();
            		}
        	}

        	return '$'; 
	}
	public static void main(String[] args)
	{
        	String testStr = "geeksforgeeks";
        	System.out.println(findFirstNonRepeating(testStr));
    	}
}

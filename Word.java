import java.util.HashMap;
import java.util.Map;
class Word
{
    	public static void countWordFrequency(String str)
	{
        	Map<String, Integer> wordCountMap=new HashMap<>();
        	String[] words=str.toLowerCase().split("\\s+");
        	for (String word:words)
		{
            		wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        	}
        	for (Map.Entry<String, Integer> entry : wordCountMap.entrySet())
		{
            		System.out.println(entry.getKey() + ": " + entry.getValue());
        	}
    	}
    	public static void main(String[] args)
	{
        	String text = "Java is great and Java is powerful";
        	countWordFrequency(text);
    	}
}

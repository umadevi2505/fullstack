import java.util.Queue;
import java.util.LinkedList;
class Binary
{
	public static void printBinary(int n)
	{
        	Queue <String> queue=new LinkedList<>();
        	queue.add("1");
        	for (int i=0;i<n;i++)
		{
            		String binary=queue.poll();
            		System.out.println(binary);
            		queue.add(binary+"0");
            		queue.add(binary+"1");
        	}
    	}
    	public static void main(String[] args)
	{
        	int n=10;
        	printBinary(n);
    }
}

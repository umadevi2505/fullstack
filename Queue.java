import java.util.*;
class Queue
{
	Stack<Integer> s1=new Stack<>();
    	Stack<Integer> s2=new Stack<>();
    	public void enqueue(int x)
	{
        	s1.push(x);
    	}
    	public int dequeue()
	{
        	if (s2.isEmpty())
		{
         		if (s1.isEmpty())
			{
                		throw new RuntimeException("Queue is empty");
            		}
            		while (!s1.isEmpty())
			{
                		s2.push(s1.pop());
            		}
        	}
       		return s2.pop();
    	}
    	public static void main(String[] args)
	{
        	Queue q = new Queue();
        	q.enqueue(1);
        	q.enqueue(2);
        	q.enqueue(3);
        	System.out.println(q.dequeue());
        	System.out.println(q.dequeue());
    }
}

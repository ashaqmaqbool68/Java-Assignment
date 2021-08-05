package basics;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueList {
public static void main(String[] args) {
	Queue <String>q=new PriorityQueue<String>();
	q.add("sahil");
	q.add("hamid");
	q.add("altaf");
	q.add("haris");
	System.out.println(q);
	q.remove();
	q.poll();
	System.out.println(q);
	
}
}
//The PriorityQueue class implements the Queue interface. It holds the elements or objects which are to be processed by their priorities.
//PriorityQueue doesn't allow null values to be stored in the queue.
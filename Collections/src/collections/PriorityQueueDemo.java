package collections;

import java.util.PriorityQueue;
public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		System.out.println(q.isEmpty());
		
		q.offer(100);
		q.add(200);
		q.offer(300);
		q.offer(400);
		System.out.println(q);
		
		System.out.println(q.remove());
	System.out.println(q.poll());
		System.out.println(q);
	}
}

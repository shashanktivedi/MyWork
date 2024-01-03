package com.learn.collection.queues;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMethods {

	public static void main(String[] args) {
		
		Queue queue = new PriorityQueue<String>();
		queue.add(null);
		queue.element();
		queue.offer(null);
		queue.peek();
		queue.poll();
		queue.remove();
		
		
	}
}

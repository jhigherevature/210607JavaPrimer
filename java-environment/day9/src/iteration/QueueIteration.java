package iteration;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueIteration {
	public static void main(String[] args) {
		System.out.println("::: QUEUES :::");
		Queue<String> pQue = new PriorityQueue<String>();
		pQue.add("Assembly");
		pQue.add("Function");
		pQue.add("Binary");
		pQue.add("Compile");
		pQue.add("Compile");
		pQue.add("DataStructure");
		pQue.add("Compile");
		
		System.out.println("Queue - Enhanced For-Loop");
		for (String name : pQue) {
			System.out.println(name);
		}
		
		System.out.println("Queue - While Loop");
		Iterator<String> qItr = pQue.iterator();
		while (qItr.hasNext()) {
			System.out.println(qItr.next());
		}
	}
}

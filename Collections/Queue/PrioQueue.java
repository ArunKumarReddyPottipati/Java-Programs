import java.util.PriorityQueue;

public class PrioQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(78);
        pq.add(20);
        pq.offer(5);
        pq.offer(75);
        pq.offer(99);
        System.out.println("Original Queue: " + pq);
        System.out.println("Removing:" + pq.remove());
        System.out.println("Queue after removing an element: " + pq);
        System.out.println("Removing:" + pq.poll());
        System.out.println("Queue after removing an element: " + pq);
        System.out.println("Checking whether the queue is empty or not: " + pq.isEmpty());
        System.out.println("Checking the size of the queue: " + pq.size());
        System.out.println("Checking whether the queue contains 20 :" + pq.contains(20));
    }
}

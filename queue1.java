import java.util.Comparator;
import java.util.PriorityQueue;
class Comparator7 implements Comparator<Integer>
{
	@Override
	public int compare(Integer i1, Integer i2) {
		return i2-i1;
	}
}
public class queue1 {

	public static void main(String[] args) {
		Comparator7 c= new Comparator7();
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.offer(50);
		queue.offer(10);
		queue.offer(30);
		queue.offer(20);
		queue.offer(40);
		queue.offer(10);
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue);
		//System.out.println(queue.poll()); //null
		System.out.println(queue.remove()); //exception
		//System.out.println(queue.element()); // NoSuchElementException
		//System.out.println(queue.peek());//null
	}

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
class Comparator6 implements Comparator<Integer>
{
	@Override
	public int compare(Integer i1, Integer i2) {
		return i2-i1;
	}
}
public class ArrayListintegerCompare {

	public static void main(String[] args) {
		Comparator6 c= new Comparator6();
		ArrayList<Integer> list =new ArrayList<Integer>();
		list.add(50);
		list.add(30);
		list.add(60);
		list.add(10);
		list.add(50);
		list.add(40);
		list.add(20);
		list.add(40);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,c);
		System.out.println(list);
	}

}

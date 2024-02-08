import java.util.*;
class Comparator5 implements Comparator<Integer>
{
	@Override
	public int compare(Integer i1, Integer i2) {
		return i2-i1;
	}
}
public class treesetintegerCompare {

	public static void main(String[] args) {
		Comparator5 c= new Comparator5();
		TreeSet<Integer> set = new TreeSet<Integer>(c);
		set.add(50);
		set.add(30);
		set.add(60);
		set.add(10);
		set.add(40);
		set.add(20);
		System.out.println(set);
		
	}

}

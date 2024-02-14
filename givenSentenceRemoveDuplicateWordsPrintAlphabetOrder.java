import java.util.*;
public class givenSentenceRemoveDuplicateWordsPrintAlphabetOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TreeSet <String> set = new TreeSet<String>();
		String s = scan.nextLine();
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		
		for(String str:set)
		{
			System.out.println(str);
		}
		
	}

}
//input:

//fear leads to anger anger leads to hatred
//- hatred leads conflict conflict leads to suffering

//output:

//anger
//conflict
//fear
//hatred
//leads
//suffering
//to

import java.util.*;
import java.util.Map.Entry;
public class givenSentencePrintWordsThatMoreThan2times {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String a[] = s.split(" ");
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(map.containsKey(a[i]))
			{
				int c =map.get(a[i]);
				map.put(a[i], c+1);
			}
			else
			{
				map.put(a[i],1);
			}
		}
		Set<Entry<String,Integer>>entrys=map.entrySet();
		
		for(Entry<String,Integer> e: entrys)
		{
			int val =e.getValue();
			if(val>2)
			{
				String res =e.getKey();
				System.out.println(res);
			}
		}
		
		
	}

}
//fear leads to anger anger leads to hatred hatred leads conflict conflict leads to suffering 
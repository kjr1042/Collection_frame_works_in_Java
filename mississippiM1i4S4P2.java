import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class mississippiM1i4S4P2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		String s=scan.next();
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(map.containsKey(ch))
			{
				int c =map.get(ch);
				map.put(ch, c+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		String t="";
		Set<Entry<Character,Integer>> entrys = map.entrySet();
		for(Entry<Character,Integer> e:entrys)
		{
			t=t+e.getKey()+e.getValue();
			
		}
		System.out.println(t);
	}

}

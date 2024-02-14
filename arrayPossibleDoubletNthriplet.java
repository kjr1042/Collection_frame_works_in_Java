import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class arrayPossibleDoubletNthriplet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<Integer,Integer> map =new HashMap<Integer,Integer>();
		int n= scan.nextInt();
		int a[] = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i] =scan.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(map.containsKey(a[i]))
			{
				int c =map.get(a[i]);
				map.put(a[i], c+1);
			}
			else
			{
				map.put(a[i], 1);
			}
		}
		Collection<Integer> values=map.values();
		int sum=0;
		for(int v:values)
		{
			sum=sum+v/3;
			
		}
		System.out.println(sum);

	}

}

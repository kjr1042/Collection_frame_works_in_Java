import java.util.*;
class Passenger implements Comparable<Passenger>
{
	private String name;
	private int price;
	private int duration;
	public Passenger(String name,int price,int duration)
	{
		this.name=name;
		this.price =price;
		this.duration=duration;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String toString()
	{
		return name +","+price+","+duration;
		
	}
	@Override
	public int compareTo(Passenger p2) {
		Passenger p1=this;
		if(p1.price-p2.price !=0)
		{
			return p1.price-p2.price;
		}
		else if(p1.duration -p2.duration !=0)
		{
			return p1.duration -p2.duration;
		}
		else
		{
			return p1.name.compareTo(p2.name);
		}
			
	}
	
}
public class flightDetails {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TreeSet<Passenger> list =new TreeSet<Passenger>();
		int n =scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			String s=scan.next();
			String a[] =s.split(",");
			String name=a[0];
			int price =Integer.parseInt(a[1]);
			int duration =Integer.parseInt(a[2]);
			Passenger p= new Passenger(name,price,duration);
			list.add(p);
		}
		for( Passenger p: list)
		{
			System.out.println(p);
		}
	}

}
//n=5
// input:
//delta,300,2
//united,200,1
//american,300,3
//southwest,200,2
//jetblue,100,1
//output:
//jetblue,100,1
//united,200,1
//southwest,200,2
//delta,300,2
//american,300,3
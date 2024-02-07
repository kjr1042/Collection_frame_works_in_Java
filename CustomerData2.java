import java.util.*;
class CustomerData  implements Comparable<CustomerData>
{
	private int id;
	private String name;
	private String email;
	private int age;
	
	public CustomerData(int id,String name,String email,int age)
	{
		this.id =id;
		this.name=name;
		this.email=email;
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString()
	{ 
		return id+" "+name+" "+email+" "+age;
		
	}
	public int compareTo(CustomerData c2) {
		CustomerData c1=this;
		String name1=c1.name;
		String name2=c2.name;
		Integer a1=c1.age;
		Integer a2=c2.age;
		if(name1.compareTo(name2)==0)
		{
			return a1.compareTo(a2);
		}
		else
		{
			return name1.compareTo(name2);
		}
		
		
	}
		
}
public class CustomerData2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		TreeSet<CustomerData> list= new TreeSet<CustomerData>();
		for(int i=1;i<=n;i++)
		{
			String s= scan.next();
			String arr[] =s.split(",");
			int id =1000+i;
			String name =arr[0];
			String email=arr[1];
			int age =Integer.parseInt(arr[2]);
			CustomerData c=new CustomerData(id,name,email,age);
			list.add(c);
		}	
		for( CustomerData c:list )
		{
			System.out.println(c);
		}
	}

}

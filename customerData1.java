import java.util.*;
class Customer
{
	private int id;
	private String name;
	private String email;
	private int age;
	
	public Customer(int id,String name,String email,int age)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.age=age;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}


public class customerData1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		ArrayList<Customer> list = new ArrayList<Customer>();
		for(int i=1;i<=n;i++)
		{
			String s= scan.next();
			String [] arr =s.split(",");
			
			int id =1000+i;
			String name =arr[0];
			String email =arr[1];
			int age =Integer.parseInt(arr[2]);
			
			
			Customer c = new Customer(id,name,email,age);
			list.add(c);
		}
		
		for(int i=0;i<list.size();i++)
		{
			Customer c=list.get(i);
			System.out.println(c.getId() +" "+c.getName()+" "+c.getEmail()+" "+c.getAge());
			
		}
		
	}

}

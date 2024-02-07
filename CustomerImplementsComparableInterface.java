import java.util.*;
class myCustomer implements Comparable<myCustomer>
{
	private int id;
	private String name;
	private String email;
	private int age;
	
	public myCustomer(int id, String name, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
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
		return id +" "+name+" "+email+" "+age;
	}

	@Override
	public int compareTo(myCustomer c2) {
		myCustomer c1=this;
		if(c1.name.compareTo(c2.name) !=0)
		{
			return c1.name.compareTo(c2.name);
		}
		else if(c1.age-c2.age !=0)
		{
			return c1.age-c2.age;
		}
		else
		{
			return c1.email.compareTo(c2.email);
		}
	}
	
	
}
public class CustomerImplementsComparableInterface {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		TreeSet<myCustomer> list = new TreeSet<myCustomer>();
		for(int i=1;i<=n;i++)
		{
			String s = scan.next();
			String a[] =s.split(",");
			int id =1000+i;
			String name=a[0];
			String email=a[1];
			int age =Integer.parseInt(a[2]);
			myCustomer c = new myCustomer(id,name,email,age);
			list.add(c);
			
		}
		for(myCustomer c:list)
		{
			System.out.println(c);
		}

	}

}


//n=5
//input:
//alex,alex@gmail.com,23
//bob,bob@gmail.com,21
//charle,charle@gmail.com,34
//jack,jack@gmail.com,67
//jack,jack23@gamil.com,67
//output:
//1001 alex alex@gmail.com 23
//1002 bob bob@gmail.com 21
//1003 charle charle@gmail.com 34
//1005 jack jack23@gamil.com 67
//1004 jack jack@gmail.com 67


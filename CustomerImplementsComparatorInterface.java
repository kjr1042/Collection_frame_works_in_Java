import java.util.*;
class myCustomer1 
{
	private int id;
	private String name;
	private String email;
	private int age;
	
	public myCustomer1(int id, String name, String email, int age) {
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

}
class mycomparator implements Comparator<myCustomer1>
{

	@Override
	public int compare(myCustomer1 c1, myCustomer1 c2) {
		
		return c1.getId() -c2.getId();
	}
	
}
class mycomparator1 implements Comparator<myCustomer1>
{

	@Override
	public int compare(myCustomer1 c1, myCustomer1 c2) {
		
		return (c1.getId() -c2.getId())*-1;
	}
	
}
class mycomparator2 implements Comparator<myCustomer1>
{

	@Override
	public int compare(myCustomer1 c1, myCustomer1 c2) {
		String name1=c1.getName();
		String name2=c2.getName();
		return name1.compareTo(name2);
	}
	
}
class mycomparator3 implements Comparator<myCustomer1>
{

	@Override
	public int compare(myCustomer1 c1, myCustomer1 c2) {
		String email1=c1.getEmail();
		String email2=c2.getEmail();
		return (email1.compareTo(email2))*-1;
	}
	
}
class mycomparator4 implements Comparator<myCustomer1>
{

	@Override
	public int compare(myCustomer1 c1, myCustomer1 c2) {
		String email1=c1.getEmail();
		String email2=c2.getEmail();
		int l1=email1.length();
		int l2=email2.length();
		if(l1!=l2)
		{
			return l1-l2;
		}
		else
		{
			return c1.getId() -c2.getId();
		}
	}
	
}
public class CustomerImplementsComparatorInterface {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();
		mycomparator4 mc = new mycomparator4();
		TreeSet<myCustomer1> list = new TreeSet<myCustomer1>(mc);
		for(int i=1;i<=n;i++)
		{
			String s = scan.next();
			String a[] =s.split(",");
			int id =1000+i;
			String name=a[0];
			String email=a[1];
			int age =Integer.parseInt(a[2]);
			myCustomer1 c = new myCustomer1(id,name,email,age);
			list.add(c);
			
		}
		for(myCustomer1 c:list)
		{
			System.out.println(c);
		}
		

	}

}

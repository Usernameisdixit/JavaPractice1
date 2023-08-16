package Collection;

import java.util.Objects;

//internal working Hash set (equals method working)

public class Person
{
	private String name;
	private int age;
	
	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if(this==o)// comparing reference as person1(this) and person2(o) but person1 not equal to person2
			{
			return true;
			}
		if(!(o instanceof Person)) {
			return false;
		}
		
		Person person=(Person)o;
		return age==person.age && Objects.equals(name, person.name);
	}
		
		
//		@Override
//		public int hashCode()
//		{
//			return Objects.hash(name,age);
//		}
//		
//	






	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Person person1=new Person("Alice",30);
		Person person2=new Person("Alice",30);
		
		boolean isEqual=person1.equals(person2);
		System.out.println("are person1 and person2 are equal:"+ isEqual);
	}

}


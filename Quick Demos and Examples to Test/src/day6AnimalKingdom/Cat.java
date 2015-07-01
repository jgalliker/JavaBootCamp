package day6AnimalKingdom;
public class Cat extends Mammal
{
	@Override
	public void speak()
	{
		System.out.println(this.getName() +  " meow");
	}
}

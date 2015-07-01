package day6AnimalKingdom;
public class AnimalKingdom
{
	public static void main(String[] args)
	{
	
		Mammal mammal = new Mammal();
		mammal.setName("mammal");
		mammal.speak();

		
		
		Dog dog = new Dog();
		dog.setName("Rover");
		dog.speak();
		

		Cat cat = new Cat();
		cat.setName("kitty");
		cat.speak();

	}

}
//Animal dog = new Dog("doggy");
		//dog.speak();
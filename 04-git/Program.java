public class Dog
{
    // Instance Variables
    String name;
    String breed;
    int age;
    String color;
    String owner_name;
 
    // Constructor Declaration of Class
    public Dog(String name, String breed,
                   int age, String color, String owner_name)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
	this.owner_name = owner_name;
    }
 
    // method 1
    public String getName()
    {
        return name;
    }
 
    // method 2
    public String getBreed()
    {
        return breed;
    }
 
    // method 3
    public int getAge()
    {
        return age;
    }
 
    // method 4
    public String getColor()
    {
        return color;
    }
 
    // method 5
    public String getOwner_name()
    {
        return owner_name;
    }

    @Override
    public String toString()
    {
        return("Hi my name is "+ this.getName() +
               ".\nMy breed,age and color are " +
               this.getBreed()+"," + this.getAge() +
               ","+ this.getColor() + "I love my owner" + this.getOwner_name());
    }
 
    public static void main(String[] args)
    {
        Dog tuffy = new Dog("tuffy","papillon", 5, "white", "Harry");
        System.out.println(tuffy.toString());

	Dog coffee = new Dog("coffee","poodle", 2, "black", "Margaret");
        System.out.println(tuffy.toString());
    }
}

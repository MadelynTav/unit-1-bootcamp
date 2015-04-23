/**
 * Created by Madelyn Tavarez on 4/14/15.
 * 1. Cool cats

 Create 3 cats named Garfield, Pink Panther, and Catwoman.
 Assign each of them a favorite food (Garfield's favorite food should be Lasagna).
 Assign each of them an age.
 2. isOlder

 Write a method called isOlder that takes 2 Cats as parameters and returns whether or not the first Cat is older than the second.

 ex: // if Garfield is 9 years old and Catwoman is 10 years old
 isOlder(garfield, catwoman) returns false
 3. Best Friends

 Write a method called makeBestFriends that takes 2 Cats as parameters and sets both of their favorite foods to the same thing.

 Hint: this method does not return anything!

 4. Kitten

 Write a method called makeKitten that takes 2 Cats as parameters and returns a new Cat with a name that is the combination of the 2 parent Cats' names. The age of the new Cat should be 0.

 ex: makeKitten(garfield, catwoman) returns a Cat named "GarfieldCatwoman" with age 0
 5. Adoption

 Write a method called adoption that takes 1 Cat and 1 Person as a paramater and sets the Cat's owner to be the Person.

 ex: Person jon = Person('Jon');
 adoption(garfield, jon); // Jon is now Garfield's owner!
 Hint: this method does not return anything!

 Bonus Challenge

 If the Cat's name is Catwoman, don't set the owner, but instead print: "Catwoman will never be anyone's pet!"

 6. isFree

 Write a method called isFree that checks whether or not a Cat has an owner.

 ex: isFree(garfield) returns false
 7. isSibling

 Write a method called isSibling that checks whether or not 2 Cats have the same owner.
 *
 *
 *
 */
public class ClassesAndObjects {

    public static boolean isOlder(Cat first, Cat second){
        if(first.getAge()>second.getAge()){
            return true;
        }
        else
            return false;
    }
    public static void makeBestFriends (Cat first, Cat second){
        first.setFavoriteFood(second.getFavoriteFood());
        System.out.println(first.getFavoriteFood());
        System.out.println(second.getFavoriteFood());
    }
    public static void makeKitten(Cat first, Cat second){
        Cat kitten=new Cat();
        kitten.setAge(0);
        kitten.setName(first.getName() + second.getName());
        System.out.println(kitten.getName()+" is "+kitten.getAge()+" years old.");
    }

    public static void adoption(Person adopter, Cat adopted){
        System.out.println(adopter.getName()+" is now "+adopted.getName()+"'s owner!");

    }

  public static void main (String args[]) {
      Cat garfield=new Cat();
      Cat pinkPanther=new Cat();
      Cat catWoman= new Cat();
      Person madey=new Person();
      madey.setName("Madelyn");

      garfield.setName("Garfield");
      pinkPanther.setName("PinkPanther");
      catWoman.setName("CatWoman");

      garfield.setFavoriteFood("Lasagna");
      pinkPanther.setFavoriteFood("Pizza");
      catWoman.setFavoriteFood("Rice Pudding");

      garfield.setAge(45);
      pinkPanther.setAge(27);
      catWoman.setAge(32);

      System.out.println(isOlder(garfield,catWoman));
      makeBestFriends(garfield,pinkPanther);
      makeKitten(garfield,catWoman);
      adoption(madey,pinkPanther);

  }
}

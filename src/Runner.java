public class Runner {
    public static void main(String[] args){
        Animal animal1 = new Animal("Joe", 19, true);
        animal1.adopt();
        animal1.feed();
        System.out.println(animal1.getAge());
        System.out.println(animal1.getName());
        System.out.println(animal1.isVaccinated());

        Dog dog1 = new Dog("Boe", 2, false);
        dog1.adopt();
        dog1.feed();
        dog1.walk();
        dog1.hasWalkedWith();
        dog1.woof();
        System.out.println(dog1.getAge());
        System.out.println(dog1.getName());
        System.out.println(dog1.isVaccinated());

        Cat cat1 = new Cat("Toe", 6, true);
        cat1.adopt();
        cat1.feed();
        cat1.play();
        cat1.hasPlayedWith();
        cat1.scratch();
        System.out.println(cat1.getAge());
        System.out.println(cat1.getName());
        System.out.println(cat1.isVaccinated());
    }
}

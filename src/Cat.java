public class Cat extends Animal{
    private boolean played;

    public Cat(String name, int age, boolean vaccinated){
        super(name, age, vaccinated);

    }
    public void play(){
        played = true;
        System.out.println("I love playing!");
    }
    public boolean hasPlayedWith(){
        return played;
    }

    public void scratch(){
        System.out.println("Scratch!");
    }
}

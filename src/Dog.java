public class Dog extends Animal{
    private boolean walked;

    public Dog(String name, int age, boolean vaccinated){
        super(name, age, vaccinated);
    }

    public void walk(){
        walked = true;
        System.out.println("Time for a walk outside");
    }

    public boolean hasWalkedWith(){
        return walked;
    }

    public void woof(){
        System.out.println("Woof!");
    }

}

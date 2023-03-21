public class Chair extends Furniture{
    private String name;
    public Chair(String name, int legs, String material){
        super(legs, material);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void sitIn(){
        System.out.println("This chair is very comfortable");
    }
}

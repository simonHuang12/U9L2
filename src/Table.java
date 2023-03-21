public class Table extends Furniture{
    private String name;
    public Table(String name, int legs, String material){
        super(legs, material);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void putItemsOn(){
        System.out.println("I got some things on me now");
    }
}

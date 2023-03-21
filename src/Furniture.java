public class Furniture {
    private int legs;
    private String material;

    public Furniture(int legs, String material){
        this.legs = legs;
        this.material = material;
    }

    public int getLegs() {
        return legs;
    }

    public String getMaterial() {
        return material;
    }

    public void breakFurniture(){
        System.out.println("The furniture has been broken");
    }
}
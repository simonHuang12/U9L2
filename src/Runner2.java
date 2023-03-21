public class Runner2 {
    public static void main(String[] args){
        Furniture f1 = new Furniture(1, "Wood");
        System.out.println(f1.getLegs());
        System.out.println(f1.getMaterial());
        f1.breakFurniture();

        Chair c1 = new Chair("Stool", 4, "Plastic");
        System.out.println(c1.getName());
        System.out.println(c1.getMaterial());
        System.out.println(c1.getLegs());
        c1.sitIn();

        Table t1 = new Table("Dining Table", 4, "Wood");
        System.out.println(t1.getName());
        System.out.println(t1.getMaterial());
        System.out.println(t1.getLegs());
        t1.putItemsOn();

    }
}

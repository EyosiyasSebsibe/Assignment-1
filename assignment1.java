/*This mini project shows OOP by creating a Animals class and 
extending it into birds using inheritance. Encapuslation is used
with private variables, and polymmorphism is shown by overriding the dispaly
method*/



class Animals {
    private String name;
    private int features;

    public Animals(String name, int features) {
        this.name = name;
        this.features = features;
    }
    public void display() {
    System.out.println("Name: " + name);
    System.out.println("Features: " + features);
    }
}
class birds extends Animals {
    private String featherColor;

    public birds(String name, int features, String featherColor) {
        super(name, features);
        this.featherColor = featherColor;
    }

@Override
    public void display() {
        super.display();
        System.out.println("Feather Color: " + featherColor);
    }

}

public class Assignment1 {
    public static void main(String[] args) {
        birds bird1 = new birds("Parrot", 2, "Green");
        bird1.display();
    }
}
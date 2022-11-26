public class Item {
    private String name;
    private double price;
    private int quantity;

    //constructor
    public Item(String name, double price, int quantity){
            this.name = name;
            this.price = price;
            this.quantity = quantity;
    }

    //copy constructor
    public Item(Item source){
        this.name = source.name;
        this.price = source.price;
        this.quantity = source.quantity;
    }



    //getters
    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    //setters
    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    //toString
    public String toString(){
        return
        "Item: " + this.name + "\n" + "Price: " +  this.price + "\n" + "Quantity: " + this.quantity + "\n";
    }

}


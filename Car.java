public class Car {
    private String make;
    private String model;
    private double price;
    public Car(String make,String model,double price){
        this.make=make;
        this.model=model;
        this.price=price;
    }
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make=make;
    }
    public String getmodel(){
        return model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void ApplyDiscount(double discount){
        if(discount>0&&discount<1){
            price*=1-discount;
        }
    }
    public void printDetails(){
        System.out.println("make"+make);
        System.out.println("model"+model);
        System.out.println("price"+price);

    }
    public static void main(String[] args) {
        Car car=new Car("Ferrari","123", 244620)
    ;
    System.out.println("original price");
    car.printDetails();
    car.ApplyDiscount(0.5);
    System.out.println("after discount");
    car.printDetails();
        
    }

}

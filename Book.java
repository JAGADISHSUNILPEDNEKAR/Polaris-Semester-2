public class Book {
    private String title;
    private String author;
    private double price;
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
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
        System.out.println("title"+title);
        System.out.println("author"+author);
        System.out.println("price"+price);

    }
    public static void main(String[] args) {
        Book book=new Book("Green","witch",2993);
        System.out.println("Original price");
        book.printDetails();
        book.ApplyDiscount(0.3);
        System.out.println("after discount");
        book.printDetails();
    }

}


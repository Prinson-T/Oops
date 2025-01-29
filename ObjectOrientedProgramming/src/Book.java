public class Book {
    String title;
    String author;
    double price;
    public Book(){
        this.title ="Naalukettu";
        this.author = "M T Vasudevan Nair ";
        this.price = 200.50;
    }
    public Book( String Title,String Author,double Price){
        this.title=Title;
        this.author=Author;
        this.price=Price;
    }
    public void displayDetails(){
        System.out.println(" Title: "+title);
        System.out.println("Author: "+author);
        System.out.println(" Price: "+price);
    }

    public static void main(String[] args) {
        Book b=new Book();
        b.displayDetails();
    }
}
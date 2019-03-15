public class Book {
    private static int id = 0;
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublication;
    private int numberOfPages;
    private double price;

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public double getPrice() {
        return price;
    }

//    public void setId(int id) {
//        this.id = id;
//    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public Book() {
    }

    public Book(int id, String title, String author, String publisher, int yearOfPublication, int numberOfPages, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public static void view(Book b){
        System.out.println();
        System.out.print(b.id + "\t");
        System.out.print(b.title + "\t");
        System.out.print(b.author + "\t");
        System.out.print(b.publisher + "\t");
        System.out.print(b.yearOfPublication + "\t");
        System.out.print(b.numberOfPages + "\t");
        System.out.println(b.price + "\t");
    }
}
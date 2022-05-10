public class Week8BookCons {
    private String title;
    private Author author;
    private double price;
    private int qty;

    public Week8BookCons(String title, Author author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Week8BookCons(String title, Author author, double price, int qty) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book[title = " + title + Week8AuthorCons.toString() + ", price = " + price + ", qty = " + qty;
    }
}
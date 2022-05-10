public class Week8BookWorm {
    public static void main(String[] args) {
        // Week8AuthorCons a1 = new Week8BookWormAuthorCons();

        Week8AuthorCons a1 = new Week8AuthorCons("RR Martin", "rr@rr.com", "W");
        Week8BookCons b1 = new Week8BookCons("Elden Ring", new Author("RR Martin", "rr@rr.com", "W"), 1500, 10);
        Week8BookCons b2 = new Week8BookCons("Elden Ring", a1, 1500, 10);

        System.out.println(b1.toString());
        System.out.println(b2.toString());

        // update the name of the author from b1
        // change it to George R.R. Martin

        // b1.getAuthor()
    }
}

public class magazine extends book implements bookOperations {
    private String category;

    public magazine(String title, String author, int year, String category) {
        super(title, author, year);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public void borrowBook() {
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("Magazine : " + getTitle() + " borrowed successfully");
        } else {
            System.out.println("Magazine : " + getTitle() + " is already borrowed");
        }
    }

    @Override
    public void returnBook() {
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Magazine : " + getTitle() + " returned successfully");
        } else {
            System.out.println("Magazine : " + getTitle() + " is not borrowed");
        }
    }
}

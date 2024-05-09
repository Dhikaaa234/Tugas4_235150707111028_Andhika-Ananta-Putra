public class Main {
    public static void main(String[] args) {
      
        textBook Textbook = new textBook("Java Programming", "John Smith", 2020, "Programming");

        novel Novel = new novel("To Kill a Mockingbird", "Harper Lee", 1960, "Fiction");

        magazine Magazine = new magazine("National Geographic", "Various", 2021, "Science");

        //informasi buku
        System.out.println("-----------Book Information------------");
        System.out.println("Title\t\t: " + Textbook.getTitle());
        System.out.println("Author\t\t: " + Textbook.getAuthor());
        System.out.println("Year\t\t: " + Textbook.getYear());
        System.out.println("Borrowed \t: " + Textbook.isBorrowed());
        System.out.println();
        
        System.out.println("Title \t\t: " + Novel.getTitle());
        System.out.println("Author \t\t: " + Novel.getAuthor());
        System.out.println("Year \t\t: " + Novel.getYear());
        System.out.println("Borrowed \t: " + Novel.isBorrowed());
        System.out.println();
        
        System.out.println("Title \t\t: " + Magazine.getTitle());
        System.out.println("Author \t\t: " + Magazine.getAuthor());
        System.out.println("Year \t\t: " + Magazine.getYear());
        System.out.println("Borrowed \t: " + Magazine.isBorrowed());
        System.out.println();

        //Meminjam dan mengembalikan buku
        System.out.println("------ Borrowing and Returning Books ------");
        Textbook.borrowBook();
        Magazine.borrowBook();
        Textbook.returnBook();
        Novel.returnBook();
    }
}

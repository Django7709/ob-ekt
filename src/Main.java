class Author {
    private String name;
    private String lastName;

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public String getName() {
        return this.name;
    }
    public String getLastName() {
        return this.lastName;
    }
}
    class Book {
    private String nameBooks;
    private int agePublication;
    private String Author;

    public Book(String nameBooks, String author, int agePublication) {

        this.nameBooks = nameBooks;
        this.agePublication = agePublication;
        this.Author = Author;
    }
    public int getAgePublication() {
        return this.agePublication;
    }
    public String getNameBook() {
        return this.nameBooks;
    }
    public String getAuthor() {
        return this.Author;
    }
    public void setAgePublication(int agePublication) {
        this.agePublication = agePublication;
    }
}
public class Main {
    public static void main(String[] args) {
        printSeparator();

        Author harperLi = new Author("Harper", "Li");
        Book killAMockingbird = new Book("Kill a mockingbird", "Harper Li", 1961);

        System.out.println("Название книги - " + killAMockingbird.getNameBook());
        System.out.println("Автор - " + harperLi.getName() + " " + harperLi.getLastName());

        killAMockingbird.setAgePublication(1960);
        System.out.println("Год публикации книги - " + killAMockingbird.getAgePublication());

        printSeparator();

        Author lewisCarrol = new Author("Lewis", "Carrol");
        Book aliceIsAdventuresInWonderland = new Book("Alice in Wonderland", "Lewis Carrol", 1865);

        System.out.println("Название книги - " + aliceIsAdventuresInWonderland.getNameBook());
        System.out.println("Автор - " + lewisCarrol.getName() + " " + lewisCarrol.getLastName());

        aliceIsAdventuresInWonderland.setAgePublication(1864);
        System.out.println("Год публикации книги - " + aliceIsAdventuresInWonderland.getAgePublication());

        printSeparator();
    }

    public static void printSeparator() {
        System.out.println("************************************");
    }
}
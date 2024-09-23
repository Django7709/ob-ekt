public class Author {
    private String name;
    private String lastName;
    private Author author;

    public Author(String name, String lastName, Author author) {
        this.name = name;
        this.lastName = lastName;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
        public Author getAuthor () {
            return this.author;
        }
    }
}

public class Book {
    private String nameBooks;
    private int agePublication;

        public Book(String nameBooks, int agePublication) {

            this.nameBooks = nameBooks;
            this.agePublication = agePublication;

        }
        public int getAgePublication() {
            return this.agePublication;
        }
        public String getNameBook() {
            return this.nameBooks;
        }
        }

public class Main {
    public static void main(String[] args) {
        printSeparator();

        Author harperLi = new Author("Harper", "Li");
        Book killAMockingbird = new Book("Kill a mockingbird", harperLi, 1961);

        System.out.println("Название книги - " + killAMockingbird.getNameBook());
        System.out.println("Автор - " + harperLi.getName() + " " + harperLi.getLastName());
        killAMockingbird.setAgePublication(1960);
        System.out.println("Год публикации книги - " + killAMockingbird.getAgePublication());
        printSeparator();


        Author lewisCarrol = new Author("Lewis", "Carrol");
        Book aliceIsAdventuresInWonderland = new Book("Alice in Wonderland", lewisCarrol, 1865);

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
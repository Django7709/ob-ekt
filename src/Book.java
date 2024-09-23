public class Book {
    private String nameBooks;
    private int agePublication;
    private Author author;

    public Book(String nameBooks, Author author, int agePublication) {

            this.nameBooks = nameBooks;
            this.agePublication = agePublication;
            this.author = author;
        }
        public int getAgePublication() {
            return this.agePublication;
        }
        public String getNameBook() {
            return this.nameBooks;
        }

            public Author getAuthor() {
                return this.author;
            }

            public void setAgePublication(int agePublication) {
                this.agePublication = agePublication;
            }
        }
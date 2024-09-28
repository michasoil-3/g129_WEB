package second_module.exceptions;

class Book {
    private int id;
    private String name;
    private String author;

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getData() {
        return "ID: " + id + ". NAME: " + name + ". AUTHOR: " + author + ".";
    }
}

class Library {
    private String name;
    private String city;
    private Book books[] = new Book[5];
    private int index = 0;

    public Library() {
    }

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addBook(Book book) {
        try {
            this.books[this.index] = book;
            this.index++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The library is full");
        }
    }


    public void printBooks() {
        for (int i = 0; i < this.index; i++) {
            if (this.books[i] == null) {
                System.out.println("The book is empty");
            } else {
                System.out.println(this.books[i].getData());
            }
        }
    }
}

public class Book {
    String name;
    int year;
    String author;
    Book(String name, int year, String author){
        this.name=name;
        this.year=year;
        this.author=author;
    }
    public String toString(){
        return name+" "+year+" "+author;
    }
}

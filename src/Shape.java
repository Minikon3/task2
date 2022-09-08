public class Shape{
    int square, perimeter;
    String name;
    Shape(String name, int square, int perimeter){
        this.name=name;
        this.square=square;
        this.perimeter=perimeter;
    }
    public String toString(){
        return name+" "+square+" "+perimeter;
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выбор класса 1 (Shape), 2 (Ball), 3 (Book), 4 (Dog)");
        int choose = sc.nextInt();
        switch(choose){
            case 1:
                System.out.println("Ввод названия объекта");
                String name1=sc.next();
                System.out.println("Ввод площади");
                int square2=sc.nextInt();
                System.out.println("Ввод периметра");
                int perimeter3= sc.nextInt();
                Shape figure1= new Shape(name1,square2,perimeter3);
                System.out.println("Характеристики объекта: " + figure1.toString());
                break;
            case 2:
                System.out.println("Ввод цвета мяча");
                String color=sc.next();
                System.out.println("Ввод размера");
                int size=sc.nextInt();
                Ball ball1= new Ball(color,size);
                System.out.println("Характеристики мяча: " + ball1.toString());
                break;
            case 3:
                System.out.println("Ввод имени книги");
                String name3=sc.next();
                System.out.println("Ввод года выпуска");
                int age3=sc.nextInt();
                System.out.println("Ввод автора");
                String author= sc.next();
                Book book1= new Book(name3,age3,author);
                System.out.println("Описание книги: " + book1.toString());
                break;
            case 4:
                Dog[] Питомниксобак = new Dog[10];
                int w=0;
                for (int g=0;g<10;g++){
                System.out.println("Хотите добавить собаку? 0-нет, 1-да");
                int choose2=sc.nextInt();
                if (choose2==0){ break;}
                    System.out.println("Добавьте собаку в питомник (до 10 собак)");
                    System.out.println("Введите имя: ");
                    String name4=sc.next();
                    System.out.println("Введите возраст собаки: ");
                    int age4=sc.nextInt();
                    Dog dog1=new Dog(name4,age4);
                    Питомниксобак[w]=dog1;
                    w++;
                    if (g==9) { System.out.println("Место закончилось"); }
                }
                int counter=0;
                System.out.println("Собаки добавленные в питомник:");
                for (int g=0;g< Питомниксобак.length;g++){
                    if (Питомниксобак[g]==null){ counter++; continue; }
                    System.out.println(Питомниксобак[g]);
                }
                System.out.println("Осталось мест: "+counter);
                break;
        }
    }
}
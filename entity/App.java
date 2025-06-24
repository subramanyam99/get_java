package entity;

public class App{
    public static void main(String[] args) {
        System.out.println("Hello");
        greeting("Hey Good Morning!");
    }

    public static void greeting(String s){
        System.out.println(s.toUpperCase());
    }
}
package entity;

public class App{
    public static void main(String[] args) {
        System.out.println("Modified Hello");
        greeting("Modified Hey Good Evening!");
    }

    public static void greeting(String s){
        System.out.println(s.toUpperCase());
    }
}
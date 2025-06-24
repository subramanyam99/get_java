package entity;

public class App{
    public static void main(String[] args) {
        System.out.println("Hello");
        greeting("Hey Good Morning!");
        fun("sai");
    }

    public static void greeting(String s){
        System.out.println(s.toUpperCase());
    }

    public static void fun(String a){
        System.out.println(a.repeat(2));
    }
}
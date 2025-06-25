package entity;

public class App{
    public static void main(String[] args) {


        

        System.out.println("Modified vanakkam");
        greeting("Modified Hey Good Evening!");
fun("sai");
    }

    public static void greeting(String s){
        System.out.println(s.toUpperCase());
    }

    public static void fun(String a){
        System.out.println(a.repeat(2));
    }
}
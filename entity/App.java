package entity;

public class App{
    public static void main(String[] args) {


        

        System.out.println("Modified vanakkam");
        greeting("Modified Hey Good Evening!");
fun("sai");
test("tested");

    }

    public static void greeting(String s){
        System.out.println(s.toLowerCase());
    }

    public static void fun(String a){
        System.out.println(a.repeat(2));
    }

     public static void test(String a){
        System.out.println(a);
    }
}
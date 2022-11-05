package week4writinghhw;

//25. Example of Constructor Overloading
//Java program to overload constructors

public class Programme_25_ConstructorOverloadingExample {

    int id;
    String name;
    int age;

    Programme_25_ConstructorOverloadingExample(int i, String n) {   //creating two arg constructor
        id = i;
        name = n;
    }

    Programme_25_ConstructorOverloadingExample(int i, String n, int a) {  //creating three arg constructor
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]) {
        Programme_25_ConstructorOverloadingExample s1 = new Programme_25_ConstructorOverloadingExample(111, "Karan");
        Programme_25_ConstructorOverloadingExample s2 = new Programme_25_ConstructorOverloadingExample(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}
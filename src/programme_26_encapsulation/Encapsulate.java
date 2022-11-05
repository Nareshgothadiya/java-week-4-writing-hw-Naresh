package programme_26_encapsulation;

public class Encapsulate {

    // private variables declared these can only be accessed by public methods of class
    private String name;
    private int rollNo;
    private int age;

    public void setName(String name) {  //set method for name to access private variable name
        this.name = name;
    }

    public String getName() {  // get method for Name to access private variable age
        return name;
    }

    public int getRollNo() {  // get method for roll to access private variable rollNo
        return rollNo;
    }

    public void setRollNo(int rollNo) {  // set method for roll to access private variable rollNo
        this.rollNo = rollNo;
    }

    public int getAge() {   // get method for age to access private variable age
        return age;
    }

    public void setAge(int age) {  // set method for age to access private variable age
        this.age = age;
    }
}

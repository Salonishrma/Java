public class Hello {
    // private attributes
    private String name;
    private int age;

    // constructor
    public Hello(String name, int age) {
        this.name = name;
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }

    // getter method for name attribute
    public String getName() {
        return name;
    }

    // setter method for name attribute
    public void setName(String name) {
        this.name = name;
    }

    // getter method for age attribute
    public int getAge() {
        return age;
    }

    // setter method for age attribute
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Hello obj = new Hello("John Doe", 20);
        obj.displayInfo();
        obj.setName("MAry Ahuja");
        obj.setAge(10);
        obj.displayInfo();
    }
}

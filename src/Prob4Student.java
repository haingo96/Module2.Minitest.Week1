import java.util.Scanner;

public class Prob4Student {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Prob4Student student1 = new Prob4Student();

        System.out.println("Input student's name:");
        student1.setName(scn.next());
        System.out.println("Input student's age:");
        student1.setAge(scn.nextInt());
        System.out.println("Input student's class:");
        student1.setCls(scn.next());

        System.out.println(student1.toString());
    }
    private String name, cls;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("name: %s, age: %s, class: %s", name, age, cls);
    }
}

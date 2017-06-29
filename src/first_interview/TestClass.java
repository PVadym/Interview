package first_interview;

public class TestClass {
    public static void main(String[] args) {
 int a = 7;
 String s = "asd";
 Person p = new Person("bb1", 6);
 method1(a);
 method2(s);
 method3(p);
 System.out.println(a); //  7
 System.out.println(s); // asd
 System.out.println(p); //
}

public static void method1(int a) {
 ++a;
a++;
}

public static void method2(String s) {
s = "bfr";
}

public static void method3(Person p) {
    p.setName("qwerty");
}
}

class Person {


private String name;
private int age;

public Person(String name, int age) {
this.name = name;
this.age = age;
}

@Override
public String toString() {
return name + " " + age;
}

public void setName(String name) {
this.name = name;
}

}

public class Person{
    String name;
    int age;
    public static void main (String[] args){
        Person std1=new Person();
        Person std2=new Person();
        std1.name="MSN";
        std1.age=21;
        std2.name="WIN";
        std2.age=22;
        System.out.println("Student 1 info"+std1.name+std1.age);
        System.out.println("Student 2 info"+std2.name+std2.age);
    }
}
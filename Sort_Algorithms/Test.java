import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Student[] sArr = new Student[3];
        sArr[0] = new Student(15, 170, "lv");
        sArr[1] = new Student(10, 180, "chen");
        sArr[2] = new Student(10, 190, "hui");
        System.out.println(Arrays.toString(sArr));
        Arrays.sort(sArr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(Arrays.toString(sArr));
    }
}

class Student{
    private int age;
    private int height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    Student(int age, int height, String name){
        this.age = age;
        this.height = height;
        this.name = name;
    }


    public String toString(){
        return super.toString()+"[age: "+this.age+", height"+this.height+", name:"+this.name+"]";
    }
}
package gau;

public class TestStudent {
    String name;
    public String lastName;
    private int age;
    protected int course;

    public void printData(){
        System.out.println(name+" "+lastName);

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}

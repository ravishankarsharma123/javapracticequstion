public class student {
    int id;
    String name;
    student(int i,String n){
        id=i;
        name=n;
    }
    student(student s){
        id=s.id;
        name=s.name;
    }
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        student s1=new student(123,"ravi");
        student s2=new student(s1);
        s1.display();
        s2.display();
    }
}

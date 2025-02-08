public class Student {
    private int StudentId;
    private String name;
    private int marks;
    public Student(int StudentId,String name,int marks){
        this.StudentId=StudentId;
        this.name=name;
        this.marks=marks;
    }
    public void calculateGrade(){
        if(marks>90){
            System.out.println("A");;
        }
        else if(marks>75&&marks<90){
            System.out.println("B");;
        }
        else{
            System.out.println("C");
        }
    }
    public static void main(String[] args) {
        Student student=new Student(123,"Jagadish", 100);
        student.calculateGrade();
        
    }
}

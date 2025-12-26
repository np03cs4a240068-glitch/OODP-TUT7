import java.util.ArrayList;

public class StudentAndExamineList {
    public static void main(String[] args) {
        
        ArrayList<String> StudentList = new ArrayList<>();

        StudentList.add("Bellingham");
        StudentList.add("Mbappe");
        StudentList.add("Vinicus");
        StudentList.add("Rodrygo");

        System.out.println(StudentList);
        
        StudentList.remove("Mbappe");
        System.out.println("StudentList after removing Mbappe:" +StudentList);
        
        StudentList.remove(0);
        System.out.println("StudentList after removing the first Student:" +StudentList);
        
        System.out.println("Updated List of Student:" +StudentList);
        
        ArrayList<String> ExamineList = new ArrayList<>();
        
        ExamineList.add("Zidane");
        ExamineList.add("Carlo");
        ExamineList.add("Xabi");
        ExamineList.add("Kross");
        
        System.out.println(ExamineList);
        
        ExamineList.remove("Carlo");
        System.out.println("ExamineList after removing Carlo:" +ExamineList);
        
       ExamineList.remove(2);
       System.out.println("ExamineList after removing the third Examine:" +ExamineList);
       
       System.out.println("Updated List of Examine:" +ExamineList);
    }
}

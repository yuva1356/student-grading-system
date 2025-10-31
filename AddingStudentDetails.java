import java.util.*;

public class AddingStudentDetails {

    static TotalMarksList totalMarksList=new TotalMarksList();

    static StudentMarks studentMarks=new StudentMarks();

    public LinkedList<StudentDetails> addingDetails(){

        LinkedList<Subjects> marksList=new LinkedList<>();
        marksList=studentMarks.addMarks();

        LinkedList<Integer> calculatedMarksList=new LinkedList<>();

        calculatedMarksList=totalMarksList.totalMarks(marksList);

        LinkedList<StudentDetails> studentList=new LinkedList<>();
        studentList.add(new StudentDetails("fk1","Heamanth","Male",calculatedMarksList.get(0)));
        studentList.add(new StudentDetails("fk2","Rakesh","Male",calculatedMarksList.get(1)));

        return studentList;
    }
}

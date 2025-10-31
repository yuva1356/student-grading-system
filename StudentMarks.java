import java.util.LinkedList;

public class StudentMarks {
    static Subjects subjects=new Subjects();
    public LinkedList<Subjects> addMarks(){
        LinkedList<Subjects> marksList=new LinkedList<>();

        marksList.add(new Subjects(3,2,8,0,6,4,7,2));
        marksList.add(new Subjects(3,0,7,3,0,0,0,0));

        return marksList;
    }
}

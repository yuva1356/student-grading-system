import java.util.LinkedList;
import java.util.ListIterator;

public class PrintingStudentDetails {

    public void displayDetails(LinkedList<StudentDetails> studentList, String name) throws Exception {


        ListIterator<StudentDetails> it = studentList.listIterator();

        while ( it.hasNext() ) {
            StudentDetails s = (StudentDetails) it.next();

            if ( s.getName().equals(name) ) {
                System.out.print(s.getId() + " ");
                System.out.print(s.getName() + " ");
                System.out.print(s.getGender() + " ");
                System.out.println(s.getTotalMarks() + "\n");
            }
        }
    }
}

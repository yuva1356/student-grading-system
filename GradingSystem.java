import java.util.*;

public class GradingSystem {
    public void grades(LinkedList<StudentDetails> studentList) throws Exception {

        ListIterator<StudentDetails> it1 = studentList.listIterator();

        PrintingStudentDetails printingStudentDetails=new PrintingStudentDetails();
        while ( it1.hasNext() ) {
            StudentDetails s = (StudentDetails) it1.next();

            float percentage=s.getTotalMarks()/800*100;

            if(percentage>90 && percentage<=100){
                System.out.println("Top Graders");
                printingStudentDetails.displayDetails(studentList,s.getName());
            }
        }

        ListIterator<StudentDetails> it2 = studentList.listIterator();
        while ( it2.hasNext() ) {
            StudentDetails s = (StudentDetails) it2.next();

            float percentage=s.getTotalMarks()/800*100;

            if (percentage>80 && percentage<=90) {
                System.out.println("Good Graders");
                printingStudentDetails.displayDetails(studentList,s.getName());
            }
        }

        ListIterator<StudentDetails> it3 = studentList.listIterator();
        while ( it3.hasNext() ) {
            StudentDetails s = (StudentDetails) it3.next();

            float percentage=s.getTotalMarks()/800*100;

            if (percentage>70 && percentage<=80) {
                System.out.println("Average Performers");
                printingStudentDetails.displayDetails(studentList,s.getName());
            }
        }

        ListIterator<StudentDetails> it4 = studentList.listIterator();
        while ( it4.hasNext() ) {
            StudentDetails s = (StudentDetails) it4.next();

            float percentage=s.getTotalMarks()/800*100;

            if(percentage<35){
                System.out.println("Failures");
                printingStudentDetails.displayDetails(studentList,s.getName());
            }
        }
    }
}



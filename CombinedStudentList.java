import java.util.LinkedList;

public class CombinedStudentList {
    static AddingStudentDetails addingStudentDetails=new AddingStudentDetails();
    static TakingInput takingInput=new TakingInput();

    public void combinedList() throws Exception {

        LinkedList<StudentDetails> studentList = new LinkedList<>();

        studentList = addingStudentDetails.addingDetails();

        LinkedList<StudentDetails> studentDetailsFromUser = new LinkedList<>();
        
        studentDetailsFromUser = takingInput.userInput();

        studentList.addAll(studentDetailsFromUser);

        GradingSystem gradingSystem = new GradingSystem();
        gradingSystem.grades(studentList);
    }
}

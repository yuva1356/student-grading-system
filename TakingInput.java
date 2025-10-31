import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class TakingInput {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static StudentDetails studentDetails=new StudentDetails();
    static Subjects subjects=new Subjects();
    static TotalMarksList totalMarksList=new TotalMarksList();

    public LinkedList<StudentDetails> userInput() throws Exception {

        LinkedList<StudentDetails> userStudentList=new LinkedList<>();

        LinkedList<Subjects> userMarksList=new LinkedList<>();

        LinkedList<Integer> calculatedMarksList=new LinkedList<>();
        int index=0;

        while (true){

            System.out.println("no :- to stop Adding details");
            System.out.println("yes :- to Add details");
            String choice = br.readLine();
            if ( choice.equalsIgnoreCase("no")) {
                break;
            }

            System.out.println("enter Id of Student");
            String id=br.readLine();

            System.out.println("Enter Name of the Student");
            String name=br.readLine();

            System.out.println("Emter Gender");
            String gender=br.readLine();

            System.out.println("Enter English Marks");
            int englishMarks=Integer.parseInt(br.readLine());

            System.out.println("Enter Telugu Marks");
            int teluguMarks=Integer.parseInt(br.readLine());

            System.out.println("Enter Hindi Marks");
            int hindiMarks=Integer.parseInt(br.readLine());

            System.out.println("Enter Maths Marks");
            int mathsMarks=Integer.parseInt(br.readLine());

            System.out.println("Enter Science Marks");
            int scienceMarks=Integer.parseInt(br.readLine());

            System.out.println("Enter Social Marks");
            int socialMarks=Integer.parseInt(br.readLine());

            System.out.println("Enter General knowledge Marks");
            int generalKnowledgeMarks=Integer.parseInt(br.readLine());

            System.out.println("Enter physicalEducation Marks");
            int physicalEducationMarks=Integer.parseInt(br.readLine());



            userMarksList.add(new Subjects(englishMarks,teluguMarks,hindiMarks,mathsMarks,scienceMarks,socialMarks,generalKnowledgeMarks,physicalEducationMarks));

            calculatedMarksList=totalMarksList.totalMarks(userMarksList);

            userStudentList.add(new StudentDetails(id,name,gender,calculatedMarksList.get(index)));
            index++;


        }
        return userStudentList;
    }
}

import java.util.LinkedList;
import java.util.ListIterator;

public class TotalMarksList {
    static Subjects subjects=new Subjects();
    static StudentMarks studentMarks=new StudentMarks();

    public LinkedList<Integer> totalMarks(LinkedList<Subjects> marksList){

        LinkedList<Integer> calculatedMarksList=new LinkedList<>();
        int totalMarks=0;

        ListIterator<Subjects> itr=marksList.listIterator();
        while (itr.hasNext()){
            Subjects s=(Subjects) itr.next();
            totalMarks += s.getEnglishMarks()+ s.getTeluguMarks()+s.getHindiMarks()+s.getMathMarks()+s.getScienceMarks()+s.getSocialMarks()+s.getGeneralKnowledgeMarks()+s.getPhisicalEducationMarks();

            calculatedMarksList.add(totalMarks);
            totalMarks = 0;
        }
        return calculatedMarksList;
    }
}

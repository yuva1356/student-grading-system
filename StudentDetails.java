public class StudentDetails {
    String id;
    String name;
    String gender;

    float totalMarks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(float totalMarks) {
        this.totalMarks = totalMarks;
    }

    StudentDetails(String id, String name, String gender, float totalMarks){
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.totalMarks = totalMarks;
    }
    StudentDetails(){}
}

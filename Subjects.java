public class Subjects {
    int englishMarks;
    int teluguMarks;
    int hindiMarks;
    int mathMarks;
    int scienceMarks;
    int socialMarks;
    int generalKnowledgeMarks;
    int phisicalEducationMarks;

    public int getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    public int getTeluguMarks() {
        return teluguMarks;
    }

    public void setTeluguMarks(int teluguMarks) {
        this.teluguMarks = teluguMarks;
    }

    public int getHindiMarks() {
        return hindiMarks;
    }

    public void setHindiMarks(int hindiMarks) {
        this.hindiMarks = hindiMarks;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public int getSocialMarks() {
        return socialMarks;
    }

    public void setSocialMarks(int socialMarks) {
        this.socialMarks = socialMarks;
    }

    public int getGeneralKnowledgeMarks() {
        return generalKnowledgeMarks;
    }

    public void setGeneralKnowledgeMarks(int generalKnowledgeMarks) {
        this.generalKnowledgeMarks = generalKnowledgeMarks;
    }

    public int getPhisicalEducationMarks() {
        return phisicalEducationMarks;
    }

    public void setPhisicalEducationMarks(int phisicalEducationMarks) {
        this.phisicalEducationMarks = phisicalEducationMarks;
    }

    Subjects(int englishMarks, int teluguMarks, int hindiMarks, int mathMarks, int scienceMarks, int socialMarks, int generalKnowledgeMarks, int phisicalEducationMarks){
        this.englishMarks=englishMarks;
        this.teluguMarks=teluguMarks;
        this.hindiMarks=hindiMarks;
        this.mathMarks=mathMarks;
        this.scienceMarks=scienceMarks;
        this.socialMarks=socialMarks;
        this.generalKnowledgeMarks=generalKnowledgeMarks;
        this.phisicalEducationMarks=phisicalEducationMarks;
    }
    Subjects(){}

}

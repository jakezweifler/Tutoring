public class Student {

    private final String name;
    private final int grade;
    private Subject[] classes;
    private boolean[][] freeTimes;
    private boolean needsHelp;


    public Student(String name, int grade, Subject[] classes, boolean[][] freeTimes, boolean needsHelp){
        this.name = name;
        this.grade = grade;
        this.classes = classes;
        this.freeTimes = freeTimes;
        this.needsHelp = needsHelp;
    }


    public void setClasses(Subject[] classes) {
        this.classes = classes;
    }

    public void setFreeTimes(boolean[][] freeTimes) {
        this.freeTimes = freeTimes;
    }

    public void setNeedsHelp(boolean needsHelp) {
        this.needsHelp = needsHelp;
    }


    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public Subject[] getClasses() {
        return classes;
    }

    public boolean[][] getFreeTimes() {
        return freeTimes;
    }

    public boolean isNeedsHelp() {
        return needsHelp;
    }
}

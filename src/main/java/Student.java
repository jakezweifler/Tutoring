import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String name;
    private final int grade;
    private ArrayList<Subject> classes;
    private boolean[][] freeTimes;
    private boolean needsHelp;


    public Student(String name, int grade, ArrayList<Subject> classes, boolean needsHelp){
        this.name = name;
        this.grade = grade;
        this.classes = classes;
        this.needsHelp = needsHelp;

        freeTimes = new boolean[7][];

        for(int x = 0; x < 5; x++) {
            freeTimes[x] = new boolean[10];
        }
        for(int x = 5; x < 7; x++) {
            freeTimes[x] = new boolean[3];
        }
    }


    public void addClass(Subject s) {
        classes.add(s);
    }

    public void setClasses(ArrayList<Subject> classes) {
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

    public ArrayList<Subject> getClasses() {
        return classes;
    }

    public boolean[][] getFreeTimes() {
        return freeTimes;
    }

    public boolean isNeedsHelp() {
        return needsHelp;
    }
}

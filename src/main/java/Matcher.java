import java.util.HashMap;

public class Matcher {


    private static HashMap<String, Integer> pairedStudents = new HashMap<>();


    public static Subject classMatches(Student tutor, Student student) {
        Subject[] tutorClasses = tutor.getClasses();
        Subject[] studentClasses = student.getClasses();

        for(Subject a : tutorClasses) {
            for(Subject b : studentClasses) {
                if(a == b && a.getLevel() == b.getLevel()) {
                    return a;
                }
            }
        }
        return null;
    }



}

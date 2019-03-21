import java.util.ArrayList;
import java.util.HashMap;

public class Matcher {

    public static void matchMe(Student pupil, ArrayList<Student> tutors) {
        Day commonDay;
        Time commonTime;
        Subject commonSubject;
        boolean anyMatches = false;

        for(int x = 0; x < tutors.size(); x++) {



        }


    }

    //returns boolean saying if a class match exists
    public static boolean anyClassMatches(Student tutor, Student pupil) {
        ArrayList<Subject> tutorClasses = tutor.getClasses();
        ArrayList<Subject> pupilClasses = pupil.getClasses();

        for(Subject a : tutorClasses) {
            for(Subject b : pupilClasses) {
                if(a == b && a.getLevel() == b.getLevel()) {
                    return true;
                }
            }
        }
        return false;
    }

    //returns actual class that is shared
    public static Subject classMatches(Student tutor, Student pupil) {
        ArrayList<Subject> tutorClasses = tutor.getClasses();
        ArrayList<Subject> pupilClasses = pupil.getClasses();

        for(Subject a : tutorClasses) {
            for(Subject b : pupilClasses) {
                if(a == b && a.getLevel() == b.getLevel()) {
                    return a;
                }
            }
        }
        return null;
    }


    //returns boolean saying if a time match exists
    public static boolean anyTimeMatches(Student tutor, Student pupil) {
        boolean[][] tutorTimes = tutor.getFreeTimes();
        boolean[][] pupilTimes = pupil.getFreeTimes();


        for (int x = 0; x < 7; x++) {
            for (int y = 0; y < tutorTimes[x].length; y++)
                if(tutorTimes[x][y] && pupilTimes[x][y]) {
                    return true;
                }
        }
        return false;
    }

    //returns the indices of both the time and day of the shared freeTime
//    public static int[] timeMatches(Student tutor, Student pupil) {
//        return {2,3};
//    }


}

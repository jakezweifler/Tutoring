import java.lang.reflect.Array;
import java.util.*;

public class Matcher {

    public static void matchMe(Student pupil, ArrayList<Student> tutors) {
        Day commonDay;
        Time commonTime;
        Subject commonSubject;
        boolean anyMatches = false;

        Day[] days = Day.values();
        Time[] times = Time.values();

        for (int x = 0; x < tutors.size(); x++) {
            if(returnMatchedClass(tutors.get(x),pupil).size() > 0 && anyTimeMatches(tutors.get(x),pupil).size() > 0) {
                anyMatches = true;
                commonDay = days[anyTimeMatches(tutors.get(x),pupil).get(0)[0]];
                commonTime = times[anyTimeMatches(tutors.get(x),pupil).get(0)[1]];
                commonSubject = returnMatchedClass(tutors.get(x),pupil).get(0);


            }
        }
        if (!anyMatches) {
            System.out.println("There were no matches, :(.");
        }

    }


    //returns actual class that is shared
    public static List<Subject> returnMatchedClass(Student tutor, Student pupil) {
        Set<Subject> tutorClasses = new HashSet<>(tutor.getClasses());
        Set<Subject> pupilClasses = new HashSet<>(pupil.getClasses());

        tutorClasses.retainAll(pupilClasses);
        List<Subject> subjectsInCommon = new ArrayList<>(tutorClasses);
        return subjectsInCommon;
    }


    //returns boolean saying if a time match exists
    public static List<Integer[]> anyTimeMatches(Student tutor, Student pupil) {
        boolean[][] tutorTimes = tutor.getFreeTimes();
        boolean[][] pupilTimes = pupil.getFreeTimes();
        List<Integer[]> sharedTimes = new ArrayList<>();

        for (int x = 0; x < 7; x++) {
            for (int y = 0; y < tutorTimes[x].length; y++)
                if (tutorTimes[x][y] && pupilTimes[x][y]) {
                    sharedTimes.add(new Integer[]{x,y});
                }
        }
        return sharedTimes;
    }


}

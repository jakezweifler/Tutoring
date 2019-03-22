public class MatchedStudents {

    private Student tutor;
    private Student pupil;
    private Day d;
    private Time t;
    private Subject[] s;


    public MatchedStudents(Student tutor, Student pupil, Day d, Time t, Subject[] s) {
        this.tutor = tutor;
        this.pupil = pupil;
        this.d = d;
        this.t = t;
        this.s = s;
    }

    public void setD(Day d) {
        this.d = d;
    }

    public void setT(Time t) {
        this.t = t;
    }


    public Student getTutor() {
        return tutor;
    }

    public Student getPupil() {
        return pupil;
    }

    public Day getD() {
        return d;
    }

    public Time getT() {
        return t;
    }

    public Subject[] getS() {
        return s;
    }
}

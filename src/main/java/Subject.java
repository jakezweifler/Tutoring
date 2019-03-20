public enum Subject {


    Algebra_1(0),
    Geometry(0),
    Algebra_2(0),
    Precalculus(0),
    Calculus(0),
    English_9(0),
    English_10(0),
    English_11(0),
    English_12(0);

    private int level;

    Subject(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int l) {
        this.level = l;
    }

}

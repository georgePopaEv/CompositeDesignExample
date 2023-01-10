interface Faculty {
    public String getDetails();
}

class Professor implements Faculty {
    private String mName;
    private String mPosition;
    private int mOfficeNum;

    public Professor(String name, String mPosition, int mOfficeNum) {
        this.mName = name;
        this.mPosition = mPosition;
        this.mOfficeNum = mOfficeNum;
    }


    @Override
    public String getDetails() {
        return (mName + " is the " + mPosition);
    }
}

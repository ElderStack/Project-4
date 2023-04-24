import java.util.Arrays;

public abstract class LectureCourse extends Course{
    private String instructor;
    private int credits;
    private MeetDay[] meetDays;
    private String[] gtas;

    public LectureCourse(String crn, String title, String[] levels, String instructor, int credits, MeetDay[] meetDays, String[] gtas){
        super(crn, title, levels);
        this.instructor = instructor;
        this.credits = credits;
        if (meetDays.length >= 2){
			this.meetDays = meetDays;
		}
		this.gtas = gtas;
    }

	public String toString(){
		return ("instructor: " + this.getInstructor() + ", credit: " + this.getCredits() + ", meetDays: " + Arrays.deepToString(this.getMeetDays()) + ", gtas: " + Arrays.deepToString(this.getGtas()) + ", " + super.toString());
	}

	public int compareTo(Course argument){
		String thisLevel = this.getLevels()[0];
		String argLevel = argument.getLevels()[0];
		if (thisLevel == "Graduate" && (argLevel == "Non-Degree" || argLevel == "Undergraduate")){
			return -1;
		}
		else if (thisLevel == "Undergraduate" && argLevel == "Non-Degree"){
			return -1;
		}
		else if (thisLevel.equals(argLevel)){
			return 0;
		}
		else{
			return 1;
		}
	}

    public String getInstructor() {
		return this.instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public int getCredits() {
		return this.credits;
	}

	public MeetDay[] getMeetDays() {
		return this.meetDays;
	}

	public String[] getGtas() {
		return this.gtas;
	}
}
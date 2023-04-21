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

	//unfinished
	public int compareTo(int argument){
		return 0;
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
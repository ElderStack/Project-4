import java.util.Arrays;

public abstract class Course <T> implements Comparable <T>{
    private String crn;
    private String title;
    private String[] levels;

    public Course(String crn, String title, String[] levels){
        this.crn = crn;
        if (title.length() >= 15 && title.length() <= 40){
            this.title = title;
        }

        int counter = 0;
        for (String level: levels){
            if (level.equals("Graduate") || level.equals("Non-Degree") || level.equals("Undergraduate")){
                counter ++;
            }
        }
        this.levels = new String[counter];
        counter = 0;
        for (String level: levels){
            if (level.equals("Graduate") || level.equals("Non-Degree") || level.equals("Undergraduate")){
                this.levels[counter] = level;
                counter ++;
            }
        }
    }

    public boolean equals(Object obj){
        if (obj.getClass().getName().equals(this.getClass().getName())){
            Course hld = (Course) obj;
            if (this.getCrn().equals(hld.getCrn())){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return ("type: " + this.getType() + ", CRN: " + this.getCrn() + ", title: " + title + ", levels: " + Arrays.deepToString(this.getLevels()));
    }

    public abstract String getType();

    public String getCrn() {
		return this.crn;
	}

	public String getTitle() {
		return this.title;
	}

	public String[] getLevels() {
		return this.levels;
	}
}
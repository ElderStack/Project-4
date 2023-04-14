public abstract class Course <T> implements Comparable{
    private String crn;
    private String title;
    private String levels;

    public Course(String crn, String title, String levels){
        this.crn = crn;
        this.title = title;
        this.levels = levels;
    }

    public boolean equals(Object obj){
        if (obj.getClass().getName().equals(this.getClass().getName())){
            obj = (Course)obj;
            if (this.getCrn().equals(obj.getCrn())){
                return true;
            }
        }
        return false;
    }

    public abstract String getType();

    public String getCrn() {
		return this.crn;
	}

	public void setCrn(String crn) {
		this.crn = crn;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLevels() {
		return this.levels;
	}

	public void setLevels(String levels) {
		this.levels = levels;
	}
}
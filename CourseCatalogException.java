public class CourseCatalogException extends IllegalStateException{
    
    private String crn;
    private Course course;
    public CourseCatalogException(String crn, Course course){
        super("The course’s CRN is already in the catalog.");
        this.crn = crn;
        this.course = course;
    }

    public String getCrn(){
        return this.crn;
    }

    public Course getCourse(){
        return this.course;
    }
}
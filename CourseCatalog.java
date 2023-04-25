import java.util.ArrayList;
import java.util.Collections;
public class CourseCatalog{
    private ArrayList<AvailableCourse<String, Course>> catalog;

    public CourseCatalog(){
        catalog = new ArrayList<AvailableCourse<String, Course>>();
    }

    public void add(String crn, Course course){
        for (AvailableCourse<String, Course> c: this.catalog){
            if (c.getValue().getCrn().equals(crn)){
                throw new CourseCatalogException(crn, course);
            }
        }
        catalog.add(new AvailableCourse<String,Course>(crn, course));
    }

    public ArrayList<AvailableCourse<String, Course>> search(String[] searchable){
        ArrayList<AvailableCourse<String, Course>> found = new ArrayList<AvailableCourse<String, Course>>();
        CourseSearcher cs = new CourseSearcher(searchable);
        for (AvailableCourse<String, Course> course: this.catalog){
            if (cs.matches(course)){
                found.add(course);
            }
        }
        return found;
    }

    public void sort(){
        ArrayList<AvailableCourse<String, Course>> inPerson = new ArrayList<AvailableCourse<String, Course>>();
        ArrayList<AvailableCourse<String, Course>> hybrid = new ArrayList<AvailableCourse<String, Course>>();
        ArrayList<AvailableCourse<String, Course>> online = new ArrayList<AvailableCourse<String, Course>>();

        for (AvailableCourse<String, Course> course: this.catalog){
            if (course.getValue().getType().equals("In-Person")){
                inPerson.add(course);
            }
            if (course.getValue().getType().equals("Hybrid")){
                hybrid.add(course);
            }
            if (course.getValue().getType().equals("Online")){
                online.add(course);
            }
        }

        Collections.sort(inPerson);
    }

    public static void main(String[] args){
        CourseCatalog cc = new CourseCatalog();

        String[] level = {"Non-Degree"};
        MeetDay[] meetdays = {MeetDay.Tuesday};
        String[] gtas = {"greg"};
        InPersonCourse c1 =  new InPersonCourse("001", "Class 1", level, "Instructor 1", 1, meetdays, gtas);

        cc.add("001", c1);

        InPersonCourse c2 =  new InPersonCourse("002", "Class 2", level, "Instructor 2", 2, meetdays, gtas);

        cc.add("002", c2);

        InPersonCourse c0 =  new InPersonCourse("000", "Class 0", level, "Instructor 0", 0, meetdays, gtas);

        cc.add("000", c0);

        System.out.println(cc);
        cc.sort();
        System.out.println(cc);
    }

    public ArrayList<AvailableCourse<String, Course>> getCatalog()
    {
		return this.catalog;
	}

    public String toString(){
        String hld = "";
        for (AvailableCourse<String, Course> course: this.catalog){
            hld += course.getValue().getCrn();
        }
        return hld;
    }
}
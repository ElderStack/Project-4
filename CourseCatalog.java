import java.util.ArrayList;
public class CourseCatalog{
    private ArrayList<AvailableCourse<String, Course>> catalog;

    public CourseCatalog(){
        catalog = new ArrayList<AvailableCourse<String, Course>>();
    }

    public void add(String crn, Course course){
        catalog.add(new AvailableCourse<String,Course>(crn, course));
    }

    public ArrayList<AvailableCourse<String, Course>> search(String[] searchable){
        ArrayList<AvailableCourse<String, Course>> found = new rrayList<AvailableCourse<String, Course>>();

        
    }

    public ArrayList<AvailableCourse<String, Course>> getCatalog()
    {
		return this.catalog;
	}
}
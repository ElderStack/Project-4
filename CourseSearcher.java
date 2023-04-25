public class CourseSearcher implements Searchable{
    private String[] searchTerms;

    public CourseSearcher(String[] searchTerms){
        this.searchTerms = searchTerms;
    }

    public boolean matches(AvailableCourse<String, Course> course){
        for (String term: searchTerms){
            if (course.toString().indexOf(term) != -1 || course.getKey().indexOf(term) != -1){
                return true;
            }
        }
        return false;
    }

    public boolean matches(Object course) {
        return false;
    }
}
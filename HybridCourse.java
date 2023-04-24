public class HybridCourse extends LectureCourse{
    public HybridCourse(String crn, String title, String[] levels, String instructor, int credits, MeetDay[] meetDays, String[] gtas){
        super(crn, title, levels, instructor, credits, meetDays, gtas);
    }

    public String getType(){
        return "Hybrid";
    }
}
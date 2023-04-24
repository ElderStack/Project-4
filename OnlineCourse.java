public class OnlineCourse extends LectureCourse{
    public OnlineCourse(String crn, String title, String[] levels, String instructor, int credits, MeetDay[] meetDays, String[] gtas){
        super(crn, title, levels, instructor, credits, meetDays, gtas);
    }

    public String getType(){
        return "Online";
    }
}
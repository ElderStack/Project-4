public class HybridCourse extends LectureCourse{
    public HybridCourse(String crn, String title, String[] levels, String instructor, int credits, MeetDay[] meetDays, String[] gtas){
        super(crn, title, levels, instructor, credits, meetDays, gtas);
    }

    public String getType(){
        return "Hybrid";
    }

    public int compareTo(HybridCourse argument){
        //wont have credits? confused abt how to implement the compareTos for sorting.
        if (this.getTitle().equals(argument.getTitle())){
            if (this.getCredits() == (argument.getCredits())){
                return 0;
            }
            else if (this.getCredits() > (argument.getCredits())){
                return 1;
            }
            else{
                return -1;
            }
        }
        return this.getTitle().compareTo(argument.getTitle());
    }
}
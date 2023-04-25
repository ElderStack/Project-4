public class InPersonCourse extends LectureCourse{
    public InPersonCourse(String crn, String title, String[] levels, String instructor, int credits, MeetDay[] meetDays, String[] gtas){
        super(crn, title, levels, instructor, credits, meetDays, gtas);
    }

    public String getType(){
        return "In-Person";
    }
    
    public int compareTo(InPersonCourse argument){
        //wont have credits? confused abt how to implement the compareTos for sorting.
        InPersonCourse newArgument = (InPersonCourse) argument;
        if (this.getCredits() == newArgument.getCredits()){
            return this.getTitle().compareTo(argument.getTitle());
        }
        else if (this.getCredits() > newArgument.getCredits()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
public class OnlineCourse extends LectureCourse{
    public OnlineCourse(String crn, String title, String[] levels, String instructor, int credits, MeetDay[] meetDays, String[] gtas){
        super(crn, title, levels, instructor, credits, meetDays, gtas);
    }

    public String getType(){
        return "Online";
    }

    public int compareTo(Online argument){
        //wont have credits? confused abt how to implement the compareTos for sorting.
        if (this.getTitle().equals(argument.getTitle())){
            if (this.getMeetDays().length == (argument.getMeetDays().length)){
                return 0;
            }
            else if (this.getMeetDays().length > (argument.getMeetDays().length)){
                return 1;
            }
            else{
                return -1;
            }
        }
        return this.getTitle().compareTo(argument.getTitle());
    }
}
public class LectureCourseException extends Exception{
    
    private String fieldName;
    public LectureCourseException(String argument){
        super("an argument has null or illegal value");
        this.fieldName = argument;
    }

    public String getFieldName(){
        return this.fieldName;
    }
}
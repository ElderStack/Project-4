public class AvailableCourse<Key, Values extends Comparable<Values>> implements Comparable<AvailableCourse<Key,Values>>{
    private Key key;
    private Values value;

    public AvailableCourse(Key key, Values value){
        this.key = key;
        this.value = value;
    }

    public boolean equals(Object obj){
        if (obj.getClass().getName().equals(this.getClass().getName())){
            AvailableCourse<Key, Values> hld = (AvailableCourse<Key, Values>) obj;
            if (this.getValue().equals(hld.getValue())){
                return true;
            }
        }
        return false;
    }

    public int compareTo(AvailableCourse<Key, Values> other){
        return this.getValue().compareTo(other.getValue());
    }

    /*
    public static void main(String[] args){
        AvailableCourse<Integer, Integer> ac1 = new AvailableCourse<Integer,Integer>(0, 1);
        AvailableCourse<Integer, Integer> ac2 = new AvailableCourse<Integer,Integer>(0, 2);
        System.out.println(ac1.compareTo(ac2));
    } */    

    public Key getKey() {
        return this.key;
    }

    public Values getValue() {
        return this.value;
    }
}
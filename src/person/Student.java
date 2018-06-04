package person;

public class Student extends Person {
    
    private String indexNumber;
    private int year;
    
//    public Student() {
//    
//    }
    
    public Student(String name, String surname, String jmbg) {
        super(name, surname, jmbg);
    }
    
    public Student(String name, String surname, String jmbg, String indexNumber, int year) {
        super(name, surname, jmbg);
        this.indexNumber = indexNumber;
        this.year = year;
    }
    
    @Override
    public void showData(){
        super.showData();
        System.out.println("Student's index number is: " + getIndexNumber());
        System.out.println("Year of studies: " + getYear());
    }
    
    public String getIndexNumber() {
        return this.indexNumber;
    }

    public void setIndexNumber(String newIndex) {
        this.indexNumber = newIndex;
    }
    
    public int getYear() {
        return this.year;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }
}

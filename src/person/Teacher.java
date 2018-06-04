package person;

public class Teacher extends Person {

    private String mainSubject;
    private int yearsExperience;
    private String gender;

    public Teacher() {

    }

    public Teacher(String name, String surname, String jmbg, String mainSubject, int yearsExperience, String gender) {
        super(name, surname, jmbg);
        this.mainSubject = mainSubject;
        this.yearsExperience = yearsExperience;
        this.gender = gender;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Teacher's subject is: " + getMainSubject());
        System.out.println("Years of experience: " + getYearsExperience());
        System.out.println("Gender: " + getGender());
    }

    public String getMainSubject() {
        return this.mainSubject;
    }

    public void setMainSubject(String newSubject) {
        this.mainSubject = newSubject;
    }

    public int getYearsExperience() {
        return this.yearsExperience;
    }

    public void setYearExperience(int newYearsExperience) {
        this.yearsExperience = newYearsExperience;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String newGender) {
        this.gender = newGender;

    }
}

package Project;

public class Customer extends Person {
    private String yearsOfActivity;

    public String getYearsOfActivity() {
        return yearsOfActivity;
    }

    public void setYearsOfActivity(String yearsOfActivity) {
        this.yearsOfActivity = yearsOfActivity;
    }

    public Customer (String name, String surname, String age, String id, String yearsOfActivity) {
        super(name, surname, age, id);
        setYearsOfActivity(yearsOfActivity);
    }

    @Override
    public String toString() {
        return "Customer [id=" + getId() + ", name=" + getName() + ", surname=" + getSurname() + ", age=" + getAge() + ", years of activity=" + getYearsOfActivity() + "]";
    }
}

package Project;

public class Employee extends Person {
    private String placeOfResidence;
    private String salary;

    public String getPlaceOfResidence() {
        return placeOfResidence;
    }

    public void setPlaceOfResidence(String placeOfResidence) {
        this.placeOfResidence = placeOfResidence;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Employee (String name, String surname, String age, String id, String placeOfResidence, String salary) {
        super(name, surname, age, id);
        setPlaceOfResidence(placeOfResidence);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "Employee [id=" + getId() + ", name=" + getName() + ", surname=" + getSurname() + ", age=" + getAge() + ", place of residence=" + getPlaceOfResidence() + ", salary=" + getSalary() + "]";
    }
}

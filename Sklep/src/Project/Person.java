package Project;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String surname;
    private String age;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person (String name, String surname, String age, String id) {
        super();
        setName(name);
        setSurname(surname);
        setAge(age);
        setId(id);
    }

}

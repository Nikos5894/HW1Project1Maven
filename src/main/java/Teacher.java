public class Teacher implements University {

    private String name;
    private String surName;
    private String speciality;

    public Teacher() {
        this.name = "None";
        this.surName = "None";
        this.speciality = "None";
    }

    public Teacher(String name, String surName, String speciality) {
        this.name = name;
        this.surName = surName;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", speciality='" + speciality + '\'' +
                '}';
    }
}

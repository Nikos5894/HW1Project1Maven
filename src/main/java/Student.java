public class Student implements University{


    private int identityCard;
    private String name;
    private String surName;

    public Student() {
        this.identityCard = -1232482;
        this.name = "None";
        this.surName = "None";
    }

    public Student(int identityCard, String name, String surName) {
        this.identityCard = identityCard;
        this.name = name;
        this.surName = surName;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
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

    @Override
    public String toString() {
        return "Student{" +
                "identityCard=" + identityCard +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}

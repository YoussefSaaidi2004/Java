public class employe {

    // Attributes

    private int  id;
    private String name;
    private String surname;
    private String dept_name;
    private int grade ;

    // Constructors

    public employe(int id, String name, String surname, String dept_name) {}

    public employe(int id, String name, String surname, String dept_name, int grade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dept_name = dept_name;
        this.grade = grade;
    }

    // Getters & Setters

    public int getId() {return id;}
    public String getName() {return name;}
    public String getSurname() {return surname;}
    public String getDept_name() {return dept_name;}
    public int getGrade() {return grade;}
    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setDept_name(String dept_name) {this.dept_name = dept_name;}
    public void setGrade(int grade) {this.grade = grade;}

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        employe other = (employe) obj;
        return id == other.id &&
                grade == other.grade &&
                name.equals(other.name) &&
                surname.equals(other.surname) &&
                dept_name.equals(other.dept_name);
    }

}

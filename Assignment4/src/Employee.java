public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee () {
        name = "";
        department = "";
        position = "";
        idNumber = 0;
    };
    public Employee (String n, int id, String dept, String pos) {
        name = n;
        idNumber = id;
        department = dept;
        position = pos;
    };

    public Employee (String n, int id) {
        name = n;
        idNumber = id;
        position = "";
        department = "";
    }

    public void setName(String n) {
        name = n;
    }
    public void setIdNumber(int id) {
        idNumber = id;
    }
    public void setDepartment(String dept) {
        department = dept;
    }
    public void setPosition(String pos) {
        position = pos;
    }

    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public String getPosition() {
        return position;
    }
    public int getIdNumber() {
        return idNumber;
    }
}

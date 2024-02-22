public class EmployeeDemo {
    public static void main(String[] args)
    {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Susan Meyers", 47899);
        Employee e3 = new Employee("Mark Jones", 39119, "IT", "Programmer");

        e1.setDepartment("Manufacturing");
        e1.setName("Joy Rogers");
        e1.setIdNumber(81774);
        e1.setPosition("Engineer");

        e2.setPosition("Vice President");
        e2.setDepartment("Accounting");

        System.out.println("Name: " + e1.getName() + "\nID number: " + e1.getIdNumber()
        + "\nDepartment: " + e1.getDepartment() + "\nPosition: " + e1.getPosition() + "\n-----------");

        System.out.println("Name: " + e2.getName() + "\nID number: " + e2.getIdNumber()
                + "\nDepartment: " + e2.getDepartment() + "\nPosition: " + e2.getPosition() + "\n-----------");

        System.out.println("Name: " + e3.getName() + "\nID number: " + e3.getIdNumber()
                + "\nDepartment: " + e3.getDepartment() + "\nPosition: " + e3.getPosition());

    }
}

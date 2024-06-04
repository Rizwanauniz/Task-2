class Employee {
    private int employeeID;
    private String name;
    private int age;

    public Employee(String name, int age, int employeeID) {
        this.name = name;
        this.age = age;
        this.employeeID = employeeID;
    }

    public void display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
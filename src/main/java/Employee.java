public class Employee {
    public long id;
    public String firstName;
    public String lastName;
    public String country;
    public int age;

    public Employee() {
        // Пустой конструктор
    }

    public Employee(long id, String firstName, String lastName, String country, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(Employee.class).append("{")
                .append("id=").append(id).append(", ")
                .append("firstName=").append(firstName).append(", ")
                .append("lastName=").append(lastName).append(", ")
                .append("country=").append(country).append(", ")
                .append("age=").append(age).append("}")
                .toString();
    }
}

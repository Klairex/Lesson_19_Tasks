public class Employee {

    private String name;
    private int age;
    private boolean isPaidPerHour;
    private boolean canConductInterview;
    private boolean canAttendTraining;
    private String department;


    public Employee(String name, int age, boolean isPaidPerHour,boolean canConductInterview, boolean canAttendTraining, String department) {
        this.name = name;
        this.age = age;
        this.isPaidPerHour = isPaidPerHour;
        this.canAttendTraining = canAttendTraining;
        this.canConductInterview = canConductInterview;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + name + '\'' +
                ", age=" + age +
                ", isPaidPerHour=" + isPaidPerHour +
                ", canConductInterview=" + canConductInterview +
                ", canAttendTraining=" + canAttendTraining +
                ", department='" + department + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPaidPerHour() {
        return isPaidPerHour;
    }

    public void setPaidPerHour(boolean isPaidPerHour) {
        this.isPaidPerHour = isPaidPerHour;
    }

    public void setCanConductInterview(boolean canConductInterview) {
        this.canConductInterview = canConductInterview;
    }

    public boolean isCanConductInterview() {
        return canConductInterview;
    }

    public void setCanAttendTraining(boolean canAttendTraining) {
        this.canAttendTraining = canAttendTraining;
    }

    public boolean isCanAttendTraining() {
        return canAttendTraining;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
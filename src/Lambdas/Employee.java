package Lambdas;

public class Employee {
    private int id;
    private String firstName;
    private int yearsOfService;

    public Employee(int id, String firstName, int yearsOfService) {
        this.id = id;
        this.firstName = firstName;
        this.yearsOfService = yearsOfService;
    }

    //Setters and Getters
    public int getId() {return id;}
    public String getFirstName() {return firstName;}
    public int getYearsOfService() {return yearsOfService;}

    public void setId(int id) {this.id = id;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setYearsOfService(int yearsOfService) {this.yearsOfService = yearsOfService;}
}

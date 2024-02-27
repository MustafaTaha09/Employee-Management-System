import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee extends Person implements ContractDepartment{
    private String entryDate;
    private int contractDuration;
    private int noticePeriod;
    private double baseSalary;
    private Positions position;
    private List<Project> projects;
    public Employee(String name, int age, String gender, Positions position) {
        super(name, age, gender);
        this.position = position;
        projects = new ArrayList<>();
    }

    public void calculateSalary(){
        switch (position) {
            case MANAGER:
                this.baseSalary = 50000.0; // Example base salary for a manager
                break;
            case DEVELOPER:
                this.baseSalary = 40000.0; // Example base salary for a developer
                break;
            case TESTER:
                this.baseSalary = 35000.0; // Example base salary for a tester
                break;
        }
    }
    @Override
    public void setEntryDate(String date) {
        if(date.isEmpty()){
            throw new IllegalArgumentException("Invalid date!"); // in case provided date wasn't valid
        }
        this.entryDate = date;
    }

    @Override
    public void setContractDuration(int duration) {
        if(duration == 0){
            throw new IllegalArgumentException("Invalid Duration!"); // in case provided duration wasn't valid
        }
        this.contractDuration = duration;
    }

    @Override
    public void setNoticePeriod(int noticePeriod) {
        this.noticePeriod = noticePeriod;
    }

    public void addProject(Project project){
        projects.add(project);
    }

    public void displayInformation() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Entry Date: " + entryDate);
        System.out.println("Contract Duration: " + contractDuration + " months");
        System.out.println("Notice Period: " + noticePeriod + " days");
        System.out.println("Salary: " + baseSalary + " Pounds");
        System.out.println("Projects:");
        if(projects.isEmpty()){ // handling if there is no projects.
            System.out.println("There is no Projects related to " + this.getName());
            return;
        }
        for (Project project : projects) {
            System.out.println("- " + project.getName());
        }
    }
}

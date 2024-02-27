public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Mustafa", 23, "Male", Positions.MANAGER);
        emp1.setContractDuration(2);
        emp1.setEntryDate("26/2/2024");
        emp1.setNoticePeriod(15);
        emp1.calculateSalary();

        Employee emp2 = new Employee("Mariam", 26, "Female", Positions.DEVELOPER);
        emp2.setContractDuration(1);
        emp2.setEntryDate("14/6/2023");
        emp2.setNoticePeriod(20);
        emp2.calculateSalary();

        Employee emp3 = new Employee("Hassan", 30, "Male", Positions.TESTER);
        emp3.setContractDuration(1);
        emp3.setEntryDate("7/9/2023");
        emp3.setNoticePeriod(20);
        emp3.calculateSalary();

        Project project1 = new Project("Retail System", "RS20");
        Project project2 = new Project("IT System", "IS50");

        emp1.addProject(project1);
        emp1.addProject(project2);
        emp2.addProject(project2);

        emp1.displayInformation();
        System.out.println("---------------------------------------------------------");
        emp2.displayInformation();
        System.out.println("---------------------------------------------------------");
        emp3.displayInformation();


    }
}
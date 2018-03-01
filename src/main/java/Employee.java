public abstract class Employee {

    private String name;
    private String niNumber;
    private Double salary;

    public Employee(String name, String niNumber, Double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public Double getSalary() {
        return salary;
    }

    // Increase the employee's salary by 'amount':
    public void raiseSalary(Double amount){
        if (amount > 0) {
            this.salary += amount;
        }
    }

    // Return a bonus that is 1% of the employees's current salary:
    public Double payBonus(){
        return this.salary / 100;
    }

}

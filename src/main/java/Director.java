public class Director extends Manager {

    private Double budget;

    public Director(String name, String niNumber, Double salary, String deptName, Double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    // Return a bonus that is 2% of the employees's current salary:
    @Override
    public Double payBonus(){
        Double salary = getSalary();
        return salary / 50;
    }
}

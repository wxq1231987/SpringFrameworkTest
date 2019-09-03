package dependency.inject.constructor;

public class ExampleBean {
    private int years;
    private int month;
    private String ultimateAnswer;

    public ExampleBean(int years, int month, String ultimateAnswer) {
        super();
        this.years = years;
        this.month = month;
        this.ultimateAnswer = ultimateAnswer;
    }

    @Override
    public String toString() {
        return "ExampleBean [years=" + years + ", month=" + month + ", ultimateAnswer=" + ultimateAnswer + "]";
    }
}

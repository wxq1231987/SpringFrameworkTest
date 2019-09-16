package annotation.based.config;

public class CustomerPreferenceDao {
    private String sql = "select 1 from dual";

    @Override
    public String toString() {
        return "CustomerPreferenceDao [sql=" + sql + "]";
    }
}

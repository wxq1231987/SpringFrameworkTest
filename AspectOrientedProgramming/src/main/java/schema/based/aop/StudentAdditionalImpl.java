package schema.based.aop;

public class StudentAdditionalImpl implements StudentAdditional {
    private String city;
    private String country;

    public void showAdditionalDetails() {
        System.out.println(this.city);
        System.out.println(this.country);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}

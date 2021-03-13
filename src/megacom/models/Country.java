package megacom.models;

public class Country {

    private String countryName;
    private City city;

    public Country(String countryName, City city) {
        this.countryName = countryName;
        this.city = city;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}

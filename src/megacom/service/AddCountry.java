package megacom.service;

import megacom.service.impl.AddCountryImpl;

public interface AddCountry {

    AddCountry INSTANCE = new AddCountryImpl();

    void addCountryAndCityes();
    void output();

}

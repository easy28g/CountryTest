package megacom;

import megacom.service.AddCountry;
import megacom.service.impl.AddCountryImpl;

public class Main {

    public static void main(String[] args) {

        AddCountry addCountry = AddCountryImpl.INSTANCE;

        addCountry.addCountryAndCityes();
        addCountry.output();

    }

}



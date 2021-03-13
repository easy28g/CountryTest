package megacom.service.impl;

import megacom.service.AddCountry;

import java.util.*;

public class AddCountryImpl implements AddCountry {

    Scanner scanner = new Scanner(System.in);

    HashMap<String, HashMap<String, Boolean>> countries = new HashMap<>();
    HashMap<String, Boolean> cities = new HashMap<>();


    HashSet<HashMap> citiesLHS = new HashSet<>();
    HashSet<HashMap> countryLHS = new HashSet<>();

    @Override
    public void addCountryAndCityes() {

    do {
        countries = new HashMap<>();

        do {
            System.out.print("Country: ");
            String country = scanner.next();

            cities = new HashMap<>();

            do {
                System.out.print("City: ");
                String city = scanner.next();

                System.out.print("Boolean: ");
                boolean cityBoolean = scanner.nextBoolean();

                cities.putIfAbsent(city.toLowerCase(), cityBoolean);
                //citiesLHS.add(cities);
            } while (cities.size() < 2);

            citiesLHS.add(cities);

            countries.putIfAbsent(country, cities);
            //countryLHS.add(countries);

        } while (countries.size() < 4);

    }while(countries.size()<2);

        countryLHS.add(countries);
        System.out.println("***********************************");
    }


    @Override
    public void output() {

        int rightAnswer = 0; boolean bool = true;
        for (Map.Entry entry : countries.entrySet()) {
            System.out.println("---------------" + entry.getKey() + "---------------");
            HashMap<String, Boolean> entry1 = (HashMap<String, Boolean>) entry.getValue();

            int i=1;
            for (Map.Entry entry2 : entry1.entrySet()){
                System.out.print(i+")"+entry2.getKey()+";  ");
                i++;
            }
            System.out.println();

            System.out.print("Введите название столицы - ");
            String capital = scanner.next();
            for (Map.Entry entry2 : entry1.entrySet()) {
                if (capital.toLowerCase().equals(entry2.getKey())) {
                    if (entry2.getValue().equals(bool)) {
                        rightAnswer++;
                    }
                }
            }
            System.out.println();
        }

        int result = 100*rightAnswer/countries.size();
        System.out.println("Процент правильных ответов - "+result+"%");
/*
        ArrayList<HashMap> citiesLHSlist = new ArrayList<>(citiesLHS);
        System.out.println(citiesLHSlist.get(0));
        System.out.println(citiesLHSlist.get(1));
        System.out.println(citiesLHSlist.get(2));
        System.out.println(citiesLHSlist.get(3));
*/

    }


}

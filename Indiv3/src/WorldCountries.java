import java.io.PrintStream;
import java.util.ArrayList;

public class WorldCountries {
    ArrayList<Country> countriesList;

    public WorldCountries() {
        countriesList = new ArrayList<Country>();
    }

    public void addCountry(Country country) {
        countriesList.add(country);
    }

    public void deleteCountry(String name) {
        int p = -1;
        for (int i = 0; i < countriesList.size(); i++) {
            if (name.equalsIgnoreCase(countriesList.get(i).getName())) p = i;
        }
        if (p > -1) {
            countriesList.remove(p);
            System.out.println(name + " удалена!");
        } else {
            System.out.println("[!] Такой страны нет!");
        }
    }


    public void findCountryByName(String name) {
        boolean found = false;
        for (Country country : countriesList) {
            if (country.getName().equalsIgnoreCase(name)) {
                System.out.println(country.toString());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("[!] Страны с таким названием нет!");
        }
    }

    public void findCountryByCapital(String capital) {
        boolean found = false;
        for (Country country : countriesList) {
            if (country.getCapital().equalsIgnoreCase(capital)) {
                System.out.println(country.toString());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("[!] Страны с такой столицей нет!");
        }
    }

    public void findCountryByPopulation(int population) {
        boolean found = false;
        for (Country country : countriesList) {
            if (country.getPopulation() == population) {
                System.out.println(country.toString());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("[!] Страны с таким населением нет!");
        }
    }

    public void findCountryBySquare(int square) {
        boolean found = false;
        for (Country country : countriesList) {
            if (country.getSquare() == square) {
                System.out.println(country.toString());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("[!] Страны с такой площадью нет!");
        }
    }

    public void findCountryByOfficialLanguage(String officialLanguage) {
        boolean found = false;
        for (Country country : countriesList) {
            if (country.getOfficialLanguage().equalsIgnoreCase(officialLanguage)) {
                System.out.println(country.toString());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("[!] Страны с таким официальным языком нет!");
        }
    }

    public void findCountryByCurrency(String currency) {
        boolean found = false;
        for (Country country : countriesList) {
            if (country.getCurrency().equalsIgnoreCase(currency)) {  // Исправлено с getOfficialLanguage() на getCurrency()
                System.out.println(country.toString());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("[!] Страны с такой валютой нет!");
        }
    }

    public void findCountryByHead(String head) {
        boolean found = false;
        for (Country country : countriesList) {
            if (country.getHead().equalsIgnoreCase(head)) {
                System.out.println(country.toString());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("[!] Страны с такой главой страны нет!");
        }
    }

    public void sortByName() {
        Country sortCountry = new Country();
        countriesList.sort(Country.NameComparator);
    }

    public void sortByCapital() {
        Country sortCountry = new Country();
        countriesList.sort(Country.CapitalComparator);
    }

    public void sortByPopulation() {
        Country sortCountry = new Country();
        countriesList.sort(Country.PopulationComparator);
    }

    public void sortBySquare() {
        Country sortCountry = new Country();
        countriesList.sort(Country.SquareComparator);
    }

    public void sortByOfficialLanguage() {
        Country sortCountry = new Country();
        countriesList.sort(Country.OfficialLanguageComparator);
    }

    public void sortByCurrency() {
        Country sortCountry = new Country();
        countriesList.sort(Country.CurrencyComparator);
    }

    public void sortByHead() {
        Country sortCountry = new Country();
        countriesList.sort(Country.HeadComparator);
    }


    public void print() {
        for (Country country : countriesList) {
            System.out.println(country.toString() + "\n");
        }
    }
}

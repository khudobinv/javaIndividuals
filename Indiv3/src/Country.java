import java.util.Comparator;

public class Country {
    String name;
    String capital;
    int population;
    int square;
    String officialLanguage;
    String currency;
    String head;

    public Country(String name, String capital, int population, int square, String officialLanguage, String currency, String head) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.square = square;
        this.officialLanguage = officialLanguage;
        this.currency = currency;
        this.head = head;
    }

    public Country() {
        name = "Россия";
        capital = "Москва";
        population = 146447424;
        square = 17098246;
        officialLanguage = "русский";
        currency = "рубль";
        head = "Владимир Путин";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String getOfficialLanguage() {
        return officialLanguage;
    }

    public void setOfficialLanguage(String officialLanguage) {
        this.officialLanguage = officialLanguage;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

     public static Comparator<Country> NameComparator = new Comparator<Country>() {
         @Override
         public int compare(Country c1, Country c2) {
             return c1.getName().compareTo(c2.getName());
         }
     };

    public static Comparator<Country> CapitalComparator = new Comparator<Country>() {
        @Override
        public int compare(Country c1, Country c2) {
            return c1.getCapital().compareTo(c2.getCapital());
        }
    };

    public static Comparator<Country> PopulationComparator = new Comparator<Country>() {
        @Override
        public int compare(Country c1, Country c2) {
            return c2.getPopulation() - c1.getPopulation();
        }
    };

    public static Comparator<Country> SquareComparator = new Comparator<Country>() {
        @Override
        public int compare(Country c1, Country c2) {
            return (int) (c2.getSquare() - c1.getSquare());
        }
    };

    public static Comparator<Country> OfficialLanguageComparator = new Comparator<Country>() {
        @Override
        public int compare(Country c1, Country c2) {
            return c1.getOfficialLanguage().compareTo(c2.getOfficialLanguage());
        }
    };

    public static Comparator<Country> CurrencyComparator = new Comparator<Country>() {
        @Override
        public int compare(Country c1, Country c2) {
            return c1.getCurrency().compareTo(c2.getCurrency());
        }
    };

    public static Comparator<Country> HeadComparator = new Comparator<Country>() {
        @Override
        public int compare(Country c1, Country c2) {
            return c1.getHead().compareTo(c2.getHead());
        }
    };

    @Override
    public String toString() {
        return "[+] Информация о стране: \n" +
                "\n[-] Название страны: " + this.name +
                "\n[-] Столица страны: " + "г. " + this.capital +
                "\n[-] Население страны: " + this.population + " чел." +
                "\n[-] Площадь страны: " + this.square + " кв. км." +
                "\n[-] Официальный язык страны: " + this.officialLanguage +
                "\n[-] Глава страны: " + this.head;
    }
}

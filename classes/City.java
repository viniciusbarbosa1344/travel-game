package classes;

import java.util.ArrayList;

public class City {
    private String name;
    private ArrayList<City> nearbyCities;
    public boolean hasMission;
    public boolean alreadyVisited;
    private String[] rules;
    private Merchant merchant;

    public City(String name, boolean hasMission, boolean alreadyVisited, String[] rules, Merchant merchant) {
        this.name = name;
        this.nearbyCities = new ArrayList<>();
        this.hasMission = hasMission;
        this.alreadyVisited = alreadyVisited;
        this.rules = rules;
        this.merchant = merchant;
    }

    public String getName() {
        return name;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public ArrayList<City> getNearbyCities() {
        return nearbyCities;
    }

    public String[] getRules() {
        return rules;
    }

    public void addNerabyCity(City city) {
        this.nearbyCities.add(city);
    }
}

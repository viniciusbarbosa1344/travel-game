package classes;

import java.util.ArrayList;

public class City {
    private String name;
    private ArrayList<Frontier> frontiers;
    public boolean hasMission;
    private String[] rules;
    private Merchant merchant;
    private int powerUp;

    public City(String name, boolean hasMission, String[] rules, Merchant merchant, int powerUp) {
        this.name = name;
        this.frontiers = new ArrayList<>();
        this.hasMission = hasMission;
        this.rules = rules;
        this.merchant = merchant;
        this.powerUp = powerUp;
    }

    public String getName() {
        return name;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    // Create a new border that connects two cities
    public void addFrontier(City city, int powerUp) {
        Frontier frontier = new Frontier(city, powerUp);
        this.frontiers.add(frontier);
    }

    public ArrayList<Frontier> getFrontiers() {
        return frontiers;
    }

    public String[] getRules() {
        return rules;
    }
}

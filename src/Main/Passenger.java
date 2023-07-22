package src.Main;


import java.util.ArrayList;

public class Passenger {
    private String name;
    private String passengerCode;
    private Tier tier;
    private double balance;
    private ArrayList<Activity> activitiesEnrolled;


    public Passenger(String name, String passengerNumber, Tier passengerType, double balance) {
        setName(name);
        setPassengerCode(passengerNumber);
        setTier(passengerType);
        setBalance(balance);
        setActivitiesEnrolled(new ArrayList<>());
    }

    /**
     * The function checks if a passenger can enroll in an activity based on their tier and balance, and
     * deducts the appropriate amount from their balance if necessary.
     *
     * @param activity The "activity" parameter is an object of the Activity class.
     * @return The method is returning a boolean value. It returns true if the passenger is successfully
     * enrolled in the activity, and false otherwise.
     */
    public boolean enrollActivity(Activity activity) {
        if (activity.addPassenger(this)) {
            double price = activity.getPrice();
            if (tier != Tier.premium && balance >= price) {
                if (tier == Tier.gold) {
                    double discount = price * 0.1;
                    balance -= (price - discount);
                } else if (tier == Tier.standard) {
                    balance -= price;
                }
                activitiesEnrolled.add(activity);
                return true;
            } else if (tier == Tier.premium) {
                // For premium passengers, activities are free, so no balance deduction needed.
                activitiesEnrolled.add(activity);
                return true;
            } else {
                System.out.println("Insufficient Balance " + this.name);
            }
        }
        return false;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassengerCode() {
        return passengerCode;
    }

    public void setPassengerCode(String passengerCode) {
        this.passengerCode = passengerCode;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Activity> getActivitiesEnrolled() {
        return activitiesEnrolled;
    }

    public void setActivitiesEnrolled(ArrayList<Activity> activitiesEnrolled) {
        this.activitiesEnrolled = activitiesEnrolled;
    }

    public Tier getTier() {
        return tier;
    }

    public void setTier(Tier tier) {
        this.tier = tier;
    }

    public enum Tier {
        standard, gold, premium
    }
}

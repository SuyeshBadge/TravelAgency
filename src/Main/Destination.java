package src.Main;

import java.util.ArrayList;

public class Destination {
    private String name;
    private ArrayList<Activity> activities;

    public Destination(String name) {
        setName(name);
        setActivities(new ArrayList<Activity>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }

    public void setActivities(ArrayList<Activity> activities) {
        this.activities = activities;
    }

    /**
     * The addActivity function adds an activity to a list of activities.
     *
     * @param activity The parameter "activity" is an object of the class "Activity".
     */
    public void addActivity(Activity activity) {
        activity.setDestination(this);
        activities.add(activity);
    }
}

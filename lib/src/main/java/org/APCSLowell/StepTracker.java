package org.APCSLowell;

public class StepTracker {
    private int minSteps;
    private int totalSteps; 
    private int totalDays;
    private int activeDays;
    public StepTracker(int activityThreshold) {
        minSteps = activityThreshold;
        totalSteps = 0;
        totalDays = 0;
        activeDays = 0;
    }
    void addDailySteps(int stepCount) {
        totalStep += stepCount;
        totalDays++;
        if(stepCount >= minSteps){
            activeDays++;
        }
    }
    int activeDays() {
        return activeDays;
    }
    double averageSteps() {
        if(totalDays == 0){
            return 0.0;
        }
        return (double) totalSteps/totalDays;
    }
}

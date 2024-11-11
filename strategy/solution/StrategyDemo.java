package designpatterns.strategy.solution;

import designpatterns.strategy.solution.drivestrategy.HeavyVehicleDriveStrategy;
import designpatterns.strategy.solution.drivestrategy.TwoWheelerDriveStrategy;

public class StrategyDemo {
    public static void main(String[] args) {

        MotorBike motorBike = new MotorBike(new TwoWheelerDriveStrategy());
        Scooty scooty = new Scooty(new TwoWheelerDriveStrategy());
        Truck truck = new Truck(new HeavyVehicleDriveStrategy());

        motorBike.drive();
        scooty.drive();
        truck.drive();

    }
}

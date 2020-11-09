package main;
import model.Plane;
import service.PlaneService;

public class AirportTest {

    public static void main(String[] args) {
        //AirportTest (score 10)
        //use all the methods from PlaneService using Scanner object.
        PlaneService ps = new PlaneService();
        Plane p = ps.createPlane();
        ps.printPlaneInfo(p);
        System.out.println("*************");
        p.setMilitary(true);
        ps.printInfoIf(p);
        System.out.println("*************");
        Plane p2 = ps.createPlane();
        ps.printPlaneInfo(ps.newerPlane(p, p2));
        System.out.println("*************");
        System.out.println(ps.biggerWingspan(p, p2));
        System.out.println("*************");
        Plane p3 = ps.createPlane();
        ps.printPlaneInfo(ps.highestCost(p, p2, p3));
        System.out.println("task6*************");
        System.out.println(ps.smallestSeats(p, p2, p3));
        System.out.println("task7*************");
        Plane[] planes = {p, p2, p3};
        ps.printNotMilitaryPlanes(planes);
        System.out.println("task8*************");
        ps.printMilitaryPlanesIf(planes);
        System.out.println("task9*************");
        ps.printPlaneInfo(ps.minimalWeight(planes));
        System.out.println("task10*************");
        ps.printPlaneInfo(ps.minCostMilitary(planes));
        System.out.println("task11*************");
        ps.planesInAsc(planes);
        System.out.println("task12*************");
        ps.notMilitaryBySeatsDesc(planes);






    }
}

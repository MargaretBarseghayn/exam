package service;
import model.Plane;
import java.util.Scanner;

public class PlaneService {
    public void printPlaneInfo(Plane plane) {
        /*PlaneService
        Task 1. (score 5)
        Create function:
        Parameter one Plane
        Result: print all information of the plane*/
        System.out.println("model: " + plane.getModel() + '\n'
                + "country: " + plane.getCountry() + '\n' +
                "year: " + plane.getYear() + '\n' +
                "hours: " + plane.getHours() + '\n' +
                "ismilitary: " + plane.isMilitary() + '\n' +
                "engineType: " + plane.getEngineType() + '\n' +
                "weight: " + plane.getWeight() + '\n' +
                "wingspan: " + plane.getWingspan() + '\n' +
                "topSpeed: " + plane.getTopSpeed() + '\n' +
                "seats: " + plane.getSeats() + '\n' +
                "cost: " + plane.getCost());
    }

    /*Task 2. (score 5)
    Create function:
    Parameter one Plane
    Result: print cost and topSpeed if the plane is military otherwise print model and country*/
    public void printInfoIf(Plane plane) {
        if (plane.isMilitary()) {
            System.out.println("cost: " + plane.getCost() + '\n' + "topSpeed: " + plane.getTopSpeed());
            return;
        }
        System.out.println("model: " + plane.getModel() + '\n' + "country: " + plane.getCountry());
    }

    /*Task 3. (score 5)
    Create function:
    Parameter two Planes
    Result: return the plane which one is newer (if they have the same age return first one).*/
    public Plane newerPlane(Plane p1, Plane p2) {
        return p1.getYear() < p2.getYear() ? p2 : p1;
    }

    /*Task 4. (score 5)
    Create function:
    Parameter two Planes
    Result: return the model of the plane which has bigger wingspan (if they have the same - return second one).*/
    public String biggerWingspan(Plane p1, Plane p2) {
        return p1.getWingspan() > p2.getWingspan() ? p1.getModel() : p2.getModel();
    }

    /*Task 5. (score 5)
    Create function:
    Parameter three Planes
    Result: return the plane which has highest cost (if they have the same - return first plane).*/
    public Plane highestCost(Plane p1, Plane p2, Plane p3) {
        if (p2.getCost() > p1.getCost() && p2.getCost() > p3.getCost())
            return p2;
        if (p3.getCost() > p1.getCost() && p3.getCost() > p2.getCost())
            return p3;
        return p1;
    }

    /*Task 6. (score 5)
    Create function:
    Parameter three Planes
    Result: print country of the plane with smallest seats count (if they have the same - print first).*/
    public String smallestSeats(Plane p1, Plane p2, Plane p3) {
        if (p2.getSeats() < p1.getSeats() && p2.getSeats() < p3.getSeats())
            return p2.getCountry();
        if (p3.getSeats() < p1.getSeats() && p3.getSeats() < p2.getSeats())
            return p3.getCountry();
        return p1.getCountry();
    }

    /*Task 7. (score 5)
    Create function:
    Parameter array of Planes
    Result: print all not military planes.*/
    public void printNotMilitaryPlanes(Plane[] planes) {
        for (var plane : planes
        ) {
            if (!plane.isMilitary())
                printPlaneInfo(plane);
        }
    }

    /*Task 8. (score 5)
    Create function:
    Parameter array of Planes
    Result: print all military planes which were in air more than 100 hours.*/
    public void printMilitaryPlanesIf(Plane[] planes) {
        for (var plane : planes
        ) {
            if (plane.isMilitary() && plane.getHours() > 100)
                printPlaneInfo(plane);
        }
    }

    /*Task 9. (score 7)
    Create function:
    Parameter array of Planes
    Result: return the plane with minimal weight (if there are some of them return last one).*/
    public Plane minimalWeight(Plane[] planes) {
        int minWeight = planes[0].getWeight();
        int minIndex = 0;
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getWeight() <= minWeight) {
                minWeight = planes[i].getWeight();
                minIndex = i;
            }
        }
        return planes[minIndex];
    }

    /*Task 10. (score 7)
    Create function:
    Parameter array of Planes
    Result: return the plane with minimal cost from all military planes (if there are some of them return first one).*/
    public Plane minCostMilitary(Plane[] planes) {
        double minCost = 0;
        int minIndex = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary()) {
                minCost = planes[i].getCost();
                minIndex = i;
                break;
            }
        }
        if (minIndex == planes.length)
            return new Plane();

        for (int i = 0; i < planes.length; ++i) {
            if (planes[i].isMilitary() && planes[i].getCost() < minCost) {
                minCost = planes[i].getCost();
                minIndex = i;
            }
        }
        return planes[minIndex];
    }

    /*Task 11. (score 12)
    Create function:
    Parameter array of Planes
    Result: print planes in ascending form order by year*/
    public void planesInAsc(Plane[] planes) {
        boolean indicator = true;
        while (indicator) {
            indicator = false;
            int count = 0;
            for (int i = 0; i < planes.length - 1 - count; ++i) {
                count++;
                int iYear = planes[i].getYear(),
                        iiYear = planes[i + 1].getYear();
                if (iYear > iiYear) {
                    iYear = iYear ^ iiYear;
                    iiYear = iYear ^ iiYear;
                    iYear = iYear ^ iiYear;
                    indicator = true;
                }
            }

        }
    }

    /*Task 12. (score 14)
    Create function:
    Parameter array of Planes
    Result: print not military planes in descending form order by number of seats.*/
    public void notMilitaryBySeatsDesc(Plane[] planes) {
        Plane[] planes1 = new Plane[planes.length];
        int index = 0;
        for (var plane : planes
        ) {
            if (!plane.isMilitary()) {
                planes1[index] = plane;
                index++;
            }
        }
        boolean indicator = true;
        while (indicator) {
            indicator = false;
            int count = 0;
            for (int i = 0; i < planes1.length - 1 - count; ++i) {
                count++;
                int iSeat = planes1[i].getSeats(),
                        iiSeat = planes1[i + 1].getSeats();
                if (iSeat < iiSeat) {
                    iSeat = iSeat ^ iiSeat;
                    iiSeat = iSeat ^ iiSeat;
                    iSeat = iSeat ^ iiSeat;
                    indicator = true;
                }
            }
        }
    }

    public Plane createPlane()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("model:");
        String model = scan.nextLine();
        System.out.println("country: ");
        String country= scan.next();
        System.out.println("year: ");
        int year = scan.nextInt();
        Plane plane = new Plane();
        plane.setModel(model);
        plane.setCountry(country);
        plane.setYear(year);
        return plane;

    }
}



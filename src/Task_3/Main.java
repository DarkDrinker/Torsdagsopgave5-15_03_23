package Task_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create three different rooms
        Room room1 = new Room(2, 2, 6);
        Room room2 = new Room(2, 3, 4);
        Room room3 = new Room(1, 4, 7);

        // Add the rooms to a list
        List<Room> roomsList = new ArrayList<>();
        roomsList.add(room1);
        roomsList.add(room2);
        roomsList.add(room3);

        Building building = new Building(roomsList, 2, 3, true);

        int totalLamps = countLampsInBuilding(building);
        System.out.println("Total number of lamps in the building: " + totalLamps);



    }

    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }
}


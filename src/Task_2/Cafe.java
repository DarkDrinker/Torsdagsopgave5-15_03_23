package Task_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu;

    public Cafe() {
        coffeeMenu = new ArrayList<String>();
    }

    void loadMenuData() {
        try {
            File file = new File("coffees.txt");
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                coffeeMenu.add(line);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check path and filename");
            e.printStackTrace();
        }
    }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;

    }
}

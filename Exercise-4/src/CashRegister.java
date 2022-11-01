import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CashRegister {
    private static CashRegister cashRegister;
    private static ArrayList<String> items;
    private static double total;

    public static void createInstance() {
        cashRegister = new CashRegister();
        items = new ArrayList<String>();
        total = 0;
    }

    public static double getTotal() {
        return total;
    }

    public static Object[] addItem(String barcode) {
        // This has a try catch method to see if there will be any errors caught or not
        try {
            // Checks to see if there is a file in the directory called database
            File myObj = new File("database");
            Scanner myReader = new Scanner(myObj);

            // This while loop is for the database files
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String current = data.substring(0, data.indexOf(":"));

                if (barcode.equals(current)) {
                    // This will grab the name, price and barcode from the database file
                    String name = data.substring(data.indexOf(":") + 2, data.indexOf("$") - 1);
                    String price = data.substring(data.indexOf("$") + 1);
                    items.add(name);
                    total += Double.parseDouble(price);

                    Object[] item = { current, name, price };
                    return item;
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }

        return new Object[0];
    }

    public static void printItems() {
        System.out.println(items.toString());
    }
}
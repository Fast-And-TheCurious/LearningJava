package JuneRevsion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClientController {

    private Client[] clients;
    private int size;
    private static String filePath = "Results.txt";

    public ClientController() {
        clients = new Client[100];
        size = 0;
        File f = new File(filePath);
        try {
            Scanner fileScan = new Scanner(f);

            while (fileScan.hasNextLine()) {
                String line = fileScan.nextLine();

                Scanner lineScan = new Scanner(line).useDelimiter("#");

                String name = lineScan.next();
                String email = lineScan.next();
                String password = lineScan.next();
                String tierStr = lineScan.next();

                int tier = Client.BRONZE_TIER;

                if (tierStr.equals("silver")) {
                    tier = Client.SILVER_TIER;
                } else if (tierStr.equals("gold")) {
                    tier = Client.GOLD_TIER;
                }
                int usage = lineScan.nextInt();

                clients[size] = new Client(name, email, password, tier, usage);
                size++;
            }
// static vs non= static , parameter, types of errors
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }

    public void sort() {
        int n = size;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (clients[j].getSurname().compareTo(clients[j + 1].getSurname()) > 0) {

                    // Swap names
                    Client tempName = clients[j];
                    clients[j] = clients[j + 1];
                    clients[j + 1] = tempName;

                }
            }
        }        
    }

    public Client search(String surname) {
        for (int i = 0; i < size; i++) {
            if (clients[i].getSurname().equals(surname)) {
                return clients[i];
            }
        }
        return null;
    }

    public String filterInsecureClients() {
        String out = "";
        for (int i = 0; i < size; i++) {
            if (clients[i].isSecure() == false) {
                out = clients[i] + "\n";
            }
        }

        return null;
    }

    public String toString() {
        String out = "";
        for (int i = 0; i < size; i++) {
            out = clients[i].toString() + "\n";
        }
        return out;

    }
}

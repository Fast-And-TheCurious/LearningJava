package JuneRevsion;

public class ClientUI {

    public static void main(String[] args) {

        Client c = new Client("John Smith", "John@gmail.com", "Password21", 0, 345);

        System.out.println(c.getSurname());
        System.out.println("R " + c.calculateCurrentBill());
        System.out.println(c.toString());
        
        ClientController cc = new ClientController();
        System.out.println(cc.toString());
        System.out.println(cc.search("Peters"));
        System.out.println("=======================");
        System.out.println(cc.filterInsecureClients());
        
    }
}

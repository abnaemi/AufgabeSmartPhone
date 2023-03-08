import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        Smartphone smartphone = new Smartphone();

        smartphone.getPosition(); smartphone.startRadio(); smartphone.stopRadio();

        Friend contactone = new Friend("Tom", 111);
        Friend contacttwo= new Friend("Sara", 222);

        //System.out.println(contactone.getName());
        //System.out.println(contactone.getTelefonNummer());

        smartphone.addContact(contactone);
        smartphone.addContact(contacttwo);


        System.out.println(smartphone.getContact(1));

         ArrayList<Friend> listOfAllContact = new ArrayList<Friend>();
        listOfAllContact.add(contactone);
        listOfAllContact.add(contacttwo);
        System.out.println(listOfAllContact.get(1));
    }
}

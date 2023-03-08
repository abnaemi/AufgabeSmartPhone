import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();

        smartphone.getPosition(); smartphone.startRadio(); smartphone.stopRadio();

        Friend contactone = new Friend("Tom", 111);
        Friend contacttwo= new Friend("Sara", 222);

        //System.out.println(contactone.getName());
        //System.out.println(contactone.getTelefonNummer());

        smartphone.addContact(contactone);
        smartphone.addContact(contacttwo);
        smartphone.getListOfAllContact();


    }
}

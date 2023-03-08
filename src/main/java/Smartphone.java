import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Smartphone implements GPS, Radio  {


    private String nameOfModel;
    private String nameOfCompany;
    private ArrayList<Friend> listOfAllContact = new ArrayList<Friend>();

    public Smartphone (){

    }

    public Smartphone (String nameOfModel, String nameOfCompany, ArrayList listOfAllContact){

    }

    public void addContact (Friend contact){
        listOfAllContact.add(contact);
    }
    public void getContact(int index) throws IOException {
        System.out.println("Contact at index " + index + ":");
       try {
           Contact contact = listOfAllContact.get(index);
           System.out.println("Name: " + contact.getName());
           System.out.println("Number: " + contact.getTelefonNummer());
       } catch (Exception e) {
           System.out.println("Contact doenst exist");

       }

    }


    @Override
    public void getPosition() {
        System.out.println("Köln");
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
                return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    public String getNameOfModel() {
        return nameOfModel;
    }

    public void setNameOfModel(String nameOfModel) {
        this.nameOfModel = nameOfModel;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public void getListOfAllContact() {
          for (Friend friend : listOfAllContact) {
              System.out.println(friend.getName());
              System.out.println(friend.getTelefonNummer());
          }

    }

    public void setListOfAllContact(ArrayList<Friend> listOfAllContact) {
        this.listOfAllContact = listOfAllContact;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "nameOfModel='" + nameOfModel + '\'' +
                ", nameOfCompany='" + nameOfCompany + '\'' +
                ", listOfAllContact=" + listOfAllContact +
                '}';
    }
}

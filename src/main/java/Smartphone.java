import java.lang.reflect.Array;
import java.util.ArrayList;

public class Smartphone implements GPS, Radio  {


    private String nameOfModel;
    private String nameOfCompany;
    private ArrayList<Contact> listOfAllContact;

    public Smartphone (){

    }

    public Smartphone (String nameOfModel, String nameOfCompany, ArrayList listOfAllContact){

    }

    public void addContact (Contact contact){
       listOfAllContact.add(contact);
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

    public ArrayList<Contact> getListOfAllContact() {
        return listOfAllContact;
    }

    public void setListOfAllContact(ArrayList<Contact> listOfAllContact) {
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

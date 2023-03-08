import java.util.ArrayList;
import java.util.Objects;

public class Smartphone implements GPS, Radio  {


    private String nameOfModel;
    private String nameOfCompany;
    private ArrayList<Friend> listOfAllContact = new ArrayList<>();

    public Smartphone (){

    }

    public Smartphone (String nameOfModel, String nameOfCompany, ArrayList listOfAllContact){

    }

    public void addContact (Friend contact){
        listOfAllContact.add(contact);
    }

    public Friend getContact(int index)  {
        return listOfAllContact.get(index);

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Smartphone that)) return false;

        if (getNameOfModel() != null ? !getNameOfModel().equals(that.getNameOfModel()) : that.getNameOfModel() != null)
            return false;
        if (getNameOfCompany() != null ? !getNameOfCompany().equals(that.getNameOfCompany()) : that.getNameOfCompany() != null)
            return false;
        return Objects.equals(listOfAllContact, that.listOfAllContact);
    }

    @Override
    public int hashCode() {
        int result = getNameOfModel() != null ? getNameOfModel().hashCode() : 0;
        result = 31 * result + (getNameOfCompany() != null ? getNameOfCompany().hashCode() : 0);
        result = 31 * result + (listOfAllContact != null ? listOfAllContact.hashCode() : 0);
        return result;
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

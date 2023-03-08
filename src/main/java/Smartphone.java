import java.util.ArrayList;

public class Smartphone implements GPS, Radio  {


    private String nameOfModel;
    private String nameOfCompany;
    private ArrayList<String> listOfAllContact;

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
}

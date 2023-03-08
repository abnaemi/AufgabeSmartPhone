import java.util.ArrayList;

public class Smartphone implements GPS, Radio  {


    private String nameOfModel;
    private String nameOfCompany;
    private ArrayList<String> listOfAllContact;

    @Override
    public int getPosition() {
        return 0;
    }

    @Override
    public boolean startRadio() {
        return false;
    }

    @Override
    public boolean stopRadio() {
        return false;
    }
}

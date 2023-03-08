public class Friend extends Contact{

    private int telefonNummer;

    public Friend () {

    }

    public Friend (String name, int telefonNummer){
        super(name);
        this.telefonNummer=telefonNummer;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "telefonNummer=" + telefonNummer +
                "} " + super.toString();
    }
}

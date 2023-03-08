public class Friend extends Contact{

    private int telefonNummer;



    public Friend (String name, int telefonNummer){
        super(name);
        this.telefonNummer=telefonNummer;
    }

    public void setTelefonNummer(int telefonNummer) {
        this.telefonNummer = telefonNummer;
    }

    public int getTelefonNummer() {
        return telefonNummer;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "telefonNummer=" + telefonNummer +
                "} " + super.toString();
    }
}

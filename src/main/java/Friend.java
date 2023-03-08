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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Friend friend)) return false;
        if (!super.equals(o)) return false;

        return getTelefonNummer() == friend.getTelefonNummer();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getTelefonNummer();
        return result;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "telefonNummer=" + telefonNummer +
                "} " + super.toString();
    }
}


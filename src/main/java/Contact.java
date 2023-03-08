public abstract class  Contact {
    private String name;
    private int telefonNummer;

    public int getTelefonNummer() {
        return telefonNummer;
    }

    public Contact(){

    }
    public Contact(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }



}

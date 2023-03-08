public abstract class  Contact {
    private String name;


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

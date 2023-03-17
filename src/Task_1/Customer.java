package Task_1;

public class Customer {
    private String firstname;
    private String lastname;
    private String username;
    private int id;
    Customer(String tmpfirstname, String tmplastname, String tmpusername, int tmpid){
        this.firstname = tmpfirstname;
        this.lastname = tmplastname;
        this.username = tmpusername;
        this.id = tmpid;

    }

    public String toString(){
        return firstname +" "+ lastname+ " "+ username+" " + id;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }
}

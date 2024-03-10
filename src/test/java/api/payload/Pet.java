package api.payload;

public class Pet {

    int petID;
    String petname;
    String petStatus;


    public int getPetID(){
        return petID;
    }
    public void setPetID(int petID){
        this.petID = petID;
    }
    public String getPetname(){
        return petname;
    }
    public void setPetname(String petname){
        this.petname = petname;
    }
    public String getPetStatus(){
        return petStatus;
    }
    public void setPetStatus(String petStatus){
        this.petStatus = petStatus;
    }

}

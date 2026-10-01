import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> myBuddies;


    public AddressBook(){
        myBuddies = new ArrayList<>();
    }


    public void addBuddy(BuddyInfo aBuddy){
        if(aBuddy != null){
            myBuddies.add(aBuddy);
        }
    }

    public void removeBuddy(int index){
        if(index >= 0 && index < myBuddies.size()){
            myBuddies.remove(index);
        }
    }



    public static void main(String[] args) {
        BuddyInfo Tom = new BuddyInfo("Tom", "Carleton", "613");
        BuddyInfo Yassein = new BuddyInfo("Yasseins Kndeel", "Cairo", "010400504");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(Tom);
        addressBook.removeBuddy(0);
    }
}








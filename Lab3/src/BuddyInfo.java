public class BuddyInfo {

    private String name;
    private String address;
    private String phone_number;

    public BuddyInfo(){
        this("unknown",  "unknown", "unknown");
    }

    public BuddyInfo(String name,String address, String phone_number){
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone_number(){
        return phone_number;
    }

    @Override
    public String toString() {
        return name + ", " + address + ", " + phone_number;
    }

    static void main() {
        BuddyInfo buddy = new BuddyInfo("Yassein Kndeel", "Ottawa", "55555");
        System.out.println("Hello " + buddy.getName());
    }
}

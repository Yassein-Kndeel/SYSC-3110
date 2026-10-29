import java.util.ArrayList;

    public class AddressBook {

        private ArrayList<BuddyInfo> buddies;

        public AddressBook(){
            buddies = new ArrayList<>();
        }


        public BuddyInfo getBuddy(int index){
            if(index >= buddies.size() || index < 0){
                throw new IndexOutOfBoundsException("Invalid index");
            }

            return buddies.get(index);
        }


        public void addBuddy(BuddyInfo buddy){
            if(buddy == null){
                throw new NullPointerException("Invalid buddy");
            }

            buddies.add(buddy);
        }


        public void removeBuddy(int index) {
            if(index >= buddies.size() || index < 0){
                throw new IndexOutOfBoundsException("Invalid index");
            }
            buddies.remove(index);
        }


        public void removeBuddy(BuddyInfo buddy){
            if(buddy == null){
                throw new NullPointerException("Invalid buddy");
            }

            buddies.remove(buddy);
        }

        public int size(){
            return buddies.size();
        }



        public static void main(String[] args){
            BuddyInfo homer = new BuddyInfo("Homer");
            AddressBook book = new AddressBook();

            book.addBuddy(homer);
            book.removeBuddy(homer);
            System.out.println(book.size());
        }

    }



public class BuddyInfo {

        private String name;

        public BuddyInfo(String name) {
            this.name = name;
        }

        public BuddyInfo(){
            name = "Unknown";
        }

        public String getName() {
            return name;
        }

        public String setName(String name){
            return this.name = name;
        }


        static void main(String[] args) {

            BuddyInfo homer = new BuddyInfo("Homer");
            System.out.print("Hello " +  homer.getName());
        }

    }



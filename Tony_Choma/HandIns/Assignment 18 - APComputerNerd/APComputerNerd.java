 public class APComputerNerd{
        int intelligence; //1-10
        int speed;//1-10
        int performance;//1-10
        private String firstName;

        APComputerNerd(int i,int s, int p, String fN){
             i.setIntelligence();
             s.setSpeed();
             p.setPerformance();
             fN.setFirstName();
       }

//getters and setters for intel
        public int getIntelligence(){
                return intelligence;
        }
        public void setIntelligence(int newIntelligence){
                intelligence = newIntelligence;
        }
//getters and setters for speed
        public int getSpeed(){
                return speed;
        }
        public void setSpeed(int newSpeed){
                speed = newSpeed;
        }
//getters and setters for laptopPerf
        public int getPerformance(){
                return performance;
        }
        public void setPerformance(int newPerformance){
                performance = newPerformance;
        }
//getters and setters for firstName
        public String getFirstName(){
                return firstName;
        }
        public void setFirstName(String newFirstName){
                firstName = newFirstName;
        }
}

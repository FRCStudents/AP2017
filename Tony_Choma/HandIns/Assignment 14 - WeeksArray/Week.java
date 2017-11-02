public class Week{
        String[] weeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        public void printWeeks(){
                for(int i = 0; i < weeks.length; i++){
                        System.out.print(weeks[i]);
                }
        }
        public void printWeeksBackwards(){
                for(int o = weeks.length - 1; o >= 0; o--){
                        System.out.print(weeks[o]);
                }
        }

        public static void main(String[] args){
                Week w = new Week();

                w.printWeeks();
                System.out.println("\n\n");
                w.printWeeksBackwards();
        }
}

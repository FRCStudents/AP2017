public class sundayDriver extends Thread{
        public static void main(String[] args) throws InterruptedException{
                String car = "L-O--O->   ";
                String spaces = " ";
                for (int i = 0; i < 100; i++){
                        spaces += " ";
                        Thread.sleep(200);
                        System.out.print('\r' + spaces + car);
                        }
                }
        }


        /*public static void main(String[] args){
                sundayDriver driver = new sundayDriver;
        }*/

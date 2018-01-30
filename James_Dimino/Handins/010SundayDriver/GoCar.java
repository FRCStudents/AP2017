public class GoCar{
    public static void main(String[] argv){

    String Car_Forward = "\n  ____ \n /  \\_\\_ \n -0--0--";
    String Car_Backward = "\n   ____ \n _/_/  \\ \n --0--0-";

    for(int z = 0; z <= 4; z++){

        for(int b = 0; b <= 80; b++){
            System.out.print("\n");
        }

        System.out.println(Car_Forward);

        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }

        for(int b = 0; b <= 80; b++){
            System.out.print("\n");
        }
            
                System.out.println(Car_Forward.replaceAll("\n", "\n\t"));

                try{
                    Thread.sleep(1000);
                }

                catch(InterruptedException ex){
                    Thread.currentThread().interrupt();
                }

                for(int b = 0; b <= 80; b++){
                    System.out.print("\n");
                }

                        System.out.println(Car_Forward.replaceAll("\n", "\n\t\t"));

                        try{
                            Thread.sleep(1000);
                        }

                        catch(InterruptedException ex){
                            Thread.currentThread().interrupt();
                        }

                        for(int b = 0; b <= 80; b++){
                            System.out.print("\n");
                        }

        System.out.println(Car_Backward.replaceAll("\n", "\n\t\t"));

        try{
            Thread.sleep(1000);
        }

        catch(InterruptedException ex){
            Thread.currentThread().interrupt();
        }

        for(int b = 0; b <= 80; b++){
            System.out.print("\n");
        }

                System.out.println(Car_Backward.replaceAll("\n", "\n\t"));

                try{
                    Thread.sleep(1000);
                }

                catch(InterruptedException ex){
                    Thread.currentThread().interrupt();
                }

                for(int b = 0; b <= 80; b++){
                    System.out.print("\n");
                }

                        System.out.println(Car_Backward);
        }

    }
}



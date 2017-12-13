public class R{
        //public static void main(String[] args){
                int[] arr = new int[10];
                public void array(){
                        for(int i = 0;i<10;i++){
                                arr[i] = i;
                        }

                }
                public void printArr(){
                        for(int x = 0;x<9;x++){
                                System.out.println(arr[x]);
                        }
                }
                public void printArrB(){
                        for(int y = arr.length;y > arr.length;y--){
                                System.out.print(arr[y]);
                        }
                }
                public int printArrR(int n){
                        if(n==0){
                                return n;
                        }
                        System.out.print(arr[n]);

                }
}

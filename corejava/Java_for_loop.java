public class Java_for_loop {
    public static void main(String args[]){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print(j+" "); 
            }
            System.out.println();
        }
        System.out.println("****New loop pattern****");
        for(int i=4;i>=1;i--){
            for(int j=1;j<=4;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("****New loop pattern****");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("* ");
            }
            System.out.println(); 
        }
        System.out.println("****New loop pattern****");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                if(i==j){
                    System.out.print(i+" "); 
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println(); 
        }
        System.out.println("****New loop pattern****");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("****New loop pattern****");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==j || i+j==6){
                    System.out.print("* "); 
                }
                else{
                    System.out.print("- ");
                }
            }
            System.out.println(); 
        }      
    }
}

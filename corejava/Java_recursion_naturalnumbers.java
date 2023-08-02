public class Java_recursion_naturalnumbers {
    public static void main(String[] args){
        natural_recurse(0);
    }

    public static void natural_recurse(int n){
        if(n<10){
            n++;
            System.out.println(n);
            natural_recurse(n);
        }
    }
}

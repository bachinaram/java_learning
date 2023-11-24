import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PreviousInteger {
    public static List<Integer> myPreviousInt(ArrayList<String> words){
        ArrayList<Integer> out = new ArrayList<>(); //[2,1,-1,-1]
        //p,1,2,p,p,4,p,p words i
        //1,2,4 RefIntArray
        //-1,2,1,4,2 output array
        ArrayList<Integer> RefIntegerArray = new ArrayList<>();
        int pointer = -1;
        for(int i=0;i<words.size();i++){
            if("prev".equals(words.get(i))){
                if(pointer<0){
                    out.add(-1);
                }
                else{
                    out.add(RefIntegerArray.get(pointer)); //
                    pointer--;
                }
            }
            else{
                RefIntegerArray.add(Integer.parseInt(words.get(i)));
                pointer=RefIntegerArray.size()-1;
            }
        }

        return out;
    }
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<String>();
        words.add("prev");
        words.add("1");
        words.add("2");
        words.add("prev");
        words.add("prev");
        words.add("4");
        words.add("prev");
        words.add("prev");

        List<Integer> output = myPreviousInt(words);
        System.out.println(output);

    }
}

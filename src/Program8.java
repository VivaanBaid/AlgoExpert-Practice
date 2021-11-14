import java.util.*;

class Program8 {
    public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
        // Write your code here.
        boolean answer = true;
        if(arrayOne.size() != arrayTwo.size()) return false;
        Collections.sort(arrayOne);
        Collections.sort(arrayTwo);
        for(int i = 0; i< arrayOne.size(); i++){
            for(int k =0; k < arrayTwo.size(); k++){
                if(arrayOne.get(i) != arrayTwo.get(k)){
                    answer = false;
                }
            }
        }
        return answer;
    }
}


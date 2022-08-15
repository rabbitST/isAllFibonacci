import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class isFibonacci {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);
        numbers.add(13);
        numbers.add(21);
        numbers.add(34);

        System.out.println(isAllFibonacci(numbers));

        //task2: írjunk egy metodust ami ellenörzi hogy a paraméterként kapott Integer lista összes eleme Fibonachi
        // szám e (0, 1, 1, 2, 3, 5, 8, 13, 21,)
    }
    private static boolean isAllFibonacci(List < Integer > numbers) {
        ArrayList<Integer> fibList=new ArrayList<>();
        fibList.add(0); fibList.add(1);
        int i=1;
        while(fibList.get(i-1)<Collections.max(numbers)){
            if(i>1){
                fibList.add(fibList.get(i-2)+fibList.get(i-1));
            }
            i++;
        }
        for(int e:numbers){
            if (!fibList.contains(e))
                return false;
        }
        return true;
    }
}
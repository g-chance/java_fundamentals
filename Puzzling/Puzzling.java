import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Puzzling {
    public ArrayList<Integer> sumAndGreaterThan10() {
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        int sum = 0;
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        for(int val : arr) {
            sum += val;
            if(val > 10) {
                newArr.add(val);
            }
        }
        System.out.println(sum);
        return newArr;
    }
    public ArrayList<String> shuffleAndRtGrT5() {
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));
        Collections.shuffle(arr);
        System.out.println(arr);
        ArrayList<String> newArr = new ArrayList<String>();
        for(String val : arr) {
            if(val.length() > 5) {
                newArr.add(val);
            // }
            }
        }
        return newArr;
    }
    public void alphabet() {
        ArrayList<Character> arr = new ArrayList<Character>();
        for(char i ='a';i<='z';i++) {
            arr.add(i);
        }
        Collections.shuffle(arr);
        System.out.println(arr.get(25));
        char v = arr.get(0);
        System.out.println(v);
        if(v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
            System.out.println("First letter is a vowel");
        }
    }
    public ArrayList<Integer> randNum55To100() {
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<10;i++) {
            arr.add(random.nextInt(46)+55);
        }
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.get(arr.size()-1));
        return arr;
    }
    public void randomString() {
        ArrayList<Character> arr = new ArrayList<Character>();
        ArrayList<String> strArr = new ArrayList<String>();
        for(char i ='a';i<='z';i++) {
            arr.add(i);
        }
        for(int j=0;j<10;j++) {
            String rand = "";
            Collections.shuffle(arr);
            for(int i=0;i<5;i++) {
                rand += arr.get(i);
            }
            strArr.add(rand);
        }
        System.out.println(strArr);
    }
}
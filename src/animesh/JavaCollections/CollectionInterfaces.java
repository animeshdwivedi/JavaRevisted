package animesh.JavaCollections;


import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.*;

class HashMapImplementation {
    private final Map<Integer, Boolean> numberMap;
    HashMapImplementation() {
        numberMap = new HashMap<>();
    }

    void findPair(int[] arrayList, int targetSum) {
        boolean pairFound = false;
        for(int num: arrayList) {
            int matchNum = targetSum - num;
            if(numberMap.containsKey(matchNum)) {
                pairFound = true;
                out.println("Pair : " + num + " " + matchNum);
            } else {
                numberMap.put(num, true);
            }
        }
        if(!pairFound) {
            out.println("Pair not found");
        }
    }
}


class CollectionInterfaces {

    public static void main(String[] args) {
        HashMapImplementation implementation = new HashMapImplementation();
        Scanner sc = new Scanner(in);
        out.println("HashMap implementation");
        out.println("Enter Array Size: ");
        int arraySize = sc.nextInt();
        out.println("Enter Array Elements : ");
        int[] arrayList = new int[arraySize];
        for(int i = 0; i < arraySize; i++) {
            arrayList[i] = sc.nextInt();
        }
        out.println("Enter Target Sum : ");
        int targetSum = sc.nextInt();
        implementation.findPair(arrayList, targetSum);
        sc.close();


    }

}

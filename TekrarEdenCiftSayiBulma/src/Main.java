import java.util.*;

public class Main {

    static boolean find(int [] array, int value){

        for (int i:array){
            if (i==value){return true;}

        }
            return false;
    }

    public static void main(String[] args) {

        int [] list = {8,1,2,3,4,3,5,6,7,7,8,9,10,10,11,7,12,13,14,14};
        int [] repeat = new int[list.length];
        int start=0;
                for(int i=0;i< list.length;i++){


                    for (int j=0;j<list.length;j++){

                        if((i != j) && list[i] == list[j] && list[j]%2==0) {

                            if (!find(repeat,list[i])){
                                repeat[start++] = list[i];}

                            break;

                        }

                    }

                }
        System.out.println(Arrays.toString(repeat));
    }
}
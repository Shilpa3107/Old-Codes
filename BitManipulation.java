import java.util.*;
public class BitManipulation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //get bit
        int n1 = 5;
        int pos1 = 3;
        int BitMask1 = 1<<pos1;
        if((BitMask1 | n1)==0)
        System.out.println("Get bit : Bit was zero");
        else
        System.out.println("Get bit : Bit was one");
        //set bit
        int n2 =5;
        int pos2=1;
        int BitMask2 = 1<<pos2;
        int newno2 = BitMask2|n2;
        System.out.println("Set bit : "+newno2);
        //clear bit
        int n3 =5;
        int pos3 = 2;
        int BitMask3 = 1<<pos3;
        int notbit = ~(BitMask3);
        int newno3 = notbit&n3;
        System.out.println("Clear bit : "+newno3);
        //update bit
        int n4 = 5;
        int pos4 = 1;
        int bitmask4 = 1<<pos4;
         int oper = sc.nextInt();
        if(oper==1){
        int newno = bitmask4|n4;
        System.out.println("Update bit : "+newno);
        }
        else {//oper==0
            int notbit4 = ~bitmask4;
            int newno = notbit4&n4;
            System.out.println("Update bit : "+newno);
        }

    }
}

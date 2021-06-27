package p;
import p1.*;
import p2.*;
public class Main2 {
    public static void main(String[] args){
        TwoDim ref;
        ref = new TwoDim(1,2);
        System.out.println(ref);
        ref = new ThreeDim(3,4,5);
        System.out.println(ref);
    }
}

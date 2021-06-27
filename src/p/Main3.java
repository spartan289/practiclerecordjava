package p;
import java.io.*;
import p1.*;
import p2.*;
import p3.*;

public class Main3 {
    static int getshapeType() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Shape Type");
        System.out.println("(1) Rectangle (2) Circle");
        return Integer.parseInt(br.readLine());
    }
    public static void main(String[] args) throws IOException{
        Shape ref;
        boolean flag = false;
        while (!flag) {
            switch(getshapeType()) {
                case 1:
                    flag = true;
                    ref = new Rectangle();
                    System.out.println("Area: "+  ref.area()+"sq units");
                    break;
                case 2:
                    flag = true;
                    ref = new Circle();
                    System.out.println("Area: "+ ref.area()+"sq unit");
                    break;
                default:
                    System.err.println("Invalid Option");
                    break;
            }
        }
    }
}

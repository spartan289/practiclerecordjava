package p2;
import java.io.*;
import p1.*;
public class Rectangle extends Shape{
    private double length;
    private double breadth;
    protected void getData() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Length of Rectange: ");
        length = Double.parseDouble(br.readLine());

        System.out.print("Enter Breadth of Rectange: ");
        breadth = Double.parseDouble(br.readLine());
    }

    public  double area() throws IOException{
        getData();
        return length*breadth;
    }
}

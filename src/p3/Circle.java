package p3;
import java.io.*;
import p1.*;
public class Circle extends Shape{
    private double radius;
    @Override
    protected void getData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        radius = Double.parseDouble(br.readLine());
    }

    @Override
    public double area() throws IOException {
        getData();
        System.out.print("Enter radius: ");
        return Math.PI*radius*radius;
    }
}

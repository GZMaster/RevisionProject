package ExamRevision;

import java.*;
import java.util.*;
import java.lang.*;

public class ShapesClass {

    public static void main(String[] args){

        float parameterOfTriangle = parameterTriangle(10, 15, 20);
        float areaOfTriangle = areaTriangle(12, 21);
        float circumferenceOfCircle = circumferenceCircle(21);
        float areaOfCircle = areaCircle(12);

        System.out.println("The parameter of the triangle is " + parameterOfTriangle);
        System.out.println("The area of the triangle is " + areaOfTriangle);
        System.out.println("The circumference of the circle is " + circumferenceOfCircle);
        System.out.println("The area of the circle is " + areaOfCircle);

    }

    public static float parameterTriangle(int a, int b, int c){
        float paramTriangle = a + b + c;
        return paramTriangle;
    }

    public static float areaTriangle(int b, int h){
        float areaTriangle = (b * h)/2;
        return areaTriangle;
    }

    public static float circumferenceCircle(int r){
        float circumferenceCircle = (float)(Math.PI * r*2);
        return circumferenceCircle;
    }

    public static float areaCircle(int r){
        float areaCircle = (float)(Math.PI * r*r);
        return areaCircle;
    }

}

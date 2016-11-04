package fh.java.geometry;

import com.sun.org.apache.xpath.internal.SourceTree;
import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.trilateral.RightTriangle;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
		//TODO: main() is missing

    public static void main(String[] args) {
        Main main = new Main();
        main.doIt();
    }

    public void doIt(){
        List<GeometricShape> shapeList = new ArrayList<>();
        fillList(shapeList);
        printList(shapeList);


    }

    public void fillList(List<GeometricShape> shapeList) {

        shapeList.add(new Circle(0,0,2.5));
        shapeList.add(new Circle(1,1,3));
        shapeList.add(new Circle(2,2,4));

        shapeList.add(new Rectangle(0,0,4.0,6.0));


    }


    public void printList(List<GeometricShape> shapeList) {
		//TODO: Implement

        System.out.println("---------------FOR LOOP-----------------");
        for(int pos = 0; pos<shapeList.size();pos++){
            System.out.println(shapeList.get(pos));
        }

        System.out.println("-----------------FOR EACH---------------");
        for (GeometricShape shape : shapeList) {
            System.out.println(shape);
        }

        System.out.println("---------------STREAM 1---------------- ");
        shapeList.stream().forEach(shape -> System.out.println(shape));

        System.out.println("---------------STREAM 2-----------------");
        shapeList.stream().forEach(System.out ::println);
    }

}

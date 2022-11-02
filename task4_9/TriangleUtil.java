package task4_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TriangleUtil {

    public TriangleUtil() {

    }
    public static double getSquare(Triangle triangle) {

        return ((triangle.getA().getX() - triangle.getC().getX()) *
                (triangle.getB().getY() - triangle.getC().getY()) - (triangle.getB().getX() - triangle.getC().getX()) *
                (triangle.getA().getY() - triangle.getC().getY())) / 2;
    }

    //ксть рівносторонніх
    public static int getQuantityEquilateral(List<Triangle> triangles) {
        int equilateral = 0;
        for (Triangle triangle : triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(), "равносторонний")) {
                equilateral++;
            }
        }
        return equilateral;
    }

    //ксть рівнобедрених
    public static int getQuantityIsosceles(List<Triangle> triangles) {
        int isosceles = 0;
        for (Triangle triangle : triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(), "равнобедренный")) {
                isosceles++;
            }
        }
        return isosceles;
    }

    //ксть прямокутних
    public static int getQuantityRectangular(List<Triangle> triangles) {
        int rectangular = 0;
        for (Triangle triangle : triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(), "прямоугольный")) {
                rectangular++;
            }
        }
        return rectangular;
    }


    //ксть довільних
    public static int intgetQuantityArbitrary(List<Triangle> triangles) {
        int arbitrary = 0;
        for (Triangle triangle : triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(), "произвольный")) {
                arbitrary++;
            }
        }
        return arbitrary;
    }

    public static List<Triangle> findEquilateral(List<Triangle> triangles){
        List<Triangle> results = new ArrayList<>();
        for (Triangle triangle: triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(),"равносторонний")){
                results.add(triangle);
            }
        }
        return results;
    }

    public static List<Triangle> findIsosceles(List<Triangle> triangles){
        List<Triangle> results = new ArrayList<>();
        for (Triangle triangle: triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(),"равнобедренный")){
                results.add(triangle);
            }
        }
        return results;
    }

    public static List<Triangle> findRectangular(List<Triangle> triangles){
        List<Triangle> results = new ArrayList<>();
        for (Triangle triangle: triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(),"прямоугольный")){
                results.add(triangle);
            }
        }
        return results;
    }

    public static List<Triangle> findArbitrary(List<Triangle> triangles){
        List<Triangle> results = new ArrayList<>();
        for (Triangle triangle: triangles) {
            if (Objects.equals(triangle.getTypeOfTriangle(),"произвольный")){
                results.add(triangle);
            }
        }
        return results;
    }

    public static List<Triangle> findTrianglWithMaxSquare(List<Triangle> triangles){
        List<Triangle> results = new ArrayList<>();
        double max = 0.0;
        for (Triangle triangle : triangles) {
            if (getSquare(triangle) > max) {
                max = getSquare(triangle);
            }
        }

        for (Triangle triangle : triangles) {
            if (getSquare(triangle) == max) {
                results.add(triangle);
            }
        }
        return results;
    }

    public static List<Triangle> findTriangWithMinSquare(List<Triangle> triangles){
        List<Triangle> results = new ArrayList<>();
        double min = 2000000.0;
        for (Triangle triangle : triangles) {
            if (getSquare(triangle) < min) {
                min = getSquare(triangle);
            }
        }
        for (Triangle triangle : triangles) {
            if (getSquare(triangle) == min) {
                results.add(triangle);
            }
        }
        return results;
    }

}
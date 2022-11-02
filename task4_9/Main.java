package task4_9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Triangle> triangles = createTriangles();

        int equilateral = TriangleUtil.getQuantityEquilateral(triangles);
        System.out.println("Equilateral Triangles:" + equilateral);

        int isosceles = TriangleUtil.getQuantityIsosceles(triangles);
        System.out.println("Isosceles triangles: " + isosceles);

        int rectangular = TriangleUtil.getQuantityRectangular(triangles);
        System.out.println("Right triangles: " + rectangular);

        int arbitrary = TriangleUtil.intgetQuantityArbitrary(triangles);
        System.out.println("Arbitrary triangles:" + arbitrary);

        List<Triangle> equil = TriangleUtil.findEquilateral(triangles);
        List<Triangle> equilMax = TriangleUtil.findTrianglWithMaxSquare(equil);
        double equilMaxS = TriangleUtil.getSquare(equilMax.get(0));
        System.out.print("Maximum area of equilateral triangles: ");
        System.out.format("%-10.2f", equilMaxS);
        System.out.println(" in triangles: " + equilMax);
        List<Triangle> equilMin = TriangleUtil.findTriangWithMinSquare(equil);
        double equilMinS = TriangleUtil.getSquare(equilMin.get(0));
        System.out.print("Minimum area for equilateral triangles: ");
        System.out.format("%-10.2f", equilMinS);
        System.out.println(" in triangles:  " + equilMin);

        List<Triangle> isos = TriangleUtil.findIsosceles(triangles);
        List<Triangle> isosMax = TriangleUtil.findTrianglWithMaxSquare(isos);
        double isosMaxS = TriangleUtil.getSquare(isosMax.get(0));
        System.out.print("Maximum area of isosceles triangles: ");
        System.out.format("%-10.2f", isosMaxS);
        System.out.println(" in triangles:  " + isosMax);
        List<Triangle> isosMin = TriangleUtil.findTriangWithMinSquare(isos);
        double isosMinS = TriangleUtil.getSquare(isosMin.get(0));
        System.out.print("Minimum area for isosceles triangles: ");
        System.out.format("%-10.2f", isosMinS);
        System.out.println(" in triangles:  " + isosMax);

        List<Triangle> rectang = TriangleUtil.findRectangular(triangles);
        List<Triangle> rectangMax = TriangleUtil.findTrianglWithMaxSquare(rectang);
        double rectangMaxS = TriangleUtil.getSquare(rectangMax.get(0));
        System.out.print("Maximum area for right triangles: ");
        System.out.format("%-10.2f", rectangMaxS);
        System.out.println(" in triangles:  " + rectangMax);
        List<Triangle> rectangMin = TriangleUtil.findTriangWithMinSquare(rectang);
        double rectangMinS = TriangleUtil.getSquare(rectangMin.get(0));
        System.out.print("Minimum area for right triangles: ");
        System.out.format("%-10.2f", rectangMinS);
        System.out.println(" in triangles:  " + rectangMin);

        List<Triangle> arbitr = TriangleUtil.findArbitrary(triangles);
        List<Triangle> arbitrMax = TriangleUtil.findTrianglWithMaxSquare(arbitr);
        double arbitrMaxS = TriangleUtil.getSquare(arbitrMax.get(0));
        System.out.print("Maximum area for arbitrary triangles: ");
        System.out.format("%-10.2f", arbitrMaxS);
        System.out.println(" in triangles:  " + arbitrMax);
        List<Triangle> arbitrMin = TriangleUtil.findTriangWithMinSquare(arbitr);
        double arbitrMinS = TriangleUtil.getSquare(arbitrMin.get(0));
        System.out.print("Minimum area for arbitrary triangles: ");
        System.out.format("%-10.2f", arbitrMinS);
        System.out.println(" in triangles:  " + arbitrMin);
    }

    public static List<Triangle> createTriangles(){
        List<Triangle> triangles = new ArrayList<>();
        triangles.add(new Triangle(new Point(250.,90.) ,new Point(180., 90.), new Point(215., 29.38), "equilateral"));
        triangles.add(new Triangle(new Point(270.,230.) ,new Point(197.25, 272.), new Point(197.25, 188.), "equilateral"));
        triangles.add(new Triangle(new Point(260.93,317.5) ,new Point(260.93, 422.5), new Point(170.0, 370.), "equilateral"));
        triangles.add(new Triangle(new Point(140.,80.) ,new Point(50., 120.), new Point(50., 40.), "isosceles"));
        triangles.add(new Triangle(new Point(140.,230.) ,new Point(50., 310.), new Point(50., 150.), "isosceles"));
        triangles.add(new Triangle(new Point(50.,350.) ,new Point(140., 370.), new Point(50., 390.), "isosceles"));
        triangles.add(new Triangle(new Point(270.,510.) ,new Point(160., 580.), new Point(160., 510.), "Right"));
        triangles.add(new Triangle(new Point(160.,640.) ,new Point(240., 640.), new Point(240., 710.), "Right"));
        triangles.add(new Triangle(new Point(260.,820.) ,new Point(160., 820.), new Point(160., 770.), "Right"));
        triangles.add(new Triangle(new Point(32.56,542.38) ,new Point(97.51, 495.85), new Point(115.22, 554.19), "arbitrary"));
        triangles.add(new Triangle(new Point(39.2,631.72) ,new Point(129.98, 704.83), new Point(54.7, 727.72), "arbitrary"));
        return triangles;
    }
}
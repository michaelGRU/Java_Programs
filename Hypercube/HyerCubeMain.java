package hyercube;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *
 * @author michaelGRU
 * The program returns the position in space of 2-4D cubes. 
 * The hypercube is built using squares and cubes. 
 * 2-cube vertex 4 edge 4 face 1
 * 3-cube vertex 8 edge 12 face 6 cell 1
 * 4-cube vertex 16 edge 32 face 24 cell 8 4-face 1
 * 
 */
public class HyerCubeMain {
    final static int INITIAL = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int length = 3;
        int width = 5;
        int height = 4;
        int trength = 2; /*the 4th spatial dimension*/

        Square sqr = new Square(length, width);
        Cube cube = new Cube(height, sqr);
        Tesseract tess = new Tesseract(trength, cube);

        try (PrintWriter print = new PrintWriter(new File("hyperCube.txt"));) {

            print.println("**********************2D**********************");
            print.println("The area of the 2D cube is " + sqr.getArea() + " L^2");
            print.println(sqr);
            print.println(Arrays.deepToString(sqr.getPosition()) + "\n");
            print.println("**********************3D**********************");
            print.println("The volume of the 3D cube is " + cube.getVolume() + " L^3");
            print.println(cube);
            print.println(Arrays.deepToString(cube.getPosition()) + "\n");
            print.println("**********************4D**********************");
            print.println("The hyper-volume of the 4D cube is " + tess.getHyperVolume() + " L^4");
            print.println(tess);
            /*
            Superimposing trength on any of the previous dimensions gives an object 
            in the subsequent dimensions a trength of 0, or a value that is infinitely small.
             */
            print.println(Arrays.deepToString(tess.getPosition()) + "\n");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

}

package hyercube;

import static hyercube.HyerCubeMain.INITIAL;

/**
 *
 * @author michaelGRU
 */
public class Tesseract {

    private int trength;
    private Cube cube;
    

    public Tesseract() {
        
        this.trength = 1;
        this.cube = new Cube();
    }

    public Tesseract(int trength, Cube cube) {
       
        this.trength = trength;
        this.cube = new Cube(cube.getHeight(), cube.getSquare());
    }

    public Tesseract(Tesseract obj) {
        
        this.trength = obj.trength;
        this.cube = new Cube(obj.cube);
    }

    public int getTrength() {
        return trength;
    }

    public void setTrength(int trength) {
        this.trength = trength;
    }

    public Cube getCube() {
        return cube;
    }

    public void setCube(Cube cube) {
        this.cube = new Cube(cube.getHeight(), cube.getSquare());
    }

    public int getHyperVolume() {
        return trength * cube.getVolume();
    }

    public int[][] getPosition() {
        int[][] position = new int[16][4];
        
        
        /*
        Superimposing trength on any of the previous dimensions gives an object 
        in the subsequent dimensions a trength of 0, or a value that is infinitely small.
        */
        position[0][0] = INITIAL;
        position[0][1] = INITIAL;
        position[0][2] = INITIAL;
        position[0][3] = INITIAL;
        
        position[1][0] = INITIAL;
        position[1][1] = cube.getLength();
        position[1][2] = INITIAL;
        position[1][3] = INITIAL;
        
        position[2][0] = cube.getWidth();
        position[2][1] = cube.getLength();
        position[2][2] = INITIAL;
        position[2][3] = INITIAL;
        
        position[3][0] = cube.getWidth();
        position[3][1] = INITIAL;
        position[3][2] = INITIAL;
        position[3][3] = INITIAL;
        
        position[4][0] = INITIAL;
        position[4][1] = INITIAL;
        position[4][2] = cube.getHeight();
        position[4][3] = INITIAL;
        
        position[5][0] = INITIAL;
        position[5][1] = cube.getLength();
        position[5][2] = cube.getHeight();
        position[5][3] = INITIAL;
        
        position[6][0] = cube.getWidth();
        position[6][1] = cube.getLength();
        position[6][2] = cube.getHeight();
        position[6][3] = INITIAL;
        
        position[7][0] = cube.getWidth();
        position[7][1] = INITIAL;
        position[7][2] = cube.getHeight();
        position[7][3] = INITIAL;
        
        position[8][0] = INITIAL;
        position[8][1] = INITIAL;
        position[8][2] = INITIAL;
        position[8][3] = this.trength;
        
        position[9][0] = INITIAL;
        position[9][1] = cube.getLength();
        position[9][2] = INITIAL;
        position[9][3] = this.trength;
        
        position[10][0] = cube.getWidth();
        position[10][1] = cube.getLength();
        position[10][2] = INITIAL;
        position[10][3] = this.trength;
        
        position[11][0] = cube.getWidth();
        position[11][1] = INITIAL;
        position[11][2] = INITIAL;
        position[11][3] = this.trength;
        
        position[12][0] = INITIAL;
        position[12][1] = INITIAL;
        position[12][2] = cube.getHeight();
        position[12][3] = this.trength;
        
        position[13][0] = INITIAL;
        position[13][1] = cube.getLength();
        position[13][2] = cube.getHeight();
        position[13][3] = this.trength;
        
        position[14][0] = cube.getWidth();
        position[14][1] = cube.getLength();
        position[14][2] = cube.getHeight();
        position[14][3] = this.trength;
        
        position[15][0] = cube.getWidth();
        position[15][1] = INITIAL;
        position[15][2] = cube.getHeight();
        position[15][3] = this.trength;
        
        
       
        
        return position;
    }

    public String toString() {
        return cube + " trength: " + trength;
    }

}


package hyercube;

import static hyercube.HyerCubeMain.INITIAL;

/**
 *
 * @author michaelGRU
 */
public class Cube {
    private int height;
    private Square square;
   
    
    public Cube(){
        this.height = 1;
        this.square = new Square();
    }
    
    public Cube(int height, Square square){
        this.height = height;
        this.square = new Square(square.getLength(), square.getWidth());
    }
    
    
    public Cube(Cube obj){
        this.height = obj.height;
        this.square = new Square(obj.square);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = new Square(square.getLength(), square.getWidth());
    }
    
    public int getLength(){
        return this.square.getLength();
    }
    public int getWidth(){
        return this.square.getWidth();
    }
    
    
    
    public int getVolume(){
        return this.height * square.getArea();
    }
    
    public int[][] getPosition(){
        int[][] position = new int[8][3];
        position[0][0] = INITIAL;
        position[0][1] = INITIAL;
        position[0][2] = INITIAL;
        
        position[1][0] = INITIAL;
        position[1][1] = this.square.getLength();
        position[1][2] = INITIAL;
        
        position[2][0] = this.square.getWidth();
        position[2][1] = this.square.getLength();
        position[2][2] = INITIAL;
        
        position[3][0] = this.square.getWidth();
        position[3][1] = INITIAL;
        position[3][2] = INITIAL;
        
        position[4][0] = INITIAL;
        position[4][1] = INITIAL;
        position[4][2] = this.height;
        
        position[5][0] = INITIAL;
        position[5][1] = this.square.getLength();
        position[5][2] = this.height;
        
        position[6][0] = this.square.getWidth();
        position[6][1] = this.square.getLength();
        position[6][2] = this.height;
        
        position[7][0] = this.square.getWidth();
        position[7][1] = INITIAL;
        position[7][2] = this.height;
        return position;
    }
    

    public String toString(){
        return square + "height: " + height;
    }
    
    
}

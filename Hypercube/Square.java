package hyercube;

import static hyercube.HyerCubeMain.INITIAL;

/**
 *
 * @author michaelGRU
 */
public class Square {
    private int length;
    private int width;
    
    
    public Square(){
        this.length = 1;
        this.width = 1;
    }
    public Square(int length, int width){
        this.length = length;
        this.width = width;
    }
    /* copy constructor */
    public Square(Square obj){
        this.length = obj.length;
        this.width = obj.width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getArea(){
        return length*width;
    }
    
    public String toString(){
        return "length: " + length + " width: " + width + " ";
    }
    
    public int[][] getPosition(){
        int[][] position = new int[4][2];
        position[0][0] = INITIAL;
        position[0][1] = INITIAL; 
        
        position[1][0] = INITIAL;
        position[1][1] = this.length;
        
        position[2][0] = this.width;
        position[2][1] = this.length;
        
        position[3][0] = this.width;
        position[3][1] = INITIAL;
        
        return position;
    }
    
    public boolean equals(Square obj){
        if(this.length == obj.length && this.width == obj.width){
            return true;
        }
        return false;
    }
    
}

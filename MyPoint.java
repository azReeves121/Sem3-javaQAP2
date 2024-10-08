public class MyPoint{

private int x;
private int y;

public MyPoint(int x, int y){
    this.x= x;
    this.y =y;
}

public int getX(){
    return x;
}

public void sexX(int x){
    this.x= x;
}
public int getY(){
    return x;
}

public void sexY(int y){
    this.y= y;
}

public void setXY(int x,int y ){
    this.x= x;
    this.y=x;
}

public String toString() {
    return "(" + x + ", " + y + ")";
} 

public double distance(MyPoint another) {
    return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
}
    
}

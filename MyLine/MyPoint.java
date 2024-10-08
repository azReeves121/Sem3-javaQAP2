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

public void setX(int x){
    this.x= x;
}
public int getY(){
    return x;
}

public void setY(int y){
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
    int xDiff = this.x - another.x;
    int yDiff = this.y - another.y;
    return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
}

}

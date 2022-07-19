public class Rectangle {

    int length;
    int width;

    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }

   int calculateArea(){
        int square =length*width;
    return square;
    }

    int calculatePerimeter(){
        int perimeter=2*(length+width);
        return perimeter;
    }
}

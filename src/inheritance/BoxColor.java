package inheritance;

public class BoxColor extends BoxPrice {
    String color;

    BoxColor(){
        this.color=null;
    }

    BoxColor(double l, double h, double w, double weight, double cost, String color){
        super(l, h, w, weight, cost);
        this.color=color;
    }
}

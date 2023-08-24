package DesignPatternAug2023.Creational.Prototype;

public class GraphicalTool {


    Graphic prototype;


    public GraphicalTool(Graphic prototype) {
        this.prototype = prototype;
    }


    public void setPrototype(Graphic prototype) {
        this.prototype = prototype;
    }

    public Graphic createGraphic() {
        return prototype.clone();
    }
}

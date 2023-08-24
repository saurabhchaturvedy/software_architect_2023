package DesignPatternAug2023.Creational.Prototype;

public class DesignExecutor {


    public static void main(String[] args) {

        Image image = new Image();
        image.setURL("https://abc.com");


        System.out.println("Image URL " + image.getURL());

        GraphicalTool graphicalTool = new GraphicalTool(image);
        Graphic graphic = graphicalTool.createGraphic();

        System.out.println("Prototype image URL : " + graphic.getURL());
    }
}

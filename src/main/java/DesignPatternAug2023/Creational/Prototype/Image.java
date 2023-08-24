package DesignPatternAug2023.Creational.Prototype;

public class Image extends Graphic {

    public String url;
    @Override
    public Graphic clone() {

        Image image = new Image();
        image.setURL(this.url);
        return image;
    }

    @Override
    public String getURL() {
        return url;
    }

    public void setURL(String url)
    {
        this.url=url;
    }
}

package DesignPatternAug2023.Creational.Prototype;

public class Video extends Graphic {

    public String url;

    @Override
    public Graphic clone() {
        Video video = new Video();
        video.setURL(this.url);
        return video;
    }

    @Override
    public String getURL() {
        return url;
    }


    public void setURL(String url) {
        this.url = url;
    }

}

package ro.uvt.services;

public class JPGImageLoader implements ImageLoader{

    private String imageName;

    public JPGImageLoader(String imageName)
    {
        this.imageName = imageName;
    }

    public void loadImage(String str) {
        // TODO Auto-generated method stub
        System.out.println("Loaded Image: " + str);
    }
    
}

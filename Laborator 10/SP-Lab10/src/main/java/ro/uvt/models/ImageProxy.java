package ro.uvt.models;

import lombok.NoArgsConstructor;
import ro.uvt.services.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@NoArgsConstructor
public class ImageProxy extends Element implements Picture,Visitee{
    private String url;

    @OneToOne
    private Dimension dim = new Dimension(300, 300);
    @OneToOne
    private Image img;

    @Id
    @GeneratedValue
    private Long id;

    public ImageProxy(String url) {
        this.url = url;
    }

    public Image loadImage() {
        if(this.img==null)
        {
            this.img = new Image(url);
        }
        return this.img;
    }

    public String getUrl() {
        return url;
    }

    public Dimension getDim() {
        return dim;
    }

    @Override
    public String url() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Dimension dim() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public void add(Element element) throws Exception {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(Element element) {
        // TODO Auto-generated method stub
        
    }

    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }
}

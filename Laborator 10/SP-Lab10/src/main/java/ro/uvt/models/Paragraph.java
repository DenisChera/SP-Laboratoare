package ro.uvt.models;

import lombok.NoArgsConstructor;
import ro.uvt.services.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Paragraph extends Element implements Visitee{
    private String text;

    @ManyToOne
    private AlignStrategy align;

    @Id
    @GeneratedValue
    private Long id;

    public Paragraph(String text) {
        this.text = text;
    }

    public void add(Element element) {
        //later
    }

    public void setAlignStrategy(AlignStrategy align) {
        this.align = align;
    }

    public void remove(Element element) {
        //later
    }

    public String getText() {
        return text;
    }

    public AlignStrategy getAlignStrategy() {
        return align;
    }

    public void setAlign(AlignStrategy align) {
        this.align = align;
    }


    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
}

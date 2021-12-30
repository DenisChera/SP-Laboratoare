package ro.uvt.models;

import lombok.NoArgsConstructor;
import ro.uvt.services.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
public class Table extends Element implements Visitee{
    private String title;

    @Id
    @GeneratedValue
    private Long id;

    public Table(String title){
        this.title = title;
    }

    public void add(Element element) {
        //later
    }

    public void remove(Element element) {
        //later
    }

    public boolean find(Element element) {
        if (!(element instanceof Table))
            return false;
        else {
            return ((Table) element).title.equals(this.title);
        }
    }

    public Element clone() {
        Table newtable = new Table(this.title);
        return newtable;
    }

    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Table with Title" + this.title);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}

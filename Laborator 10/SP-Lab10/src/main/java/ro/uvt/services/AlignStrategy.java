package ro.uvt.services;

import ro.uvt.models.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class AlignStrategy {
//    @Id
    private long id;
    void render(Paragraph paragraph, Context context){

    }
    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}

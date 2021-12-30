package ro.uvt.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
public class Dimension{
    private int height;
    private int width;

    @Id
    @GeneratedValue
    private Long id;

    public Dimension(int height, int width) {
        this.height = height;
        this.width = width;
    }
    

    public int getHeight() {
        return height;
    }


    public int getWidth() {
        return width;
    }


    public void println() {
        System.out.println("H: " + height + " W: " + width);
    }
}
package ro.uvt.services;

import ro.uvt.models.Context;
import ro.uvt.services.AlignStrategy;

public class AlignRight implements AlignStrategy {

    public void render(String paragraph, Context c){
        System.out.println("+++++"+paragraph);
    }
}

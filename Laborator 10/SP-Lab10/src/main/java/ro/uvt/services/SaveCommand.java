package ro.uvt.services;

import ro.uvt.models.*;


public class SaveCommand implements Command{
    private Section section;

    public SaveCommand(Section section) {
        this.section = section;
    }
    
    public void execute() throws Exception {
        this.section.add(new Paragraph("Ceva!"));

        DocumentManager.getInstance().getBook().addContent(this.section);
    }
}

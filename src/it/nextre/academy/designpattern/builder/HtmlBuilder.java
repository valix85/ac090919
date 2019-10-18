package it.nextre.academy.designpattern.builder;

public class HtmlBuilder {

    private String page="";
    //check data
    String titolo;

    private HtmlBuilder(String titolo){
        this.titolo=titolo;
        page+="<!DOCTYPE html>\n" +
                "<html lang=\"it\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
                "    <title>"+this.titolo+"</title>\n" +
                "</head>\n" +
                "<body>";
    }

    public static HtmlBuilder getBuilder(String titolo){
        if (titolo==null)
            throw new RuntimeException("Titolo can't be null!");
        return new HtmlBuilder(titolo.trim());
    }

    public HtmlBuilder addP(String text){
        page+="<p>"+text+"</p>";
        return this;
    }

    public HtmlBuilder addH(int valore, String titolo){
        page+="<h"+valore+">"+titolo+"</h"+valore+">";
        return this;
    }

    public String getPage(){
        //attivo i check
        if (titolo == null || titolo.length()==0)
            throw new RuntimeException("Invalid value in HtmlBuilder");

        return page+"</body></html>";
    }

}//end class

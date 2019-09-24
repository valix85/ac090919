package it.nextre.academy.myutils;

import it.nextre.academy.basi.eccezioni.IllegalParamsException;

import java.awt.*;
import java.util.Random;

public class DummyData {

    private static final String[] names = {"Abigail","Alexandra","Alison","Amanda","Amelia","Amy","Andrea","Angela","Anna","Anne","Audrey","Ava","Bella","Bernadette","Carol","Caroline","Carolyn","Chloe","Claire","Deirdre","Diana","Diane","Donna","Dorothy","Elizabeth","Ella","Emily","Emma","Faith","Felicity","Fiona","Gabrielle","Grace","Hannah","Heather","Irene","Jan","Jane","Jasmine","Jennifer","Jessica","Joan","Joanne","Julia","Karen","Katherine","Kimberly","Kylie","Lauren","Leah","Lillian","Lily","Lisa","Madeleine","Maria","Mary","Megan","Melanie","Michelle","Molly","Natalie","Nicola","Olivia","Penelope","Pippa","Rachel","Rebecca","Rose","Ruth","Sally","Samantha","Sarah","Sonia","Sophie","Stephanie","Sue","Theresa","Tracey","Una","Vanessa","Victoria","Virginia","Wanda","Wendy","Yvonne","Zoe","Adam","Adrian","Alan","Alexander","Andrew","Anthony","Austin","Benjamin","Blake","Boris","Brandon","Brian","Cameron","Carl","Charles","Christian","Christopher","Colin","Connor","Dan","David","Dominic","Dylan","Edward","Eric","Evan","Frank","Gavin","Gordon","Harry","Ian","Isaac","Jack","Jacob","Jake","James","Jason","Joe","John","Jonathan","Joseph","Joshua","Julian","Justin","Keith","Kevin","Leonard","Liam","Lucas","Luke","Matt","Max","Michael","Nathan","Neil","Nicholas","Oliver","Owen","Paul","Peter","Phil","Piers","Richard","Robert","Ryan","Sam","Sean","Sebastian","Simon","Stephen","Steven","Stewart","Thomas","Tim","Trevor","Victor","Warren","William","Cristina","Mattia","Emanuele","Erika","Domenico","Anna","Chiara","Giuseppe","Vincenzo","Manuel","Giuseppe","Simone","Domenico","Laura","Michela","Enrico","Marta","Mattia","Nicoletta","Debora","Giada","Simona","Marta","Paolo","Christian"};


    private static final String[] surnames = {"Conte","Ricci","Sala","Giuliani","Ricci","Conte","Milani","Montanari","Giuliani","Riva","Rizzi","Galli","Ricci","Giordano","Rossetti","Neri","Barbieri","Cattaneo","NicolòRicci","Piras","Giordano","Esposito","Piras","Rizzi","Pellegrini"};



    private static final String[] prefix = {"331","333","347","348"};

    private static final String lettereNumeri = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final String specialChars = "!$=&_.;?-<>,";


    private static final String[] sites = {"libero.it","msn.com","live.it","lve.net","outlook.com","outlook.it","gmail.com","email.it","yahoo.com","yahoo.it","hotmail.it","hotmail.com","nextre.it","hp.com","dell.net","asus.co","local.dev"};


    private static final String[] cities = {"Northwich","Hornsea","Harrison","Tuscaloosa","Appleton","Deadwood","Glens Falls","Great Yarmouth","Winterton","Totowa","Topsham","Wickham","Lock Haven","Dalhousie","Radstock","Cushing","Brough","Prineville","Saint Cloud","Londonderry","Xenia","Westminster","Monroe","Lovington","Dartford","Ponca City","Wabash","Redditch","Moscow","Butte","Nyack","Reno","Nampa","Widnes","Jonqui","Tennant Creek","Ypsilanti","Midland","Turlock","Oshkosh","Virginia","Roanoke","Bethany","Hays","Covington","Gallup","Norristown","Brandon","Great Neck","Horsham","Long Branch","Beverly","La Salle","Kyabram","Nashua","Albury-Wodonga","Selsey","Torrington","Blackwater and Hawley","Sturgeon Bay","Tacoma","Yarmouth","Price","Welland","Yellow Springs","Orange","Anaconda","Branford","Kent","Fitzgerald","Rowley Regis","St. John","Charlottetown","Brixham","Fort Smith","Pittsburg","Colyton","Rhinelander","Hamilton","Revelstoke","Gatineau","Van Buren","Dorking","Maryborough","Falls Church","Fleet","Northam","Kelowna","Sag Harbor","Calgary","Brampton","Arundel","Fort Kent","Horwich","Sonoma","Torpoint","Shelton","Newark-on-Trent","Davenport","Johnson City","Lignano","Vescovana","Zuccarrello","Bard","Sianga","Capoterra","Chasteiran","Avenale","Bucchianico","Casalmaggiore","Balma","Vistorta","Selvone","Lemie","Verna","Bojano","Buriasco","Ciglione","Protonotaro","Petriano","Ruggera","Prebenek","Picerno","Bisignano","Tussio","Sinopoli","Carboneri","Cappelle","Naturno","Santhià","Saleit","Corticella","Montescudo","Arbod","Favalanciata","Gherghenzano","Barkovlje","Frosinone","Tarsogno","Collesecco","Caporiacco","Chirico","Atena","Colpetrazzo","Meolo","Borgunto","Frua","Madrisio","Ventimiglia","Bonacquisto","Battaias","Villamaina","Camorone","Castagno","Marlengo","Capolago","Nulvi","Pese","Ronchetti","Stiffe","Tubre","Piazzetta","Parantoro","Terracino","Termoli","Roccafranca","Nottoria","Carpeneto","Carbonarola","Casemasce","Menestrello","Sarcedo","Paludi","Contron","Puianello","Macerone","Piancogno","Viadana","Slingia","Volania","Cellamare","Subil","Gerinagnano","Martinazzo","Fontanile","Metteglia","Vendoglio","Monteguidi","Forfi","Pontelungo","Sorbolongo","Listolade","Ceres","Nemoli","Toscella","Egadis","Roia","Porano","Melizzano","Istrago","Franconi","Anqua","Navenze","Patrignone","Colleberardi","Montetassi","Semivicoli","Nosate","Missano","Trani","Ceriana","Melilli","Cenadi","Gaida","Coccaglio","Rapolano","Pagliarazzi","Concadirame","Campiglio","Nembro","Log","Pretoro","Bagnarola","Piantabete","Viamaggio","Crescentino","Lavaiano","Massascusa","Elviano","Maestrello","Sampeire","Brusago","Licusati","Piraino","Savoulx","Amalfi","Vivajo","Mottarelle","Lateis","Stura","Pietransieri","Pianaz","Mestrino","Sambiase","Premariacco","Pacentro","Lauropoli","Bovolone","Boccaleone","Salars"};;



    private static final Random r = new Random();


    public static String getPrefissoDiTelefono(){
        //return prefix[r.nextInt(prefix.length)];
        return 300+r.nextInt(100)+"";
    }

    public static String getNumeroDiTelefono(int lunghezza){
        String tmp = "";
        tmp+= getPrefissoDiTelefono();
        while(tmp.length() < lunghezza) {
            tmp+=r.nextInt(10);
        }//end for
        return tmp.length()>lunghezza?tmp.substring(0, lunghezza):tmp;
    }

    public static String getPin(int lunghezza){
        String tmp = "";
        while(tmp.length() < lunghezza) {
            tmp+=r.nextInt(10);
        }//end for
        return tmp;
    }

    public static String getNumero(int lunghezza){
        return getPin(lunghezza);
    }

    public static String getCreditCard(){
        return getPin(16);
    }

    public static final String getPassword(){
        return getPassword(8);
    }

    public static final String getPassword(int lunghezza){
        if (lunghezza<=0)
            throw new IllegalParamsException("Lunghezza minima 1 carattere");
        String chars = lettereNumeri+specialChars;
        String tmp = "";
        while (tmp.length()<lunghezza){
            tmp+=chars.charAt(r.nextInt(chars.length()));
        }
        return tmp;
    }

    public static final String getName(){
        return names[r.nextInt(names.length)];
    }
    public static final String getSurname(){
        return surnames[r.nextInt(surnames.length)];
    }

    public static final String getEmail(){
        String tmp="";
        String join = "._-";
        tmp+= getName();
        tmp+= join.charAt(r.nextInt(join.length()));
        tmp+= getSurname();
        tmp+= r.nextBoolean()?r.nextInt(100):"";
        tmp+= "@"+sites[r.nextInt(sites.length)];
        return tmp.toLowerCase();
    }

    public static final String getEmail(String name, String surname){
        String tmp="";
        String join = "._-";
        tmp+= name;
        tmp+= join.charAt(r.nextInt(join.length()));
        tmp+= surname;
        tmp+= r.nextBoolean()?r.nextInt(100):"";
        tmp+= "@"+sites[r.nextInt(sites.length)];
        return tmp.toLowerCase();
    }


    public static final String getCity(){
        return cities[r.nextInt(cities.length)];
    }


    public static double getRandomTemp(double base, double delta){
        double temp = 0, scarto;
        Random r = new Random();
        scarto = r.nextDouble()*delta;
        if (r.nextBoolean()){
            //aggiungo
            temp = base + scarto;
        }else{
            //sottraggo
            temp = base - scarto;
        }

        //return r.doubles(1,base-delta/2,base+delta/2)
        //        .findFirst()
        //        .getAsDouble();

        return temp;
    }

    public static int[][] randomMatrix(int righe, int colonne) {
        int[][] mattmp = new int[righe][colonne];
        Random r = new Random();
        for (int i = 0; i<righe;i++){
            for (int j = 0; j < colonne; j++) {
                mattmp[i][j]=r.nextInt(10);
            }//end for
        }
        return mattmp;
    }

}//end class

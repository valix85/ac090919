package it.nextre.academy.myutils;

import it.nextre.academy.basi.eccezioni.IllegalParamsException;


import java.util.*;
import java.util.Random;

public class DummyData {

    private static final String[] names = {"Abigail","Alexandra","Alison","Amanda","Amelia","Amy","Andrea","Angela","Anna","Anne","Audrey","Ava","Bella","Bernadette","Carol","Caroline","Carolyn","Chloe","Claire","Deirdre","Diana","Diane","Donna","Dorothy","Elizabeth","Ella","Emily","Emma","Faith","Felicity","Fiona","Gabrielle","Grace","Hannah","Heather","Irene","Jan","Jane","Jasmine","Jennifer","Jessica","Joan","Joanne","Julia","Karen","Katherine","Kimberly","Kylie","Lauren","Leah","Lillian","Lily","Lisa","Madeleine","Maria","Mary","Megan","Melanie","Michelle","Molly","Natalie","Nicola","Olivia","Penelope","Pippa","Rachel","Rebecca","Rose","Ruth","Sally","Samantha","Sarah","Sonia","Sophie","Stephanie","Sue","Theresa","Tracey","Una","Vanessa","Victoria","Virginia","Wanda","Wendy","Yvonne","Zoe","Adam","Adrian","Alan","Alexander","Andrew","Anthony","Austin","Benjamin","Blake","Boris","Brandon","Brian","Cameron","Carl","Charles","Christian","Christopher","Colin","Connor","Dan","David","Dominic","Dylan","Edward","Eric","Evan","Frank","Gavin","Gordon","Harry","Ian","Isaac","Jack","Jacob","Jake","James","Jason","Joe","John","Jonathan","Joseph","Joshua","Julian","Justin","Keith","Kevin","Leonard","Liam","Lucas","Luke","Matt","Max","Michael","Nathan","Neil","Nicholas","Oliver","Owen","Paul","Peter","Phil","Piers","Richard","Robert","Ryan","Sam","Sean","Sebastian","Simon","Stephen","Steven","Stewart","Thomas","Tim","Trevor","Victor","Warren","William","Cristina","Mattia","Emanuele","Erika","Domenico","Anna","Chiara","Giuseppe","Vincenzo","Manuel","Giuseppe","Simone","Domenico","Laura","Michela","Enrico","Marta","Mattia","Nicoletta","Debora","Giada","Simona","Marta","Paolo","Christian"};


    private static final String[] surnames = {"Conte","Ricci","Sala","Giuliani","Ricci","Conte","Milani","Montanari","Giuliani","Riva","Rizzi","Galli","Ricci","Giordano","Rossetti","Neri","Barbieri","Cattaneo","NicolòRicci","Piras","Giordano","Esposito","Piras","Rizzi","Pellegrini"};



    private static final String[] prefix = {"331","333","347","348"};

    private static final String lettereNumeri = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final String specialChars = "!$=&_.;?-<>,";


    private static final String[] sites = {"libero.it","msn.com","live.it","lve.net","outlook.com","outlook.it","gmail.com","email.it","yahoo.com","yahoo.it","hotmail.it","hotmail.com","nextre.it","hp.com","dell.net","asus.co","local.dev"};


    private static final String[] prodotti = {"Gel Detergente rinfrescante","Crema Viso rivitalizzante protettiva","Crema Mani idratante e protettiva","Crema Corpo nutriente protettiva","Burrocacao idratante protettivo","Latte Detergente delicato","Struccante occhi idratante delicato","Tonico purificante rinfrescante","Salviette Struccanti idratanti delicate","Shampoo fortificante officinalis L' Angelica","Shampoo Ultradolce alla Camomilla Garnier","Shampoo Ultradolce al Cacao e all'olio di cocco Garnier","Balsamo ravvivante Camomilla Schultz","Maschera ristrutturante Camomilla Schultz","Balsamo fortificante Puliti e Brillanti Garnier Fructis","Balsamo Ultradolce alla Mandorla e fiori di Loto Garnier","Gel d' Aloe vera Equilibra","Spuma Capelli LaVera","Spuma fissante capelli Farfalla","Spuma Capelli ricci Frank Provost","Latte Detergente Bionova","Balsamo corpo Bionova","Crema Mani all' olio di Argan Bionova","Crema Viso antirughe Bionova","Bagnodoccia Aloe e olio di Argan Bionova","Burro corpo","Gel Doccia Guaranà Coop","Detergente Aloebio Athena's","Mousse Doccia Aloebio Athena's","Crema Viso Garnier bioactive","Docciaschiuma Latte e Miele Sensure","Docciaschiuma Muschio bianco Sensure","Detergente intimo Neutromed","Shampoo delicato","Sapone liquido","Gel doccia","Deodorante vapo","Deodorante roll on","Crema contorno occhi rivitalizzante protettiva","Burrocacao Labbra idratante e protettivo","Detergente Viso e Mani con Yogurt Neutromed","Shampoo Forsan Bio","Shampoo al Miglio verde e Germe di grano Omnia Botanica","Bagnodoccia tonificante Menta e Rosa canina Omnia Botanica","Bagnodoccia rilassante Tiglio e Melissa Omnia Botanica","Deodorante delicato Bionova","Detergente Cien","Shampoo Aloe vera Omia Laboratoires","Shampoo Olio di Argan Omia Laboratoires","Maschera Capelli Aloe vera Omia Laboratoires","Bagnoschiuma Aloe vera Omia Laboratoires","Gel Detergente intimo e viso Aloe vera Omia Laboratoires","Crema Corpo olio di Argan Omia Laboratoires","Crema Corpo Aloe vera Omia Laboratoires","Shampoo olio di Macadamia Omia Laboratoires","Shampoo olio di semi di Lino Omia Laboratoires","Maschera Capelli olio di Argan Omia Laboratoires","Maschera Capelli olio di Macadamia Omia Laboratoires","Maschera Capelli olio di semi di Lino Omia Laboratoires","Crema Corpo Mandorla Phytorelax","Crema Mani e Unghie con olio di Argan Phytorelax","Latte Detergente e Tonico Burro di Karitè Phytorelax","Bagno doccia Mandorla Phytorelax","Crema Viso Burro di Cacao Phytorelax","Crema Corpo rilassante Fiori di Bach Phytorelax","Balsamo Capelli Oliva Phytorelax","Latte Detergente Biologico Linea Bimbi I Provenzali Bio","Bagnetto Biologico ultradelicato Linea Bimbi I Provenzali Bio","Crema protettiva biologica Linea Bimbi I Provenzali Bio","Impacco Capelli biologico fortificante olio di Sapote I Provenzali Bio","Balsamo biologico fortificante olio di Sapote I Provenzali Bio","Olio di Karitè super idratante I Provenzali","Olio di Mandorle dolci super idratante I Provenzali","Olio di Jojoba super idratante I Provenzali","Sapone Corpo olio di Mandorle dolci I Provenzali","Sapone Viso e Corpo extradolce Ribes rosso I Provenzali","Saponetta vegetale Vaniglia e Cannella I Provenzali","Balsamo Labbra vegetale olio di Argan I Provenzali Bio","Stick Labbra extradolce Arancia I Provenzali","Shampoo olio essenziale di Lavanda e estratto di Rosa Ultradolce Garnier","Shampoo 5 piante Ultradolce Garnier","Shampoo all'estratto di Mango e fiori di Tiarè Ultradolce Garnier","Olio di Semi di Lino puro Forsan","Detergente Intimo delicato","Shampoo Barbie olio di Oliva Admiranda","Docchia schiuma Camomilla Kamill","Bagnoschiuma Aloe vera Sensure","Detergente Intimo Intimate body wash Cien","Gel Detergente Viso delicato aquarich Cien","Salviette Struccanti e detergenti Iseree","Latte Detergente Cien","Solvente per unghie senza acetone Cien","Shampoo giorno per giorno estratto di Papaia e Pesca Cien","Shampoo giorno per giorno estratti di 7 erbe e Aloe vera Cien","Shampoo giorno per giorno con Luppolo for men Cien","Docciaschiuma Lime kick Cien","Docciaschiuma for men Cien","Docciaschiuma Red sun Cien","Bagnoschiuma Vaniglia Cien","Lacca capelli extra strong Cien","Shampoo sensitive Aloe vera Cien","Crema Viso idratante Kaloderma","Crema Mani Argan Kaloderma","Latte Detergente delicato Kaloderma","Bagnodoccia rilassante Fiori di Bach Phytorelax","Crema Corpo rilassante da massaggio Fiori di Bach Phytorelax","Crema Viso idratante Fiori di Bach Phytorelax","Detergente Intimo delicato Bionova","Salviette Struccanti delicate Equilibra","Salviette Struccanti Bio delicate Fria","Burrocacao Legami","Latte Solare PROTEZIONE Alta SPF 30 Argan Phytorelax","Latte Solare Protezione Media SPF 15 Argan Phytorelax","Latte Solare Protezione Bassa SPF 6 Argan Phytorelax","Latte Doposole idratante lenitivo Argan Phytorelax","Olio Solare illuminante SPF 0 Argan Phytorelax","Shampoo delicato","Balsamo Puliti e Brillanti Garnier Fructis","Olio di Jojoba de I Provenzali","Gel Detergente rinfrescante","Crema Viso idratante protettiva","Crema Mani Bionova","Bagnoschiuma tonificante alla Menta e Rosa canina Omnia Botanica","Latte Corpo al Burro di Cacao Phytorelax","Gel d' Aloe Vera puro Equilibra","Struccante Occhi delicato Bionova","Olio di Semi di Lino puro Forsan","Bagnoschiuma Tweety Admiranda","Burro Corpo","Balsamo Labbra idratante protettivo","Crema Solare Bionova spf 50","Latte Solare Bionova Spf 30","Fluido Doposole Idratante Bionova","Balsamo Ultradolce all' Olio di Avocado e Burro di Karitè Garnier","Balsamo Fructis Oleo Repair Garnier","Balsamo Fructis Vitamina Hydra Garnier","Shampoo Ultradolce 5 piante Garnier","Shampoo Ultradolce Lavanda Garnier","Crema corpo Cliclamino delle Alpi Phytorelax","Crema corpo Vaniglia Intra","Crema corpo Rosa Intra","Latte corpo Fiori di BAch Phytorelax","Crema mani protettiva al Miele Botanika","Crema viso Lifting con Olio di Mandorle dolci Botanika","Crema viso Antiage Botanika","Crema multiuso viso, corpo e mani Botanika","Dentifricio Antica erboristeria Menta e salvia","Crema mani protettiva Fior di Magnolia","Salviette igiene intima Fior di Magnolia","Salviette struccanti Fior di Magnolia","Dentifricio Sensitive White & Fresh","Shampoo biologico fortificante Sapotè I Provenzali","Impacco capelli biologico fortificante Sapotè I Provenzali","Balsamo biologico fortificanten Sapotè I Provezali","Olio per capelli biologico Sapotè I Provenzali","Crema mani Argan Kaloderma","Fluido rigenerante corpo Rosa mosqueta Omnia botanica","Crema nutriente Viso al Burro di Karitè Omnia Botanica","Crema nutriente Mani e Unghie al Burro di Karitè Omnia Botanica","Burro di Karitè Omnia Botanica","Salviette biologiche I provenzali Linea Bimbi","Dermo bagno biologico Aloe vera Omia Laboratories","Sapone Liquido Tweety Admiranda","Latte detergente emolliente Naturissima","Tonico addolcente Naturissima","Crema mani Botanika","Struccante occhi Bioactive Garnier","Crema gel protettiva pelli normali e miste","Gel detergente esfoliante"};

    private static final String[] marche = {"Gametime","Club Pilates Franchise","Halo Top Creamery","Single Serve Beverage Distribution","Dyla","MM.LaFleur","TrackR","iBenzer","BASX Solutions","Chef's Cut Real Jerky","E-file.com","Brazi Bites","FabFitFun","Omaze","Fab Glass and Mirror","Factor 75","JC's","Idea Buyer","Zeel","Fuse Chicken","MOVE Bumpers","P.F. Candle Co.","Bombfell","Paint Nite","iLoveKickboxing","LIFEAID Beverage Company","Boba Guys","BrightFarms","United Carports","Images Luxury Nail Lounge","LiveTrends Design Group","Untappd","Au Bon Broth","R. Riveter","Her Hair Company","HYPERICE","MOD Pizza","Downeast Cider House","Berkley","MatterHackers","Skull Shaver","CanSource","Fitness Holdings Northeast","Warrior Media","Repurpose","Spindrift","Tophatter","VRC Metal Systems","Waiakea","Buzz Franchise Brands","Ledge Lounger","Mystery Tackle Box","Course","Ecochlor","SoapBox","Reduce","iGotOffer","Humm Kombucha","Nulo","TickPick","Science of Skill","B'more Organic","Biena Foods","Southern Designs","ZippyPaws","Touch of Modern","Maximum Games","Keyser Ventures","Southern Proper Hospitality","Cappello's Grain Free","Makeup Geek","Ocean Beach Sportswear","Remarkable Liquids","Whim Hospitality","DiPietro Family Law Group, PLLC","EDWARD MARC BRANDS","Private Label Skin","Votto Vines Importing","Willie Jewell's Old School Bar-B-Q","cellhelmet","LIVE Soda","Tomasino Foods","James Martin Furniture","GMB FItness","Big Barker","Fresh Roasted Coffee","Brew Dr. Kombucha","Little Passports","Intermountain Nutrition","Tiesta Tea Company","Chicken and Rice Guys","Cirrus Systems","DFW Storm Solutions","Delsur Trading","Origaudio","Sound Rink","Ashby Law","EVERYTHING BUT THE HOUSE (EBTH)","Float Pod Technologies","Silencerco","Jeunesse Global","Deal Partners","Smoking Vapor","Foodmate US","Chicken Salad Chick","American Bath Group","Jarvis Lighting","Beef Jerky Outlet","Ben's Soft Pretzels","Homeland Manufacturing Services","Terra Exports","G&G LED Lighting","Chosen Foods","Zerelli Technologies","Semihandmade","Beneficial Blends dba Kelapo","Saxbys","Daily Sale","CircusTrix","Hawkers Asian Street Fare","Klymit","Bluemar Promotions","Hiball Energy","overdrive brands","Deco Lighting","Capital Teas","Rocky Mountain Barrel Company","James Enterprise","NEKTER JUICE BAR","Robefactory","Dhaliwal Labs","CARCHEX","Mutual Minds","Hoosier Hill Farm","South by Sea","High Road Craft Ice Cream","WABA GRILL FRANCHISE","Segero","Punch Bowl Social","GO Pull-It","Camp Gladiator","Distritech","Water Liberty","Noribachi","MAKO Design + Invent","Futureshirts","Crossbar Electronic Cigarettes","Alcohol by Volume","Sports Addix","Brent Industries","MavTel Global Solutions","Global Food Solutions","Light Efficient Design","spa810","The Cutting Board Company","P.L.A.Y. Pet Lifestyle And You","San Francisco Salt Company","Appalachian Antique Hardwoods","SHOP MELEE","OAG GLOBAL","Bourbon and Boweties","RapidVisa","Perfect Water Technologies","The Olde Mecklenburg Brewery","SynergyLabs","Rhino Camera Gear","Cali Bamboo","ARCTIC ZERO","Turnstyle Brands","Festivals Unlimited","Credit Law Center","ARIIX","Field Goods","Bolay Enterprises","Four Foods Group","Real Thread","Andes Global Trading","Spice Jungle","Corkcicle","Sweet Peach Wax & Sugaring Studio","Mr Beams","Primal Life Organics","RuMe","Sky Zone Trampoline Park","The Ticket Group","Garb Athletics","Performance Plus Carts","Tender Belly","Nothing Bundt Cakes","Xero Shoes","24hrsdeals","Western Window Systems","Now Communications","Free Flow Wines","Diamond Hair Company","Yoder Smokers","ONEHOPE","The Spice Lab","Popular Ink","Poo~Pourri","Triple Tap Ventures","Bulu Box","CardCash.com","WeddingWire","Elite Survival Systems","Roblox","Crown Laboratories","eSalon.com","Ultimovalue.com","Envirofit International","Mommy's Bliss","Inspect-All Services","Black Clover Enterprises","Boardroom Salon for Men","FATHOM (Oakland, CA)","All Industrial Tool Supply","Teriyaki Madness","The Rox Group","Just Ryt Foods","AlerStallings","Silk Worldwide","College Hunks Hauling Junk and Moving","QC Manufacturing","The Junkluggers","Automated Pet Care Products","INTEX Millwork Solutions","Prosperity Organic Foods","MaxBotix","YakAttack","Happy's Home Centers","Apeks Supercritical","DMA Goodpoint","Peepers by PeeperSpecs","Michigan Custom Machines","Greenville Avenue Pizza Company","Lady M Confections Co.","Another Broken Egg Cafe","Prop & Peller Pretzels","Arcadia Louvered Roofs","EmazingLights / iHeartRaves / IntoTheAM","All Things Metal","Fort Collins Heating and Air Conditoning","Rifle Paper Co.","Janus International Group","SS Industries","Nexgrill Industries","Industrial Lighting Products","Early Upgrade","Fusion Optix","Mosquito Squad","NewSouth Window Solutions","South Florida Tissue Paper","Nix Companies","OOLY","Wet Brush","Toilettree Products","Edge","Hissho Sushi","Ideal Industries","Culture Studio","Kobeyaki Holdings","Hydra-Flex","Monogram Foods","EO Products","Freddy's Frozen Custard & Steakburgers","Full Circle Home","Purium Health Products","McIlveen Family Law Firm","Minute Key","United Fray","Pedego Electric Bikes","Parts Town","Blue Microphones","Computer Overhauls","CleanLife LED","PRO-VISION","Maine Coast","Pete and Gerry's Organics","Wet Sounds","Stomping Ground Photography","Powertrain Products","Laser Products Industries","Summerset Professional Grills","University Tees","MKind","Kohana Coffee","Component Surfaces","Amrita Aromatherapy","PC Laptops","Prestman Auto","Nuun & Company","Wine & Design","DriveTime","Lee Industrial Contracting","Freedom Boat Club","SRS Distribution","Wicked Good Cupcakes","Kitchen & Bath Cottage","The Spa & Sauna Co","Warehouse-Lighting Com","WheelsOnsite USA","Corporate Essentials","Happy Howie's","Bench Dogs","Xtreme Xperience","Mid America Pet Food","Monster Transmission","BULL ENGINEERED PRODUCTS","4 Rivers Smokehouse","CTEMS","Upward Projects","Reliant Foodservice","John Pomp Studios","Logojet USA","Villa Dolce Gelato","Slow Dough Bread Co","Lighting Unlimited","Big Ass Solutions","The Catering Company","M Culinary Concepts","Puredot","Southwest Foodservice Excellence","Granbury Solutions","Paris Presents","Meriwether & Tharp","TDBBS","Cooper's Hawk Winery & Restaurants","Arizona Fireplaces","Spokeo","Explotrain, L.L.C.","City Winery","Cincotta & Co.","Phoenix Logistics","RSP","Grand Transformers","Packsize International","Palm Coast Sales","Mobile Outfitters","Blount Fine Foods","Staging Concepts","Tiger Plumbing, Heating, Air Conditioning and Electrical Services","MODA LIGHT","Unimex","ManhattanHomeDesign.com","Targeted Pet Treats","5 Generation Bakers","Tanner Goods","Fortress Building Products","Storebound","EGP","The Service Professor","Studio Movie Grill","Kurgo Products","OptiFuse","Singing Dog Vanilla","Center Link Media","National Food Group","Nila","1908 Brands","Western Timber Frame","The Original Frameless Shower Doors","Pure Romance","JLab Audio","Zoup! Fresh Soup Company","Grand Trunk","Gray Matter Systems","McClarin Plastics","Modern Store Equipment","TrippNT","Pristine Pools","Schaal Heating & Cooling","Costa Vida","professional concessions","Skin By Lovely","A. Marshall Family Foods","BuyBackWorld","SeaBreeze Electric","JP Fuji Group","Kerusso","Uncorked","Magnolia Bakery","Souto Foods","Better Life","Sharon Young","Aluminum Trailer Company","KW Cages","Dining Alliance","IMAGE Skincare International","Go-Forth Pest Control","Modern Flames","SnapCab","Katom Restaurant Supply","SomerTile","NoHo Hospitality Group","COZZIA USA","Cold Jet","Ellison Bakery","Scorpion Coatings","The Gents Place","Midwest Prototyping","Ammex","Primitives by Kathy","Ticket Alternative","Jonathan's Grille","Patriot Aluminum Products","MATRIX 4","Creative Sign Designs","Honey-Can-Do International","The FruitGuys","Bintelli & citEcar Electric Vehicles","milk + honey","Premier Plastics","Uckele Health & Nutrition","Scooter's Coffee","FCP Euro","Mud Pie","BuildASign.com","H&F Bread Cpmpany","Counselman Automotive Recycling","Field Fastener","Clipper","2 Hounds Design","Amber Green","Advanced Powder Products","GiftBasketsOverseas.com","Kucumber Skin Lounge","On Safari Foods","Pro Mach","DiamondBack Truck Covers","Bonitas International","EBW Electronics","Productive Edge","M S International","AA METALS","Asker Distributors","The Garland Company","MacDonald & Owen Lumber Co.","Diamond Mowers","RevPart","Dashed","Nicolet Plastics","Caroline's Cakes","BEAULIEU-FAWCETT LAW GROUP, PA","Survival Frog","Carver Skateboards","New Glarus Brewing Co.","Double Good","Universal Separators","Time After Time","Foundation Supportworks","IN10SE Productions","Shields Manufacturing","T&D Metal Products","Simplicity Laser","Valudor Products","Advanced Piping Products","Optimax Systems","iTECH","Biomedical Research Laboratories","ComplianceSigns.com","Four Hands","Century Service Affiliates","Integro Technologies","RNR Tire Express","Ulrich Barns","G.S. Gelato & Desserts","TAPCO","Rosnet","Wildkin","M. A. Silva USA","Nulook Collision","Stratosphere Quality","The Lewis Chemical Company","Surya","Sharper Impressions Painting","FabriFast","Massage Heights Franchising","AmeriChem Systems","W.S. Darley & Co.","Edgewater Automation","Natalie's Orchid Island Juice Company","Happy Hound Play & Daycare","Custom Profile","Rabbit Air","Weiss & Associates","MTD Micro Molding","Storflex","Birds Barbershop","PM SLEEP LAB","Catrike","PFSbrands","Startech.Com","US Micro Products","Easiway Systems","Green Lawn Fertilizing","StayOnline","Rotorcorp","Morris - Sockle, PLLC","Genysis Brand Solutions","Stringer Industries","Tierra Farm","Quality Aluminum Products","Ervolina Associates","Russian Pointe","Melt Bar and Grilled","Pitts Enterprises","Mountain Showcase Group","Prosource Fitness Equipment","GOLFTEC","Cases By Source","ink! Coffee","Liberty Pumps","Royalton Music Center","Timberlane","C&H Baseball","Industrial Revolution","Infiltrator Water Technologies","LifeSource Water Systems","Plustar","Kona Ice","Cox Manufacturing Company","BriskHeat"};


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
    public static final String getMarca(){
        return marche[r.nextInt(marche.length)];
    }
    public static final String getProdotto(){
        return prodotti[r.nextInt(prodotti.length)];
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


    public static double getRandomDouble(double base, double delta){
        return getRandomTemp(base,delta);
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

    public static int getAge(int min, int max){
        return min+r.nextInt(max-min);
    }

    public static int getAge(){
        return getAge(0,110);
    }

}//end class

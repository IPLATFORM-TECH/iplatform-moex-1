package space.eliseev.iplatformmoex.model.enumeration;

public enum Engine {

    STOCK("stock"),
    STATE("state"),
    CURRENCY("currency"),
    FUTURES("futures"),
    COMMODITY("commodity"),
    INTERVENTIONS("interventions"),
    OFFBOARD("offboard"),
    AGRO("agro"),
    OTC("otc");

    private final String name;
    Engine(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

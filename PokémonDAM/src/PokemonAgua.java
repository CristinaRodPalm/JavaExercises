/**
 * Created by Cristina on 18/10/2016.
 */
public class PokemonAgua extends Pokemon implements Capturable{

    String tipo = "agua";
    String efectivoContra = "fuego";
    String debilContra = "planta";

    public PokemonAgua(String nombre, int ataque, int defensa, int puntosSalud){
        super(nombre, ataque, defensa, puntosSalud);
        this.tipo = "agua";
        this.efectivoContra = "fuego";
        this.debilContra = "planta";
    }

    public String getTipo() {
        return tipo;
    }

    public String getEfectivoContra() {
        return efectivoContra;
    }

    public String getDebilContra() {
        return debilContra;
    }
    @Override
    public String toString() {
        /*return "AGUA \n"+
                "nombre: "+this.getNombre()+
                "\nataque: "+this.getAtaque()+
                "\ndefensa: "+this.getDefensa()+
                "\npuntosSalud: "+this.getPuntosSalud()+
                "\ntipo: "+this.getTipo()+
                "\nefectivo: "+this.getEfectivoContra()+
                "\ndebil: "+this.getDebilContra();
         */
        return this.getNombre()+" --> Ataque: "+this.getAtaque()+" | Defensa: "+this.getDefensa()+" | PS: "+this.getPuntosSalud();

    }

    @Override
    public boolean Capturable() {
        int random = (int) (Math.random()*120+20);
        if(random - this.getPuntosSalud() > this.getDefensa()) return true;
        else return false;
    }

}

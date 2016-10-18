/**
 * Created by Cristina on 18/10/2016.
 */
public class PokemonFuego extends Pokemon implements Capturable {

    String tipo = "fuego";
    String efectivoContra = "planta";
    String debilContra = "agua";

    public PokemonFuego(String nombre, int ataque, int defensa, int puntosSalud){
        super(nombre, ataque, defensa, puntosSalud);
        this.tipo = "fuego";
        this.efectivoContra = "planta";
        this.debilContra = "agua";
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
        /*return "FUEGO \n"+
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

/**
 * Created by Cristina on 18/10/2016.
 */
public class Pokemon implements Capturable{
    String nombre;
    int ataque;
    int defensa;
    int puntosSalud;

    public Pokemon() {
    }

    public Pokemon(String nombre, int ataque, int defensa, int puntosSalud) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.puntosSalud = puntosSalud;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getPuntosSalud() {
        return puntosSalud;
    }

    @Override
    public boolean Capturable() {
        return false;
    }
}

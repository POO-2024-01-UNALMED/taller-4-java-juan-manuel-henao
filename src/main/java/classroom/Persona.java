package classroom;

public class Persona {

    final long cedula;
    private String nombre;
    private static int totalPersonas;
    
    static {
        Persona.totalPersonas = 0;
       
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        Persona.totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        Persona.totalPersonas++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        Persona.totalPersonas++;
    }

    public Persona(String nombre) {
        this.cedula = 1;
		this.nombre =nombre;
        Persona.totalPersonas++;
    }
    
    public Persona() {
    	this.cedula = 0;
		this.nombre="";
    	Persona.totalPersonas++;
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

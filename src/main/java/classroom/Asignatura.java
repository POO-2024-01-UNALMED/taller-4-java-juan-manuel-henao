package classroom;

public class Asignatura {

    public String nombre;
    public int codigoInterno;
    public int codigoExterno;
    public Tipo tipo;

    public Asignatura() {
        this("Sin nombre",0,0,Tipo.FUNDAMENTACION);
    }

    public Asignatura(int codigoExterno,Tipo tipo) {
        this.nombre="Sin nombre";
        this.codigoExterno=codigoExterno;
        this.tipo=tipo;
        this.codigoInterno=0;
    }

    public Asignatura(Tipo tipo,int codigoInterno) {
        this.nombre="Sin nombre";
        this.codigoInterno=codigoInterno;
        this.tipo=tipo;
        this.codigoExterno=0;
    }

    public Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0,tipo);
    }

    public Asignatura(String nombre, int codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    public void cambiarDatos(int codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }
    
    public void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }


    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
}

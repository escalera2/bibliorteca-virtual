public class autor {

    //variables globales
    String nombre;
    String primerApellido;
    String segundoApellido;
    public autor(){
    }
    public  autor(String nombre, String primerApellido){
        this.nombre=nombre;
        this.primerApellido=primerApellido;
    }
    public autor(String nombre, String primerApellido, String segundoApellido){
        this.nombre=nombre;
        this.primerApellido=primerApellido;
        this.segundoApellido=segundoApellido;
    }
}

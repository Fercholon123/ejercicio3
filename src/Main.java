public class Main {
    public static void main(String[] args) {
        persona Edad = new persona();
        Edad.setEdad(33);

        persona nombre = new persona();
        nombre.setNombre("Marcos");

        persona telefono = new persona();
        telefono.setTelefono(9474829);



        System.out.println("Hola, tengo " + Edad.getEdad() + " años");
        System.out.println("Mi nombre es " + nombre.getNombre());
        System.out.println("y mi telefono es " + telefono.getTelefono());

    }
}

class persona{

    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return this.telefono;
    }
}
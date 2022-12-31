public class ejercicioPersona {
    public static void main(String[] args) {
        //objeto cliente - declaracion de variables
        Cliente cliente1 = new Cliente();
        cliente1.setNombrePersona("cristhian");
        cliente1.setedadPersona(28);
        cliente1.settelefonoPersona(344554563);
        cliente1.setcreditoCliente(12000);

        //impresion en pantalla de las variables del objeto
        System.out.println("informacion del Cliente \n" + cliente1.getNombrePersona());
        System.out.println(cliente1.getedadPersona());
        System.out.println(cliente1.gettelefonoPersona());
        System.out.println("el credito disponible es: " + cliente1.getcreditoCliente());

        //objeto trabajador - declaracion de las variables
        Trabajador trabajador1 = new Trabajador();
        trabajador1.setNombrePersona("Rafael");
        trabajador1.setedadPersona(26);
        trabajador1.settelefonoPersona(354364763);
        trabajador1.setsalarioTrabajador(122000);

        //impresion en pantalla de las variables del objeto
        System.out.println("informacion del empleado \n" +trabajador1.getNombrePersona());
        System.out.println(trabajador1.getedadPersona());
        System.out.println(trabajador1.gettelefonoPersona());
        System.out.println("el salario es: " + trabajador1.getsalarioTrabajador());
    }
}

//clase persona
class Persona{
    private String NombrePersona = " ";
    private int edadPersona = 0;
    private int telefonoPersona = 0;

    public void setNombrePersona(String NombrePersona){
        this.NombrePersona = NombrePersona;
    }
    
    public String getNombrePersona(){
        return this.NombrePersona;
    }
        
    public void setedadPersona(int edadPersona){
        this.edadPersona = edadPersona;
    }
    
    public int getedadPersona(){
        return this.edadPersona;
    }
        
    public void settelefonoPersona(int telefonoPersona){
        this.telefonoPersona = telefonoPersona;
    }
    
    public int gettelefonoPersona(){
        return this.telefonoPersona;
    }
}//fin clase persona

// clase cliente con herencia de clase persona
class Cliente extends Persona{
    float creditoCliente = 0;

    public void setcreditoCliente(float creditoCliente){
        this.creditoCliente = creditoCliente;
    }
    
    public float getcreditoCliente(){
        return this.creditoCliente;
    }
}//fin clase cliente

//clase trabajador
class Trabajador extends Persona{
    float salarioTrabajador = 0;

    public void setsalarioTrabajador(float salarioTrabajador){
        this.salarioTrabajador = salarioTrabajador;
    }
    
    public float getsalarioTrabajador(){
        return this.salarioTrabajador;
    }
}//fin clase trabajador


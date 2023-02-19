package eva1_6_automovil;

public class Automovil {
    
    private String marca;
    private String modelo;
    private int placa;
    private int año;
    private String dueño;
    
    //constructor default
    public Automovil(){
        marca = "-----";
        modelo = "-----";
        placa = 00000;
        año = 00000;
        dueño = "-----";                       
    }
    //constructor con argumentos
    public Automovil(String nMarca, String nModelo, int nPlaca, int nAño, String nDueño){
        marca = nMarca;
        modelo = nModelo;
        placa = nPlaca;
        año = nAño;
        dueño = nDueño;
    }
    
    public void setMarca(String valor){
        marca = valor;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setModelo(String valor){
        modelo = valor;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setPlaca(int valor){
        placa = valor;
    }
    
    public int getPlaca(){
        return placa;
    }
    
    public void setAño(int valor){
        año = valor;
    }
    
    public int getAño(){
        return año;
    }
    
    public void setDueño(String valor){
        dueño = valor;
    }
    
    public String getDueño(){
        return dueño;
    }
    
    public int calcularAdeudo() {
        int adeudo = 0;
        if(año <= 2000)
            adeudo = 1500;
        
        if(año > 2000 && año <=2005)
            adeudo = 2000;
        
        if(año > 2005 && año <= 2010)
            adeudo = 2500;
        
        if(año > 2010 && año <=2015)
            adeudo = 3000;
        
        if(año > 2015)
            adeudo = 4000;
        
        System.out.println("El adeudo del automovil con placa " + placa + " es de: $" + adeudo);
        return adeudo;
    }
}

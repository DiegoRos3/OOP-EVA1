package eva1_11_return;

public class EVA1_11_RETURN {

    public static void main(String[] args) {
        // TODO code application logic here
        int res;
        res= square(10); //invocacion o llamada a función
        System.out.println("Resultado: " +res);
    }
    
    public static int square(int num){
        return num * num;
    }
}

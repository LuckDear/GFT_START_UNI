public class Icms implements Imposto{
    String s = "";
    public void calculaImposto(double valor){
         valor *= 0.27;

         s += valor;
    }

    public String getValor() {
        return s;
    }
}

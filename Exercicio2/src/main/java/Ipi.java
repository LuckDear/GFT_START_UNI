public class Ipi implements Imposto{
    String s = "";

    public void calculaImposto(double v){
       if (v >= 20000){
           v *= 0.19;
       }else {
           v *= 0.07;
       }
       s += v;
    }

    public String getValor() {
        return s;
    }

}

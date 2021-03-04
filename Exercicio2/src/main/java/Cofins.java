public class Cofins implements Imposto{
    String s = "";

        public void calculaImposto(double valor){
            if (valor > 12000) {
                valor *= 0.04;

            }else {
                valor *= 1;
            }
            s += valor;
        }

    public String getValor() {
        return s;
    }
}

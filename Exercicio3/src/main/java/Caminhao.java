public class Caminhao extends Transporte{
    public Caminhao(double valor, double peso) {
        super(valor, peso);
    }

    @Override
    public double calculaFrete() {
        if (getValor() > 40000) {
            return 0.25 * (getPeso() * 0.02) + (getValor() * 0.03);
        }
        else {
            return (getPeso() * 0.02) + (getValor() * 0.03);
        }
    }
}

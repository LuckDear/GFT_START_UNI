public class Vagao extends Transporte {

    public Vagao(double valor, double peso,int dis) {
        super(valor, peso);
    }

    @Override
    public double calculaFrete() {
        if (getPeso() < 15000) {
            return 5000 + (getPeso() * 0.07) + (getValor() * 0.01) ;
        } else {
            return (getPeso() * 0.07) + (getValor() * 0.01);
        }
    }
}

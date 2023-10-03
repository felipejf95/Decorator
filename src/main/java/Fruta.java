public class Fruta extends AcaiDecorator{

    private String fruta;
    public Fruta(Acai acai, String fruta) {
        super(acai);
        this.fruta = fruta;
    }

    @Override
    public float getCusto(){
        return super.getCusto() + 2.0f;
    }

    public String getDescricao(){
        return super.getDescricao() + " + " + this.fruta;
    }
}

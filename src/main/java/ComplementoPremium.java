public class ComplementoPremium extends AcaiDecorator{

    private String complemento;
    public ComplementoPremium(Acai acai, String complemento) {
        super(acai);
        this.complemento = complemento;
    }

    @Override
    public float getCusto(){
        return super.getCusto() + 5.0f;
    }

    public String getDescricao(){
        return super.getDescricao() + " + " + this.complemento;
    }
}

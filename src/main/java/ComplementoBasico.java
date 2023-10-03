public class ComplementoBasico extends AcaiDecorator{
    private String complemento;
    public ComplementoBasico(Acai acai, String complemento) {
        super(acai);
        this.complemento = complemento;
    }

    @Override
    public float getCusto(){
        return super.getCusto() + 1.5f;
    }

    public String getDescricao(){
        return super.getDescricao() + " + " + this.complemento;
    }
}

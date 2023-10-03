public abstract class AcaiDecorator implements Acai{

    private Acai acai;
    private String descricao;

    public AcaiDecorator(Acai acai) {
        this.acai = acai;
    }

    public Acai getAcai() {
        return acai;
    }

    public void setAcai(Acai acai) {
        this.acai = acai;
    }

    public float getCusto(){
        return this.acai.getCusto();
    }
    @Override
    public String getDescricao() {
        return this.acai.getDescricao() + this.getDescricao();
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

package personagem_builder;

public class MagoBuilder implements Builder{

    private String nome;
    private TipoPersonagem tipo;
    private int inteligencia;
    private int forca;
    private int vigor;
    private int resistencia;
    private int destreza;
    private double danoAtaque;

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setTipo(TipoPersonagem tipo) {
        this.tipo = TipoPersonagem.MAGO;
    }

    @Override
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    @Override
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    @Override
    public void setDanoAtaque(double danoAtaque) {
        this.danoAtaque = danoAtaque;
    }

    public Mago build(){
        return new Mago(nome, inteligencia, forca, vigor, resistencia, destreza);
    }

}

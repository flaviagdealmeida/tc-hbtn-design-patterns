public class Guerreiro extends  Personagem{

    public Guerreiro(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super (nome, TipoPersonagem.GUERREIRO, inteligencia, forca, vigor, resistencia, destreza);

        if(inteligencia >= forca && destreza>=forca){
            throw new IllegalArgumentException("Atributos invalidos para GUERREIRO");
        }
    }

    @Override
    public double getDanoAtaque() {
        return (getInteligencia() * 0.05) + (getForca() * 0.8) + (getDestreza() * 0.1) + (getVigor() * 0.05);


    }
}

public class Ladrao extends  Personagem{

    public Ladrao(String nome, int inteligencia, int forca, int vigor, int resistencia, int destreza) {
        super (nome, TipoPersonagem.LADRAO, inteligencia, forca, vigor, resistencia, destreza);

        if(forca >= destreza || inteligencia >= destreza){
            throw new IllegalArgumentException("Atributos invalidos para LADRAO");
        }
    }

    @Override
    public double getDanoAtaque() {
        return (getInteligencia() * 0.05) + (getForca() * 0.5) + (getDestreza() * 0.35) + (getVigor() * 0.1);


    }
}

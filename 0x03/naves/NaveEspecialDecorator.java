public class NaveEspecialDecorator extends NaveEspacial{

    private NaveEspacial nave;

    public NaveEspecialDecorator( NaveEspacial nave ) {
        this.nave = nave;
    }


    @Override
    public int getAtaque() {
        return nave.getAtaque();
    }

    @Override
    public int getSaude() {
        return nave.getSaude();
    }
}

public class NaveEspacialDecorator extends NaveEspacial{

    private NaveEspacial nave;

    public NaveEspacialDecorator( NaveEspacial nave ) {
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

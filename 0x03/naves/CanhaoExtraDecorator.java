public class CanhaoExtraDecorator extends NaveEspecialDecorator{

    public CanhaoExtraDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial);
    }

    @Override
    public int getAtaque() {
      return super.getAtaque() + 75;
    }
}

public class LaserDecorator extends NaveEspecialDecorator{

    public LaserDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial);
    }

    @Override
    public int getAtaque() {
      return super.getAtaque() + 40;
    }
}

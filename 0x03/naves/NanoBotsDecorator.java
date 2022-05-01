public class NanoBotsDecorator extends NaveEspecialDecorator{

    public NanoBotsDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial);
    }


    @Override
    public int getAtaque() {
      return super.getAtaque() + 25;
    }
}

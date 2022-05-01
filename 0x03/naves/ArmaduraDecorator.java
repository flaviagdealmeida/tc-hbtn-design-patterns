public class ArmaduraDecorator extends NaveEspecialDecorator{

    public ArmaduraDecorator(NaveEspacial naveEspacial) {
        super(naveEspacial);

    }

    @Override
    public int getSaude() {
      return super.getSaude()+150;

    }
}

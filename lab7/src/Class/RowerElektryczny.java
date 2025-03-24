package Class;

public class RowerElektryczny extends Pojazd implements Elektryczny{
    private int poziomnabaterii = 100;

    public RowerElektryczny(String id, String model) {
        super(id, model);
    }

    @Override
    public void naladuj() {
        poziomnabaterii = 100;
    }

    @Override
    public int poziomNaladowania() {
        return poziomnabaterii;
    }

    @Override
    public double ObliczKoszt(int liczbaGodzin) {
        return liczbaGodzin * 10.0;
    }
}

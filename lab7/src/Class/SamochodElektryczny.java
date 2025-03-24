package Class;

public class SamochodElektryczny extends Pojazd implements Elektryczny{
    private int poziomnabaterii = 100;

    public SamochodElektryczny(String id, String model) {
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
        return liczbaGodzin * 100.0;
    }
}

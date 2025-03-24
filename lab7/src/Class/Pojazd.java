package Class;

public abstract class Pojazd {
    //pola
    protected String id;
    protected String model;
    protected Boolean czydostepny = true;

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public Boolean getCzydostepny() {
        return czydostepny;
    }

    public Pojazd(String id, String model) {
        this.id = id;
        this.model = model;
    }

    public void wypozycz(){
        czydostepny = false;
    }

    public void zwroc(){
        czydostepny = true;
    }

    public boolean isCzydostepny(){
        return czydostepny;
    }

    public abstract double ObliczKoszt(int liczbaGodzin);
}

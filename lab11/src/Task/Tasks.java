package Task;
import RunInput.Input;

public class Tasks {
    Input input = new Input();
    public void Zadanie1(){
        enum Swiatlo{
            CZERWONE("Stój!"),
            ZOLTE("Uwaga!"),
            ZIELONE("Jedź!");

            private String opis;

            Swiatlo(String opis) {
                this.opis = opis;
            }

            public String getKomunikat(){
                return opis;
            }
        }

        Swiatlo[] swiatlo = {Swiatlo.CZERWONE, Swiatlo.ZOLTE, Swiatlo.ZIELONE};
        for (Swiatlo sw: swiatlo){
            System.out.println(sw.name()+" -> "+sw.getKomunikat());
        }
    }

    public void Zadanie2(){
        enum PizzaSize{
            MALA(24, 16.00F),
            SREDNIA(30, 21.99F),
            DUZA(40, 32.99F);

            private float srednica;
            private float cena;

            PizzaSize(float srednica, float cena){
                this.srednica = srednica;
                this.cena = cena;
            }

            public float getCena() {
                return cena;
            }

            public float getSrednica() {
                return srednica;
            }
        }

        PizzaSize[] pizzaSize = {PizzaSize.MALA, PizzaSize.SREDNIA, PizzaSize.DUZA};
        for(PizzaSize pizza: pizzaSize){
            System.out.println("Srednica: "+pizza.srednica+", cena: "+pizza.cena);
        }
    }
}

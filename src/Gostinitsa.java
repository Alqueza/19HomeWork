public class Gostinitsa extends  Family implements Arenda{
    public Gostinitsa(String name1, String name2, String name3) {
        super(name1, name2, name3);
    }

    public Gostinitsa() {

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void adress() {
        System.out.println("Адресс гостиницы: Гостиница #3");
    }

    @Override
    public void arenda() {
        System.out.println("Оплатите арендную плату до завтра");


    }
}

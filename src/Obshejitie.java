public class Obshejitie extends  Family implements Arenda {
    public Obshejitie(String name1, String name2, String name3) {
        super(name1, name2, name3);
    }

    public Obshejitie() {

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void adress() {
        System.out.println("Адресс общежития: xasdy3041");
    }

    @Override
    public void arenda() {
        System.out.println("Оплатите арендную плату до конца недели");
    }
}

package exemplul05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mesaj {
    private String mesaj;

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public String toString() {
        return mesaj;
    }
}


class MainApp {
    public static void main(String []args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans05.xml");
        Mesaj m1 = (Mesaj) context.getBean("mesaj");
        System.out.println("Obiectul m1 dupa creare:" + m1);
        m1.setMesaj("Al doilea mesaj!");
        System.out.println("Obiectul m1 dupa setare:" + m1);
        Mesaj m2 = (Mesaj) context.getBean("mesaj");
        System.out.println("Obiectul m2 dupa creare:" + m2);
    }
}

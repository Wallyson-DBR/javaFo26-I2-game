import greenfoot.Greenfoot;
import greenfoot.World;

public class MyWorld extends World {

    //ATRIBUTOS - Coisas que o mundo tem
    Jogador jogador1;
    Inimigo inimigo1;
    Inimigo inimigo2;
    Moeda moeda1;
    Moeda moeda2;
    Moeda moeda3;
    Moeda moeda4;
    Moeda moeda5;

    //METODO CONSTRUTOR
    public MyWorld(){
        super(1200,700,1);
        setBackground("imagens/background/background_light_600.png");

        jogador1 = new Jogador(3,5,100);
        addObject(jogador1, 600,350);

        inimigo1 = new Inimigo(5, 1);
        addObject(inimigo1, 700, Greenfoot.getRandomNumber(700));

        inimigo2 = new Inimigo(5, 1);
        addObject(inimigo2, 500, Greenfoot.getRandomNumber(700));

        moeda1 = new Moeda(50,1000);
        moeda1.spawnar(this);
        moeda2 = new Moeda(50,1000);
        moeda2.spawnar(this);
        moeda3 = new Moeda(50,1000);
        moeda3.spawnar(this);
        moeda4 = new Moeda(50,1000);
        moeda4.spawnar(this);
        moeda5 = new Moeda(50,1000);
        moeda5.spawnar(this);

    }

    //METODOS DE CLASSE

}
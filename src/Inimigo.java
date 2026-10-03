import greenfoot.Actor;
import greenfoot.Greenfoot;

public class Inimigo extends Actor {

    //ATRIBUTOS
    int velocidade;
    int direcao;    //Pode ser +1 (Direita) ou -1 (Esquerda)
    int dano;

    //CONSTRUTORES
    public Inimigo(){}

    public Inimigo(int velocidade, int dano){

        int numero = Greenfoot.getRandomNumber(10);
        if(numero<5){
            this.direcao = +1;
        }
        else {
            this.direcao = -1;
        }
        this.velocidade = velocidade;
        this.dano = dano;
        setImage("imagens/inimigos/Monstro/Monstro_baixo_0.png");
    }

    //METODOS
    public void act(){
        movimentar();
    }

    public void movimentar(){
        setLocation(getX()+(velocidade * direcao), getY());
        if(getX()<20 || getX() >1180){
            direcao = direcao * -1;
        }
    }

    public void atacar(){

    }

}

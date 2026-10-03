import greenfoot.Actor;
import greenfoot.Greenfoot;

public class Jogador extends Actor {

    //ATRIBUTOS
    int vidas;
    int velocidade;
    String imagemBaixo;
    String imagemCima;
    String imagemDireita;
    String imagemEsquerda;
    int estamina;

    //CONSTRUTOR
    public Jogador(){
    }
    public Jogador(int vidas, int velocidade, int estamina) {
        this.vidas = vidas;
        this.velocidade = velocidade;
        this.estamina = estamina;
        this.imagemBaixo = "imagens/jogadores/Jogador1/Jogador_baixo_1.png";
        this.imagemCima = "imagens/jogadores/Jogador1/Jogador_cima_1.png";
        this.imagemEsquerda = "imagens/jogadores/Jogador1/Jogador_esquerda_1.png";
        this.imagemDireita = "imagens/jogadores/Jogador1/Jogador_direita_1.png";

        setImage(imagemBaixo);
    }

    //METODOS
    public void act() {
        movimentar();
    }

    public void movimentar(){
        if(Greenfoot.isKeyDown("right")){
            //Andar para a direita:
            setLocation(getX()+velocidade, getY());
            setImage(imagemDireita);
        }
        if(Greenfoot.isKeyDown("left")){
            //Andar para a esquerda:
            setLocation(getX()-velocidade, getY());
            setImage(imagemEsquerda);
        }
        if(Greenfoot.isKeyDown("up")){
            //Andar para a cima:
            setLocation(getX(), getY()-velocidade);
            setImage(imagemCima);
        }
        if(Greenfoot.isKeyDown("down")){
            //Andar para a baixo:
            setLocation(getX(), getY()+velocidade);
            setImage(imagemBaixo);
        }
    }

    public void coletarMoedas(){

    }


}

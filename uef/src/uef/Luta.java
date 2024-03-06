package uef;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            System.out.println("A luta foi marcada!");
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else{
            System.out.println("A LUTA NAO FOI MARCADA!");
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if (this.aprovado){
            System.out.println("DESAFIADO: ");
            this.desafiado.apresentar();
            System.out.println("DESAFIANTE: ");
            this.desafiante.apresentar();
            
            Random ale = new Random();
            
            int vencedor = ale.nextInt(3);
            
            switch(vencedor){
                case 0 -> {
                    //empate
                    System.out.println("O GANHADOR DA LUTA FOI: EMPATOU!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                }
                case 1 -> {
                    //desafiado
                    System.out.println("O GANHADOR DA LUTA FOI: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                }
                case 2 -> {
                    //desafiante
                    System.out.println("O GANHADOR DA LUITA FOI:" + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                }
            }
        } else{
            System.out.println("A luta não pode acontecer");
        }
    }

    
    
    
    
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    
    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    
    
}

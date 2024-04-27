package com.example.pedra_papel_tesoura_joaovitor.model;

import java.util.Random;

public class Jogada
{
    public static final int PEDRA = 0;
    public static final int PAPEL = 1;
    public static final int TESOURA = 2;
    private int opcao_sorteada;

    public Jogada()
    {
        this.opcao_sorteada = new Random().nextInt(3);
    }

    public String resultado(int opcao_escolhida)
    {
        if (opcao_escolhida == opcao_sorteada) {
            return "empate";
        } else if ((opcao_escolhida == PEDRA && opcao_sorteada == TESOURA) ||
                   (opcao_escolhida == PAPEL && opcao_sorteada == PEDRA) ||
                   (opcao_escolhida == TESOURA && opcao_sorteada == PAPEL)) {
            return "Você ganhou!";
        }else {
            return "Você perdeu!";
        }
    }
    public int getOpcao_sorteada()
    {
        return opcao_sorteada;
    }
}

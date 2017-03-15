package roteiroListas;

import java.util.ArrayList;

public interface AgendaDeAniversarios {
	public void adcionarAniversariante(String nome, int dia, int mes, int ano);
	public ArrayList<String> obterAniversariantesDoMes(int mes);
	public void removerAniversariantes(String nomeAniversariante);
}

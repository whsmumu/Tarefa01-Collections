package exercicios;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Tarefa01 {
    public static void main(String[] args) {
        ListaGeneros();
    }

    private static void ListaGeneros() {

        List<Pessoa> masculino = new ArrayList<>();
        List<Pessoa> feminino = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Digite o nome(ou 'sair' encerrar o programa): ");
            String nome = scan.nextLine().trim().toLowerCase();

            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.print("Digite o sexo: ");
            String sexo = scan.nextLine().trim().toLowerCase();

            Pessoa pessoa = new Pessoa(nome, sexo);

            if (sexo.equals("feminino")) {
                feminino.add(pessoa);

            } else if (sexo.equals("masculino")) {
                masculino.add(pessoa);
            } else {
                System.err.println("Sexo invalido tente novamente");
            }
        }

        System.out.println(" ");

        System.out.println("Lista do genero masculino:" + masculino);
        System.out.println("Lista do genero feminino:" + feminino);

        scan.close();
    }
}
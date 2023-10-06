package br.com.questao2;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Talita","talitapaivadiniz@gmail.com","123",3,503);
        Professor professor= new Professor("Michelle","michele@hotmail.com","123", 5.000F,60);

        System.out.println("\n Aluno: \n" + aluno.mostraAluno());
        System.out.println("\n Professor: \n" + professor.mostraProfessor());

    }
}

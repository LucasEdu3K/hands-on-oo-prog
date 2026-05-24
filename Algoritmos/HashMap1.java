import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {

        HashMap<Integer, String> alunos = new HashMap<>();
        alunos.put(10, "Ana");
        alunos.put(20, "Carla");
        alunos.put(30, "Luiz");
        alunos.put(40, "Luca");

        System.out.println("Aluno matricula 20: " + alunos.get(20));
        alunos.remove(10);

        System.out.println("\n--- Alunos Cadastrados ---\n");

        for (Integer matricula : alunos.keySet()){
            String nome = alunos.get(matricula);
            
            System.out.println("Matricula " + matricula + " Aluno: " + nome);
        }
    }

    

    
}

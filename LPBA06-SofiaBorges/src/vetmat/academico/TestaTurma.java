package vetmat.academico;

public class TestaTurma {
    public static void main(String[] args) {
        Turma t1 = new Turma("3º INF - Turma B");
        
        t1.matricular("Taine");
        t1.matricular("Vitoria Corte");
        t1.matricular("Juliane");
        t1.matricular("Neuri");
        t1.matricular("Elci");
        t1.matricular("José");
        
        /**
         * Registro de notas:
         * 
         * `s` representa o aluno
         * `b` representa o bimestre
         * 
         * A utilização de (float) (Math.random() * (10 - 1 + 1) + 1) seria para
         * gerar um número aleatório float entre 0 e 10. Para acessar o conteúdo
         * utilizei o site https://www.javatpoint.com/how-to-generate-random-number-in-java
         */
        for (int s = 0; s < 6; s++){
            for (int b = 0; b < 4; b++){
                t1.registrarNota(s, b, (float) (Math.random() * (10 - 1 + 1) + 1));
            }
        }
        
        // Chama método utilizado para calcular média
        t1.calcularMedia();
        
        // Chama método utilizado para mostrar notas
        t1.mostrarNotas();
    }
}

package vetmat.academico;

public class Turma {
    public static final int MAX_ALUNOS = 20;
    public static final int MAX_NOTAS = 5;
        
    private String nomeTurma;
    private int qtdeMatriculas;
    private String[] nomes = new String[MAX_ALUNOS];
    private float[][] notas = new float[MAX_ALUNOS][MAX_NOTAS];
    
    public Turma(String nomeTurma) {
       this.nomeTurma = nomeTurma;
       qtdeMatriculas = 0;
       limpaNomesNotas();
    }
    
    public void limpaNomesNotas(){
        for (int i=0; i<MAX_ALUNOS; i++) {
            nomes[i] = "";
        }
        for (int lin=0; lin<MAX_ALUNOS; lin++) {
            for (int col=0; col<MAX_NOTAS; col++) {
                notas[lin][col] = 0F;
            }
        } 
    }
    
    public void matricular(String n) {
        if (qtdeMatriculas<MAX_ALUNOS) {
            qtdeMatriculas++;
            nomes[qtdeMatriculas-1] = n;
        } else {
            System.err.println("Não há mais vagas na turma! Matrícula na efetivada.");
        }
    }

    public void registrarNota(int aluno, int bimestre, float nota) {
        notas[aluno][bimestre] = nota;
    }
    
    public void calcularMedia(){
        for (int v = 0; v < qtdeMatriculas; v++){
            notas[v][4] = (notas[v][0]+notas[v][1]+notas[v][2]+notas[v][3])/4;
        }
    }

    public void mostrarNotas() {
        System.out.println("---------------------------------------------------------");
        System.out.println(" Aluno     B1     B2    B3    B4    Media");
        System.out.println("---------------------------------------------------------");
        
        for (int a = 0; a < qtdeMatriculas; a++){
            System.out.printf("%s   %.01f     %.01f    %.01f     %.01f     %.01f %n", nomes[a], notas[a][0], notas[a][1], notas[a][2], notas[a][3], notas[a][4]);
        }
    }
}

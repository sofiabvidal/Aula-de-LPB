package vetmat.exemploaula;

public class ExemploSlides {
    
    public static void main(String[] args) { 
        String nomes[] = {"Ana", "Beatriz", "Carlos", "Cícero", "Denise"};
        float notas[][] = { {6F, 8F, 7F, 9F, 0F},  
                            {7F, 9F, 6F, 10F,0F},
                            {8F, 8F, 7F, 8F, 0F},
                            {9F, 7F, 9F, 7F, 0F},
                            {6F, 7F, 8F, 9F, 0F} };      
        
        for (int aluno=0; aluno<5; aluno++) {
            notas[aluno][4] = (notas[aluno][0]+notas[aluno][1]+notas[aluno][2]+notas[aluno][3])/4;
        }
        
        System.out.println("---------------------------------------------------------");
        System.out.println(" Aluno     B1     B2    B3    B4    Media");
        System.out.println("---------------------------------------------------------");
       
        for (int l = 0; l < 5; l++){
            System.out.printf("%s   %.01f     %.01f    %.01f     %.01f     %.01f %n", nomes[l], notas[l][0], notas[l][1], notas[l][2], notas[l][3], notas[l][4]);
        }
    }
    
}

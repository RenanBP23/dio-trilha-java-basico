import javax.lang.model.util.ElementScanner14;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        int nota = 6;

        if (nota < 6)
            System.out.println("Reprovado");
        else if (nota == 6)
            System.out.println("Recuperacao");
        else
            System.out.println("Aprovado");
    }
}

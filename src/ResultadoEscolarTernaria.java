public class ResultadoEscolarTernaria {
    
    public static void main(String[] args) {
        int nota = 5;
        String resultado = nota >=7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado";
// resultado igual a se a nota for maior igual a sete, se for maior igual a 7 Aprovado Se não Reprovado
        
        System.out.println(resultado);
    }
}
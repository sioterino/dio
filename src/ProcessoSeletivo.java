public class ProcessoSeletivo {

    private final double BASE_SALARIAL = 2000;
    private final double SALARIO_PRETENDIDO;

    public ProcessoSeletivo(double salarioPretentido) {
        this.SALARIO_PRETENDIDO = salarioPretentido;
    }

    public void iniciarProcessoSeletivo() {
        System.out.println("Iniciando o processo seletivo...");
        System.out.println("Salário pretendido: " + SALARIO_PRETENDIDO);
        
        if (SALARIO_PRETENDIDO < BASE_SALARIAL) {
            System.out.println("LIGAR PARA CANDIDATO.");
        } else if (SALARIO_PRETENDIDO == BASE_SALARIAL) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA.");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS CANDIDATOS.");
        }
    }
    
    public static void main(String[] args) {
        ProcessoSeletivo processo = new ProcessoSeletivo(2500);
        processo.iniciarProcessoSeletivo();
    }

}

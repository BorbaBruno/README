
/**
 * Sistema cadastral simples de uma Academia.
 * @author (Bruno Borba) 
 * @version (02.22)
 */

public class TarefaM1
{
    public static void main (String [] args) {
        //Entrada de dados cadastrais.
        System.out.println("Vamos realizar seu cadastro, por favor, informe os dados solicitados a seguir =)");
        String nome = Teclado.leString("Digite seu nome completo: ");
        int idade = Teclado.leInt("Digite sua idade: ");
        char sexo = Teclado.leChar("Sexo M/F: ");
        String cpf = Teclado.leString("Digite seu CPF: ");
        int rg = Teclado.leInt("Digite seu RG: ");
        String telefone = Teclado.leString("Digite seu telefone com DDD: ");
        double altura = Teclado.leDouble("Digite sua altura, exemplo 1.80: " );
        int peso = Teclado.leInt("Digite seu peso, exemplo 80: ");
        String plano = Teclado.leString("Digite o plano desejado, PARCIAL ou LIVRE: ");
        
        System.out.println("***************************************************************************************************");
        System.out.println("***************************************************************************************************");
        
        //Saída de dados cadastrais.
        System.out.println("Obrigado por realizar seu cadastro, é um prazer tê-lo conosco, segue abaixo o resumo do seu cadastro =)");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade+" anos");
        System.out.println("Sexo: "+sexo);
        System.out.println("CPF: "+cpf);
        System.out.println("RG: "+rg);
        System.out.println("Telefone: "+telefone);
        System.out.println("Altura: "+altura);
        System.out.println("Peso: "+peso);
        System.out.println("Plano desejado: "+plano);

        if (plano.length() >= 6 ) {
        System.out.println("O valor do plano escolhido é de R$ 50,00 mensais.");            
    }
        else {
        System.out.println("O valor do plano escolhido é de R$ 75,00 mensais.");    
        }
}
}


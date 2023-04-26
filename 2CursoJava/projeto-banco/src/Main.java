import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ContaCliente jacqueline = new ContaCliente();
        jacqueline.setNome("Jacqueline");
        jacqueline.setTipo("Corrente");
        jacqueline.setSaldo(2500);

        System.out.println("Operações:\n\n1- Consultar saldos\n2- Receber valor\n3- Transferir valor\n4- Sair\n\nDigite a opção desejada:");
    }
}

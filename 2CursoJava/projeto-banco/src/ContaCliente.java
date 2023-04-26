import java.util.Scanner;

public class ContaCliente {
    //Atributos
    private String nome;
    private String tipo;
    private double saldo;

    //Construtores
    public ContaCliente(String nome, String tipo, double saldo) {
        this.nome = nome;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    //Métodos
    public void operacao() {
        Scanner input = new Scanner(System.in);

        int n = 0;
        while (n != 4) {

            System.out.println("\nOperações:\n\n1- Consultar saldos\n2- Receber valor\n3- Transferir valor\n4- Sair\n\nDigite a opção desejada:");
            n = input.nextInt();

            switch (n) {
                case 1:
                    System.out.println("\nSaldo atual: " + this.getSaldo());
                    break;
                case 2:
                    System.out.println("\nDigite o valor a receber: ");
                    double v = input.nextDouble();
                    this.recebe(v);
                    System.out.println("\nSaldo atualizado: " + this.getSaldo());
                    break;
                case 3:
                    System.out.println("\nDigite o valor a transferir: ");
                    double v2 = input.nextDouble();
                    this.transfere(v2);
                    System.out.println("\nSaldo atualizado: " + this.getSaldo());
                    break;
                case 4:
                    System.out.println("\nAtendimento finalizado!");
                    break;
                default:
                    System.out.println("\nOpção inválida");
                    break;
            }
        }
    }

    public void transfere(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Não há saldo suficiente para fazer essa transferência.");
        }
    }

    public void recebe(double valor) {
        this.saldo += valor;
    }
    
    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int parametro1 = terminal.nextInt();
        System.out.println("Digite o segundo número: ");
        int parametro2 = terminal.nextInt();

        try {
contar(parametro1,parametro2);
        }catch (InvalidNumberException e){
System.out.println("O segundo parâmetro deve ser maior que o primeiro20");
        }
    }
static void contar(int parametro1, int parametro2) throws InvalidNumberException{
        if(parametro1 > parametro2){
            throw new InvalidNumberException();
        }
int contagem =  parametro2 - parametro1;

for(int N = 0; N <= contagem; N ++){
    if(N == 0 ){
        continue;
    }
    System.out.println("Imprimindo o número" + N);
}
}
}

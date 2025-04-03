import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
            Computador[] pc = new Computador[3];
            Computador[] comprar = new Computador[3];
            Scanner entrada = new Scanner(System.in);
            float total = 0;
            int aux;

            //Promocao 1
            SistemaOperacional so1 = new SistemaOperacional("Linux Ubuntu", 32);
            HardwareBasico[] hardware1 = new HardwareBasico[3];
            hardware1[0] = new HardwareBasico("Pentium Core i3", 2200);
            hardware1[1] = new HardwareBasico("Memoria RAM", 8);
            hardware1[2] = new HardwareBasico("HD", 500);
            pc[0] = new Computador("Apple",367, so1, hardware1);
            MemoriaUSB musb1 = new MemoriaUSB("Pen-Drive", 16);
            pc[0].addMemoriaUSB(musb1);

            //Promocao 2
            SistemaOperacional so2 = new SistemaOperacional("Windows 8", 64);
            HardwareBasico[] hardware2 = new HardwareBasico[3];
            hardware2[0] = new HardwareBasico("Pentium Core i5", 3370);
            hardware2[1] = new HardwareBasico("Memoria RAM", 16);
            hardware2[2] = new HardwareBasico("HD", 1);
            pc[1] = new Computador("Samsung",1601, so2, hardware2);
            MemoriaUSB musb2 = new MemoriaUSB("Pen-Drive", 32);
            pc[1].addMemoriaUSB(musb2);

            //Promocao 3
            SistemaOperacional so3 = new SistemaOperacional("Windows 10", 64);
            HardwareBasico[] hardware3 = new HardwareBasico[3];
            hardware3[0] = new HardwareBasico("Pentium Core i7", 4500);
            hardware3[1] = new HardwareBasico("Memoria RAM", 32);
            hardware3[2] = new HardwareBasico("HD", 2);
            pc[2] = new Computador("Dell",6045, so3, hardware3);
            MemoriaUSB musb3 = new MemoriaUSB("HD Externo", 1);
            pc[2].addMemoriaUSB(musb3);

        System.out.println("----------------------------");
        System.out.println("[Promoção 1]");
        pc[0].mostraPCConfigs();
        System.out.println("[Promoção 2]");
        pc[1].mostraPCConfigs();
        System.out.println("[Promoção 3]");
        pc[2].mostraPCConfigs();

        System.out.println("[Digite qual/quais computador(es) você quer comprar (1) (2) (3)?] ");
        System.out.println("[Digite (0) Para finalizar compra!]");

        for(int i = 0; i <=2; i++)
        {
            aux = entrada.nextInt();
            if (aux == 0)
            {
                break;
            }
            else if (aux == 1)
            {
                comprar[i] = pc[0];
            }
            else if (aux == 2)
            {
                comprar[i] = pc[1];
            }
            else if (aux == 3)
            {
                comprar[i] = pc[2];
            }
            else
            {
                System.out.println("Erro, digite o valor correto!");
            }
        }

        Cliente cliente = new Cliente("Henrique", 123456789, comprar);
        System.out.println("[Nome do Cliente:] " + cliente.nome);
        System.out.println("[CPF do Cliente:] " + cliente.cpf);

        System.out.println("[Os computadores comprados foram:] ");
        System.out.println("----------------------------");
         for(int i = 0; i <=2; i++)
        {
            if (comprar[i] != null)
            {
                comprar[i].mostraPCConfigs();
            }

        }

         total = cliente.calculaTotalCompra();

        System.out.println("[Total da compra:] " + total + " R$");

    }
}

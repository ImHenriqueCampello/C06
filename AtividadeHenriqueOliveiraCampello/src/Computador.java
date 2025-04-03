public class Computador
{
    String marca;
    public float preco;

    public SistemaOperacional so;
    public MemoriaUSB musb;
    public HardwareBasico[] hardware;

    public Computador(String marca, float preco, SistemaOperacional so, HardwareBasico[] hardware)
    {
        this.marca = marca;
        this.preco = preco;
        this.so = so;
        this.hardware = hardware;
    }


    public void mostraPCConfigs()
    {
        System.out.println("[Configuração do PC:] ");
        System.out.println("[Marca:] " + marca);
        System.out.println("[Preço:] " + preco + " R$");
        System.out.println("[Processador:] " + hardware[0].nome + " " + hardware[0].capacidade + " Mhz");
        System.out.println("[Memoria:] " + hardware[1].nome + " " + hardware[1].capacidade + " Gb");
        if(hardware[2].capacidade > 100)
        {
            System.out.println("[Armazenamento:] " + hardware[2].nome + " " + hardware[2].capacidade + " Gb");
        }
        else
        {
            System.out.println("[Armazenamento:] " + hardware[2].nome + " " + hardware[2].capacidade + " Tb");
        }
        System.out.println("[Sistema:] " + so.nome + " " + so.tipo + " bits");
        if(musb.capacidade > 10)
        {
            System.out.println("[MemoriaUSB:] " + musb.nome + " " + musb.capacidade + " Gb");
        }
        else
        {
            System.out.println("[MemoriaUSB:] " + musb.nome + " " + musb.capacidade + " Tb");
        }
        System.out.println("----------------------------");
    }

    public void addMemoriaUSB(MemoriaUSB musb)
    {
        this.musb = musb;
    }
}

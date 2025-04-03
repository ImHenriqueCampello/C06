public class Cliente
{
    public String nome;
    public long cpf;
    public Computador[] pc;

    public Cliente(String nome, long cpf, Computador[] pc)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.pc = pc;
    }

    public float calculaTotalCompra()
    {
        float total = 0;
        for(int i = 0; i < pc.length; i++)
        {
            if(pc[i] != null)
            {
                total += pc[i].preco;
            }
        }
        return total;
    }


}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Agenda extends JFrame{
    public Agenda(){
        Painel painel = new Painel();
        getContentPane().add(painel);
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    
    }
}

class Painel extends JPanel{
    public Painel() {
        JLabel image;
        JPanel divisaoCadastro = new JPanel	();
        JPanel divisaocentro = new JPanel();
        JPanel atributos = new JPanel();
        JPanel botoes = new JPanel();
        JPanel anotacoes = new JPanel();
    
        JTextField bCodigo,
                    bNome,
                    bEndereco,
                    bTelefone,
                    cTexto;


        JButton inserir,
                consultar,
                alterar,
                excluir,
                limpar;

        setLayout(new BorderLayout());
        image = new JLabel(new ImageIcon("image.jpeg"));
        add("North", image);

        divisaoCadastro.setLayout(new BorderLayout());
        anotacoes.setLayout(new BorderLayout());

        atributos.setBackground(Color.ORANGE);
        botoes.setBackground(Color.GREEN);
        anotacoes.setBackground(Color.BLUE);
        divisaocentro.setBackground(Color.GRAY);
        

        add("Center",divisaocentro);
        add("West", divisaoCadastro);


        divisaoCadastro.add("Center", atributos);
        divisaoCadastro.add("South", botoes);
        divisaoCadastro.add("East", anotacoes);

        // Incializando os elementos do atributo
      atributos.setLayout(new GridLayout(4,1));

        JPanel codigo = new JPanel();
        codigo.setLayout(new FlowLayout());
        codigo.add(new JLabel("Codigo"));
        bCodigo = new JTextField(10);

        JPanel nome = new JPanel();
        nome.setLayout(new FlowLayout());
        nome.add(new JLabel("Nome"));
        bNome = new JTextField(10);

        JPanel endereco = new JPanel();
        endereco.setLayout(new FlowLayout());
        endereco.add(new JLabel("endereco"));
        bEndereco = new JTextField(10);

        JPanel telefone = new JPanel();
        telefone.setLayout(new FlowLayout());
        telefone.add(new JLabel("telefone"));   
        bTelefone = new JTextField(10);

        codigo.add(bCodigo);
        nome.add(bNome);
        endereco.add(bEndereco);
        telefone.add(bTelefone);

        atributos.add(codigo);
        atributos.add(nome);
        atributos.add(endereco);
        atributos.add(telefone);

     // Anotações
        JPanel tituloAnotacoes = new JPanel();
        tituloAnotacoes.add(new JLabel ("Anotacoes"));
        anotacoes.add("North", tituloAnotacoes);
        cTexto = new JTextField (20);
        anotacoes.add("Center",cTexto);
        
        //Botoes
        JPanel jb_botoes = new JPanel();
        //b_botoes.setLayout(new FlowLayout());
        inserir = new JButton ("INSERIR");
        consultar = new JButton ("CONSULTAR");
        alterar = new JButton ("ALTERAR");
        excluir = new JButton ("EXCLUIR");
        limpar = new JButton ("LIMPAR");

        jb_botoes.add(inserir);
        jb_botoes.add(consultar);
        jb_botoes.add(alterar);
        jb_botoes.add(excluir);
        jb_botoes.add(limpar);

        botoes.add(jb_botoes);



    
    }

}




class PrincipalAgenda
{
    public static void main (String args[])
    {
       Agenda agenda = new Agenda();


    }
}
import javax.swing.*;

public class LojaJogos {

    public static void main(String[] args) {
        int opcao =0;
        Cliente cliente = new Cliente();
        Ingresso ingresso = new Ingresso();
        Pedido pedido = new Pedido();

       // try{

            do {
                //Ingresso ingresso;

                String nomecliente = JOptionPane.showInputDialog(null, "Informe o nome do cliente",
                        "PEDIDO INGRESSO", JOptionPane.PLAIN_MESSAGE);
                cliente.setNome(nomecliente);
                //Cliente cliente = new Cliente(nomecliente);

                String nomejogo = JOptionPane.showInputDialog(null, "Informe o nome do jogo",
                        "PARTIDA", JOptionPane.PLAIN_MESSAGE);
                ingresso.setPartida(nomejogo);


                Double valorjogo = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do jogo",
                        "PREÇO", JOptionPane.PLAIN_MESSAGE));
                ingresso.setValor(valorjogo);


                int qtdingresso = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade de ingressos",
                        "QUANTIDADE", JOptionPane.PLAIN_MESSAGE));
                ingresso.setQuantidade(qtdingresso);

                String finaliza = "Pedido feito para " + cliente.getNome() + "\n" + ingresso.getQuantidade() + " Ingressos: " + ingresso.getPartida() +
                       "\n Valor: " + pedido.calcula();
                JOptionPane.showMessageDialog(null, finaliza, "PEDIDO FINALIZADO", JOptionPane.PLAIN_MESSAGE);

                String carrinho = JOptionPane.showInputDialog(null, "Deseja retornar para escolher outro jogo? \n 1.SIM \n 2.NÃO", "CARRINHO", JOptionPane.PLAIN_MESSAGE);
                opcao = Integer.parseInt(carrinho);

                pedido.setValor(valorjogo);

//                String finaliza = "Pedido feito para " + cliente.getNome() + "\n" + ingresso.getQuantidade() + " Ingressos: " + ingresso.getPartida() +
//                        "\n Valor: " + pedido.calcula();
//                JOptionPane.showMessageDialog(null, finaliza, "PEDIDO FINALIZADO", JOptionPane.PLAIN_MESSAGE);
            }

                while (opcao ==1);





                    //retornar mensagem pedido finalizado e o calculo
               // JOptionPane.showMessageDialog(null, finaliza, "PEDIDO FINALIZADO", JOptionPane.PLAIN_MESSAGE);
                //opcao = Integer.parseInt(finaliza);
//            }
//
//                catch(Exception){
//                JOptionPane.showMessageDialog(null, get.Messenger, "Opção invalida, escolha 1 para nova compra e 2 para finalizar", JOptionPane.ERROR_MESSAGE);
//                }


        }


    }



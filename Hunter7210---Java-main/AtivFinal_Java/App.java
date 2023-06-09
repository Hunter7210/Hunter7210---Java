package AtivFinal_Java;

import java.util.Random;

import javax.lang.model.util.Elements.Origin;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        Random rd = new Random();

        int cont = 0;

        ContaPF contaPF[] = new ContaPF[5];
        ContaPJ contaPJ[] = new ContaPJ[5];

        boolean ligado = true;
        int acao;
        int acao1;

        while (ligado) {

            int num1 = 00000;
            int fim1 = 99999;

            int num2 = 99999;
            int fim2 = 999999;

            int numContaP = rd.nextInt(num1, fim1);
            int numContaE = rd.nextInt(num1, fim1);

            int corSen;
            int senha = 0;

            JOptionPane.showMessageDialog(null, "1- CRIAR CONTA\n 2- ENTRAR");
            acao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Ação"));

            JOptionPane.showMessageDialog(null, "1- Pessoa Física\n 2- Pessoa Juridica");
            acao1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a Ação"));

            if (acao == 1 && acao1 == 1) {

                // contruir o objeto
                contaPF[cont] = new ContaPF(null, null, null, null, null, null, null, null, null);
                // preencher

                contaPF[cont].setNomeP(JOptionPane.showInputDialog("Digite seu nome:"));
                contaPF[cont].setIdadeP(JOptionPane.showInputDialog("Digite sua idade:"));
                contaPF[cont].setDatNasc(JOptionPane.showInputDialog("Digite sua data de nascimento: "));
                contaPF[cont].setcPF(JOptionPane.showInputDialog("Digite seu CPF:"));
                contaPF[cont].setEndeP(JOptionPane.showInputDialog("Digite seu endereço:"));
                contaPF[cont].setEmailP(JOptionPane.showInputDialog("Digite seu e-mail: "));
                contaPF[cont].setNomeMaeP(JOptionPane.showInputDialog("Digite o nome da mãe: "));
                contaPF[cont].setNomePaiP(JOptionPane.showInputDialog("Digite o nome do pai (não obrigatório): "));
                contaPF[cont].setTelP(JOptionPane.showInputDialog("Digite seu telefone/celular: "));

                JOptionPane.showMessageDialog(null,
                        "SEU NOME É: " + contaPF[cont].getNomeP() + "\n" + "O NUMERO DE SUA CONTA É: " + numContaP);

            }

            if (acao == 1 && acao1 == 2) {

                // contruir o objeto
                contaPJ[cont] = new ContaPJ(null, null, null, null, null);
                // preencher

                contaPJ[cont].setNomeEmp(JOptionPane.showInputDialog("Digite o nome de sua empresa:"));
                contaPJ[cont].setcNPJ(JOptionPane.showInputDialog("Digite seu  CNPJ: "));
                contaPJ[cont].setEndeEmp(JOptionPane.showInputDialog("Digite o endereço de sua empresa: "));
                contaPJ[cont].setEmailEmp(JOptionPane.showInputDialog("Digite o e-mail de sua empresa:"));
                contaPJ[cont].setTelEmp(JOptionPane.showInputDialog("Digite o telefone da sua empresa: "));

                JOptionPane.showMessageDialog(null,
                        "Nome: " + contaPJ[cont].getNomeEmp() + "\n" + "CNPJ: " + contaPJ[cont].getcNPJ() + "\n"
                                + "Endereço: " + contaPJ[cont].getEndeEmp() + "\n" + "E-mail: "
                                + contaPJ[cont].getEmailEmp() + "\n" + "Telefone: " + contaPJ[cont].getTelEmp());

                corSen = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Seus dados estão corretos?" + "\n" + "1- SIM" + "\n" + "2- NÃO"));

                if (corSen == 1) {

                    senha = Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite sua senha:" + "\n" + "SUA SENHA DEVE CONTER 6 NUMEROS"));
                    JOptionPane.showMessageDialog(null, "O NOME DA EMPRESA É: " + contaPJ[cont].getNomeEmp() + "\n"
                            + "O NUMERO DE SUA CONTA É: " + numContaE + "\n" + "SUA SENHA É: " + senha);
                } else {
                    JOptionPane.showMessageDialog(null, "PREENCHA NOVAMENTE");
                }

            }
            /* (2- Permitir busca de conta pelo n° da conta/ou nome) */
            if (acao == 2 && acao1 == 1) {
                int pesqu = 0;
                int nContaDig;
                int nomeDig;
                
                pesqu = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Escolha uma ação" + "\n" + "1- Acessar por n° Conta" + "\n" + "2- Acessar por Nome"));
                if (pesqu == 1) {
                    nContaDig =Integer.parseInt(JOptionPane.showInputDialog(null,
                            "Digite n° da conta: "));
                            if (nContaDig == numContaP) {
                                 JOptionPane.showMessageDialog(null, "Acesso permitido");
                            }
                            else if (nContaDig != numContaP) {
                                JOptionPane.showMessageDialog(null, "Acesso negado");
                           }
                }
                else {
                    nomeDig =Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite seu nome: "));

                    
                }


            }
        }
    }
}
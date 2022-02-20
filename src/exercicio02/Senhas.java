package exercicio02;

import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Senhas {
    //Crio um método para verificar a senha
    static void verificarSenha() {
        String senha;

        senha = JOptionPane.showInputDialog("Digite sua senha:\n" +
                "Sua senha precisa ter o seguinte padrão:\n" +
                "* Possuir no mínimo 6 caracteres.\n" +
                "* Conter no mínimo 1 digito\n" +
                "* Conter no mínimo 1 letra em minúsculo \n" +
                "* Conter no mínimo 1 letra em maiúsculo \n" +
                "* Conter no mínimo 1 caractere especial. os caracteres especiais são: !@#$%^&*()-+\n" +
                "\nExemplo de senha segura: Yp56%T\n\n");

        //defino um padrão para a minha senha
        Pattern p = Pattern.compile("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+]).{6,12})");
        //Verifico se a senha segue o padrão
        Matcher m = p.matcher(senha);

        if (m.matches() == true) {
            JOptionPane.showMessageDialog(null, "Senhá válida\nLogin Efetuado!");
        } else {
            JOptionPane.showMessageDialog(null,"Senha inválida\n");

            int tentando;
            String tentarNovamente;
            tentarNovamente = JOptionPane.showInputDialog("Tentar novamente?\nDigite 1 para sim\nDigite 2 para não:");
            tentando = Integer.parseInt(tentarNovamente);

            switch (tentando){
                case 1:
                    verificarSenha();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Você escolheu finalizar o programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida\nO programa será encerrado!");
            }
        }
    }

    public static void main(String[] args) {
        int tentarDeNovo;
        String tentar;
        Scanner tn = new Scanner(System.in);

        verificarSenha();

    }
}

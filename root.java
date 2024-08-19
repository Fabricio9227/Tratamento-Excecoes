package com.exception;

public class root {
    public static void main(String[] args) {
        //Criando/instanciando o objeto "d"
        Divisão d = new Divisão();

        //Criando duas arrays que serão usadas como parâmetro para a utilização do método "dividir()"
        int[] num1 = new int[] {10, 20, 30, 100};
        int[] num2 = new int [] {2, 0, 4};

        //criando um loop para percorrer todos os indices de "num1" e "num2"
        for(int i = 0; i < 4; i++) {
            try { //Tudo que está dentro desse bloco será testado, caso haja um erro, ele irá para a linha do catch

                d.dividir(num1[i], num2[i]); //Usamos como parâmetro os indices (i) de cada um dos arrays (num1 e num2)

            } catch (ArithmeticException erro) { //Aqui está tratando de uma "Exception" especifica, no caso do tipo aritimética

                System.out.println("ERRO: " + erro.getMessage());

            } catch (ArrayIndexOutOfBoundsException erro) { //Aqui está tratando de uma "Exception" especifica, no caso do tipo de acesso à posição da array

                System.out.println("ERRO: " + erro.getMessage());

            } catch (Exception erro) { //Aqui está tratando sobre qualquer tipo de erro, a classe Exception é do tipo genérica de erro
                System.out.println("Erro genérico!");
            } finally {
                System.out.println("Saindo do Try/Catch..");
            }
        }
        
    }
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Scanner;

public class ACMESports {
    private Scanner entrada = new Scanner(System.in);  // Atributo para entrada de dados

    private PrintStream saidaPadrao = System.out;   // Guarda a saida padrao - tela (console)

    private final String nomeArquivoEntrada = "dadosin.txt";  // Nome do arquivo de entrada de dados

    private final String nomeArquivoSaida = "dadosoutTeste.txt";

    private Medalheiro medalheiro;

    private Plantel plantel;

    public ACMESports() {
        medalheiro = new Medalheiro();
        plantel = new Plantel();
        redirecionaES();
    }


    public void executar() {
        cadastrasAtleta();
        cadastrarMedalha();
        cadastroMutuo();

    }

    private void cadastrasAtleta() {
        while (true) {
            int numero = entrada.nextInt();
            entrada.nextLine();
            if (numero == -1) {
                break;
            }
            String nome = entrada.nextLine();
            String pais = entrada.nextLine();
            Atleta novoAtleta = new Atleta(numero, nome, pais);
            plantel.cadastraAtleta(novoAtleta);
            System.out.println("1: "+ novoAtleta);
        }
    }

    private void cadastrarMedalha() {
        while (true) {
            int codigo = entrada.nextInt();
            if (codigo == -1) {
                break;
            }
            int tipo = entrada.nextInt();
            entrada.nextLine();
            boolean individual = Boolean.parseBoolean(entrada.nextLine());
            String modalidade = entrada.nextLine();
            Medalha novaMedalha = new Medalha(codigo, tipo, individual, modalidade);
            medalheiro.cadastraMedalha(novaMedalha);
            System.out.println("2: " + novaMedalha);
        }
    }

    private void cadastroMutuo() {
        int codigo = entrada.nextInt();
        int numero = entrada.nextInt();
        if (plantel.consultaAtleta(numero) != null && medalheiro.consultaMedalha(codigo) != null){
            Atleta atletaEncontrado = plantel.consultaAtleta(numero);
            Medalha medalhaEncontrada = medalheiro.consultaMedalha(codigo);
            medalhaEncontrada.adicionaAtleta(atletaEncontrado);
            atletaEncontrado.adicionaMedalha(medalhaEncontrada);
            System.out.println("3: " + medalhaEncontrada.getCodigo() + ", " + atletaEncontrado.getNumero());
        }
    }



    /*********************************************************************************
     //METODO PRONTO PRA REDIRECIONAR ENTRADA E SAIDA DE DADOS
     ********************************************************************************/

    private void redirecionaES() {
        try {
            BufferedReader streamEntrada = new BufferedReader(new FileReader(nomeArquivoEntrada));
            entrada = new Scanner(streamEntrada);   // Usa como entrada um arquivo
            PrintStream streamSaida = new PrintStream(new File(nomeArquivoSaida), Charset.forName("UTF-8"));
            System.setOut(streamSaida);             // Usa como saida um arquivo
        } catch (Exception e) {
            System.out.println(e);
        }
        Locale.setDefault(Locale.ENGLISH);   // Ajusta para ponto decimal
        entrada.useLocale(Locale.ENGLISH);   // Ajusta para leitura para ponto decimal
    }

    // Restaura E/S padrao de tela(console)/teclado
    // Chame este metodo para retornar a leitura e escrita de dados para o padrao
    private void restauraES() {
        System.setOut(saidaPadrao);
        entrada = new Scanner(System.in);
    }
}

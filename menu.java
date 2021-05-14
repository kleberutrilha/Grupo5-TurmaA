import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class menu {
	static int temp_dialog = 100, temp_narrativa = 10, temp_transicao = 25;

	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner(System.in);
		Digita("O ano é 3050 e após guerras a humanidade finalmente começou a desenvolver tecnologias para implantes corporais.",
				TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\nNós da Full Body Tech somos pioneiros nesta revolucionária tecnologia.", TimeUnit.MILLISECONDS,
				temp_dialog);
		Digita("\nSeu objetivo? Deixar de ser humano e ser um dos mais respeitados VP's (Vice President) obtendo um dos nossos implantes e assim se tornar meio humano, \n meio robô.",
				TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\nTemos dois dos mais avançados implantes!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\nVocê será desafiado!", TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\nNo fim, somente seus resultados poderão dizer se você será Tyger Fayol's, Valentinos Taylor's ou continuará no mundo dos humanos vagando.",
				TimeUnit.MILLISECONDS, temp_dialog);
		Digita("\nVocê está pronto?", TimeUnit.MILLISECONDS, temp_dialog);

		int escolha_menu;

		do {
			Digita("\n\n*** FULL BODY TECH *** \n\n1 - Jogar \n2 - Personagens\n3 - Créditos \n4 - Sair",
					TimeUnit.MILLISECONDS, temp_transicao);
			System.out.println("\n");
			escolha_menu = entrada.nextInt();
			if (escolha_menu == 1) {
				jogo();
			} else if (escolha_menu == 2) {
				personagens();
			} else if (escolha_menu == 3) {
				creditos();
			} else if (escolha_menu == 4) {
				System.exit(0);
			} else {
				System.out.println("\nOpção inválida, digite novamente: ");
			}
		} while (escolha_menu != 1 && escolha_menu != 2 && escolha_menu != 3 && escolha_menu != 4);

		entrada.close();
	}

	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}
	}

	static void menu() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int escolha_menu;

		do {
			Digita("\n\n*** FULL BODY TECH. *** \n\n1 - Jogar \n2 - Personagens\n3 - Créditos \n4 - Sair",
					TimeUnit.MILLISECONDS, temp_transicao);
			System.out.println("\n");
			escolha_menu = entrada.nextInt();
			if (escolha_menu == 1) {
				jogo();
			} else if (escolha_menu == 2) {
				personagens();
			} else if (escolha_menu == 3) {
				creditos();
			} else if (escolha_menu == 4) {
				System.exit(0);
			} else {
				System.out.println("\nOpção inválida, digite novamente: ");
			}
		} while (escolha_menu != 1 && escolha_menu != 2 && escolha_menu != 3 && escolha_menu != 4);

		entrada.close();
	}

	static void jogo() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int escolha_menu, temp_narrativa = 100;
		
		do {
			System.out.println("\n\n0 - Menu Principal");
			escolha_menu = entrada.nextInt();
			if (escolha_menu == 0) {
				menu();
			} else {
				System.out.println("\nOpção inválida, digite novamente: ");
			}
		} while (escolha_menu != 0);

		entrada.close();
	}

	static void personagens() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int escolha_menu, temp_narrativa = 20;
		Digita("\n<<Tyger Fayol's>> nascido como Jules Henri Fayol, após sofrer um grave acidente recebe um implante corporal.\nÉ um desenvolvedor que ajudou a tornar o movimento cibernético que é hoje. "
				+ "Ele é o principal desenvolvedor \nque deu origem aos primeiros implantes, e se tornou uma das figuras mais proeminentes na luta a favor da classe operária.\n",
				TimeUnit.MILLISECONDS, temp_narrativa);
		Digita("\n<<Valentinos Taylor's>> nascido como Frederick Taylor, implantou em si mesmo um chip corporal criado por ele \npara aumentar o seu conhecimento e chegar ao topo da corporação.",
				TimeUnit.MILLISECONDS, temp_narrativa);
		do {
			System.out.println("\n\n0 - Menu Principal");
			escolha_menu = entrada.nextInt();
			if (escolha_menu == 0) {
				menu();
			} else {
				System.out.println("\nOpção inválida, digite novamente: ");
			}
		} while (escolha_menu != 0);

		entrada.close();

	}

	static void creditos() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int escolha_menu, temp_narrativa = 20;
		Digita("\n\n** Desenvolvedores **\n\n-> Gustavo Sousa \n-> Jordana Jesus \n-> Kleber Utrilha \n-> Lucas Alves \n-> Rafael Maieski",
				TimeUnit.MILLISECONDS, temp_narrativa);
		do {
			System.out.println("\n\n0 - Menu Principal");
			escolha_menu = entrada.nextInt();
			if (escolha_menu == 0) {
				menu();
			} else {
				System.out.println("\nOpção inválida, digite novamente: ");
			}
		} while (escolha_menu != 0);

		entrada.close();
	}

}

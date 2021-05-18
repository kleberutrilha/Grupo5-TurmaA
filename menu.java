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
			if (escolha_menu == 1) { // Cada número leva para a função correspondente.
				jogo(); // Leva para a função jogo, onde iniciará a história.
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
		for (char caractere : mensagem.toCharArray()) { // Foreach ( Para cada caracter da mensagem, deve ser imprimida um caracter por vez).
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
				System.out.println("\nOpção inválida, digite novamente: "); // Caso o usuário não digite uma opção válida, o programa pedi para digitar novamente.
											    
			}
		} while (escolha_menu != 1 && escolha_menu != 2 && escolha_menu != 3 && escolha_menu != 4);

		entrada.close();
	}

	static void jogo() throws Exception { // A história e desafios que o jogador terá que enfrentar.
		Scanner entrada = new Scanner(System.in);
		int escolha_menu, temp_narrativa = 50, cont_Fayol=0,cont_Taylor=0, perdeu=0;
		String resposta;
		
		
		Digita(" \n   TRIIIIIIM! TRIIIIIM! TRIIIIIM!\n", TimeUnit.MILLISECONDS, temp_narrativa);
		Digita("\n   Toca o alarme no seu quarto, você, jogador, desliga sem muito ânimo e cansado das noites passadas, após ter perdido o emprego em uma grande multinacional\n com o cargo"
				+ " de CIO (Chief Information Officer), onde gerenciava a infraestrutura tecnológica da empresa e cuidava do departamento de TI.\n   Agora? Ah...Não passa de mais um desempregado"
				+ " em meio a muitos na atual sociedade, cercada de tecnologia e com modificações de chips e implantes artificiais\n pelo corpo, essa acaba sendo a nova maneira de sobreviver a esta realidade.",
				TimeUnit.MILLISECONDS, temp_narrativa); // descrição da história usando o TimeUnit.
		
		Digita("\n\n   Você então se levanta, pega algo para comer e dá uma olhada nas notícias corporativas do dia, percebendo que no topo das informações, há algo que o chama\n muita atenção,"
				+ " uma vaga para VP (Vice President) na maior corporação tecnológica já existente, a FULL BODY TECH! A empresa mais capacitada e a maior\n produtora de chips e implantes corporais já conhecida,"
				+ " tem centenas de indústrias e vários investidores de altíssimos níveis que pagam bilhões para verem\n esta empresa lucrar ainda mais. Quem conseguir está vaga, não apenas será tão famoso e poderoso,"
				+ " como também terá rios de dinheiro para sua vida toda e de\n suas próximas gerações... ", TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("\n\n   Você não pensa duas vezes, e já escaneia seu código da nuca (todas as informações sobre você estão contidas nele e não é mais necessário o uso de papel),\n afinal quem não quer se tornar"
				+ " o Vice president de uma corporação tão poderosa? ", TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("\n\n   Passado alguns dias você recebe a informação que seu perfil foi avaliado e considerado apto a participar das próximas fases da tão sonhada vaga, recebendo\n o local e o horário para apresentação"
				+ " dos candidatos. ", TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("\n\n\n   ALGUNS DIAS DEPOIS....", TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("\n\n\n   Chegou o grande momento! É hora de ir ao lugar marcado, e não poderia deixar de ser na grande corporação, enorme, com inúmeros andares, toda espelhada, \nrefletindo o poder que esta empresa tem entre o"
				+ " sucesso ou fracasso cruel de quem trabalha nela. Na grande recepção você é direcionado a um grupo\nde outros candidatos (ou melhor, concorrentes) à vaga, alguns nervosos demais e que demonstram inexperiência"
				+ " ao cargo, já outros que estão no mesmo nível\nque você, senão melhor, por isso TOME CUIDADO para não ser jogado para escanteio!", TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("\n\n   Uma TR (Tech Recruiter) chega até seu grupo e inicia seu discurso sobre a vaga:", TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("\n   “Olá, bem-vindos a Full Body Tech, sou responsável por mostrar a vocês os setores da corporação e avisá-los que a partir do momento que decidirem continuar\n a candidatura, não poderão desistir no meio do caminho."
				+ " Alguém prefere não continuar?”", TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("\n\n   Todos se entreolham, mas não mudam de opinião e continuam. A recrutadora então diz:", TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("\n   “Ótimo! Primeiro, devo avisá-los sobre como funcionará as próximas fases.... os senhores passarão por situações vivenciadas na corporação onde as decisões\n e ações de vocês implicará no êxito em conseguir esta vaga,"
				+ " ou falha da mesma e consequentemente sem chances para uma nova contratação em outro cargo da\n organização. Estes desafios serão feitos durante uma semana e no final deste período saberão quem será o novo VP da Full Body"
				+ " Tech.\n   AH, ATENÇÃO! nem sempre serão avisados que estão sendo testados, então cuidado com seus movimentos. Enfim, vamos iniciar o tour pela corporação.”", TimeUnit.MILLISECONDS, temp_narrativa);
		
		
		Digita("\n\n   Durante o tour pela empresa, foram apresentadas as áreas da organização. Você, candidato então percebe que muitos trabalhadores executam seus serviços de\n forma errada e que demora o dobro do tempo para serem realizadas."
				+ " Então você:", TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("\n\nA) Apenas deixa quieto, afinal ainda não começou a fase de testes então se precisar resolver este tipo de problema, pensa em uma solução mais à frente.\r\n"
				+ "\nB) Comenta com o responsável pela apresentação, que percebeu este problema na empresa e sugere que seria interessante analisar as atividades \ndestes funcionários e o tempo que levam para realizar cada "
				+ "operação. \r\n\nC) Analisa a situação e depois do tour decide conversar com a gerência sobre a possibilidade de melhorar este problema incentivando o trabalho em equipe \ne colocando uma unidade de direção para cobrar"
				+ " os operários a serem mais ágeis nas atividades.\r\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
				resposta=entrada.next();
					
		switch(resposta.toUpperCase()) { //Utilização do switch case para definir a escolha do usuário na história.
		case "A":
			Digita("\n   Na verdade, o tour pela empresa já fazia parte dos testes e a demora na execução foi um problema colocado pela Full Body Tech, para verificar se seus \ncandidatos estão atentos e preparados para gerenciar uma empresa"
					+ " de grande porte, assim você retrocedeu um passo de ser contratado pela empresa.", TimeUnit.MILLISECONDS, temp_narrativa);
			perdeu++; // Contador para adicionar um ponto caso a pessoa escolher a alternativa que leva a nenhuma caracteristica, fazendo o jogador perder o jogo.
			break;
			
		case "B":
			Digita("\n   O responsável passou a frente sobre a sua sugestão e o próprio CEO concordou que sua análise seria uma ótima solução para a organização, te dando o \nprimeiro ponto para a sua possível contratação.",
					TimeUnit.MILLISECONDS, temp_narrativa);
			cont_Taylor++; // Contador para adicionar um ponto caso a pessoa escolher a alternativa que leva a caracteristicas do Taylor.
			break;
			
		case "C":
			Digita("\n   Sua ideia é recebida de bom grado na gerência, sendo passada para o CEO da empresa que concordou com sua opinião, considerando uma ótima solução \npara a organização, te dando o primeiro ponto para a sua"
					+ " possível contratação.", TimeUnit.MILLISECONDS, temp_narrativa);
			cont_Fayol++; // Contador para adicionar um ponto caso a pessoa escolher a alternativa que leva a caracteristicas do Fayol.
			break;
		}
			
		
		Digita("\n\n   Parece que nem todos foram bem neste primeiro desafio, alguns candidatos demonstram mais inquietação que antes, isso com certeza \nnão é o perfil de um Vice president a altura desta corporação."
				+ " E para desespero destas pessoas, a Tech Recruiter, anuncia que o próprio CEO da empresa\n irá também avaliar e supervisionar os candidatos durante as fases seguintes.", TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("\n\n   Depois da apresentação e do primeiro teste aplicado os candidatos são dispensados e requisitados a retornar no dia posterior para mais desafios.", TimeUnit.MILLISECONDS, temp_narrativa);
		
		switch(resposta.toUpperCase()) {
		case "A":
			Digita("\n\n   Éh... para o primeiro dia não foi tão bom assim, tome cuidado da próxima vez e tome iniciativas antes de não ter mais nenhuma chance.", TimeUnit.MILLISECONDS, temp_narrativa);
			break;
			
		case "B":
			Digita("\n\n   Olha só! Você não se saiu tão ruim assim. Mas vamos com calma. Este foi apenas o primeiro dia, ainda lhe falta mais quatro dias até o resultado e \ncom certeza terão testes mais desafiadores que este.",
					TimeUnit.MILLISECONDS, temp_narrativa);
			break;
			
		case "C":
			Digita("\n\n   Olha só! Você não se saiu tão ruim assim. Mas vamos com calma. Este foi apenas o primeiro dia, ainda lhe falta mais quatro dias até o resultado e \ncom certeza terão testes mais desafiadores que este.",
					TimeUnit.MILLISECONDS, temp_narrativa);
			break;
		
		}
		
		Digita("\n\n\n    NO DIA SEGUINTE... ", TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("\n\n\n   Mais um dia na empresa e como dito anteriormente, o Diretor executivo participará supervisionando alguns testes, como este. \r\n"
				+ "\n   O CEO, imagem da FULL BODY TECH, Poderoso e multibilionário faz a empresa render centenas de trilhões ao ano, sobra-lhe dinheiro na conta, mas falta-lhe \nhumildade no seu interior. A ambição o move e é isso que"
				+ " ele procura em seu novo VP.\r\n", TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("\n   Ele se apresenta ao grupo de candidatos e de forma direta e sem rodeios já apresenta o próximo desafio que terá que enfrentar: ", TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("\n\n   “Eu como o CEO, exijo que aumentem a produtividade em 120% dos nano chips para implementação cibernética.”\r\n"
				+ "   Você sabe que isso não é tarefa fácil, mas precisa tomar ações. Você chega à linha de produção e: ", TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("\n\nA) Observa toda a rotina da linha de produção e toma como ação cobrar mais trabalho dos operários. Você observa que os funcionários estão fazendo pouco e \nna sua metodologia, o peão tem que ralar. Os funcionários"
				+ " vão considerar isso como um artifício para fazê-los trabalharem mais. O importante é entregar os 120%.\r\n"
				+ "\nB) Vê a fábrica e nota que está faltando organização. Otimizando a estrutura da organização, chegaria naturalmente à máxima eficácia de cada uma das partes.\n Crê no aumento salarial e pensa em dar bônus aos "
				+ "melhores funcionários. Rumo aos 120%.\r\n"
				+ "\nC) Nota que os funcionários estão cansados e resolve dar o dia de folga para todos. Afinal, amanhã é um novo dia e com certeza vão chegar descansados e \nprontos para cumprir o aumento de produtividade.\r\n\n",
				TimeUnit.MILLISECONDS, temp_narrativa);
				resposta=entrada.next();
				
				Digita("", TimeUnit.MILLISECONDS, temp_narrativa);

				
			switch(resposta.toUpperCase()) {
				case "A":
					Digita("\n\n   Seus subordinados foram a loucura com a sua primeira decisão. Eles estão trabalhando praticamente como escravos! Mas o aumento da \nremuneração deles de acordo com a produtividade certamente "
							+ "nos trará muitos lucros. Bom saber que no seu segundo desafio você se preocupou na metodologia.\n Seu próximo desafio será voltado para o time de RH.", TimeUnit.MILLISECONDS, temp_narrativa);
					cont_Taylor++;
					break;
					
				case "B":
					Digita("\n\n   Você pensou muito bem no departamento como um todo. Bom saber que no seu segundo desafio você se preocupou na organização. Isso \nmostra claramente seus conceitos. Seu próximo desafio será voltado"
							+ " para o time de RH.",TimeUnit.MILLISECONDS, temp_narrativa);
					cont_Fayol++;
					break;
					
				case "C":
					Digita("\n\n   Você é maluco? Dar um dia de folga para todos os funcionários não foi legal. Espero que na sua próxima tarefa você tenha mais \ncuidado com a corporação, ela não perdoa erros. E seu próximo desafio"
							+ " será voltado para nosso time de RH.",TimeUnit.MILLISECONDS, temp_narrativa);
					perdeu++;
					break;
				
				}
		
		Digita("\n\n   Após a conclusão do segundo desafio, o grande CEO pergunta a cada um dos candidados, inclusive você, jogador, sobre a administração da empresa. \n\r   “Hoje, vejo que nossa corporação está sem comando. Nosso "
				+ "time de RH não é especializado em contratar gerentes, supervisores, coordenadores... \nPreciso que você me diga se é necessário ou não ter esta preocupação. Me diz: ” ", TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("\n\nA) “Sim, é necessário ter esta preocupação.”\r\n\nB) “Não, não tem a menor necessidade.”\r\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
		resposta=entrada.next();
		
		switch(resposta.toUpperCase()) { //Agora o próximo estará responsável pela consequência das alternativas que o usuário escolher.
		case "A":
			Digita("\nÓtimo! Mas você está preparado para um desafio administrativo no RH? Não vamos te enganar... A situação aqui é caótica...  ",
					TimeUnit.MILLISECONDS, temp_narrativa);
				break;

		case "B":
			Digita("\n\nVocê pode até ignorar isso, mas será momentaneo. Afinal, o desafio começará AGORA! ",
					TimeUnit.MILLISECONDS, temp_narrativa);
				break;
		}

		Digita(" \n\n*DERREPENTE TOCA UM ALARME ESTRANHO*\n\n ", TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\nEm meio ao silencio, ecoa a voz da TR (Tech Recruiter)...\n", TimeUnit.MILLISECONDS, temp_narrativa);

		Digita(" \n\n “Parabéns a todos que chegaram até esta fase do processo, daqui para frente o desafio de vocês é mais trabalhoso se tratando de esforço mental ao invés de corporal...”\n\n ",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("Após pisar o pé naquele escritório branco como algodão com paredes laminadas e iluminação clara como a neve, a primeira coisa que chama atenção são os PD's (Power Diamond's)\n"

				+ "é assim que eles chamam os super computadores de alta performance, não só para registrar estoque de peças, faturamento diário, entre outros,\n"
				+ "como contem toda a ficha dos candidatos e suas pontuações no meio do processo! ",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\n Durante sua permanencia no RH da empresa você terá TOTAL ACESSO aos Power Diamond's, assim o seu desafio será analisar planilhas de gastos mensais\n"
				+ "e chegar a uma conclusão sobre o caminho que o dinheiro da empresa está sendo levado...\n\n"
				+ "\n\n Após ser deixados a sós no escritório, você identifica uma pasta no PD com o nome de -- Cyber Candidater's (Pontuação Pessoal) -- "
				+ "\n\n...\n  ", TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\nQue tal dar uma espiada em como você está se saindo durante esses testes? Afinal, o mundo é dos Cyber Espertos...\n ",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\nA) Abrir a pasta para saber como estou me saindo e corrigir os meus erros. Assim sairei na frente dos outros para essa vaga!\n ",
				TimeUnit.MILLISECONDS, temp_narrativa);
		Digita("\nB) Melhor não mexer nisso. Prefiro saber o meu resultado no final de todo o processo, mesmo que seja ruim... \n",
				TimeUnit.MILLISECONDS, temp_narrativa);
		resposta = entrada.next();

		switch (resposta.toUpperCase()) {

		case "A":
			Digita("\n\nInfelizmente você não teve sorte... Um micro robô-filmador estava instalado no seu Power Diamond, "
					+ "assim que você clicou na pasta ele acendeu o seu PD alertando a Tech Recruiter... ",
					TimeUnit.MILLISECONDS, temp_narrativa);
			break;

		case "B":
			Digita("\n\nSua honestidade serviu bem nesse momento... Afinal, havia um micro robô-filmador instalado nos Power Diamond's. "
					+ "Outros 2 candidatos que pensaram em ser “Espertos” , foram eliminados na hora pela sua própria desonestidade.\n ",
					TimeUnit.MILLISECONDS, temp_narrativa);
			break;

		}

		Digita("\n\nTome mais cuidado da proxima vez, tudo nessa empresa é um teste. Você deve se manter firme para alcançar o cargo! ",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\nAgora, com a pasta certa em mente você pode se depara com uma planilha cheia de códigos. Essa planilha arquiva a entrada de peças no estoque e "
				+ "\nconforme o responsável recebe o QR Code com a nota fiscal, ele deve passar para a seus superiores. \n\n  ",
				TimeUnit.MILLISECONDS, temp_narrativa);

		ArrayList<String> lista = new ArrayList<String>(); // ArrayList criado para adiconar uma lista que depois será embaralhada a cada vez que o jogador iniciar o game.
		lista.add("Filamento Emissor");
		lista.add("Filamento Base");
		lista.add("Filamento Coletor");
		lista.add("Filamento Auxiliar");

		Collections.shuffle(lista); // Função que embaralha o ArrayList criado a cima.

		Digita("\nVocê começa a comparar os itens utilizados para a produção dos chips e percebe que o transistor principal é descrito como contendo 4 filamentos: \n\n",
				TimeUnit.MILLISECONDS, temp_narrativa);
		Digita(">> " + lista.get(0) + "\n", TimeUnit.MILLISECONDS, temp_narrativa); // A função "Lista.get() chama o item da lista na posição que você escolher. Neste caso foi a primeira posição.
		Digita(">> " + lista.get(1) + "\n", TimeUnit.MILLISECONDS, temp_narrativa);
		Digita(">> " + lista.get(2) + "\n", TimeUnit.MILLISECONDS, temp_narrativa);
		Digita(">> " + lista.get(3) + "\n", TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\nNotando que o filamento (auxiliar) não é necessario no transistor, você percebe uma diferença de R$ 17,00 por transistor entre um com filamento auxiliar e outro sem...\n\n ",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\nA) Neste caso, anotarei a diferença de valor para economia da compra do transistor e passarei a Tech Recruiter. \n ",
				TimeUnit.MILLISECONDS, temp_narrativa);
		Digita("\nB) Se esse transistor foi comprado com um quarto filamento é porque a produção utiliza de alguma forma, então melhor procurar outro problema e não atrapalhar a produção.\n",
				TimeUnit.MILLISECONDS, temp_narrativa);
		Digita("\nC) Melhor nem mexer com essa planilha, afinal eu vou cuidar mais do chão de fabrica e ficar de olho na produção... \n\n ",
				TimeUnit.MILLISECONDS, temp_narrativa);
		resposta = entrada.next();

		switch (resposta.toUpperCase()) {

		case "A":
			Digita("Sua observação foi aceita com muito valor. O engenheiro de produção não conseguiu notar que o quarto filamento não era utilizado"
					+ " e além disso estava fazendo muitas peças apresentarem instabilidades. \n",
					TimeUnit.MILLISECONDS, temp_narrativa);
			cont_Fayol++;
			break;

		case "B":
			Digita("A produção encontrou uma forma de estabilizar o quarto filamento e adicionar uma utilidade para balancear átomos e elétrons em sua base.\n ",
					TimeUnit.MILLISECONDS, temp_narrativa);
			cont_Taylor++;
			break;

		case "C":
			Digita("\nOutro candidato encontrou um gasto desnecessário com a camada de silicio utilizada no chip, ele relatou a Tech Recruiter sobre a possivel troca de fornecedor e ela adorou a observação... "
					+ "Você precisar tomar a atitude! \n\n ", TimeUnit.MILLISECONDS, temp_narrativa);
			perdeu++;
			break;
		}

		Digita("\nVocê continua a mexer nas planilhas calmamente enquanto... ", TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\n*SEU COMPUTADOR APRESENTOU ALGUNS CÓDIGOS ESTRANHOS* \n\n", TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("0100111011010000101100101100111010111010\n" + "1100111100001110101110011101010111010101\n"
				+ "0001000111011011110011101011010010100101\n" + "1101101011011 <<AVISO>> 1010011010101011\n"
				+ "1010101101110010110010110111010010101101\n" + "0011011001101100011100101101001101010101\n"
				+ "1110011010011001100010101110110101111010\n\n", TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\nParece que você está recebendo alerta de um problema raro que aconteceu na empresa... ",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\nEnquanto todos os Cyber Candidater's estavam empenhados em achar soluções para economias da organização, analisando planilhas e fornecedores "
				+ "\n(exceto aqueles dois pobres coitados que não conseguiram conter a sua ansiedade em descobrir o seu desempenho até o momento e foram eliminados),"
				+ "\nhouve uma discussão entre o funcionario que executa a separação de nano-eletrodos dos chips no setor V1R-X07 "
				+ "\ne o outro que executa o armazenamento dos implantes em cilindros no setor GRZ1-M2.\n\n ",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\nOs operadores iniciaram um confronto pois após serem estocados os chips estavam apresentando defeito nos nano-eletrodos e assim o funcionario do setor V1R-X07 "
				+ "\nestava recebendo reclamações posteriores pelos danos aos nano-eletrodos.\n", TimeUnit.MILLISECONDS,
				temp_narrativa);

		Digita("\n\nEsse acontecimento não estava nos planos da TR (Tech Recruiter), mas calhou bem com os testes de RH nesse dia...\n"
				+ "\nTodos receberam o aviso através dos códigos em seus Power Diamond's relatando o ocorrido e também instruções para resolver o problema entre eles. \n\n  ",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\nO seu desafio é: definir uma solução coerente para o confronto entre eles.\n ",
				TimeUnit.MILLISECONDS, temp_narrativa);

		do {

			Digita("\n\nSolução A: Definir um novo modo de estocar os chips produzidos para não danificar os nano-eletrodos. ",
					TimeUnit.MILLISECONDS, temp_narrativa);

			Digita("\n\nSolução B: Analisar a forma que está sendo separado os nano-eletrodos e verificar se o erro não está acontecendo antes do armazenamento. ",
					TimeUnit.MILLISECONDS, temp_narrativa);

			Digita("\n\nSolução C: Chamar o gerente geral para decidir a melhor opção. \n ", TimeUnit.MILLISECONDS,
					temp_narrativa);
			resposta = entrada.next();

			if (resposta.equalsIgnoreCase("A")) {
				Digita("\n\nSua solução não poderia ser melhor! Mostrou ser um grande resolvedor de confrontos. Nenhum outro acima de você gostaria de resolver isso. ",
						TimeUnit.MILLISECONDS, temp_narrativa);
				cont_Fayol++;
				saida = true;

			} else if (resposta.equalsIgnoreCase("B")) {
				Digita("\n\nNão é errado pensar no outro lado da moeda, neste caso, da CRIPTO-moeda... Vamos ver o que está acontecendo no setor V1R-X07. ",
						TimeUnit.MILLISECONDS, temp_narrativa);
				cont_Taylor++;
				saida = true;

			} else if (resposta.equalsIgnoreCase("C")) {
				Digita("\n\nComo você quer chamar o gerente geral para resolver este assunto, se o teste é seu? Quem deveria resolve-lo é VOCÊ! Sua atitude não foi nada coerente. ",
						TimeUnit.MILLISECONDS, temp_narrativa);
				perdeu++;
				saida = true;
			}

		} while (!saida);

		Digita("\n", TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("\n\n<<<O dia foi longo, você teve até que resolver um problema entre dois funcionarios... QUE LOUCURA CARA! Os testes do terceiro dia se encerram por hoje.>>> \n\n ",
				TimeUnit.MILLISECONDS, temp_narrativa);
		
		}
		
		
		Digita(" ", TimeUnit.MILLISECONDS, temp_narrativa);
		 
		if(cont_Taylor>1) { // Contagem dos pontos de todas as perguntas, que definirá se o jogador, tem caracteristicas do Taylor, Fayol ou perderá o jogo.
			Digita("\n\n   Parabéns você ganhou a vaga tão sonhada, se caracterizando com Taylor", TimeUnit.MILLISECONDS, temp_narrativa); //Frase de exibição, se tiver mais respostas relacionadas a Taylor.
		}else if(cont_Fayol>1) {
			Digita("\n\n   Parabéns você ganhou a vaga tão sonhada, se caracterizando com Fayol", TimeUnit.MILLISECONDS, temp_narrativa);
		}else if(perdeu>1) {
			Digita("\n\n   Que horror! Você falhou miseravelmente e não é digno de se tornar um VP, Vá para o olho da rua, AGORA!!", TimeUnit.MILLISECONDS, temp_narrativa);
		}
		

		
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

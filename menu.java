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
		
		Digita("   Você são conduzidos a uma outra parte da corporação que até então era desconhecida, essa nova área é o orgulho do time"
				+ " de pesquisas e viagens espaciais." + "Vocês escutam em alto e bom som, um brado que parece vir de alguma pessoa que está"
				+ " entre as centenas de pesquisadores na plataforma abaixo, sim isso mesmo que ouviu. O lugar em que se encontram possui"
				+ " pequenas plataformas que ficam suspensas no ar devido a força da gravidade que foi convertida em um dispositivo que"
				+ " suspende e move as plataformas de um lugar para outro.\n ", TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("\n   Esse brado que ouviram anteriormente é do pesquisador chefe da área conhecido como, Brainiac. Que tenta balbuciar algumas"
				+ " palavras(Afinal ele está cansado, pois veio literalmente pulando entre as plataformas para chegar até vocês).\n",
				TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("\n   Bem-vindos meus caros viajantes intergaláticos, esse é nosso espaço de pesquisas espaciais onde procuramos por diversas"
				+ " fomas de vidas que nosso universo abriga, ao qual, ainda não conhecemos.\n",TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("\n   Sem mais delongas, tenho um desafio para vocês e esse é um dos grandes se não maiores......\n",TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("\n   Vocês estão preparados?\n",TimeUnit.MILLISECONDS, temp_narrativa);
		
		Digita("   Um dos propulsores da nave Start Coding situada na constelação de Aldebaran perto do planeta Mitry, necessita de reparos"
				+ " e possivelmente a sua troca.\n"
				+ "\r\n"
				+ "Você será responsável por organizar uma expedição espacial que tem como objetivo concertar o propulsor da nave.\n"
				+ "\r\n"
				+ "O propulsor que deve ser utilizado é o Haward-35J, esse equipamento é produzido em 1 semana e 3 dias.\n"
				+ "\r\n"
				+ "Mas aqui que está o problema, a Start Coding está com apenas um propulsor funcionando e não consegue efetuar a manobra z,"
				+ " essa manobra é feita quando o campo \ngravitacional do planeta ou de um buraco negro está puxando a nave.\n"
				+ "\r\n"
				+ "A nave está sendo puxada por um buraco negro chamado Garganta que diferente dos outros não faz danos ao seu redor e não"
				+ " possui a radiação de Hawking.\n"
				+ "Mas dentro do buraco negro é que está o problema, pois uma vez lá dentro não há como retornar.\n"
				+ "\nA tribulação que é pega por esse buraco negro tem até 4 dias para sair do campo gravitacional, pois a gravidade ali"
				+ " atua em um tempo diferente.\n"
				+ "E então como você vai organizar a produção e entrega do propulsor? Sua missão é resgatar todos os 5 astronautas da nave"
				+ " com vida.\n"
				+ "Lembrando que o trajeto do seu local atual até a Start Coding é de 1 dia:\n", TimeUnit.MILLISECONDS,
				temp_narrativa);

		String[] alternativa = {
				"\n A) Um engenheiro mecânico percebe o grande alvoroço na fábrica e pede para conversar com você, ali os dois criam"
				+ " estratégias em como executar \na construção do projeto analisando o tempo que será dedicado as operações e planejando com"
				+ " um astrofísico a melhor rota de entrega do propulsor. \nAlém de planejar cada tarefa dos funcionários selecionando-os"
				+ " conforme a execução de seu trabalho.\n",
				"\n B) Você observa que o prazo é curto para a produção do propulsor Haward-35J, e então decide pegar um modelo similar que"
				+ " encontrou na \nfábrica e o mais rápido possível consulta um dos assistentes de rotas interplanetárias e envia-o para o"
				+ " espaço através de uma rota pelo buraco \nde minhoca perto da constelação de Aioros de Sagitário. De acordo com seus"
				+ " cálculos e dedução este equipamento atende as necessidades da Start Coding.\n",
				"\n C) Sabendo do curto prazo você organiza uma comitiva de urgência com engenheiros e operários para discutir sobre as"
				+ " propriedades de \nconstrução do propulsor, e em quanto tempo conseguem construí-lo dentro do prazo apertado. A conversa"
				+ " inicia-se com a divisão das tarefas \nonde os operários terão que trabalhar ainda mais para salvar os astronautas.\n" };

		// busca as alternativas dentro do vetor e imprime no Sysout, selecionando cada
		// uma delas e buscando e trazendo a próxima alternativa
		for (int i = 0; i < alternativa.length; i++) {
			Digita(alternativa[i], TimeUnit.MILLISECONDS, temp_narrativa);
		}
		resposta = entrada.next();

		// compara a resposta que o usuário digitou com a alternativa da questão
		if (resposta.toLowerCase().equals("a")) {
			Digita("   Essa ajuda que recebeu do engenheiro mecânico abriu os seus olhos e possibilitou a organização das tarefas,"
					+ " e conseguiram obter os materiais necessários para a construção do Haward-35J. Após a reunião uma turma de engenheiros"
					+ " foi selecionada justamente para aquela ocasião, pois sabiam trabalhar com horários apertados e conheciam muitos"
					+ " termos técnicos que seriam de grande ajuda aqui. \r\n"
					+ "O propulsor foi finalizado em 2 dias inteiros, e a questão agora seria qual rota tomar para realizar a entrega,"
					+ " durante a conversa com o astrofísico decidiram escolher o caminho da rota de Dohko na constelação de Libra. O trajeto foi bem-sucedido e nenhum obstáculo surgiu no caminho.\r\n"
					+ "A entrega foi realizada no terceiro dia faltando 10horas para o quarto dia, mas a instalação do propulsor durou 1h30,"
					+ " pois o campo gravitacional do buraco negro ficou um pouco intenso e turbulências surgiram. Mas no final foi"
					+ " instalado com sucesso e todos os astronautas retornaram para a civilização.\r\n"
					+ "Os recrutadores o parabenizaram pelo excelente trabalho e agora estão com altas expectativas em você.\r\n",
					TimeUnit.MILLISECONDS, temp_narrativa);
			cont_Taylor++;

		} else if (resposta.toLowerCase().equals("b")) {
			Digita("   Você não estudou muito bem quais eram as especificações do propulsor e o selecionou com base no empirismo, e não"
					+ " consultou um engenheiro para a aprovação do envio do propulsor. O que ocasionou na perda de um tripulante da nave, pois o propulsor enviado não executava a manobra Z, mas sim a manobra Z1 que é economizar combustível e em casos de urgências forçá-lo a usar 75% de sua capacidade o que o deixa ineficiente por 1 hora.\r\n"
					+ "A Start Coding consegue sair do buraco negro, mas a nave sai com sérios estragos na lateral e no painel de controle"
					+ " além da perda de um dos tripulantes que era o médico Burton.\r\n",
					TimeUnit.MILLISECONDS, temp_narrativa);
			perdeu++;
		} else if (resposta.toLowerCase().equals("c")) {
			Digita("  Você fez bem em consultar os engenheiros e organizar uma reunião de emergência, com ela cada operário e engenheiro"
					+ " conseguiram executar a produção do propulsor em 3 dias com a rápida distribuição das tarefas, foi aumentado o expediente dos funcionários para salvar os astronautas. No final da conclusão da construção analisaram a melhor rota e decidiram usar a tecnologia Zyon que faz viagens na velocidade da luz, e conseguiram entregá-lo a Start Coding no terceiro dia faltando 5 horas para o quarto dia.\r\n"
					+ "A instalação do propulsor levou 45 minutos e, foi de fácil encaixe, os recrutadores o parabenizam pelo excelente"
					+ " trabalho\r\n",
					TimeUnit.MILLISECONDS, temp_narrativa);
			cont_Fayol++;
		} else {
			Digita("   Digite uma opção válida...", TimeUnit.MILLISECONDS, temp_narrativa);

		}
		
		//temporariamente esta parte permanecerá aqui:
		Digita("\n\n   Candidato, até agora você foi muito bem, por esta razão quero que você me ajude com algo, desde a nossa ultima missão, "
				+ "tivemos diversas avarias em nossas naves, os comandantes das nossas espaçonaves estão reclamando que as condições de trabalho "
				+ "são precários e nos ameaçam dizendo que se nada mudar em uma semana, todos vão parar e ocorrerá uma greve geral, para a função "
				+ "que você está se candidatando, é fundamental que você saiba como lidar com este tipo de situação, agora eu quero que você solucione"
				+ " este problema para mim, marcarei uma reunião com os nossos pilotos em uma hora, até lá, vamos conversar sobre nosso orçamento, nossos planos e até aonde podemos chegar.”\r\n"
				+ "\r\n" + "Com essa missão, você se prepara e vai encontrar os pilotos no saguão E-79.",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\nA) Você encontra os pilotos e faz uma promessa em que diz que toda situação se normalizará em um mês, pois o orçamento máximo já foi "
				+ "atingido e apenas teríamos receitas no próximo mês.\r\n"
				+ ".\r\n"
				+ "\nB) Você vai para a reunião junto com o diretor e o gerente, quando lhe é dada a voz, você diz que a empresa está passando por problemas"
				+ " financeiros, mas estará investindo em melhorias das espaçonaves para que todos tenham melhorias nas condições humanas e atualizar as espaçonaves"
				+ " para que o trabalho seja menos estressante para seus colaboradores. \r\n\n"
				+ "C) Você se prepara para a reunião e mostra um gráfico e alguns vídeos, inicia mostrando os vídeos em que a maioria dos seus colaboradores desrespeitam "
				+ "as ordens e recomendações do responsável do setor e são irresponsáveis com as espaçonaves, o que acarreta uma série de avarias nas espaçonaves, após a "
				+ "exibição dos vídeos lhes são apresentados os gráficos com os prejuízos gerados pela indisciplina dos pilotos, o que acarretou em uma quantidade menor de"
				+ " valor para manutenção e condição mais precária para seus trabalhadores.\r\n"
				+ "\r\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
		resposta = entrada.next();

		switch (resposta.toUpperCase()) {
		case "A":
			Digita("\n   Como conversamos anteriormente eu lhe expliquei da nossa situação, você sabe que essa situação não se resolverá no próximo mês, você apenas nos deu 1"
					+ " mês para que tudo volte a estar como está hoje, só que provavelmente a irá deles será muito maior por conta dessa promessa que nunca será cumprida.",
					TimeUnit.MILLISECONDS, temp_narrativa);
			perdeu++;

			break;

		case "B":
			Digita("\n   Os trabalhadores sentiram confiança em você, muitas vezes tentamos apenas acalmar os nervos dos nossos colaboradores, mas você lhes deu uma esperança"
					+ " de que as coisas vão realmente mudar, e que eles vão se sentir privilegiados de estarem conosco!",
					TimeUnit.MILLISECONDS, temp_narrativa);
			cont_Taylor++;
			break;

		case "C":
			Digita("\n   SAgora eu entendi o porque você ficou tanto tempo falando com os inspetores e com o chefe de sessão, ficou claro em que boa parte dos problemas causados"
					+ " foram gerados por eles mesmos, faremos um anuncio dizendo que atenderemos a algumas exigências deles, porém conversarei com o chefe de sessão para que a disciplina"
					+ " seja muito mais rigorosa e que atos como os que vimos não serão mais tolerados.",
					TimeUnit.MILLISECONDS, temp_narrativa);
			cont_Fayol++;
			break;
		}

		Digita("\n\n   Candidato, estávamos fazendo uma pesquisa anônima na nossa empresa para ver as principais reclamações dos funcionários e dos diretores, com isso constatamos dois"
				+ " problemas, a reclamação principal dos nossos funcionários é que o clima na empresa não é bom, são muitos os casos relatados de pilotos interplanetários dando broncas "
				+ "muito ríspidas em pilotos novatos em treinamento, muitos se dizem desconfortáveis e desmotivados para continuarem conosco, por outro lado, os diretores dizem que sentem "
				+ "que o trabalho entregue não é satisfatório, dizem que a seleção de trabalhadores está fazendo um trabalho péssimo na hora de recrutar talentos, também reclamam da falta de"
				+ " comunicação entre trabalhadores, lhe darei o resto do dia para pensar em uma solução viável para que possamos solucionar ao menos uma boa parcela destes problemas."
				+ "Você não tem muito tempo para solucionar esses problemas, é melhor pensar rápido e tomar alguma atitude, você sabe que essa é uma chance única na sua vida e não pode desperdiçar esta oportunidade!",
				TimeUnit.MILLISECONDS, temp_narrativa);

		Digita("\n\nA) Você volta ao seu chefe e lhe propõe algumas ideias, para solucionar o problema dos funcionários, você deveria fazer uma reunião com seus principais colaboradores, "
				+ "cobrando uma explicação dos relatos de seus funcionários de baixo escalão, ressaltando que a justiça deve prevalecer em toda organização, atitudes como essa não serão mais"
				+ " toleradas, e que caso o mesmo aconteça ao contrário, a mesma atitude será cobrada, direitos iguais. Já em relação a reclamação dos pilotos interplanetários a atitude correta"
				+ " a se fazer seria uma reciclagem no RH para uma melhora na captação de talentos e que os colaboradores sejam cobrados respeitosamente com argumentos construtivos e mostrando os"
				+ " erros para que eles possam corrigi-los e evoluírem, o clima ficaria muito melhor e também melhoraria o desempenho dos jovens pilotos.\r\n"
				+ "\nB) Você propõe uma palestra motivacional para todos pregando a união e o respeito entre os pilotos mais jovens que fazem a rota regional, pilotos interplanetários e pessoas da"
				+ " área administrativa para que todos possam se darem melhor e terem mais empatia entre todos. \r\n\n"
				+ "C) Você propõe ao seu chefe para que os funcionários com pouco tempo de empresa tenham um bônus por não ultrapassar um limite de erros e não fugirem dos padrões propostos para uma"
				+ " empresa, assim fazendo eles estudarem sobre o tema para que possam melhorar na sua função o que geraria além de uma recompensa financeira extra, uma enorme probabilidade de nunca "
				+ "serem vítimas de tratamento ríspidos em público, porém ainda ressaltando que essas atitudes não serão mais permitidas para que eles fiquem tranquilos quanto a essa relação, já em "
				+ "relação aos pilotos mais experientes e nossa parte administrativa que seja proposto uma análise mais aprofundada sobre os problemas e que serão devidamente advertido aos jovens pilotos"
				+ " para que se possa ter uma resposta mais rápida e eficiente dos jovens pilotos, causando assim um aumento da produção de forma eficiente.\r\n"
				+ "\r\n\n", TimeUnit.MILLISECONDS, temp_narrativa);
		resposta = entrada.next();

		switch (resposta.toUpperCase()) {
		case "A":
			Digita("\n   Parece que todos entenderam que não será mais tolerado este tipo de atitude, o que é ótimo, todos aparentavam estar sabendo muito bem dos erros que cometeram e sabem que terá uma"
					+ " fiscalização mais rígida agora, certamente não vão mais cometer este tipo de erro.",
					TimeUnit.MILLISECONDS, temp_narrativa);
			cont_Fayol++;

			break;

		case "B":
			Digita("\n   Sabemos que esse tipo de método raramente é o suficiente, as pessoas apenas vão para essas palestras apenas para descansar ou porque estão sendo obrigadas, é um custo alto de contratar "
					+ "alguém para este tipo específico de serviço e parar nossas operações para algo com chances de retorno extremamente baixas, eu esperava mais de você, achei que você era a pessoa que iria ser"
					+ " o maior talento recente da nossa empresa, será que eu estava enganado?",
					TimeUnit.MILLISECONDS, temp_narrativa);
			perdeu++;
			break;

		case "C":
			Digita("\n   Você pode estar certo quanto a isso, porém, temos que ter cuidado para que a cada novo problema de ambiente não acabe fazendo-os pensar que serão pagos para esquecerem de tudo isso, mas é "
					+ "uma alternativa viável momentaneamente, espero que você esteja correto.",
					TimeUnit.MILLISECONDS, temp_narrativa);
			cont_Taylor++;
			break;
			
		}
		//Parte Temporaria.

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

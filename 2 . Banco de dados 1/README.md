# ADS IPOG

Repositório criado para apresentar projetos e Anotações criados durante o curso de ADS da IPOG.

1. Logica de Programação.

2. Banco de dados 1

![passos para modelagem de dados!](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/Passo%20para%20Modelagem%20de%20dados.png)

1. Análise de requisitos: Momento onde você realizará perguntas ao seu cliente, do que ele precisa armazenar no banco de dados.

2. Modelo conceitual: Visão geral do conceito que será usado no banco de dados, qual a finalização do modelo vai gerar uma visão parecida o apresentado na figura acima. (Visão de alto nível)

3. Modelo Lógico: Faz um detalhamento do modelo conceitual, definindo o tipo de estrutura, e o tipo de banco de dados a ser usado.

4. Modelo físico: Nesse momento, o que será definido qual ferramenta utilizar, em exemplo, em casos onde vou precisar montar um modelo estruturado, posso usar um SGBD como FIREBASE, MySQL, PostGreSQL, ou quando usa um modelo não estruturado
pode ser usado SGBD como um MongoDB.

## O que e um modelo?

**Modelar** significa criar um modelo que explique as características de funcionamento e comportamento de algo.

![o que e modelar dados?](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/o%20que%20e%20modelar%20dados.png)

### Modelo conceitual

- Finalidade de <font color="red"> capturar os requisitos de informação e regras de negócio</font> sob o ponto de vista do negócio.
- Não sofre interferências de fatores tecnológicos e fatores de projetos em sua construção.
- Descreve um modelo de dados de forma abstrata e independente da sua tecnologia do SGBD empregado.
- Descreve quais dados deverão ser armazenados de banco no dados.
- Não menciona como estes mesmos dados serão armazenados em nível de software. (SGBD)

![modelo conceitual](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/modelo%20conceitual.png)

**<ins>Modelo entidade-relacionamento</ins>**  **MER**

- Uma das principais técnicas utilizadas na modelagem conceitual.
- É representado graficamente por meio do uso do diagrama de entidade e relacionamento (DER), conforme representada na figura abaixo.


![diagrama entidade-relacionamento](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/der.png)

Alguns elementos presentes em um DER são:

- Entidades
	- Conjunto de objetos da realidade modelada sobre as quais deseja-se manter informações no banco de dados:
		- Pode ser representar tanto objetos concretos quanto abstratos.
			ex.: Produtos, vendas, fornecedores, contas correntes, agências, automóveis.
	- Em um DER, uma entidade é representada por um retângulo.
	![entidades](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/entidades.png)
- Atributos
	- Uma propriedade(característica) de uma entidade é o atributo.
	- Atributo é o dado que é associado a cada ocorrência de uma entidade.
	- As formas mais comuns de representar um atributo no DER e por um circulo, porém alguns modelos também e usado uma elipse.
		**Obs.: Se você iniciou com uma forma, use a mesma para todos os atributos, se for circulo, sempre circulo, se for elipse sempre elipse.**


		- Atributo identificador ou atributo chave.
			- O atributo identificador é um campo único ou uma combinação de campos que define exclusivamente um registro.
				ex.:
					Campo único: CPF do cliente.
					Combinação de campos: número social emitido por diferentes estados (mesmo número sendo utilizado em diferentes estados).
		- Atributos multivalorados.
			- Pode conter múltiplos valores para uma única instancia de uma entidade.
				ex. Uma mesma pessoa pode conter vários telefones.
		- Atributo compostos
			- É um tipo de atributo que pode ser dividido em partes menores ou componentes.
			- Por exemplo, considere uma entidade "Endereço" em um banco de dados de uma empresa. O atributo "Endereço" pode ser composto por vários sub-atributos, como "Rua", "Número", "Cidade", "Estado" e "CEP".
	![Atributos ](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/atributos.png)
- Relacionamentos

![der detalhado](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/der%20detalhado.png)

<ins>Software para criar modelos conceituais</ins>


(https://www.brmodeloweb.com/lang/pt-br/index.html)

## Relacionamento e Cardinalidade

### Relacionamento

- Conjunto de associações entre ocorrências de entidades.
- É representado por um losango, ligado por linhas aos retângulos representativos das entidades que participam do relacionamento.

![relacionamento](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/relacionamento.png)

Abaixo foi feito um modelo corrigido, e melhorado dos relacionamentos da imagem acima usando a ferramenta BRModelos.

![relacionamento vendas melhorado](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/relacionamento%20vendas%20melhorado.png)

Link para o modelo criado.
(https://app.brmodeloweb.com/#!/publicview/67768aff5ca14bc262ca29ee)

## Cardinalidade

Número (mínimo e máximo) de ocorrências de entidade associadas a uma ocorrência da outra entidade.

![cardinalidade](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/cardinalidade.png)

![cardinalidade detalhes](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/Cardinalidade%20detalhes.png)

No exemplo acima, temos o relacionamento entre empregado e lotação (1,n) onde diz que o empregado tem que ter no mínimo 1 departamento e no máximo muitos, e entre departamento e lotação(1,1), diz que o departamento pode ter no mínimo 1 empregado, e no máximo 1 empregado.

## Tipos de cardinalidade

O primeiro valor do par ordenado é o mínimo e o segundo o máximo (mínimo, máximo):
- (1,1): No mínimo 1 e no máximo 1.
- (0,n): No mínimo 0 e no máximo muitos.
- (1,n): No mínimo 1 e no máximo muitos.
- (n ,n): No mínimo muitos e no máximo muitos.

Os valores máximo e mínimo, representados por n, poderiam ser trocados por outros valores fixo, por exemplo (1,2) no mínimo 1 e no máximo 2.

### Prática - Aula 05
** Desenvolva o Diagrama Entidade-relacionamento (Der) Para as seguintes situações:** 
1. Um aluno realiza vários trabalhos. Um trabalho é realizado por um ou mais alunos.
![pratica-aluno](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/pratica-aluno.png)
2.  Um diretor dirige no máximo um departamento. Um departamento tem no máximo um diretor.
	![pratica-diretor](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/pratica-diretor.png)
3. Um autor escreve vários livros. Um livro pode ser escrito por vários autores.
![pratica-autor](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/pratica-autor.png)
4. Uma equipe é composta por vários jogadores. um jogador joga apenas uma equipe.
![pratica-equipe](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/pratica-equipe.png)
5. Uma cliente realiza várias encomendas. Uma encomenda diz respeito a apenas a um cliente.
![pratica-cliente](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/pratica-cliente.png)

Modelo criado usando BRModelos:
(https://app.brmodeloweb.com/#!/publicview/6776cf195ca14bc262ca2b22)

### Prática - Aula 06

1. Um berçário deseja informatizar suas operações. Quando um bebê nasce, algumas informações são armazenadas sobre ele, tais como:
		Nome
		Data de nascimento
		Peso do nascimento
		altura
	Para as mães dos bebês, o berçário também deseja manter um controle, guardando informações como:
		Nome
		Endereço
		Telefone
		Data de nascimento
	Para os médicos que fazem o parto, é importante saber:
		CRM
		Nome
		Especialidade

![pratica-bercario](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/pratica-bercario.png)

(https://app.brmodeloweb.com/#!/publicview/6776dab15ca14bc262ca2b8b)

2. Uma turma tem vários professores, sendo que um professor pode ministrar aulas em mais de uma turma. Uma turma tem sempre aulas na mesma sala, mas uma sala pode estar associada a várias turmas(com horários diferentes). Um aluno pode estar matriculado em várias turmas.

![pratica-escola](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/pratica-escola.png)

(https://app.brmodeloweb.com/#!/publicview/6776de8f5ca14bc262ca2b9b)

3. A partir do cenário abaixo, identifique as entidades, atributo e relacionamento.
Você foi selecionado para propor um banco de dados para uma companhia rodoviária que deseja, nesse momento, registrar informações sobre viagens e clientes. 
Um cliente ao chegar no terminal da companhia solicita a compra de um ou mais bilhetes. Para casa viagem realizada pela companhia você precisa armazenar, além dos dados do motorista que realizou a viagem, o código de identificação da viagem, a data e hora de partida e de chegada, a origem, o destino da viagem.
Para cliente devem ser registrados o nome, o número da identidade, telefone(pode adicionar mais de um telefone), endereço dos clientes que estavam presentes. O endereço do cliente tem rua, complemento e cep. No bilhete devem constar o número da poltrona que o cliente estava sentado e a quantidade de bagagens que ele despachou. Para os motoristas armazenam-se o nome do motorista, a carteira nacional de habilitação (CNH), data de validade da CNH;
Cada viagem é feita por um único motorista.

![pratica-companhia](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/pratica-companhia.png)

(https://app.brmodeloweb.com/#!/publicview/6776ef61b28a363a9780d8ea)
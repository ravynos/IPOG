# ADS IPOG


# Modelagem de dados


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

## Modelo Lógico

- Descreve como os dados serão organizados e relacionados dentro do banco de dados.
- Geralmente usando conceitos de tabela (relação), coluna e os relacionamentos entre tabelas.
- É criado a partir do modelo conceitual.

![tabela do modelo logico](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/tabela_modelo_logico.png)

### Conceitos do modelo lógico (relacional)

- As linhas de uma relação (tabela) são chamadas de tuplas.
- Ao cabeçalho de cada coluna dá-se o nome de atributo ou campos.
- O conjunto de valores que aparecer em cada coluna é chamado de domínio.

![conceito_modelo_logico](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/conceito_modelo_logico.png)

### Esquema de uma tabela (relação)

- Em um modelo lógico, descreve uma tabela (relação).
	- R(A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>n</sub>), onde:
	- A<sub>i</sub>: Nome de um atributo
	- N: Grau de relação (número de atributos que seu esquema contém)
Exemplo:
	- Estudante (nome, <ins>matrícula</ins>, telefone, endereço)

![esquema_tabela](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/esquema_tabela.png)

### Conceitos de chave

- **Chave primária: é a *chave candidata* que é *escolhida pelo projetista* para identificar tuplas dentro de um conjunto de tuplas *de maneira unívoca uma tupla* em um conjunto de tuplas.
- No modelo lógico, convenciona-se sublinhar os atributos que compõem a chave primária.
![esquema_tabela](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/esquema_tabela.png)

### Etapas do mapeamento: Etapa 1

![modelo_mapeamento](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/modelo_mapeamento.png)

R(A<sub>1</sub>, A<sub>2</sub>, ..., A<sub>n</sub>),
Se vários atributos-chave são identificados para R durante o projeto conceitual, cada chave e adicional é mantida a fim de especificar chaves secundárias (únicas) da relação R

Empregado = {<ins>cpf</ins>, nome, sobrenome, idade, endereço, sexo, salario}  
Departamento = {<ins>numero</ins>,<ins>nome</ins>, numEmpregados, localizacao}  
Projeto = {<ins>numero</ins>,<ins>nome</ins>, localizacao}  

### Conceitos de chave estrangeira

- Estabelece uma relação entre 2 tabelas.
	- Referencia uma chave de uma tabela (tabela pai) em outra tabela (tabela filho).
- Garante que os valores na coluna de chave estrangeira só possam aparecer se já existem na coluna correspondente na tabela referenciada (a tabela pai).

![modelo_conceitual_chave_estrangeira](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/modelo_conceitual_chave_estrangeira.png)

![tabela_chave_estrangeira](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/tabela_chave_estrangeira.png)

Modelo Lógico (relacional)

CLIENTES (<ins>codigo</ins>, nome, idade, endereco, telefone)  
VENDEDORES (<ins>matricula</ins>, nome, telefone)  
VENDAS (<ins>id</ins>, <ins>codigo_cliente</ins>, <ins>mat_vendedor</ins>, valor)  

codigo_cliente refencia CLIENTES

mat_vendedor referencia VENDEDORES

### Entidade Fraca

- Depende de outra entidade (chamada de entidade forte) para obter identificação
- Não possui uma chave primária única por si só.

![entidade_fraca](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/entidade_fraca.png)


### Etapas do mapeamento: Etapa 2

![mapeamento_chave_fraca](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/mapeamento_chave_fraca.png)

- Para cada entidade fraca F cria-se uma relação R formada por todos os atributos simples do conjunto entidade fraca.
- Inclua como atributo de chave estrangeira de R o atributo de chave primária da relação a qual F é dependente.
- A chave primária de R é a combinação da chave primária e a chave parcial do tipo de entidade fraca F.

Empregado = {<ins>cpf</ins>, nome, sobrenome, idade, endereço, sexo, salario}  
Dependente = {<ins>cpf</ins>, <ins>nome</ins>, dtAniversario, parentesco}  
Departamento = {<ins>numero</ins>,<ins>nome</ins>, numEmpregados, localizacao}  
Projeto = {<ins>numero</ins>,<ins>nome</ins>, localizacao}  

### Etapa do mapeamento de dados: Etapa 3

- Para cada tipo de relacionamento binário 1:1 R
	- identifique as relações S e T que correspondem aos tipos de entidades participantes de R
- **Inclua a chave estrangeira em T**
- __Inclua o atributo do relacionamento em T__

Empregado = {<ins>cpf</ins>, nome, sobrenome, idade, endereço, sexo, salario}  
*Dependente = {<ins>cpf</ins>, <ins>nome</ins>, sexo, dtAniversario, parentesco}  
		***cpf referencia Empregado***
Departamento = {<ins>numero</ins>,<ins>nome</ins>, numEmpregados, localizacao, cpfGerente, dataInicio}  
Projeto = {<ins>numero</ins>,<ins>nome</ins>, localizacao, numeroDep}
		***numeroDep referencia Departamento***

![mapeamento_etapa3](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/mapeamento_etapa3.png)

### Etapas do mapeamento: Etapa 4

Para cada conjunto de relacionamento de cardinalidade 1 para N, a chave primária da entidade que participa com cardinalidade N terá a chave primária da outra entidade como chave estrangeira, bem como os atributos do relacionamento.

![mapeamento_etapa4.png](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/mapeamento_etapa4.png)

Empregado = {<ins>cpf</ins>, nome, sobrenome, idade, endereço, sexo, salario, numeroDep, numeroSupervidor}  
			***numeroDep referencia Deparatamento***  
			***numeroSupervisor referencia Empregado***  
*Dependente = {<ins>cpf</ins>, <ins>nome</ins>, sexo, dtAniversario, parentesco}  
			***cpf referencia Empregado***  
Departamento = {<ins>numero</ins>,<ins>nome</ins>, numEmpregados, localizacao, cpfGerente, dataInicio}  
Projeto = {<ins>numero</ins>,<ins>nome</ins>, localizacao, numeroDep}  
		***numeroDep referencia Departamento***  

### Etapas do mapeamento: Etapa 5

- Para cada relacionamento binário N:N cria-se uma nova relação, com as chaves das entidades relacionadas.
- a combinação das chaves estrangeiras formará a chaves primária da nova relação
- Inclua também quaisquer atributo simples do tipo de relacionamento N:N como atributos da nova relação

Empregado = {<ins>cpf</ins>, nome, sobrenome, idade, endereço, sexo, salario, numeroDep, numeroSupervidor}  
			***numeroDep referencia Deparatamento***  
			***numeroSupervisor referencia Empregado***    
*Dependente = {<ins>cpf</ins>, <ins>nome</ins>, sexo, dtAniversario, parentesco}  
			***cpf referencia Empregado***  
Departamento = {<ins>numero</ins>,<ins>nome</ins>, numEmpregados, localizacao, cpfGerente, dataInicio}  
Projeto = {<ins>numero</ins>,<ins>nome</ins>, localizacao, numeroDep}  
		***numeroDep referencia Departamento***  
Trabalha = {<ins>cpf</ins>, <ins>numero</ins>, horas}  
		***cpf referencia Empregado***  
		***numero referencia Projeto***  

### Etapas do mapeamento: Etapa 6

Existe duas maneiras de tratar atributos multivalorados no mapeamento:
- Sabendo uma estimativa de números de ocorrências do atributo. Assim, pode-se adicionar a relação quantos atributos forem necessários.

| Departamento = {<ins>numero</ins>, nome numero, dataIni, local1, local2, local3}|

- Caso de números de ocorrências do atributo seja identificado, cria-se uma nova relação. Essa relação R incluirá um atributo correspondente a atributo multivalorado A, mais atributo de chave primária como uma chave estrangeira em R. A chave primária de R é a combinação de ambo.

Empregado = {<ins>cpf</ins>, nome, sobrenome, idade, endereço, sexo, salario, numeroDep, numeroSupervidor}  
			***numeroDep referencia Deparatamento***  
			***numeroSupervisor referencia Empregado***  
*Dependente = {<ins>cpf</ins>, <ins>nome</ins>, sexo, dtAniversario, parentesco}  
			***cpf referencia Empregado***  
Departamento = {<ins>numero</ins>,<ins>nome</ins>, numEmpregados, localizacao, cpfGerente, dataInicio}  
Projeto = {<ins>numero</ins>,<ins>nome</ins>, localizacao, numeroDep}  
		***numeroDep referencia Departamento***  
Trabalha = {<ins>cpf</ins>, <ins>numero</ins>, horas}  
		***cpf referencia Empregado***  
		***numero referencia Projeto***  
LocalDep = {<ins>numero</ins>, <ins>localizacao</ins>}  
		***numero referencia Departamento***  



## Exercícios práticos de fixação.

### Prática 01

![pratica01.png](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/pratica01.png)

Empregado(<ins>cpf</ins>, nome, endereço, salario)

:nerd_face: No exercício pratico acima, foi definido no modelo conceitual a entidade "Empregado", com os atributos "cpf" como chave primaria, "nome", "endereço" e "salario", os quais for identificados no modelo lógico abaixo da imagem.

### Prática (Atributo Composto, e Multivalorado)

![pratica02.png](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/pratica02.png)

Empregado(<ins>cpf</ins>, nome, salario, rua, numero)
telefone(<ins>cpf</ins>,<ins>numero</ins>)

:nerd_face: No caso acima, temos o "endereço" como atributo composto, e "telefone" como atributo multivalorado, no caso, saiu o atributo "endereço", e foi adicionado os atributos "rua" é "numero", onde o conjunto dos 2, gera o endereço do empregado, e no caso do telefone, foi criado uma nova tabela, onde foi usado o atributo "cpf" para fazer a ligação da tabela pai com a tabela filho, fazendo a ligação entre o telefone e o empregado, e também "numero" que e o registro dos telefones.

### Prática ( 1,1 )

![pratica(1,1).png](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/pratica(1,1).png)

Funcionario(<ins>cpf</ins>, nome, cargo)
Identidade Funcional(<ins>cpf</ins>, dtEmissao, funcao, cpf)


:nerd_face: No caso acima, temos um relacionamento de 1 para 1, onde foram definidos os atributos conforme imagem acima, porém, foi adicionado a entidade "Identidade Funcional" o atributo "cpf", para assim fazendo a identificação do funcionário com a identidade.

### Prática (1,n)

![pratica(1,n).png](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/pratica(1,n).png)

pedido(<ins>numero</ins>)
itens(<ins>FK_nrPedido</ins>,<ins>codigo</ins>, quantidade)
	***FK_nrPedido referencia Pedido***

:nerd_face: No caso do relacionamento 1 para muitos, na tabela que tem como máximo o n, criamos uma chave estrangeira que garante a ligação entre as 2 tabelas.

### Prática ( n, n )

![pratica(n,n).png](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/pratica(n,n).png)

Empregado (<ins>cpf</ins>, nome, salario, rua, numero)
telefone(<ins>FK_cpf</ins>, <ins>numero</ins>)
	***FK_cpf referencia Telefone***
projeto(<ins>codigo</ins>, titulo)
atividade(<ins>FK_cpf</ins>, <ins>FK_codProjeto</ins>, atividade)
	***FK_cpf referencia Empregado***
	***FK_codProjeto referencia Projeto***


:nerd_face: Nesse caso, temos o relacionamento n para n, foi criado a entidade empregado, com a chave primaria "cpf", e também a entidade "projetos", com chave primaria "código",  devido ao atributo multivalorado presente no atributo "telefone" na entidade empregado, se cria uma nova entidade chamada telefone, que vai recebe uma chave estrangeira de empregado "FK_cpf", que faz referencia a entidade "empregado", e também o atributo "numero" que guarda o telefone do empregado.
O relacionamento gera a tabela "atividade", onde ficará armazenado o valor do cpf do empregado, o código do projeto que ele esta participando e a atividade que esta sendo realizada.

### Dependência funcional

- Conceito da matemática que estabelece uma relação entre os atributos de dois conjuntos.
- Indicando que valores de um conjunto influenciam ou determinam os valores de um outro dentro de uma relação.

	>Dados dois conjuntos A e B, diz-se que B é funcionamento dependente de A, ou A determina B, B depende de A, se cada valor de A estiver associado <ins>ca um é somente um valor de B</ins>.
	Representado assim: A --> B

![dependencia_funcional.png](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/dependencia_funcional.png)

Podemos ver que cada matrícula está relacionada a um único nome

2335 --> {Tomé Mascarenhas}
3426 --> {André Costa}
2421 --> {João Sousa}

**EXISTE DEPENDÊNCIA FUNCIONAL**


![sem_dependencia_fun.png](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/sem_dependencia_fun.png)


2335 --> {Eletrodomésticos, Cama e Mesa}
3426 --> {Eletrodomésticos}
2421 --> {Cama Mesa}

**NÃO EXISTE DEPENDÊNCIA FUNCIONAL**


Conceito A --> B: B é funcionalmente dependente de A, ou A determina B para cada A está associado <ins>um e somente um valor</ins> de B.

Vendedores

| MATRICULA | NOME             | TELEFONE  | DEPARTAMENTO     |
| --------- | ---------------- | --------- | ---------------- |
| 2335      | Tomé Mascarenhas | 9999-8888 | Eletrodomésticos |
| 3426      | André Costa      | 9999-8882 | Eletrodomésticos |
| 2421      | João Sousa       | 9999-8883 | Cama e Mesa      |
| 2335      | Tomé Mascarenhas | 9999-8888 | Cama e Mesa      |


Matricula --> Nome
**NOME** depende da **MATRICULA** do vendedor, existe uma relação um para um. Agora considere a dependência:

Matricula --> Departamento
Não existe dependência funcional clara entre **MATRICULA** e **DEPARTAMENTO**, pois **MATRICULA** pode pertencer a diferentes **DEPARTAMENTO** ao longo do tempo.
**2335 --> {Eletrodoméstico, Cama e Mesa}

Departamento --> Matricula

A relação inversa também não existe. Isso porque um departamento determina mais de uma matrícula.
**Eletrodomésticos --> {2335, 3426}**
**Cama e Mesa --> {2421, 2335}**

| MATRICULA | NOME             | TELEFONE  | DEPARTAMENTO     | HORARIO    |
| --------- | ---------------- | --------- | ---------------- | ---------- |
| 2335      | Tomé Mascarenhas | 9999-8888 | Eletrodomésticos | MATUTINO   |
| 3426      | André Costa      | 9999-8882 | Eletrodomésticos | INTEGRAL   |
| 2421      | João Sousa       | 9999-8883 | Cama e Mesa      | INTEGRAL   |
| 2335      | Tomé Mascarenhas | 9999-8888 | Cama e Mesa      | VERPERTINO |

Matricula --> Departamento, Horário

2335 --> {(Eletrodoméstico, Matutino), (Cama e Mesa, Vespertino)} **NÃO EXISTE DEPENDENCIA FUNCIONAL**
3426 --> {(Eletrodoméstico, Integral)} **EXISTE DEPENDENCIA FUNCIONAL**
2421 --> {(Cama e Mesa, Integral)} **EXISTE DEPENDENCIA FUNCIONAL**

### Exercício prático

Considere que uma tabela tem os atributos Matricula, Nome, Telefone, Endereço, Departamento, Horário, Salário.

- A matrícula é única por vendedor e chave primária na tabela.
- Podem existir vendedores homônimos (com o mesmo nome).
- O telefone é único por vendedor
- Pode ter dois vendedores morando em um mesmo endereço, mais um vendedor só tem um endereço.
- Um vendedor só trabalha em um único horário por departamento.
- Podemos ter vários vendedores num mesmo horário por departamento.
- Os salários podem ser diferentes entre vendedores, mas um vendedor só tem um salário.
- Os salários de vendedores de mesma categoria é o mesmo.

	- Matricula --> Departamento, Horário = Existe Dependência
	- Matricula --> Endereço = Existe Dependência
	- Endereço --> Matricula = Não Existe Dependência
	- Matricula --> Telefone, Endereço = Existe Dependência
	- Departamento, Horário --> Matricula = Não Existe Dependência
	- Departamento --> Matricula = Existe Dependência
	- Matricula --> Departamento = Existe Dependência
	- Matricula --> Salário = Existe Dependência
	- Salário --> Matricula = Não Existe Dependência
	- Salário --> Matricula, Departamento = Não Existe Dependência

### Regras da dependência funcional


| MATRICULA | NOME             | TELEFONE  | DEPARTAMENTO     | HORARIO    |
| --------- | ---------------- | --------- | ---------------- | ---------- |
| 2335      | Tomé Mascarenhas | 9999-8888 | Eletrodomésticos | MATUTINO   |
| 3426      | André Costa      | 9999-8882 | Eletrodomésticos | INTEGRAL   |
| 2421      | João Sousa       | 9999-8883 | Cama e Mesa      | INTEGRAL   |
| 2335      | Tomé Mascarenhas | 9999-8888 | Cama e Mesa      | VERPERTINO |


- Separação/Decomposição
	Se A --> BC então
		A -->B
		A -->C
Um exemplo dessa relação para os dados da tabela acima:

Se
Matricula --> Nome, Telefone então
Matricula --> Nome
Matricula --> Telefone

- Acumulação
	Se
	A --> B então
	AC --> B

Um exemplo dessa relação para os dados da tabela acima?
Se
Matricula --> Nome então
Matricula, Horário --> Nome

- Transitividade
	Se A --> B e B --> C então
		A --> C
Um Matricula --> Nome e Nome --> Telefone então
	Matricula --> Telefone

- Decomposição
	Se A --> BC e BC --> D então
		AC --> D


## Normalização de dados

### 1ª Forma Normal(1FN)

### Anomalias de banco de dados mal modelado

Quais problemas são decorrentes da relação Vendas?

- Inclusão
- Alteração
- Exclusão

| Nome_cliente | CPF | Endereço | Fone    | <ins>Cod_Produto</ins> | Nome_Produto | Valor_unitario | Quantidade | Total |
| ------------ | --- | -------- | ------- | ---------------------- | ------------ | -------------- | ---------- | ----- |
| José         | 111 | ABC      | 9923123 | A                      | Lápís        | 0,50           | 2          | 1,00  |
| Ana          | 222 | XYZ      | 9111456 | B                      | Caneta       | 1,00           | 3          | 3,00  |
| José         | 111 | ABC      | 9912123 | C                      | Régua        | 1,00           | 2          | 2,00  |
| Pedro        | 444 | KZZ      | null    | D                      | Lápis        | 0,50           | 20         | 10,00 |

- Inclusão:
	- Redundância do cliente e do produto.

		No caso do cliente "José" que aparece 2 vezes  e também do produto "Lápis", na tabela acima, ao fazer a inclusão, de uma nova venda, os dados citados anteriormente serão redundantes, podendo ser inclusos de formas diferentes, tornando os registros confusos.
- Exclusão:
	- Se o cliente "ANA" for eliminado a informação de que o produto B é chamado Caneta e custa R$ 1,00 é perdida.
- Atualização:
	- Uma mudança na descrição do produto A requer várias mudanças
- Inconsistência: 
	- Não há nada no projeto impedindo que o produto A tenha duas ou mais descrições diferentes.

		Caso seja preciso mudar o nome do produto Lápis, ou o telefone do cliente "José", precisará ser alterado linha a linha, gerando inconsistência nos dados caso não seja feito dessa forma.

### O que pode acontecer se uma modelagem for mal realizada.

- Redundância de dados
- Problemas de desempenho
- Perda de dados

Como evitar:

- Modelo conceitual
- Projeto Lógico
- Normalização de dados

[!IMPORTANT]
Devido a problemas com a plataforma do curso, esse modulo foi encerrado prematuramente.

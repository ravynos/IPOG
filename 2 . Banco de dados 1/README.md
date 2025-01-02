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

![relacionamento]()

Abaixo foi feito um modelo corrigido, e melhorado dos relacionamentos da imagem acima usando a ferramenta BRModelos.

![modelo vendas](https://app.brmodeloweb.com/#!/publicview/67768aff5ca14bc262ca29ee)



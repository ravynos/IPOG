# Exercícios práticos da conversão do modelo conceitual para o modelo lógico.


## Exercício 01

![exercicios01.png](https://github.com/ravynos/IPOG/blob/main/2%20.%20Banco%20de%20dados%201/Banco%20de%20imagens/exercicios01.png)

Empregado(<ins>cpf</ins>, nome, endereço, salario)

## Exercício 02

![exercicios02.png](exercicios02.png)

Empregado(<ins>cpf</ins>, nome, rua, numero, salario)
telefone(<ins>cpf</ins>, <ins>numero</ins>)

## Exercício 03

![exercicios03.png](exercicios03.png)

Funcionario(<ins>cpf</ins>, nome, cargo)
Identidade Funcional(<ins>cpf</ins>, dtEmissao, funcao, cpf)

## Exercício 04

![exercicios04.png](exercicios04.png)


Correntista(<ins>codCorrentista</ins>, nome)
cartão(<ins>codigo</ins>, dtExp, codCorrentista)

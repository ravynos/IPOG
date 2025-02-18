# Padrões de Projetos

### O que é um padrão de projetos

Os padrões são soluções comprovadas para problemas comuns que surgem durante o processo de desenvolvimento de software.

Eles são soluções que foram testadas e comprovadas em projetos anteriores, que podem ser aplicadas a novos projetos para resolver problemas semelhantes.

Os padrões podem ser aplicados em diferentes níveis de um sistema de software, desde a arquitetura até o código.

Design Patterns ou padrões de projetos são soluções generalistas para problemas recorrentes durante o desenvolvimento de um software.

Não se trata de um framework, ou um código pronto, mais de uma definição de alto nível de como um problema comum pode ser solucionado.

> [!note]
>Uma analogia nos ajudará a ilustrar este ponto. Os novelistas ou autores de roteiros (cinema, teatro, televisão) raramente projetam suas tramas do zero. Em vez disso, eles seguem padrões como "O herói tragicamente problemático" (Macbeth, Hamlet, etc.) ou "A Novela Romântica" ( um sem-número de novelas de romance).


### Definição

Christopher Alexander afirma: "cada padrão um problema no nosso ambiente e o cerne da sua solução, de tal forma que você possa usar essa solução mais de um milhão de vezes, sem nunca fazê-lo da mesma maneira" \[AIS+77. pág. x].

Em geral um padrão possui 4 elementos essenciais:

1. O nome do padrão
2. O problema
3. A solução
4. As consequências

### Algumas orientações importantes

Se você não é um projetista com experiência em software orientado a objetos, comece os padrões mais simples e mais comuns:

- Abstract Factory
- Adapter
- Composite
- Decorator
- Factory Method
- Observer
- Strategy
- Template Method

>[!note]
>É difícil achar um sistema orientado a objetos que não use pelo menos dois desses padrões, e grandes sistemas usam quase todos eles. Esse subconjunto lhe ajudará a compreender padrões de projetos em particular e, no geral, a compreender o bom projeto orientado a objetos.



## Tipos de padrões

Os padrões de projetos podem ser classificados em três tipos principais: criacionais, estruturais e comportamentais.

### 1. Padrões Criacionais:

- Estes padrões lidam com mecanismos para criar objetos de forma que o sistema seja desacoplado das classes concretas que está criando. Os principais padrões desse tipo são Singleton, Factory Method e Abstract Factory.

### 2. Padrões Estruturais:

- Eles se concentram em como as classes e objetos são compostos para formar estruturas maiores. Isso ajuda a garantir que, quando uma das partes da estrutura é alterada, o restante da estrutura permaneça inalterado. Alguns dos exemplos de padrões estruturais são Adapter, Bridge e Composite.

### 3. Padrões Comportamentais:

- Esses padrões estão relacionados ao modo como classes e objetos interagem e distribuem responsabilidades.

Eles ajudam a definir como os objetos interagem entre si e como eles operam em conjunto para realizar uma tarefa.

Alguns exemplos de padrões comportamentais são Command, Observer e Strategy.


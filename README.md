# PROJETO EM DESENVOLVIMENTO


# Padrão de Arquitetura de Software

- Utilizado o MVC

- O MVC é um padrão de arquitetura de software. O MVC sugere uma maneira para você pensar na divisão de responsabilidades, principalmente dentro de um software web.

- O princípio básico do MVC é a divisão da aplicação em três camadas: a camada de interação do usuário (view), a camada de manipulação dos dados (model) e a camada de controle (controller).

![alt text](https://github.com/740fernando/projeto-ensalamento-servlet/blob/master/assets/modeloMvc.png)

## Quais os papéis de cada camada?


Quando falamos sobre o MVC, cada uma das camadas apresenta geralmente as seguintes responsabilidades:

- Model : A responsabilidade dos models é representar o negócio. Também é responsável pelo acesso e manipulação dos dados na sua aplicação.

- View : A view é responsável pela interface que será apresentada, mostrando as informações do model para o usuário.

- Controller : É a camada de controle, responsável por ligar o model e a view, fazendo com que os models possam ser repassados para as views e vice-versa.

- Esta divisão facilita a manutenção e extensão futura do código


### Controller

<p>É o componente chamado pelo cliente. O controller executa os seguintes passos: </p>

- Prepara os dados que serão usados pelo model

- Chama o model

- Prepara os dados que serão usados pela view

- Direciona para a view

### View

- É o resultado visual observado pelo cliente
- O direcionamento para uma determinada
view é responsabilidade do controller
- Os dados presentes na view normalmente
são renderizados com base em dados
obtidos pelo model

### Model

- É onde está toda a lógica de negócio
implementada pela aplicação
- O model compreende implementação da
lógica, acesso a bancos de dados, acesso a
sistemas externos, etc.
- O model não deve ter qualquer dependência
com a tecnologia usada pelos controllers ou
views
- Esta independência garante que o mesmo model
pode ser usado para qualquer tipo de aplicação
(web, desktop, dispositivos móveis, etc.)

## Design Pattern

<strong>Design Pattern você terá vários benefícios dentre eles são: código mais enxuto, limpo, organizado, aumentar a qualidade e diminuir a complexidade do seu código. </strong>
<br>
<p> Foi utilizado : </p>

- Front Controller : É implementado em diversos frameworks de ponta que são utilizados em diversos projetos de diferentes complexidades. Exemplo de dois frameworks que utilizam o padrão Front Controller é o Struts e o JSF, dois frameworks dos mais utilizados em projetos Java para aplicações que executam na Web. Entendendo o Front Controller e entendendo o funcionamento do padrão Command podemos entender muito melhor como ambos funcionam e como eles trabalham juntos para resolver problemas recorrentes nas aplicações Web.



- Singleton : Permite criar objetos únicos para os quais há apenas uma instância. Este padrão oferece um ponto de acesso global, assim como uma variável global, porém sem as desvantagens das variáveis globais. Para entendermos e usarmos bem o padrão de Projeto Singleton é necessário apenas dominar bem as variáveis e métodos de classe estáticos além dos modificadores de acesso.


- Template Method : O pattern template method é muito simples, é como se ele montasse o esqueleto de um algoritmo de uma forma abstrata, e deixasse para que as classes concretas realizem as devidas implementações. O Template Method utiliza uma classe abstrata base, que vai encapsular o template do algoritmo em um método, para que as classes concretas possam herdar desta classe e realizar a implementação de determinados passos deste algoritmo.




# PROJETO EM DESENVOLVIMENTO


# Padrão de Arquitetura de Software

- Utilizado o MVC

- O MVC é um padrão de arquitetura de software. O MVC sugere uma maneira para você pensar na divisão de responsabilidades, principalmente dentro de um software web.

- O princípio básico do MVC é a divisão da aplicação em três camadas: a camada de interação do usuário (view), a camada de manipulação dos dados (model) e a camada de controle (controller).


# Quais os papéis de cada camada?


Quando falamos sobre o MVC, cada uma das camadas apresenta geralmente as seguintes responsabilidades:

- Model A responsabilidade dos models é representar o negócio. Também é responsável pelo acesso e manipulação dos dados na sua aplicação.

- View A view é responsável pela interface que será apresentada, mostrando as informações do model para o usuário.

- Controller É a camada de controle, responsável por ligar o model e a view, fazendo com que os models possam ser repassados para as views e vice-versa.

- Esta divisão facilita a manutenção e extensão futura do código


## Controller

<p>É o componente chamado pelo cliente. O controller executa os seguintes passos: </p>

- Prepara os dados que serão usados pelo
model

- Chama o model

- Prepara os dados que serão usados pela view

- Direciona para a view

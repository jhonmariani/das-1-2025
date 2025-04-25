# das-1-2025

# Aula dia 26/02

# Livro ENG SOFT MODERNA CAP-07 https://engsoftmoderna.info/cap7.html

Interface, pacotes, componentes, modulos, camadas, serviços
O pacote ajuda na arquitetura de software deixando o projeto mais organizado, eficiênciente, com o objetivo de criar um software de mais alto nível
Camada de apresentação (front)
Camada de gerir informação (back)
Camada de informação (bd,drivers, devices)
Anotação são tipos de componentes, são bibliotecas, feitas de antemão, e usadas para facilitar na programação
No Java se refere como @
Httpserveletrequest (Java) ajuda a entender oq è o Java vindo da internet

# Aula dia 27/02

Padrões aquiteturais, umas das mais utilizadas é em camadas. Basica front / back / bd

- Aquitetura model view-controlle ou MVC
- view: apresentação dos dados ao usuario
- model: acessar e gerenciar dados
- controller: controlar a tela

- entidade: 
- modelo: outra classe que representa os dados que vão para outra tela

Microsserviços: pode ser um modulo, ideia que nao tenha interface grafica. Api rest. Deve ter camadas.

Monolito
- Repositorio unico de codigo
- Uso de uma unica tecnologia padrão
- Compilado, testado, unico pacote
- Deploy com um unico sistema
- Executado como um unico processo no sistema operacional
- Unico banco de dados

# Aula dia 05/03

- Padrão arquitetural: solução para um problema especifico.
- MVC: separa as responsabilidades (model(dados) - view(tela) - control(comportamento))
- Estilo arquitetura = organização do projeto

- Arquitetura em camadas
- DIvisão de responsabilade
- Perfomace
- Segurança
- Manutenibilidade
- Camada de apresentação
  - Requisitos próprios
- Camada de logica de negocio (aplicação)
  - Local central para definiição e atualização de regras
  - Escalar o backend suportar as requisições
- Camada de persistência
  - Banco de dados relacional - consolidada
  - Resolve problemas de concorrencia
  - Permite compartilhamento de dados

 # Aula dia 06/03
 
  - Who Needs an Architect ? https://martinfowler.com/ieeeSoftware/whoNeedsArchitect.pdf

O que é arquitetura?
  - A arquitetura de um sistema de software(em um dado ponto no tempo) é sua organização ou estrutura de componentes significativos interagindo por meio de interfaces, esses componentes sendo compostos de componentes e interfaces sucessivamente menores

Qual o comportamento do arquiteto da "Matrix"?
  - Aquele quem toma as decisões mais importantes, logo no início do projeto, para que todos tenham um plano a seguir, sendo o único responsável por garantir a integridade conceitual de um sistema
  
Qual o comportamento do arquiteto ideal?
  - É orientar a equipe de desenvolvimento, levantar seu nível para que possam assumir questões mais complexas. Melhorar a habilidade da equipe de desenvolvimento dá ao arquiteto uma alavancagem muito maior do que ser o único tomador de decisões e, portanto, correr o risco de ser um gargalo arquitetônico.

  # Aula 13/03

  - Fundamentos da arquitetura de Software
    - Arquitetura de software é a estrutura que organiza os componentes de um sistema e define como eles se comunicam, garantindo qualidade, desempenho e manutenibilidade.
  - Pensamento arquitetonico
    - Pensamento arquitetônico é a capacidade de tomar decisões técnicas com visão de longo prazo, equilibrando simplicidade, escalabilidade e evolução do sistema.

  # Aula 19/03

  - Trade-offs
    - São escolhas técnicas em que se ganha algo e se perde em outro aspecto, como escolher entre desempenho e simplicidade.
  - Topicos
    - Tópicos referem-se a canais de comunicação usados em sistemas baseados em eventos, onde produtores publicam mensagens e consumidores se inscrevem para recebê-las.
  - Filas
    - São estruturas de dados que armazenam mensagens de forma ordenada até que sejam processadas, ajudando a desacoplar componentes e lidar com picos de carga.
  - Fan out
    - É um padrão em que uma mensagem é enviada simultaneamente para múltiplos destinos, permitindo distribuir o processamento ou acionar diversos serviços ao mesmo tempo.

  # Aula 02/04 

  - Trabalho (CHAT)

  # Aula 09/04

  - Caracteristicas Arquiteturais
  https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/26%5B%3Bvnd.vst.idref%3Dcap4.xhtml%5D!/4

  - RESUMO
  - ...

  # Aula 16/04

  - Fundamentos da Arquitetura de Software
  https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/38%5B%3Bvnd.vst.idref%3Dcap9.xhtml%5D!/4

  - RESUMO
  - ....

  # Aula 24/04

  - Estilo de Arquitetura em Camadas
  https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/40%5B%3Bvnd.vst.idref%3Dcap10.xhtml%5D!/4

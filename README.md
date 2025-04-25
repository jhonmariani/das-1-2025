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
  O que diferencia a arquitetura de software da codificação e do design está na sua função estratégica. Enquanto codificação e design tratam da implementação prática, a arquitetura foca nas decisões estruturais e organizacionais que têm impacto direto em toda a solução, independentemente das funcionalidades específicas do domínio do problema.
    
Uma característica da arquitetura atende a três critérios:

  - Especificar uma consideração de design fora do domínio, ou seja, não relacionada diretamente às funcionalidades de negócio.
  - Influenciar algum aspecto estrutural do design, afetando decisões como camadas, componentes, padrões arquiteturais, tecnologias e frameworks.
  - Ser essencial ou importante para o sucesso da aplicação, tendo impacto direto na viabilidade, manutenção, desempenho, segurança, escalabilidade, entre outros.

  As características da arquitetura dividem-se em implícitas e explícitas. As implícitas não costumam aparecer nos requisitos, mas são essenciais ao sucesso do sistema — como segurança, confiabilidade e disponibilidade. Cabe ao arquiteto identificá-las com base no conhecimento do domínio. Já as explícitas estão claramente descritas nos documentos de requisitos ou em instruções formais do projeto.
  Variam desde aspectos técnicos de baixo nível, como modularidade, até questões complexas como escalabilidade. Não existe um padrão único para defini-las, e cada organização adota suas próprias interpretações. Como o ecossistema de software muda constantemente, novos termos e métricas surgem com frequência, trazendo novas formas de definir essas características. Ainda assim, os arquitetos costumam organizá-las em grandes categorias para facilitar seu entendimento e aplicação.
  Características operacionais da arquitetura envolvem capacidades como desempenho, escalabilidade, elasticidade, disponibilidade e confiabilidade. As características operacionais da arquitetura têm uma sopreposição significativa com as preocupações de operações e DevOps, formando a interseção dessas questões em muitos projetos de software.

  Os arquitetos devem se preocupar com a estrutura do código. Em muitos casos, o arquiteto tem uma responsabilidade única ou compartilhada pelas questões de qualidade do código, como boa modularidade, acoplamento controlado entre os componentes, código legível e muitas outras avaliações internas da qualidade.
  Embora muitas características da arquitetura se classifiquem em categorias fáceis de reconhecer, muitas estão fora ou desafiam a categorização, formando importantes restrições de design e considerações.
  
  Muitos termos usados para descrever características da arquitetura são imprecisos e ambíguos, com significados que variam conforme o contexto. Termos como interoperabilidade e compatibilidade, ou ainda disponibilidade e confiabilidade, frequentemente se sobrepõem, embora tenham distinções técnicas importantes. Além disso, algumas definições, como “aprendizado”, podem se referir tanto à facilidade de uso por humanos quanto à capacidade do sistema de aprender com o ambiente. A ISO tenta organizar essas características em categorias como desempenho, compatibilidade, usabilidade, confiabilidade, segurança, manutenibilidade e portabilidade, detalhando cada uma com subcaracterísticas. No entanto, mesmo essa classificação é incompleta e não universal. Por fim, a adequação funcional, apesar de listada pela ISO, não é considerada uma característica da arquitetura, pois está mais ligada aos objetivos funcionais do sistema.

  # Aula 16/04

  - Fundamentos da Arquitetura de Software
  https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/38%5B%3Bvnd.vst.idref%3Dcap9.xhtml%5D!/4

  - RESUMO
  Estilos de arquitetura, ou padrões de arquitetura, descrevem relações entre componentes e suas características, funcionando como atalhos para arquitetos experientes. Cada estilo captura detalhes importantes sobre a estrutura, vantagens, desvantagens e estratégias comuns de implementação. Arquitetos devem estar familiarizados com esses estilos básicos para compreender os padrões maiores e suas implicações no design.
  Padrões fundamentais, como a arquitetura em camadas, continuam a ser usados ao longo do tempo por sua eficácia em organizar o código e as implementações.

  Uma "bola de lama" descreve uma aplicação desorganizada e sem estrutura, que se torna difícil de manter e escalar à medida que cresce. Esse antipadrão é comum devido à falta de controle sobre a qualidade e a estrutura do código, tornando as mudanças complexas e arriscadas.
  No começo, software e hardware eram uma entidade única, mas com o tempo, surgiram sistemas mais complexos, como distribuídos. Hoje, sistemas de software geralmente se dividem em componentes para manter desempenho e escalabilidade. A necessidade de particionar sistemas levou ao desenvolvimento de estilos arquiteturais que buscam separar eficientemente as partes do sistema. Um estilo fundamental é a arquitetura de duas camadas ou cliente/servidor, que divide a funcionalidade técnica entre front-end e back-end, variando conforme a época e as capacidades de computação.
  Os estilos de arquitetura podem ser classificados em dois principais: monolítico (uma unidade de implementação de todo o código) e distribuído (várias unidades de implementação conectadas por protocolos de acesso remoto).
  Embora as arquiteturas distribuídas ofereçam melhor desempenho, escalabilidade e disponibilidade do que as monolíticas, elas envolvem trade-offs significativos. Esses problemas são descritos nas falácias da computação distribuída, um termo criado por L. Peter Deutsch e colegas, que se referem a suposições falsas frequentemente feitas sobre sistemas distribuídos.

  - 08 Falácias da computação:

  - Falácia 1: A Rede É Confiável
    - Presume-se que a rede sempre funcionará perfeitamente, mas, na prática, falhas podem ocorrer, como perda de pacotes ou interrupções.
  - Falácia 2: A Latência É Zero
    - Assume-se que não há atrasos na rede, mas a latência sempre estará presente devido a fatores como distância e congestionamento.
  - Falácia 3: A Largura de Banda É Infinita
    - Presume-se que a rede pode suportar qualquer quantidade de dados, mas ela tem limitações físicas e de capacidade.
  - Falácia 4: A Rede É Segura
    - Assume-se que a comunicação na rede é sempre protegida, mas ataques e brechas de segurança são uma preocupação constante.
  - Falácia 5: A Topologia Nunca Muda
    - Supõe-se que a estrutura da rede permaneça constante, mas ela pode mudar devido a falhas ou atualizações.
  - Falácia 6: Existe Apenas Um Administrador
    - Assume-se que uma única pessoa controla toda a rede, mas redes grandes geralmente têm múltiplos administradores com diferentes responsabilidades.
  - Falácia 7: O Custo do Transporte É Zero
    - Presume-se que enviar dados pela rede não tenha custo, mas há custos associados ao uso de largura de banda e recursos.
  - Falácia 8: A Rede É Homogênea
    - Assume-se que todos os componentes da rede são iguais, mas eles podem ser diferentes em termos de tecnologias, protocolos e configurações.

  Além das oito falácias da computação distribuída, existem outras questões e desafios na arquitetura distribuída que não estão presentes nas arquiteturas monolíticas.

  Em arquiteturas distribuídas, a análise de problemas é difícil devido à dispersão de logs em múltiplos sistemas e formatos, complicando o rastreamento de requisições. Ferramentas como Splunk ajudam a consolidar logs, mas não resolvem todas as complexidades. As transações também são mais complicadas, pois dependem de consistência eventual em vez de transações ACID, sacrificando integridade para maior escalabilidade e desempenho. As sagas transacionais e as transações BASE são técnicas usadas para gerenciar transações distribuídas. Além disso, a manutenção e o versionamento de contratos entre cliente e servidor são desafiadores devido ao desacoplamento dos serviços e à gestão de diferentes versões em sistemas de equipes distintas.

  # Aula 24/04

  - Estilo de Arquitetura em Camadas
  https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/40%5B%3Bvnd.vst.idref%3Dcap10.xhtml%5D!/4

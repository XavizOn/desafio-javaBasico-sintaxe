📌 Exercício: Simulação de Conta Bancária em Java

Este projeto foi desenvolvido como parte de um exercício prático para uma aula de Java Básico. O objetivo é praticar conceitos fundamentais da linguagem, como entrada de dados, criação de classes e objetos, uso de métodos e manipulação de Strings.

🏆 Objetivo

Criar um programa que simula a abertura de uma conta bancária, solicitando informações ao usuário e exibindo os dados cadastrados.

🛠 Tecnologias Utilizadas

Java (JDK 8 ou superior)

Scanner (para entrada de dados do usuário)

Classes e Objetos

📜 Passo a Passo do Código

1️⃣ Criamos a classe ContaTerminal que contém:

Atributos para armazenar nome do cliente, número da agência, número da conta e saldo.

Um construtor para inicializar esses atributos.

Um método exibirInformacoes() para mostrar os dados da conta.

2️⃣ No main(), fazemos a interação com o usuário:

Utilizamos Scanner para capturar os dados digitados.

Criamos um objeto da classe ContaTerminal.

Exibimos uma mensagem de boas-vindas com os detalhes da conta criada.

📌 Como Executar o Programa

1️⃣ Certifique-se de ter o Java JDK instalado em sua máquina.
2️⃣ Salve o código em um arquivo chamado ContaTerminal.java.
3️⃣ Compile o código no terminal/cmd com:

javac ContaTerminal.java

4️⃣ Execute o programa com:

java ContaTerminal

5️⃣ Siga as instruções no console, inserindo os dados solicitados.

📌 Exemplo de Saída no Console

   ****** BEM-VINDO AO BANCO TEXTE ******
*** Iniciando Processo de Abertura de Conta ***
_____________________________________________
Digite o número da agência: 1234
Digite o número da conta: 56789
Por favor, digite seu nome: João Silva

Olá João Silva, obrigado por criar uma conta conosco.
Sua agência é 1234, conta número 56789.
Seu saldo inicial é de R$ 0.0 e já está disponível para saque.

🎯 Conceitos Praticados

✅ Classes e Objetos
✅ Construtores e Métodos
✅ Entrada de Dados com Scanner
✅ Concatenação de Strings
✅ Exibição de Mensagens no Console 

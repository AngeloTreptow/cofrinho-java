# 🏦 Cofrinho Java

Projeto em **Java** que simula um cofrinho com diferentes moedas (**Real**, **Dólar**, **Euro**).  

Este projeto foi desenvolvido para demonstrar habilidades em **Programação Orientada a Objetos (POO)**, aplicação de **Factory Pattern**, tratamento robusto de **exceções**, e organização do código seguindo **boas práticas de desenvolvimento Java**.

---

## 📚 Sobre o projeto

O Cofrinho permite:

* 💰 Adicionar moedas (Real, Dólar, Euro)  
* 🗑️ Remover moedas existentes  
* 📄 Listar todas as moedas adicionadas  
* 💵 Calcular o total convertido para Reais  
* ⚠️ Validar tipos de moedas com exceções  

O projeto reforça conceitos de **orientação a objetos**, **organização de código** e **tratamento de erros em Java**.

---

## 📂 Estrutura do projeto

O código está organizado por pacotes:

```text
src/
└─ br/com/angelotreptow/cofrinho/
   ├─ application/ → Main.java
   ├─ model/ → Moeda, Real, Dolar, Euro, Cofrinho
   └─ service/ → FabricaMoeda.java (Factory Pattern)

.gitignore → ignora arquivos compilados e configurações da IDE

```
---

## 🚀 Tecnologias utilizadas

* Java 17+
* Orientação a Objetos (POO)
* Factory Pattern
* Exceptions e validação de entrada
* Eclipse IDE 

---

## 🎯 Objetivo
Este projeto faz parte do meu portfólio e demonstra:

* Estrutura organizada de projetos Java

* Aplicação de POO e padrões de projeto

* Código limpo e de fácil manutenção

---

## 👨‍💻 Autor

**Ângelo Treptow**
Estudante de desenvolvimento Java

GitHub: [https://github.com/AngeloTreptow](https://github.com/AngeloTreptow)

---

## 🖥 Como executar

1. Abra o Eclipse ou IntelliJ.
2. Importe o projeto como "Existing Java Project".
3. Execute a classe `Main.java`.
4. Interaja com o programa pelo console da IDE.

---

## 🖥 Exemplo de execução

```text
+----------+
| Cofrinho |
+----------+
1 - Adicionar Moeda
2 - Remover Moeda
3 - Listar Moedas
4 - Calcular Total Convertido para Real
0 - Encerrar
Escolha uma opção: 1

Escolha uma moeda:
1 - Real
2 - Dólar
3 - Euro
2
Digite o valor: 10
Moeda adicionada!

+----------+
| Cofrinho |
+----------+
Escolha uma opção: 4
Total em reais: R$ 50,00

```


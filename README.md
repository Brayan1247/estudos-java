# Estudos de Java

Repositório pessoal para guardar exercícios e exemplos feitos durante o estudo de Java.

## Estrutura

```text
src/
└── main/java/       # programas e exercícios Java
```

Os arquivos atuais são exercícios independentes:

- `Main.java`: leitura de números, soma e condicionais.
- `Repetiçãolista.java`: repetição com `for`.
- `Tabuadacompleta.java`: impressão de tabuadas.

## Requisitos

- JDK 25
- Maven 3.9 ou superior

## Compilar

```bash
mvn clean compile
```

## Executar um exercício

```bash
mvn compile
java -cp target/classes Main
```

Troque `Main` pelo nome da classe que deseja executar, sem a extensão `.java`.

## Como adicionar exercícios

Coloque cada programa em `src/main/java` e dê à classe pública um nome que descreva o exercício. Para conectar este projeto ao GitHub, configure o remoto e publique a branch principal uma vez:

```bash
git remote add origin https://github.com/SEU-USUARIO/estudos-java.git
git branch -M main
git push -u origin main
```

O hook local envia automaticamente cada novo commit quando a branch já possui upstream. Para habilitá-lo em outro clone, execute uma vez `git config core.hooksPath .githooks`. Sem remoto/upstream, o commit permanece local.

Registre as alterações com Git:

```bash
git add src/main/java
git commit -m "Adiciona exercício de arrays"
```

O GitHub Actions compila o projeto a cada push e pull request.

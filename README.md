# Começando com Java

### Instalando do JDK 21 (Java Development Kit)

[Installing Java in Fedora](https://docs.fedoraproject.org/en-US/quick-docs/installing-java/) que pode ser feito atraves
do Terminual

```bash
$ sudo dnf install java-21-openjdk-devel.x86_64
```

```bash
$ java -version

openjdk version "21.0.7" 2025-04-15
```

---

### Instalando o Gradle

[Guia de Instalação do Gradle](https://gradle.org/install/), Baixando o arquivo do Gradle em sua ultima versão (latest) e descompactando ele

```bash
$ mkdir /opt/gradle
$ unzip -d /opt/gradle gradle-8.14.2-bin.zip
```

E então adicionando ele ao <i>PATH</i>

```bash
$ nvim .bashrc
```

```vim
# .bashrc

export PATH=$PATH:/opt/gradle/gradle-8.14.2/bin
#fim_do_bashrc
:wq #write_and_quit
```

```bash
# reinicie o terminal
$ gradle -v

-----------------------
Gradle 8.14.2
-----------------------
```

---

### Instalando o Maven

[Guia de Instalação do Maven](https://maven.apache.org/install.html) ou apenas com o comando no terminal

```bash
$ sudo dnf install maven
```

---

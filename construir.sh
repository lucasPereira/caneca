#!/bin/bash

fontes=fontes
fontesCaneca=${fontes}/caneca
fontesGramaticas=${fontes}/g
fontesJava=${fontes}/java
fontesJavaAntlr=${fontesJava}/br/ufsc/inf/ine5426/caneca/antlr

binarios=binarios
binariosJava=${binarios}/class

bibliotecas=bibliotecas
bibliotecasJava=${bibliotecas}/jar
bibliotecasCss=${bibliotecas}/css
bibliotecaCssEstilos=${bibliotecasCss}/estilos
bibliotecaJavaAntlr=${bibliotecasJava}/antlr.jar

construcao=construcao
relatorios=${construcao}/relatorios
relatorioAnaliseLexica=${relatorios}/analiseLexica.txt
relatorioAnaliseSintatica=${relatorios}/analiseSintatica.txt
relatorioAnaliseArvore=${relatorios}/analiseArvore.txt
relatorioErroExecucao=${relatorios}/erroExecucao.txt
relatorioSaidaExecucao=${relatorios}/saidaExecucao.txt

recursos=recursos
recursoEspecificacaoDoGEdit=${recursos}/outros/especificacaoDoGEdit.xml

nomeDoAnalisadorLexico=CanecaLexico
nomeDoAnalisadorSintatico=CanecaSintatico
nomeDoAnalisadorArvore=CanecaArvore
gLexico=${fontesGramaticas}/${nomeDoAnalisadorLexico}.g
javaLexico=${fontesJavaAntlr}/${nomeDoAnalisadorLexico}.java
tokensLexico=${fontesJavaAntlr}/${nomeDoAnalisadorLexico}.tokens
gSintatico=${fontesGramaticas}/${nomeDoAnalisadorSintatico}.g
javaSintatico=${fontesJavaAntlr}/${nomeDoAnalisadorSintatico}.java
tokensSintatico=${fontesJavaAntlr}/${nomeDoAnalisadorSintatico}.tokens
gArvore=${fontesGramaticas}/${nomeDoAnalisadorArvore}.g
javaArvore=${fontesJavaAntlr}/${nomeDoAnalisadorArvore}.java
tokensArvore=${fontesJavaAntlr}/${nomeDoAnalisadorArvore}.tokens

gerados=gerados
geradosHtml=${gerados}/html

limpar() {
	echo ":limpar";
	rm -rf ${binarios};
	rm -rf ${construcao};
	rm -rf ${javaLexico};
	rm -rf ${tokensLexico};
	rm -rf ${javaSintatico};
	rm -rf ${fontesJavaAntlr}/*;
	rm -rf ${gerados};
}

criarDiretorios() {
	echo ":criarDiretorios";
	mkdir -p ${fontes};
	mkdir -p ${fontesCaneca};
	mkdir -p ${fontesGramaticas};
	mkdir -p ${fontesJava};
	mkdir -p ${fontesJavaAntlr};
	mkdir -p ${binarios};
	mkdir -p ${binariosJava};
	mkdir -p ${bibliotecas};
	mkdir -p ${bibliotecasJava};
	mkdir -p ${bibliotecasCss};
	mkdir -p ${bibliotecaCssEstilos};
	mkdir -p ${construcao};
	mkdir -p ${relatorios};
	mkdir -p ${recursos};
	mkdir -p ${gerados};
	mkdir -p ${geradosHtml};
}

gerarAnalisadorLexico() {
	echo ":gerarAnalisadorLexico";
	java -classpath ${bibliotecaJavaAntlr} org.antlr.Tool ${gLexico} -fo ${fontesJavaAntlr} -report -print > ${relatorioAnaliseLexica};
}

gerarAnalisadorSintatico() {
	echo ":gerarAnalisadorSintatico";
	java -classpath ${bibliotecaJavaAntlr} org.antlr.Tool ${gSintatico} -fo ${fontesJavaAntlr} -report -print > ${relatorioAnaliseSintatica};
}

gerarAnalisadorArvore() {
	echo ":gerarAnalisadorArvore";
	java -classpath ${bibliotecaJavaAntlr} org.antlr.Tool ${gArvore} -fo ${fontesJavaAntlr} -report -print > ${relatorioAnaliseArvore};
}

compilarFontesJava() {
	echo ":compilarFontesJava";
	javac -g -deprecation -Werror -classpath ${bibliotecaJavaAntlr}:${binariosJava} -sourcepath ${fontesJava} -d ${binariosJava} `find ${fontesJava} -name *.java`;
}

adicionarCanecaAoGEdit() {
	echo ":adicionarCanecaAoGEdit";
	mkdir -p ~/.local/share/gtksourceview-3.0/language-specs;
	rm -f ~/.local/share/gtksourceview-3.0/language-specs/caneca.lang;
	cp ${recursoEspecificacaoDoGEdit} ~/.local/share/gtksourceview-3.0/language-specs/caneca.lang;
}

construir() {
	limpar
	criarDiretorios
	gerarAnalisadorLexico
	gerarAnalisadorSintatico
	gerarAnalisadorArvore
	compilarFontesJava
	adicionarCanecaAoGEdit
}

if [ -n "$1" ]
then
	$1
else
	construir
fi




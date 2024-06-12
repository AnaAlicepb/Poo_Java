<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Gerenciamento de Pessoas">
    <meta name="keywords" content="Java, POO, Gerenciamento de Pessoas">
    <meta name="author" content="Ana Alice Rodrigues">

</head>
<body>

<header>
    <h1>Gerenciamento de Pessoas</h1>
    <img src="./img/poo01.png" alt="resultado" width="300" height="auto">
</header>

<details>
    <summary>Índice</summary>
    <ol>
        <li><a href="#sobre-o-projeto">Sobre o projeto</a></li>
        <li><a href="#parte-tecnica">Parte Técnica</a></li>
        <li><a href="#estrutura-dos-arquivos">Estrutura dos Arquivos</a></li>
        <li><a href="#casos-de-uso">Casos de Uso</a></li>
        <li><a href="#ferramentas">Ferramentas</a></li>
        <li><a href="#contato">Contato</a></li>
    </ol>
</details>

<section id="sobre-o-projeto">
    <h2>Sobre o projeto</h2>
    <p>
        O projeto "Gerenciamento de Pessoas" é uma aplicação em Java que utiliza os princípios da Programação Orientada a Objetos (POO) para gerenciar informações de pessoas físicas e jurídicas. A aplicação permite armazenar e exibir dados comuns e específicos de cada tipo de pessoa, utilizando uma classe abstrata <strong>Pessoa</strong> como base para as classes concretas <strong>PessoaFisica</strong> e <strong>PessoaJuridica</strong>.
    </p>
    <p>
        Proposta de Valor: Este programa pode ser útil em diversas situações, como organização de listas de presença, eventos, e qualquer outra situação onde a categorização e ordenação de pessoas seja necessária.
    </p>
</section>

<section id="parte-tecnica">
    <h2>Parte Técnica</h2>
    <ul>
        <li><strong>Java:</strong> Linguagem de programação utilizada para desenvolver o programa.</li>
        <li><strong>Classes e Objetos:</strong> Utilização de classes para representar pessoas.</li>
        <li><strong>Coleções:</strong> Utilização de <code>ArrayList</code> para armazenar e manipular listas de pessoas.</li>
        <li><strong>Scanner:</strong> Utilização da classe <code>Scanner</code> para ler a entrada do usuário.</li>
        <li><strong>Ordenação:</strong> Utilização de <code>Collections.sort</code> e <code>Comparator</code> para ordenar as listas de pessoas.</li>
        <li><strong>Divisão de String:</strong> Utilização do comando <code>split</code> para dividir a entrada de dados.</li>
    </ul>
</section>

<section id="estrutura-dos-arquivos">
    <h2>Estrutura dos Arquivos</h2>
    <ul>
        <li><code>Pessoa.java</code>: Define a classe abstrata <strong>Pessoa</strong> com propriedades comuns como nome, endereço e telefone, além de um método abstrato <code>mostrarDados()</code>.</li>
        <li><code>PessoaFisica.java</code>: Extende a classe <strong>Pessoa</strong> e adiciona propriedades específicas como CPF e data de nascimento. Implementa o método <code>mostrarDados()</code> para exibir as informações da pessoa física.</li>
        <li><code>PessoaJuridica.java</code>: Extende a classe <strong>Pessoa</strong> e adiciona propriedades específicas como CNPJ e razão social. Implementa o método <code>mostrarDados()</code> para exibir as informações da pessoa jurídica.</li>
        <li><code>Main.java</code>: Contém o método <code>main</code> que instancia objetos das classes <strong>PessoaFisica</strong> e <strong>PessoaJuridica</strong>, e chama o método <code>mostrarDados()</code> para exibir as informações.</li>
    </ul>
</section>

<section id="casos-de-uso">
    <h2>Casos de Uso</h2>
    <ul>
        <li>Organização de listas de presença.</li>
        <li>Ordenação de participantes de eventos.</li>
        <li>Qualquer situação onde a ordenação alfabética de nomes seja necessária.</li>
    </ul>
</section>

<section id="ferramentas">
    <h2>Ferramentas</h2>
    <ul>
        <li><img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Badge Java"></li>
        <li><img src="https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white" alt="Badge Git"></li>
        <li><img src="https://img.shields.io/badge/Visual_Studio_Code-0078D4?style=for-the-badge&logo=visual-studio-code&logoColor=white" alt="Badge Visual Studio Code"></li>
    </ul>
</section>

<section id="contato">
    <h2>Contato</h2>
    <ul>
        <li><a href="https://linktr.ee/anaeanali5" target="_blank"><img src="https://img.shields.io/badge/Ana_Alice_Rodrigues-blue?style=for-the-badge" alt="Perfil de Ana Alice Rodrigues"></a></li>
    </ul>
</section>

</body>
</html>


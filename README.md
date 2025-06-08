<b> Exercício de Java - Tema: Garrafa Térmica Inteligente POO<br></b> 

Objetivo:<br>
Praticar os conceitos de Programação Orientada a Objetos em Java, incluindo:<br>

- Criação de classes e objetos

- Uso de métodos especiais (toString() e equals())

- Criação de exceções personalizadas

- Tratamento de exceções com try-catch

- Padrão de projeto Singleton

- Diferença entre == e .equals()<br><br>

Enunciado:<br>
Imagine que você foi contratado para desenvolver um sistema simples de monitoramento para uma garrafa térmica inteligente. A garrafa consegue medir a temperatura do líquido em seu interior e emite um alerta caso a temperatura esteja muito alta (acima de 80ºC).<br><br>

Você deverá implementar as seguintes classes:<br>

<b> Classe 1: GarrafaTermica<br> </b>
Esta classe representa uma garrafa térmica.<br>

Atributos:<br>
- String marca
- double temperaturaAtual<br>

Métodos obrigatórios:<br>
- Construtor com todos os atributos.
- Métodos get e set para todos os atributos.
- Sobrescreva o método toString() para retornar uma string como:
"Garrafa da marca XYZ com temperatura de 75.00°C"
- Sobrescreva o método equals(Object obj) para considerar duas garrafas iguais se tiverem a mesma marca.<br><br>

 <b>Classe 2: TemperaturaMuitoAltaException</b><br>
Crie uma exceção personalizada chamada TemperaturaMuitoAltaException.<br>
Requisitos:<br>
- Deve estender a classe Exception.
- Deve ter um construtor que recebe uma mensagem (String) e a repassa para a superclasse.<br><br>

<b> Classe 3: MonitorDeTemperatura (Singleton)</b><br>
Essa classe representa o sistema que monitora a garrafa.<br>

Requisitos:<br>
- Implemente esta classe como um Singleton.<br>

Atributo:<br>
- GarrafaTermica garrafaMonitorada<br>

Métodos:<br>
- void definirGarrafa(GarrafaTermica g) – define qual garrafa será monitorada.
- void verificarTemperatura() – se a temperatura da garrafa for maior que 80ºC, lance a exceção TemperaturaMuitoAltaException com uma mensagem como:
"Temperatura muito alta na garrafa XYZ: 85.0°C"<br><br>

<b>Classe 4: Main (com método main)</b><br>
Implemente uma classe com o método main para testar o sistema:
1. Crie duas garrafas diferentes, mas com a mesma marca.<br>
2. Compare as duas garrafas com == e com .equals() e imprima os resultados.<br>
3. Imprima o toString() de uma das garrafas.<br>
4. Registre uma das garrafas no MonitorDeTemperatura (Singleton).<br>
5. Use um bloco try-catch para chamar o método verificarTemperatura() e tratar a exceção, imprimindo a mensagem de erro se for lançada.
<br><br>

O que você deve entregar:<br>

Resultado - Saída do Console:<br>
![image](https://github.com/user-attachments/assets/8e2baa33-9dce-4a14-ae39-d38782cfbe50)

- Os arquivos .java das quatro classes<br>
- O código devidamente indentado e comentado<br>
- A saída esperada no terminal com os testes realizados no main<br>


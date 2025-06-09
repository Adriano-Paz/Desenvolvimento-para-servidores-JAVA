<?php

echo "1- Crie um algoritmo que receba um número digitado pelo usuário e verifique se esse valor
é positivo, negativo ou igual a zero. A saída deve ser: 'Valor Positivo', 'Valor Negativo' ou 'Igual
a Zero'";

$algoritimo = -1;


if ($algoritimo  > 0){
    echo 'Valor positivo';
}else if($algoritimo < 0){
    echo 'Valor negativo';
}else if($algoritimo == 0){
    echo 'valor igual a zero';
}
echo "<br><br>";
echo "---------------------------------------------------------------------------------------------------------------";
echo  "<br><br>";


echo "2 - Faça um algoritmo PHP que receba os valores A e B, imprima-os em ordem crescente
em relação aos seus valores. Exemplo, para A=5, B=4. Você deve imprimir na tela: '4 5'. Dica,
utilizem concatenaçã";
echo "<br><br>";
$a = 5;
$b = 4;

echo $b.' - '. $a;

echo "<br><br>";
echo "---------------------------------------------------------------------------------------------------------------";

echo "<br><br>";


echo "3 - Crie um algoritmo para calcular a média final de um aluno, para isso, solicite a entrada
de três notas e as insira em um array, por fim, calcule a média geral. Caso a média seja maior ou
igual a seis, exiba aprovado, caso contrário, exiba reprovado. Exiba também a média final
calculada.
Ex: N1 = 5 | N2 = 10 | N3 = 4 | MG = 6,33 [Aprovado].";
echo "<br><br>";
$n1 = 7;
$n2 = 7;
$n3 = 8;

 $media = ($n1+$n2+$n3) /3;

 if($media >=6){
    echo "nota.$media  aprovado";
 }else{
    echo "nota.$media  reprovado";
 }

 echo "<br><br>";
echo "---------------------------------------------------------------------------------------------------------------";

 echo "<br><br>";
echo "4 - Ler um número inteiro entre 1 e 12 e escrever o mês correspondente. Caso o número
seja fora desse intervalo, informar que não existe mês com este número. Exigência, resolva esse
exercício utilizando array.
Observação: Crie as soluções a seguir utilizando a estrutura switch case:";
echo "<br><br>";
$mes = 14;
Switch ($mes){
    case 1:
        echo 'janeiro';
        break;
    case 2:
        echo 'fevereiro';
        break;
    case 3:
        echo 'março';
        break;
    case 4:
        echo 'abril';
        break;
    case 5:
        echo 'maio';
        break;
    case 6:
        echo 'junho';
        break;
    case 7:
        echo 'julho';
        break;
    case 8:
        echo 'agosto';
        break;
    case 9:
        echo 'setembro';
        break;
    case 10:
        echo 'outubro';
        break;
    case 11:
        echo 'novembro';
        break;
    case 12:
        echo 'dezembro';
        break;
    default:
        echo 'não é um mes';
        break;
    
}
echo "<br><br>";
echo "---------------------------------------------------------------------------------------------------------------";
echo "<br><br>";
echo "5- Elabore um algoritmo que leia dois valores do usuário e a operação que ele deseja
executar (Operações: soma, subtração, divisão, multiplicação). Execute a operação desejada e
mostre o resultado;";
echo "<br><br>";
$denominador1 = 30;
$denominador2 = 10;
$operacao = '/';
Switch ($operacao){
    case '+':
        $resultado = $denominador1 + $denominador2;
        break;
    case '-':
        $resultado = $denominador1 - $denominador2;
        break;
    case '*':
        $resultado = $denominador1 * $denominador2;
        break;
    case '/':
        $resultado = $denominador1 / $denominador2;
        break;
}


echo "$resultado";
echo "<br><br>";
echo "---------------------------------------------------------------------------------------------------------------";
echo'<br><br>';


echo"6 - Faça um algoritmo que aborde a seguinte situação: Uma loja fornece 10% de desconto
para funcionários e 5% de desconto para clientes vips. Faça um programa que calcule o valor total
a ser pago por uma pessoa. O script deverá ler o valor total da compra e um código que identifique
se o comprador é um cliente comum (1), funcionário (2) ou vip (3);";
echo "<br><br>";
$TipoCliente = 3;
$Valorcompra  = 80.00;

Switch ($TipoCliente){
    case 1:
        $desconto = 0.10;
        echo "cliente comun ";
        break;
    case 2:
        $desconto = 0.05;
        echo "funcionario ";
        break;
        
    case 3:
        $desconto = 0;
        echo "vip ";
        break;
        
}

$ValorFinal = $Valorcompra - ($Valorcompra * $desconto);

echo "valor da compra.$ValorFinal";
echo "<br><br>";
echo "---------------------------------------------------------------------------------------------------------------";

echo'<br><br>';
echo "7 - Faça um algoritmo PHP que calcule e imprima o salário reajustado de um funcionário
de acordo com a seguinte regra:
• salários até 300, reajuste de 50%
• salários maiores que 300, reajuste de 30%
Observação: Crie as soluções abaixo utilizando estruturas de repetição de acordo com
sua escolha:";
echo "<br><br>";
$salario = 200.00;

if($salario <= 300.00){
    $Reajuste = 0.05;
}else{
    $Reajuste = 0.03;
}

$salarioFinal = $salario + ($salario * $Reajuste);
echo "o seu salario foi reajustado de.R$$salario para final é.R$$salarioFinal";

echo "<br><br>";
echo "---------------------------------------------------------------------------------------------------------------";


echo'<br><br>';
echo "8 - Faça um algoritmo em PHP que receba um valor qualquer e imprima os valores de 0
até o valor recebido, exemplo:
- Valor recebido = 9
- Impressão do programa – 0 1 2 3 4 5 6 7 8 9 ";

echo "<br><br>";
$ValorRecebido = 9;

For($contagem = 0; $contagem <= $ValorRecebido; $contagem++){
    print $contagem;
}

echo "<br><br>";
echo "---------------------------------------------------------------------------------------------------------------";

echo"<br><br>";
echo" 9 - Faça um algoritmo PHP que receba um valor qualquer e calcule o seu fatorial (!),
sabendo que fatorial de um número é: 7! = 7*6*5*4*3*2*1 4! = 4*3*2*1";
echo "<br><br>";
$numero = 7;
$resultado = 1;
for($fatorial = $numero; $fatorial >= 1; $fatorial--){
    $resultado  *= $fatorial;
    
}

     print $resultado;

echo "<br><br>";
echo "---------------------------------------------------------------------------------------------------------------";

echo "<br><br>";
echo"10 - Faça um algoritmo PHP que receba dois valores quaisquer e imprime todos os valores
intermediários a ele, veja exemplo: Primeiro Valor = 5 Segundo Valor = 15 Imprime: 6 7 8 9 10 11
12 13 14";
echo "<br><br>";
$c = 7;
$d = 17;

for($c++ || $c > $c; $c <$d; $c++){
echo "$c,";
}

echo "<br><br>";
echo "---------------------------------------------------------------------------------------------------------------";
echo "<br><br>";
echo "11- Pesquise. Faça um algoritmo PHP que receba uma string, encontre o número total de
caracteres desta e imprima todos os números que existem entre 0 e o número total, exemplo:
* string = “Gil Eduardo de Andrade”
* total_caracter = 22
 Imprime: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21";
 echo "<br><br>";
 $nome = "Adriano gomes da Paz";
 $nNome =strlen($nome);

for($cont = 0; $cont <=$nNome; $cont++){
    echo "$cont,";
    
}
   echo " $nome";

echo "<br><br>";
echo "---------------------------------------------------------------------------------------------------------------";
 
 
?>

## Para convertir esse numero aleatorio em uma String primeiro a gente cria um Random para generar numeros aleatorios.

## Depois a gente cria uma constante String com todas as letras formatadas da maneira que a gente quiser e onde cada posicion dela será o valor gerado aleatoriamente e vamos fazer ser uma letra. PARA PEGAR SÓ UMA LETRA CRIAMOS UM CHARACTER
## Para criar um generador de numeros criamos um int, inicializado em 0.
## Criamos aqui também um StringBuilder/ StringBuffer: Os dois sao String inmutables, ou seja os valores do string sao alteraveis e mais flexivéis, a diferencia do Builder para o Buffer é que o Buffer é mais seguro criando sincronizaciones de threds.
## Criamos um for com iniciando com a posicion 0 e teniendo el bucle la cantidad de veces que quieres crear una letra.
## DENTRO DO FOR:
### * int creado: onde inicializaremos aqui. INicializamos com o generador Random, gerando um proximo numero que tem como capacidad o tamanho de comprimento gerado pela constante LETRA.
### creamos um character: esse character vai ser responsavel por percorrer a constante encontrar a posicion que era o int que criamos anteriormente e nos mostrar a letra nessa posicion. LEMBRANDO QUE O QUE TA EM PARENTECES É O INDICE, OU CAPACIDADE QUE A GENTE QUER PERCORRER A CADENA.
### Por ultimo aqui utilizamos el StringBuilder/StringBuffer: aqui vamos utilizar uma propriedade propria dessa ferramente que é o "append" que significa acresecntar. Ou seja é como o concat, acrescenta letras para formar uma cadena de texto completa.


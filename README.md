## Descrição do Problema

Um programa para identificar "Gemstones" em coleções de rochas.

## Contexto

Juninho descobriu várias rochas. Cada rocha é composta por vários elementos, e cada elemento é representado por uma letra minúscula latina de 'a' a 'z'. Um elemento pode estar presente diversas vezes em uma rocha. Um elemento é chamado de "Gemstone" se ocorrer pelo menos uma vez em cada uma das rochas.

O objetivo é calcular quantos tipos diferentes de elementos-gema Juninho tem em sua coleção.

## Especificações

### Entrada
- A primeira linha contém um inteiro **N** (1 ≤ N ≤ 100), representando o número de rochas
- As próximas **N** linhas contêm strings representando a composição de cada rocha
- Cada composição consiste apenas de letras minúsculas do alfabeto latino ('a'-'z')
- O comprimento de cada composição varia entre 1 e 100 caracteres

### Saída
- Um único inteiro representando o número de diferentes tipos de Gemstones encontrados

## Exemplo

### Entrada
```
3
abcdde
baccd
eeabg
```

### Saída
```
2
```

### Explicação
No exemplo acima, apenas "a" e "b" são Gemstones, pois são os únicos elementos presentes em todas as três rochas.

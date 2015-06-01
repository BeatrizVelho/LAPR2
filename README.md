# Sistema de Gestão de Eventos Científicos #

### Padrão adotado para o JavaDoc ###
###### O padrão abaixo foi adotado de forma a garantir uma melhor leitura do código, caso seja necessário adicionar ainda mais informação, sintam-se à vontade de o fazer. Quando determinado parâmetro tem limites, ou determinado método contém validações relevantes, é suposto falar sobre as mesmas. ######

*Classes*
```
/**
 * Representa uma instância de [nome da classe] através de [variáveis de instância].
 */
```

*construtor*
```
/**
 * Constrói uma instância de [nome da classe] recebendo [parametros do método].
 *
 * @param [parametro] - ... 
 */
```

*getter*
```
/**
 * Devolve [valor].
 *
 * @return [valor].
 */
```

*setter*
```
/**
 * Modifica o [valor].
 */
```

*toString*
```
/**
 * Devolve a descrição textual do/a [nome da classe] no formato: [formato]
 *
 * @return Características da/o [nome da classe]. 
 */
```

*equals*
```
/*
 * Compara dois objetos entre si. Comparando primariamente a posição de memória, seguida
 * do conteudo e das classes as quais cada um deles pertence, e finalmente os seus  
 * atributos [pode-se especificar os atributos comparados]. 
 * 
 * @param Objeto/[nome da classe] que vai ser usado na comparação.
 * @return Verdadeiro caso os objetos comparados sejam iguais e falso caso não o sejam.
 */
```

### Padrão adotado para os Testes Unitários ###
...
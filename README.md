# Sistema de Gestão de Eventos Científicos #

### Padrão adotado para a implementação(codificação, testes e commits) ###
###### A implementação do projeto será por *Use Cases*, estando os mesmos neste momento listados como issues, o facto de um determinado membro escolher implementar um *Use Case* especifico não significa que seja o único a trabalhar no mesmo, mas assume a responsabilidade de garantir que o mesmo contém tudo o que lhe é necessário para funcionar corretamente. ###

## Codificação ##
###### As dúvidas devem ser retiradas junto dos colegas do grupo, é melhor para nós enquanto grupo, a dúvida de um pode ser a dúvida de todos e assim sabemos aquilo que cada um está a fazer, e onde tem mais dificuldades. ######
###### No caso de ninguém no grupo ser capaz de esclarecer uma dúvida, então ai sim devemos pedir ajuda ao docente que está na sala e comunicar aos outros a solução. ######
###### Sempre que seja codificado um método, se se justificar, devemos pedir ao colega que reveja o código, de forma a verificar a sua legibilidade, ou até se é possível realizar uma simplificação. ######

## Testes Unitários ##
###### É obrigatório testar todos os métodos implementados no projeto, não é à toa que a empresa se chama "TestasOuChumbas". Não temos necessidade de perder pontos por preguiça, quando muitos dos testes são de fácil implementação. Os únicos métodos que não requerem testes, pertencem à UI e aos métodos de leitura e escrita de ficheiros (ainda que estes últimos, deviam também ser testados). ######

## Commits ##
###### Os commits devem ser, se possível, pequenos e bem comentados. #######
* ```Implementado o método xpto(), que tem como função imprimir uma String de números. ```
###### Nunca se deve fazer commit de código que não esteja a funcionar a 100%, ou seja, TESTADO!!! ######
###### Todos os commits de métodos devem incluir, ser precedidos ou sucedidos dos testes unitários, sendo que o mais correto será fazer o commmit dos testes antes do método em si. #######

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

## Construtores ##
###### Não se testam construtores a menos que estes tenham lógica.

## Setters & Getters ##
```
#!java
/*
 * Teste dos métodos set e get do atributo [atributo], da classe [nome da classe].
 */
@Test
public void testSetAndGet[atributo]() {
  System.out.println("setAndGet[atributo]");
  [nome da classe] instance = new [nome da classe]();
  String texto = "texto";
  instance.set[atributo](texto);
  assertEquals(texto, instance.get[atributo]());
}
```
###### Devem ser testados em conjunto. ######
## toString ##
Deve ser criada uma String com o resultado esperado e comparado ao método.
```
#!java
/**
 * Teste do método toString, da classe [nome da classe].
 */
@Test
public void testToString() {
  System.out.println("toString");
  [nome da classe] instance = new [nome da classe]();
  String expResult = "Texto esperado.";
  String result = instance.toString();
  assertEquals(expResult, result);
}
```
## equals ##
Devem ser criados dois objetos com os mesmo atributos e comparados através do método equals de duas maneiras.
```
#!java
/**
 * Teste do método equals, da classe [nome da classe].
 */
@Test
public void testEquals() {
  System.out.println("equals");
  Object outroObjeto = new [nome da classe]();
  [nome da classe] instance = new [nome da classe]();
  boolean expResult = true;
  assertEquals(expResult, instance.equals(outroObjeto));
}
```

#!java
/**
 * Teste do método equals, da classe [nome da classe].
 */
@Test
public void testEqualsNot() {
  System.out.println("equalsNot");
  Object outroObjeto = new [nome da classe]();
  [nome da classe] instance = new [nome da classe]();
  boolean expResult = false;
  assertEquals(expResult, instance.equals(outroObjeto));
}
```
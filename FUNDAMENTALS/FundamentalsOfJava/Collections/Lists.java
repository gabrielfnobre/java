//  LISTS:

/*  A "list" é uma estrutura de dados dentro dos collections onde é possível armazenar valores das seguintes
    formas:

        # Heterogênea ou Homogênea:
            Podemos armazenar valores que possuem tanto o mesmo tipo de dado como valores com tipos de 
            dados diferente.

            OBSERVAÇÃO: É preferível que os valores não sejam heterogêneos, não é visto como uma boa 
            prática guardar valores heterogêneos num set, num list, num array ou qualquer estrutura que 
            seja. Mas claro podem existir suas excessões, mas via de regra, não é uma boa prática;

        # Aceita valores duplicados:
            A list aceita valores iguais, pois ela também é uma estrutura indexada, o que facilita  o 
            encontro e manipulação de valores, mesmo que eles sejam idênticos;

        # É ordenado:
            A list sempre mantém a ordem de inserção dos valores;

        # É indexado:
            As lists, assim como os arrays, são indexados, o que diferencia uma list de um array é que a 
            list não tem tamanho fixo;

        # Não aceita Tipos Primitivos:
            Não só a list, como todas as collections, não aceitam tipos primitivos, elas só aceitam tipos que
            sejam encarados pelo java como um object, como: String, Wrappers ou Arrays;

            OBSERVAÇÃO: Podemos até atribuir um valor de tipo primitivo diretamente á uma list que ele vai 
            aceitar normalmente. Mas o que acontece de verdade é que o java fará a conversão do valor de tipo
            primitivo para um tipo wrapper correspondente, chamamos esse processo de auto-box;

    Para declarar uma list temos que usar métodos específicos, e cada um desses métodos servem para um propósito
    específico e precisam ser importados da lib java.util para serem utilizados. Seguem os métodos e suas 
    especialidades:

        # ArrayList: Esse é um método que implementa um array dinâmico sobre a list, essa implementação possuí uma
            série de métodos que facilitam a inserção, remoção, busca e etc. Esse é o método que utiliza menos 
            memória, porém ele é mais lento para procurar por valores;

        # LinkedList: Esse método gera uma lista duplamente encadeada, onde cada valor guarda quem é o seu valor 
            antecessor e o valor posterior. Isso facilita a procura por um determinado elemento dentro da lista, 
            fazendo com que a busca seja muito eficiente. Porém, se a busca for feita por através de indexação, 
            ela fica mais lenta. Esse método também armazena mais memória que os demais. Esse método é 
            preferível quando temos um programa que constantemente têm que fazer alterações e buscas na lista, 
            por que ele é mais rápido para encontrar os elementos;

    Embora a list seja uma estrutura heterogênea, a boa prática de programação pede que sempre usemos o mesmo tipo 
    de dado, por isso foi desenvolvido o Generics, usando o Generics conseguimos fazer com que até mesmo uma list 
    só aceite valores que sejam do mesmo tipo.

    Veja como usamos o Generics:

        List<String> nomeDaVariavel = new ArrayList<>();

        Explicando:
                    - Veja que chamamos pela classe "List" em seguida, dentro das tags nós colocamos tipo de dado 
                        que nós queremos que o nosso list tenha. Essas tags são o generics, elas querem dizer ao 
                        java que essa list só vai aceitar valores Strings, se tentássemos colocar valores Double ou
                        Integer teríamos um erro de compilação;

                        OBSERVAÇÕES: Por estar se tratando de uma collection o generics só aceitará valores do 
                        tipo objeto como wrappers, objects e arrays. Aqui usamos uma List para declarar a variável
                        mas poderíamos ter usado um ArrayList ou LinkedList.

                    - Note também que quando instanciamos a variável usamos também um generics no método 
                        construtor, note que esse generics em especial está vazio, isso acontece por que o nosso 
                        generics no método construtor não precisa necessáriamente estar com o nome do tipo de dado 
                        que vamos colocar, o java entende que se usarmos um generics vazio o método construtor vai 
                        imitar o mesmo tipo de dado da classe declarante. Esse generics vazio é o que chamamos de 
                        "diamond notation", por causa da sua aparência;

        Veja abaixo exemplos de como declaramos esses métodos...
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    @SuppressWarnings({"rawtypes", "unchecked"}) //Usado para suprimir erros de tipos randômicos...
    public static void main(String[] args){
        
        //EX01
        System.out.println("Ex01:");

        ArrayList newList = new ArrayList();
        newList.add("nome");
        newList.add(2);
        newList.add(true);
        newList.add(4.5);

        System.out.println(newList);
        System.out.println();
         

        //EX02
        System.out.println("Ex02:");

        for(int i = 0; i < newList.size(); i++){
            System.out.println(newList.get(i));
        }
        System.out.println();
        

        //EX03
        System.out.println("Ex03:");

        List<String> nomes = new ArrayList<>();
        nomes.add("Gabriel");
        nomes.add("Graziela");
        nomes.add("Dario");

        for(String name: nomes){
            System.out.println(name + " Nobre");
        }
        System.out.println();
        

        //EX04
        System.out.println("Ex04:");

        System.out.println(newList.size());
        System.out.println();
        

        //EX05
        System.out.println("Ex05:");
        
        newList.remove(0);
        System.out.println(newList);
        System.out.println();
        

        //EX06
        System.out.println("Ex06:");

        ArrayList<String> nomesOutros = new ArrayList<>(Arrays.asList("Gabriel", "Dario"));
        for(String nome: nomesOutros){
            if(nomes.contains(nome)){
                System.out.println("Nas duas listas contem o nome " + nome);
            }
        }
        System.out.println();
        
        //EX07
        System.out.println("Ex07:");

        LinkedList<String> fruits = new LinkedList<>(Arrays.asList("banana", "apple", "orange"));
        System.out.println(fruits);
        
        fruits.add(1, "mango");
        System.out.println(fruits);
        System.out.println();
        

        //EX08
        System.out.println("Ex08:");

        String fruitShifted = fruits.get(1);
        fruits.set(1, fruits.get(0));
        fruits.set(0, fruitShifted);
        System.out.println(fruits);
        System.out.println();
        

        //EX09
        System.out.println("Ex09:");
        getIndex(fruits, "mango", "apple");
        getIndex(fruits, "orange", "banana");
        getIndex(fruits, "pineapple", "banana");
        getIndex(fruits, "banana", "strawberry");
        System.out.println(fruits);
        System.out.println();

    }

    @SuppressWarnings({"rawtypes"})
    private static <T> LinkedList getIndex(LinkedList<T> listLinked, T shifter, T shifted){
        int value1 = 0;
        int value2 = 0;
        boolean firstValidation = false;
        boolean secondValidation = false;
        for(int i = 0; i < listLinked.size(); i++){
            if(listLinked.get(i).equals(shifter)){
                value1 = i;
                firstValidation = true;
            } else if(listLinked.get(i).equals(shifted)){
                value2 = i;
                secondValidation = true;
            }
        }
        
        if(firstValidation && secondValidation){
            listLinked.set(value1, shifted);
            listLinked.set(value2, shifter);
        } else {
            if(!firstValidation){
                System.out.println("A fruta \"" + shifter + "\" nao esta na lista!");
            } else if (!secondValidation){
                System.out.println("A fruta \"" + shifted + "\" nao esta na lista!");
            }
        }

        return listLinked;
    }


    /*  Ex01 - Nesse primeiro exemplo vimos como criar uma list usando o método "ArrayList" e classe
                ArrayList, note também que é possível criar uma lista heterogênea, muito embora essa 
                não seja uma boa prática de programação.
     */

    /*  Ex02 - Nesse exemplo vemos uma vantagem que as list possuem em cima das sets, enquanto não 
                podemos executar um laço for sobre uma set heterogênea, na list executar um laço for
                sobre uma lista heterogênea é totalmente possível, pois as list são indexadas. Basta 
                usarmos o método "get()" para encontrar os valores por através de indexação.
     */

    /*  Ex03 - Aqui temos o exemplo de como criar uma list da maneira correta, usando "generics" para
                gerar valores homogêneos. Note que neste exemplo estamos usando a classe "List" para
                gerar a list, mas poderíamos usar as outras classes variantes como o ArrayList e o 
                LinkedList. Em seguida estamos usamos as notações de tags generics para gerar o tipo
                dos nossos valores como String e a "diamond notation" no método ArrayList para copiar
                o generics da classe declarante.

                Mais abaixo, veja uma das vantagens de usar lists homogêneas que é usar o for each, 
                visto que as listas possuem o mesmo tipo de dado;
     */

    /*  Ex04 - Neste exemplo, veja que é possível retornar o tamanho completo de uma lista usando o 
                método "size()";
     */

    /*  Ex05 - Neste exemplo, veja que é possível remover qualquer elemento de uma list por através 
                do "id" do índex, para isso usamos o método "remove()";
     */

    /*  Ex06 - Neste exemplo, gostaríamos de mostrar 3 coisas:
                1º - Que é possível criar uma lista homogênea iniciando a declaração com qualquer 
                    classe do tipo list, como o "ArrayList";

                2º - Que é possível iniciar uma variável list com os seus valores usando a classe
                    Arrays e o método "asList", onde poderemos atribuir diretamente os valores a 
                    variável;

                3º - Também gostaríamos de mostrar mais um método das lists, que é o método 
                    "contains()", esse método consegue checkar se um determinado valor existe 
                    dentro de uma list, retornando "true" ou "false";
     */
    
     /*  Ex07 - Neste exemplo, temos o exemplo de uma LinkedList criada, lembre-se que a missão das
                LinkedList é gerar uma lista onde é facil encontrar itens pelo seu id assim como 
                também encontrar os valores adjacentes.
                Note que  inicializamos uma lista com 3 valores de frutas, e facilmente inserimos 
                mais uma fruta na segunda posição, isso foi possível graças ao método "add()" do 
                LinkedList, que é capaz de encontrar um determinado index fazer a inserção nele e
                fazer com que os valores adjacentes ocupem as posições seguintes na lista, sem 
                perder nenhum valor;
     */
    
     /*  Ex08 - Neste exemplo, mostramos como usar os métodos "get()" e "set()" do LinkedList, 
                note que com esses métodos é possível retornar o valor de uma lista por através do
                método "get()", guardando esse valor numa variável.
                E usando o método "set()" é possível selecionar um índice para que ele receba um
                valor, como no caso a nossa LinkedList é do tipo String, ela só receberá valores
                desse tipo, note que usamos "get()" e "set()" para trocar valores de lugar;
     */
     
     /*  Ex09 - Neste exemplo, temos uma versão mais sofisticada do exemplo 08. Aqui criamos um 
                método chamado "getIndex" que recebe como parâmetros a lista e o nomes dos valores
                que queremos trocar de posição na lista e em resposta devolve a lista com os 
                valores trocados, e caso o usuário digite um valor que não existe na lista o 
                método irá retornar no console o nome do valor que não existe na lista.

                Explicando o método getIndex:

                    - Generics com notação <T>: 
                        É um generics com tipo Genérico que aceitará qualquer tipo de valor;
                    
                    - Laço For:
                        Nosso método recebe a lista que será iterada com o laço for, no laço for 
                        verificamos se os valores existem dentro da lista, toda vez que um valor
                        existir, o número id dele será armazenado na variavel "value1" ou "value2"
                        e as valiáveis de validação serão setadas como "true";
                    
                    - Validação:
                        Se ambas as variveis de validação forem setadas como "true" é sinal de 
                        que os dois valores passados como string existem dentro da lista e a 
                        troca será feita usando os "set()".
                        Mas se 1 dos valores da validação der "false" o valor que deu false é 
                        encontrado e é retornado para o usuário qual valor que deu false. 
     */
    
}

//  O THIS:

/*  A palavra reservada "this" representa um conceito de Orientação a Objetos que deve ser entendido
    plenamente pelo programador.

    Relembrando o conceito de construtores, sempre que criamos uma nova instância temos que usar o 
    método construtor para criar a instância, referenciando aos membros - sejam eles de instância 
    ou de classe.

    E o "this" é uma palavra reservada que nós usamos sempre para referenciar aos membros da 
    instância. Geralmente o usamos dentro dos métodos para referenciar aos membros da instância.
    
    A sintaxe é simples:

        this.nomeDoAtributo

        ou 

        this.nomeDoMetodo()

    O "this" só pode ser usado para referenciar instâncias, não podemos usar o "this" para 
    referenciar "classes" ou "membros estaticos" da classe. Vejamos alguns exemplos (olhe nesse 
    arquivo e no arquivo "TheThisInstancer.java")...

 */

public class TheThis {
    
    String name;
    String lastName;
    int age;
    
    //Ex 01
    TheThis(String name){
        this.name = name;
    }

    //Ex 02
    TheThis(String name, String lastName){
        name = name;
        lastName = lastName;
    }
    
    //Ex 03
    TheThis(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    //Ex 04
    String showTheThis(){
        return String.format("%s %s, he is %d years old", this.name, this.lastName, this.age);
    }

    /*  Ex 01 - Aqui nós temos o exemplo de um construtor utilizando o "this" note que o nome do parametro
                do método construtor é o mesmo nome do atributo "name" da instancia. Se nós não tivéssemos
                usado o "this" para referenciar o atributo "name" da instância, o método iria entender que
                o "name" é o mesmo "name" do parâmetro e não iria fazer nada, pois um método com valor 
                nullo seria atribuído ao mesmo método com o valor nullo. Mas o "this" faz com que o valor 
                seja referenciado para o atributo correto;
     */

    /*  Ex 02 - Aqui nós temos um exemplo sem o uso do "this", note que neste caso o java entende que nós
                estamos querendo atribuir o valor que foi colocado no parâmetro "name" do método no mesmo
                parâmetro "name" do método. Ou seja, não faz nada!
     */

    /*  Ex 03 - No terceiro exemplo note, que utilizamos o this para todos os atributos, note como a 
                referência é feita corretamente;
     */
    
     /*  Ex 04 - Aqui temos um méotodo usado para recuperar os valores da instância, note que conseguimos
                recuperar corretamente os valores graças ao "this";
     */

}

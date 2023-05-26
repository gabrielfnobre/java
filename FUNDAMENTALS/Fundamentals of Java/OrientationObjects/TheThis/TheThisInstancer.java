public class TheThisInstancer {

    public static void main(String[] args){

        //Ex01
        TheThis person1 = new TheThis("Vandeilson");
        System.out.println(person1.showTheThis());
        
        //Ex02
        TheThis person2 = new TheThis("Calóvisk", "Clements");
        System.out.println(person2.showTheThis());
        
        //Ex03
        TheThis person3 = new TheThis("August", "Clements", 32);
        System.out.println(person3.showTheThis());

    }

    /*  Ex 01 - Note que ao usar o construtor que possuí o "this" só para o "name", conseguimos pegar o nome 
                passado como argumento corretamente;
     */

    /*  Ex 02 - Neste exemplo, o construtor não usa o "this", por isso ele atribuí o valor ao parametro do 
                método. Por isso, quando chamamos pelo método "showTheThis()" ele retorna os atributos com o
                valor "nulo", pois nada foi atribuído á elas;
     */

    /*  Ex 03 - Aqui temos um caso de sucesso, onde todos os atributos receberam valores;
     */

}

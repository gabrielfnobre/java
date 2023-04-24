
//USO DO CONSOLE:

/*  No Java, assim como em outras linguagens, é possível que nós utilizemos o console
 *  das IDEs para imprimir mensagens e mostrar resultados, como também para capturar
 *  dados do usuário.
 * 
 *  Geralmente usamos 2 métodos para mostrar mensagens no console, eles são:
 *      
 *      * print() - O "print" é usado para quando queremos imprimir um texto comum,
 *                  como uma string. A característica básica do "print" é que ele 
 *                  não pula linhas, ele simplesmente imprime o que estiver escrito
 *                  em uma linha corrida. Até podemos pular linhas, mas para isso
 *                  deveríamos usar notação format como o "\n";
 * 
 *      * println() - O "println" faz a mesma coisa que o "print", imprime uma 
 *                  mensagem textual no console. Mas a grande sacada do "println" 
 *                  é que ele sempre pula uma linha;
 * 
 *  Mas existem outros métodos com outras funcionalidades para mostrar mensagens e 
 *  resultados no console, como por exemplo:
 * 
 *      * printf() - O "printf" ou "print format" é um método que consegue imprimir 
 *                  mensagens que usem notação format por através de notações como
 *                  %d (dígitos), %c (caracteres), %f (float), %s (strings) e 
 *                  outros; OBSERVAÇÃO: o printf também não quebra linha
 *                  automáticamente;
 */

public class ConsoleUse {
    public static void main(String[] args){
        System.out.print("Veja");
        System.out.print(" como ");
        System.out.print("a mensagem ");
        System.out.print("fica na mesma linha \n\n");

        System.out.println("Veja como a");
        System.out.println("mensagem pula linhas.\n");

        System.out.printf("Veja como podemos juntar números: %d + %d = %d", 1, 1, (1+1));
    }
 }
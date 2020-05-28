public class Main { //Main class para correr el código

    public static void main(String args[]) {

        /*Esta función corre el código y establece unos parámetros para la ejecución del ejemplo
         *@author Andrés Quirós
         *@Version 24/05/2020
         * @param args
         */

        Yiguirro yiguirro = new Yiguirro();  //Crea un nuevo objeto yiguirro
        PatoJuguete patoJuguete = new PatoJuguetedePlastico();   //Crea un nuevo objeto patojuguete

        // Envuelve al pajaro en el adapter para que este se puede comportar como el patojuguete

        PatoJuguete pajaroAdapter = new PajaroAdapter(yiguirro);


        //Imprime los métodos del yiguirro junto con "Yiguirro"
        System.out.println("Yiguirro...");
        yiguirro.volar();
        yiguirro.hacerSonido();

        //Imprime los métodos del patojuguete junto con "PatoJuguete"
        System.out.println("PatoJuguete...");
        patoJuguete.chirrido();


        //Se implemente el adapter para que el pájaro se comporte como un pato juguete
        //Se ve que el pajaroAdapter está llamando al método de patojuguete
        System.out.println("pajaroAdapter...");
        pajaroAdapter.chirrido();
    }
}

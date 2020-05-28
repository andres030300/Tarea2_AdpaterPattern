public class PajaroAdapter implements PatoJuguete  {
    // Implementa la interfaz que el cliente desea utilizar

    Pajaro pajaro;
    public PajaroAdapter(Pajaro pajaro) {

        /*Esta función establece que el pajaron introducido va a ser el nuevo parametro pajaro. Adapta lo introducido como un nuevo pajaro
         *@author Andrés Quirós
         *@Version 24/05/2020
         * @param pajaro
         */

        this.pajaro = pajaro; //Referencia la objeto que está siendo adaptado
    }

    public void chirrido() {
        /*Esta función hace que el pajaro haga el sonido establecido
         *@author Andrés Quirós
         *@Version 24/05/2020
         * @param pajaro
         */
        // traduce el método de menera adecuada.
        pajaro.hacerSonido();
    }
}

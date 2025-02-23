package Entornos.Entornos;

    /**
     * Clase que representa un Usuario en el sistema.
     * @author Everth Rivera
     * @version 1.0
     * @since 2025
     */
    public class Usuario {
        private String nombre;
        private int edad;

        /**
         * Constructor de la clase Usuario.
         * @param nombre Nombre del usuario.
         * @param edad Edad del usuario.
         */
        public Usuario(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        /**
         * Obtiene el nombre del usuario.
         * @return Nombre del usuario.
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Establece el nombre del usuario.
         * @param nombre Nombre del usuario.
         */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        /**
         * Método obsoleto. No usar.
         * @deprecated
         */
        @Deprecated
        public void metodoObsoleto() {
            System.out.println("Este método está obsoleto");
        }
}

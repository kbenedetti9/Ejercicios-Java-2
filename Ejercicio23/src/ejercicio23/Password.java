package ejercicio23;

/**
 *
 * @author Karen Benedetti M
 */
public class Password {

    private int longitud;
    private String contrasena;
    private final static int LONG_DEF = 8;

    public Password() {
        this.longitud = LONG_DEF;
    }

    public Password(int longitud) {
        this.longitud = longitud;
        //contrasena es igual al metodo de generarContrasena
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean esFuerte(String contrasena) {
        boolean verificacion = false;
        int conteoMayuscula = 0;
        int conteoMiniscula = 0;
        int conteoNumero = 0;
        for (int i = 0; i < contrasena.length(); i++) {
            if (contrasena.charAt(i) >= 65 && contrasena.charAt(i) <= 90) {
                conteoMayuscula++;
            } else if (contrasena.charAt(i) >= 97 && this.contrasena.charAt(i) <= 122) {
                conteoMiniscula++;
            } else if (contrasena.charAt(i) >= 48 && this.contrasena.charAt(i) <= 57) {
                conteoNumero++;
            }

            if (conteoMayuscula > 2 && conteoMiniscula > 1 && conteoNumero > 5) {
                verificacion = true;
            }
        }
        return verificacion;
    }

    public String generarContrasena(int longitud) {
        String password = "";
        for (int i = 0; i < longitud; i++) {
            //Generamos un numero aleatorio, segun este elige si añadir una minuscula, mayuscula o numero
            int eleccion = ((int) Math.floor(Math.random() * 3 + 1));

            if (eleccion == 1) {
                char minusculas = (char) ((int) Math.floor(Math.random() * (123 - 97) + 97));
                password += minusculas;
            } else {
                if (eleccion == 2) {
                    char mayusculas = (char) ((int) Math.floor(Math.random() * (91 - 65) + 65));
                    password += mayusculas;
                } else {
                    char numeros = (char) ((int) Math.floor(Math.random() * (58 - 48) + 48));
                    password += numeros;
                }
            }
        }

        return password;
    }

}

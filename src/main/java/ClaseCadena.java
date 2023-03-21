public class ClaseCadena {
    public static String DevuelveIniciales(String nombreCompleto){
        String iniciales = "";
        if(nombreCompleto == null || nombreCompleto.isEmpty()){
            return iniciales;
        }
        String[] nombres = nombreCompleto.trim().split("\\s+");
        for(String nombre : nombres){
            if(!nombre.isEmpty()){
                iniciales += nombre.charAt(0) + ".";
            }
        }
        return iniciales.toUpperCase();
    }

    public static void main(String[] args) {

    }
        }
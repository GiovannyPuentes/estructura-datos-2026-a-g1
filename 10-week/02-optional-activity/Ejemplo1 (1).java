import java.util.Scanner;

/*Giovanny Andrey Puentes Alape 
GiovannyPuentes
 */

public class Ejemplo1 {
    public static void main(String[] args) {
        /*  
            Se requiere almacenar los datos básicos de una lista de estudiantes, dónde se guarde.
            * Tipo documento (Array)
            * Documento (Integer)
            * Nombre (String)
            * Correo (String)
        */

        /*
            Posibilidades: objetos para almacenar datos
            - array (problema: respeta a un solo tipo de dato)
            - map <key>,<value>
            - arrayList (problema: respeta a un solo tipo de dato)
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cuántos estudiantes desea ingresar?: ");
        int cantidadEstudiante = scanner.nextInt();

        String[] tipoDocumento = new String[cantidadEstudiante];
        Integer[] documento = new Integer[cantidadEstudiante];
        String[] nombre = new String[cantidadEstudiante];
        String[] correo = new String[cantidadEstudiante];
        String[] tipoDcumentoPermitodo = {"CC", "CE", "TI", "PA", "DNI", "RUT", "NIT"};
        // tipoDocumento[0] = "CC";
        // documento[0] = 123456789;
        // nombre[0] = "Juan Perez";
        // correo[0] = "juan.perez@example.com";

        int i = 0;
        int j = 0;
        

        for(i=0; i<tipoDocumento.length; i++){
            /*
                1. Datos permitidos: Depende de la data del array tipoDcumentoPermitodo
                2. Validar que el número este entre 0 y tipoDcumentoPermitodo.length, para que elija un tipo de documento permitido
                    Nota: 
                        - El usuario, agraga del 1 al tipoDcumentoPermitodo.length + 1, para que el programa sea legible.
                        - El programa internamente, resta 1 al número ingresado.
                3. Si no esta en el rango, volve a preguntar hasta que elija un tipo de documento permitido
            */
            System.out.print("Ingrese el tipo de documento del estudiante " + (i+1)+ ": ");
            for(j=0; j<tipoDcumentoPermitodo.length; j++){
                System.out.print("("+(j+1)+"=>" + tipoDcumentoPermitodo[j]+") ");
            }
            System.out.print(": ");

            int pos = -1; // Variable para almacenar la posición del tipo de documento seleccionado
            while(pos<0 || pos>=tipoDcumentoPermitodo.length){
                try {
                    pos = scanner.nextInt(); // Leer la posición ingresada por el usuario
                    pos--; // Restar 1 para convertir a índice de array
                    if (pos < 0 || pos >= tipoDcumentoPermitodo.length) {
                    System.out.print("Error en el dato ingresado. Por favor, ingrese un número entre 1 y " + tipoDcumentoPermitodo.length+", ingresar de nuevo el dato: "); 
                    }else{
                        tipoDocumento[i] = tipoDcumentoPermitodo[pos]; // Asignar el tipo de documento seleccionado al array
                    }
                } catch (Exception e) {
                   System.out.println("Dato no válido: "); 
                   pos = -1; // Reiniciar la posición para volver a solicitar el dato
                }                
            }

 /*
            INGRESO DEL NÚMERO DE DOCUMENTO
            - Solo permite valores numéricos
            */
            System.out.print("Ingrese el número de documento: ");
            boolean valido = false;

            while(!valido){
                try{
                    documento[i] = scanner.nextInt();
                    valido = true;
                }catch(Exception e){
                    System.out.print("Dato inválido. Solo números: ");
                    scanner.next();
                }
            }

            scanner.nextLine(); // Limpiar buffer

            /*
            INGRESO DEL NOMBRE
            - Se valida que solo contenga letras y espacios
            */
            System.out.print("Ingrese el nombre completo: ");
            boolean nombreValido = false;

            while(!nombreValido){
                String entrada = scanner.nextLine();

                if(entrada.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")){
                    nombre[i] = entrada;
                    nombreValido = true;
                }else{
                    System.out.print("Nombre inválido. Intente nuevamente: ");
                }
            }

            /*
            INGRESO DEL CORREO ELECTRÓNICO
            - Validación básica de formato
            */
            System.out.print("Ingrese el correo electrónico: ");
            boolean correoValido = false;

            while(!correoValido){
                String entradaCorreo = scanner.nextLine();

                if(entradaCorreo.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")){
                    correo[i] = entradaCorreo;
                    correoValido = true;
                }else{
                    System.out.print("Correo inválido. Intente nuevamente: ");
                }
            }

            System.out.println("Registro guardado correctamente.");
        }

        // =====================================================
        // MOSTRAR RESULTADOS
        // =====================================================
        System.out.println("\n===== LISTA FINAL DE ESTUDIANTES =====");

        for(i = 0; i < tipoDocumento.length; i++){
            System.out.println("\nEstudiante " + (i+1));
            System.out.println("Tipo Documento: " + tipoDocumento[i]);
            System.out.println("Número Documento: " + documento[i]);
            System.out.println("Nombre: " + nombre[i]);
            System.out.println("Correo: " + correo[i]);
        }
    }
}
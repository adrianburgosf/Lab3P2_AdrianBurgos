package lab3p2_adrianburgos;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_AdrianBurgos {
    static Scanner scan = new Scanner(System.in);
    static ArrayList listausuarios = new ArrayList();
    static ArrayList listaresta = new ArrayList();
    /*
    Siento que el lab estaba demasiado largo para lo que teniamos que hacer
    entonces vas a ver muchas cosas incompletas pero trate de que lo basico
    como el login y registrarse estuviera hecho y que cada clase tambien estuviera
    hecha con herencia y todo
    */
    public static void main(String[] args) {
        Restaurantes r = new Restaurantes("McDonalds", "Novacentro", "912914", "im loving it");
        Comidas co = new Comidas("Hamburguesa", 75.99);
        r.getComidas().add(co);
        Programadores p = new Programadores();
        p.setUsuario("david");
        p.setPass("1234");
        listausuarios.add(p);
        listaresta.add(r);
        
        int opcion = 0;
        while (opcion != 3) {
            System.out.println();
            System.out.print("=========Menu=========\n"
                    + "1. Login\n"
                    + "2. Registrarse\n"
                    + "3. Salir\n"
                    + "Ingrese Opcion: ");
            opcion = scan.nextInt();
            System.out.println();
            
            switch (opcion) {
                case 1: {
                    System.out.println("=====Login=====");
                    System.out.print("Usuario: ");
                    String borrador = scan.nextLine();
                    String usuario = scan.nextLine();
                    System.out.print("Contraseña: ");
                    String pass = scan.nextLine();
                    login(usuario, pass);
                    
                    break;
                }
                case 2: {
                    System.out.println("=====Registrarse=====");
                    System.out.print("Ingrese usuario: ");
                    String borrador = scan.nextLine();
                    String usuario = scan.nextLine();
                    System.out.print("Ingrese contraseña: ");
                    String pass = scan.nextLine();
                    System.out.print("Ingrese su nombre: ");
                    String nombre = scan.nextLine();
                    System.out.print("Ingrese su apellido: ");
                    String apellido = scan.nextLine();
                    System.out.print("Ingrese su domicilio: ");
                    String domicilio = scan.nextLine();
                    System.out.print("Ingrese su id: ");
                    int id = scan.nextInt();
                    Clientes c = new Clientes(nombre, apellido, domicilio, id);
                    c.setUsuario(usuario);
                    c.setPass(pass);
                    listausuarios.add(c);
                    break;
                }
                case 3: {
                    break;
                }
                default: System.out.println("Opcion invalida");
            }
        }
    }
    
    public static void login(String usuario, String pass) {//perdi mucho tiempo en la parte de login pero me dio
        for (int i = 0; i < listausuarios.size(); i++) {//Recorre toda la lista de usuarios
            if (listausuarios.get(i) instanceof Clientes == true) {//Uso instance of para ver que tipo de objeto es
                if (((Clientes) listausuarios.get(i)).getUsuario().equals(usuario)//ifs para cada objeto y si el usuario y pass coincide continua
                        && ((Clientes) listausuarios.get(i)).getPass().equals(pass)) {
                    System.out.println();
                    System.out.print("1. Comprar\n"
                            + "2. Modificar Nombre\n"
                            + "3. Modificar Apellido\n"
                            + "4. Modificar ID\n"
                            + "5. Modificar Domicilio\n"
                            + "6. Eliminar usuario\n");
                    System.out.print("Ingrese index de lo que desea realizar: ");
                    int index = scan.nextInt();
                    switch (index) {
                        case 1: {
                            System.out.println("1. Restaurante\n"
                                    + "2. Tienda"
                                    + "Ingrese de donde desea comprar");
                            int opcion = scan.nextInt();
                            if (opcion == 1) {
                                System.out.println(listaresta);
                                System.out.print("Ingrese index del restaurante que desea comprar: ");
                                int index3 = scan.nextInt();
                                System.out.println(((Restaurantes)listaresta.get(index3)).getComidas());
                                System.out.print("Ingrese index de la comida que desea: ");
                                System.out.println("Usted a comprado: "+((Restaurantes)listaresta.get(index3)).getComidas().get(scan.nextInt()));
                            }
                            else if (opcion == 2) {
                                System.out.println("En construccion");
                            }
                            else System.out.println("Opcion invalida");
                            break;
                        }
                        case 2: {
                            System.out.print("Ingrese nuevo nombre: ");
                            String borrador = scan.nextLine();
                            ((Clientes) listausuarios.get(i)).setNombre(scan.nextLine());
                            break;
                        }
                        case 5: {
                            listausuarios.remove(i);
                            break;
                        }
                    }
                }
            } else if (listausuarios.get(i) instanceof Programadores == true) {
                if (((Programadores) listausuarios.get(i)).getUsuario().equals(usuario)
                        && ((Programadores) listausuarios.get(i)).getPass().equals(pass)) {
                    System.out.println("===SubMenu===");
                    System.out.println("1. Modificar un usuario");
                    System.out.println("2. Agregar un usuario");
                    System.out.println("3. Eliminar un usuario");
                    int index = scan.nextInt();
                    switch (index) {
                        case 1: {//aqui irian varios ifs para cada modificacion posible para los diferentes tipos de usuario
                            System.out.print("Ingrese index del usuario a modificar: ");
                            int index2 = scan.nextInt();
                            if (listausuarios.get(index) instanceof Clientes) {
                                System.out.println("no me ajusto el tiempo");
                            }
                            break;
                        }
                        case 2: {
                            break;
                        }
                        case 3: {
                            System.out.print("Ingrese index del usuario que desearia eliminar");
                            listausuarios.remove(scan.nextInt());
                        }
                    }
                }
            } else if (listausuarios.get(i) instanceof Motoristas == true) {
                if (((Motoristas) listausuarios.get(i)).getUsuario().equals(usuario)
                        && ((Motoristas) listausuarios.get(i)).getPass().equals(pass)) {
                    
                }
            } else if (listausuarios.get(i) instanceof Administradores == true) {

            }
        }
    }
}

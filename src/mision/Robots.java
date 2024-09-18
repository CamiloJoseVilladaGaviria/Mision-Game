package mision;

import java.util.Arrays;
import java.util.Scanner;

public final class Robots {

    private Scanner sc;
    private int opcion;
    private int robot;
    private int lugarExploracion;
    private int dos;
    private int tres;

    int[][] lunaNorte = new int[6][6];
    int[][] lunaSur = new int[6][6];
    int[][] lunaCentro = new int[3][3];
    int[][] lunaOriente = new int[6][6];
    int[][] lunaOccidente = new int[6][6];
    int i;
    int o;
    int u;
    int a;
    int e;
    private String datos;
    private int idRobotUno;
    private int idRobotDos;
    private int idRobotTres;
    private int idRobotCuatro;
    private int idRobotCinco;
    private int generacionRobotUno;
    private int generacionRobotDos;
    private int generacionRobotTres;
    private int generacionRobotCuatro;
    private int generacionRobotCinco;
    private String porcentajeBateriaRobotUno;
    private String porcentajeBateriaRobotDos;
    private String porcentajeBateriaRobotTres;
    private String porcentajeBateriaRobotCuatro;
    private String porcentajeBateriaRobotCinco;

    public Robots() {
        this.datos = datos;
        lunaNorte[0][0] = 1;
        lunaNorte[0][1] = 1;
        lunaNorte[0][2] = 1;
        lunaNorte[0][3] = 1;
        lunaNorte[0][4] = 1;
        lunaNorte[0][5] = 1;
        lunaNorte[1][0] = 1;
        lunaNorte[1][1] = 1;
        lunaNorte[1][2] = 1;
        lunaNorte[1][3] = 1;
        lunaNorte[1][4] = 1;
        lunaNorte[1][5] = 1;
        lunaNorte[2][0] = 2;
        lunaNorte[2][1] = 2;
        lunaNorte[2][2] = 2;
        lunaNorte[2][3] = 2;
        lunaNorte[2][4] = 2;
        lunaNorte[2][5] = 2;
        lunaSur[0][0] = 1;
        lunaSur[0][1] = 1;
        lunaSur[0][2] = 1;
        lunaSur[0][3] = 1;
        lunaSur[0][4] = 1;
        lunaSur[0][5] = 1;
        lunaSur[1][0] = 1;
        lunaSur[1][1] = 1;
        lunaSur[1][2] = 1;
        lunaSur[1][3] = 1;
        lunaSur[1][4] = 1;
        lunaSur[1][5] = 1;
        lunaSur[2][0] = 2;
        lunaSur[2][1] = 2;
        lunaSur[2][2] = 2;
        lunaSur[2][3] = 2;
        lunaSur[2][4] = 2;
        lunaSur[2][5] = 2;
        lunaCentro[0][0] = 1;
        lunaCentro[0][1] = 1;
        lunaCentro[0][2] = 1;
        lunaCentro[1][0] = 1;
        lunaCentro[1][1] = 1;
        lunaCentro[1][2] = 1;
        lunaCentro[2][0] = 1;
        lunaCentro[2][1] = 1;
        lunaCentro[2][2] = 1;
        lunaOriente[0][0] = 1;
        lunaOriente[0][1] = 1;
        lunaOriente[0][2] = 1;
        lunaOriente[0][3] = 1;
        lunaOriente[0][4] = 1;
        lunaOriente[0][5] = 1;
        lunaOriente[1][0] = 1;
        lunaOriente[1][1] = 1;
        lunaOriente[1][2] = 1;
        lunaOriente[1][3] = 1;
        lunaOriente[1][4] = 1;
        lunaOriente[1][5] = 1;
        lunaOriente[2][0] = 2;
        lunaOriente[2][1] = 2;
        lunaOriente[2][2] = 2;
        lunaOriente[2][3] = 2;
        lunaOriente[2][4] = 2;
        lunaOriente[2][5] = 2;
        lunaOccidente[0][0] = 1;
        lunaOccidente[0][1] = 1;
        lunaOccidente[0][2] = 1;
        lunaOccidente[0][3] = 1;
        lunaOccidente[0][4] = 1;
        lunaOccidente[0][5] = 1;
        lunaOccidente[1][0] = 1;
        lunaOccidente[1][1] = 1;
        lunaOccidente[1][2] = 1;
        lunaOccidente[1][3] = 1;
        lunaOccidente[1][4] = 1;
        lunaOccidente[1][5] = 1;
        lunaOccidente[2][0] = 2;
        lunaOccidente[2][1] = 2;
        lunaOccidente[2][2] = 2;
        lunaOccidente[2][3] = 2;
        lunaOccidente[2][4] = 2;
        lunaOccidente[2][5] = 2;
        this.idRobotUno = 101010;
        this.idRobotDos = 202020;
        this.idRobotTres = 303030;
        this.idRobotCuatro = 404040;
        this.idRobotCinco = 505050;
        this.generacionRobotUno = 2010;
        this.generacionRobotDos = 1980;
        this.generacionRobotTres = 1975;
        this.generacionRobotCuatro = 1950;
        this.generacionRobotCinco = 1948;
        this.porcentajeBateriaRobotUno = "100 %";
        this.porcentajeBateriaRobotDos = "100 %";
        this.porcentajeBateriaRobotTres = "95 %";
        this.porcentajeBateriaRobotCuatro = "85 %";
        this.porcentajeBateriaRobotCinco = "80 %";
        sc = new Scanner(System.in);
        System.out.println("MENU PRINCIPAL");
        System.out.println("0. SALIR");
        System.out.println("1. COMENZAR MISION DE EXPLORACION");
        System.out.println("2. ASIGNAR ROBOT A OTRA MISION");
        System.out.println("3. CARACTERISTICAS ROBOTS");
        System.out.println("ELIJA SU OPCION: ");
        opcion = Integer.parseInt(sc.nextLine());
        switch (opcion) {
            case 0:
                System.out.println("SALIDA DEL JUEGO");
                break;
            case 1:
                System.out.println("JUEGO PRIVADO. ANTES DE INICIAR, ESCRIBA SU NOMBRE COMPLETO A EXCEPCION DE SU ULTIMO APELLIDO EN MAYUSCULAS, Y SIN TILDES: ");
                datos = sc.nextLine();
                if (datos.equals(datos)) {
                    System.out.println("BIENVENIDO SR. " + datos);
                    System.out.println("INICIO DE MISION DE EXPLORACION");
                    System.out.println("ID ROBOT USA: " + getIdRobotUno());
                    System.out.println("ID ROBOT RUSSIA: " + getIdRobotDos());
                    System.out.println("ID ROBOT CHINA: " + getIdRobotTres());
                    System.out.println("ID ROBOT INDIA: " + getIdRobotCuatro());
                    System.out.println("ID ROBOT GERMANY: " + getIdRobotCinco());
                    System.out.println("ELIJA SU ROBOT PARA LLEVAR A CABO LA EXPLORACION");
                    robot = Integer.parseInt(sc.nextLine());
                    if (robot == getIdRobotUno() || robot == getIdRobotDos() || robot == getIdRobotTres() || robot == getIdRobotCuatro() || robot == getIdRobotCinco()) {
                        System.out.println("USTED ELIGIO EL ROBOT: " + robot);
                    } else {
                        System.out.println("ROBOT INEXISTENTE");
                        break;
                    }
                    System.out.println("LUGARES DE EXPLORACION");
                    System.out.println("NORTE DE LA LUNA, DIGITE: 1");
                    System.out.println("SUR DE LA LUNA, DIGITE: 2");
                    System.out.println("CENTRO DE LA LUNA, DIGITE: 3");
                    System.out.println("ORIENTE DE LA LUNA, DIGITE: 4");
                    System.out.println("OCCIDENTE DE LA LUNA, DIGITE: 5");
                    System.out.println("AHORA ELIJA SU LUGAR DE EXPLORACION");
                    lugarExploracion = Integer.parseInt(sc.nextLine());
                    if (lugarExploracion == 1 || lugarExploracion == 2 || lugarExploracion == 3 || lugarExploracion == 4 || lugarExploracion == 5) {
                        System.out.println("USTED ELIGIO EL LUGAR: " + lugarExploracion);
                    } else {
                        System.out.println("LUGAR DE EXPLORACION INEXISTENTE");
                        break;
                    }
                    if (lugarExploracion == 1) {
                        for (i = 0; i < lunaNorte.length; i++) {
                            if (i == 2) {
                                System.out.println("EL ROBOT: " + robot + ", HA LLEGADO A EXPLORAR LO POSIBLE DE EXPLORACION DE LA LUNA NORTE");
                                System.out.println("EL ROBOT ENVIO LOS SIGUIENTES DATOS: ");
                                System.out.println(Arrays.deepToString(lunaNorte));
                                System.out.println("EL RECORRIDO EXPLORADO LO MARCO CON 1, PERO MOSTRO QUE EL CAMINO MAS COMPLICADO ERA EL MARCADO CON 2, MIENTRAS QUE EL CAMINO 0 ES DESCONOCIDO");
                                System.out.println("DIGITE 2 PARA RETIRAR AL ROBOT DE LA ZONA");
                                dos = Integer.parseInt(sc.nextLine());
                                if (dos == 2) {
                                    System.out.println("RETIRANDO AL ROBOT: " + robot + ", DE EL NORTE DE LA LUNA");

                                } else {
                                    System.out.println("RETIRANDO FORZOSAMENTE AL ROBOT: " + robot + ", DE EL NORTE DE LA LUNA");

                                }
                                System.out.println("AHORA, DIGITE 3 PARA TERMINAR LA MISION");
                                tres = Integer.parseInt(sc.nextLine());
                                if (tres == 3) {
                                    System.out.println("MISION EN EL NORTE DE LA LUNA FINALIZADA");
                                    break;
                                } else {
                                    System.out.println("MISION FINALIZADA AUTOMATICAMENTE");
                                    break;
                                }
                            }
                        }

                    }
                    if (lugarExploracion == 2) {
                        for (o = 0; o < lunaSur.length; o++) {
                            if (o == 2) {
                                System.out.println("EL ROBOT: " + robot + ", HA LLEGADO A EXPLORAR LO POSIBLE DE EXPLORACION DE LA LUNA SUR");
                                System.out.println("EL ROBOT ENVIO LOS SIGUIENTES DATOS: ");
                                System.out.println(Arrays.deepToString(lunaSur));
                                System.out.println("EL RECORRIDO EXPLORADO LO MARCO CON 1, PERO MOSTRO QUE EL CAMINO MAS COMPLICADO ERA EL MARCADO CON 2, MIENTRAS QUE EL CAMINO 0 ES DESCONOCIDO");
                                System.out.println("DIGITE 2 PARA RETIRAR AL ROBOT DE LA ZONA");
                                dos = Integer.parseInt(sc.nextLine());
                                if (dos == 2) {
                                    System.out.println("RETIRANDO AL ROBOT: " + robot + ", DE EL SUR DE LA LUNA");
                                } else {
                                    System.out.println("RETIRANDO FORZOSAMENTE AL ROBOT: " + robot + ", DE EL SUR DE LA LUNA");
                                }
                                System.out.println("AHORA, DIGITE 3 PARA TERMINAR LA MISION");
                                tres = Integer.parseInt(sc.nextLine());
                                if (tres == 3) {
                                    System.out.println("MISION EN EL SUR DE LA LUNA FINALIZADA");
                                    break;
                                } else {
                                    System.out.println("MISION FINALIZADA AUTOMATICAMENTE");
                                    break;
                                }
                            }

                        }
                    }
                    if (lugarExploracion == 3) {
                        for (u = 0; u < lunaCentro.length; u++) {
                            System.out.println("EL ROBOT: " + robot + ", HA LLEGADO A EXPLORAR COMPLETAMENTE EL CENTRO DE LA LUNA");
                            System.out.println("EL ROBOT ENVIO LOS SIGUIENTES DATOS: ");
                            System.out.println(Arrays.deepToString(lunaCentro));
                            System.out.println("EL RECORRIDO FUE EXITOSO, YA QUE EL ROBOT SUELE MARCAR EL PASO CON 1 CUANDO ES ACCESIBLE, Y CUANDO EL CAMINO SE VA PONIENDO MAS COMPLICADO, EL ROBOT LO SUELE SEÑALAR CON 2, Y 0 CUANDO ES DESCONOCIDO");
                            System.out.println("DIGITE 2 PARA RETIRAR AL ROBOT DE LA ZONA");
                            dos = Integer.parseInt(sc.nextLine());
                            if (dos == 2) {
                                System.out.println("RETIRANDO AL ROBOT: " + robot + ", DE EL CENTRO DE LA LUNA");
                            } else {
                                System.out.println("RETIRANDO FORZOSAMENTE AL ROBOT: " + robot + ", DE EL CENTRO DE LA LUNA");
                            }
                            System.out.println("AHORA, DIGITE 3 PARA TERMINAR LA MISION");
                            tres = Integer.parseInt(sc.nextLine());
                            if (tres == 3) {
                                System.out.println("MISION EN EL CENTRO DE LA LUNA FINALIZADA");
                                break;
                            } else {
                                System.out.println("MISION FINALIZADA AUTOMATICAMENTE");
                                break;
                            }
                        }
                    }
                    if (lugarExploracion == 4) {
                        for (a = 0; a < lunaOriente.length; a++) {
                            if (a == 2) {
                                System.out.println("EL ROBOT: " + robot + ", HA LLEGADO A EXPLORAR LO POSIBLE DE EXPLORACION DE LA LUNA ORIENTAL");
                                System.out.println("EL ROBOT ENVIO LOS SIGUIENTES DATOS: ");
                                System.out.println(Arrays.deepToString(lunaOriente));
                                System.out.println("EL RECORRIDO EXPLORADO LO MARCO CON 1, PERO MOSTRO QUE EL CAMINO MAS COMPLICADO ERA EL MARCADO CON 2, MIENTRAS QUE EL CAMINO 0 ES DESCONOCIDO");
                                System.out.println("DIGITE 2 PARA RETIRAR AL ROBOT DE LA ZONA");
                                dos = Integer.parseInt(sc.nextLine());
                                if (dos == 2) {
                                    System.out.println("RETIRANDO AL ROBOT: " + robot + ", DE EL ORIENTE DE LA LUNA");
                                } else {
                                    System.out.println("RETIRANDO FORZOSAMENTE AL ROBOT: " + robot + ", DE EL ORIENTE DE LA LUNA");
                                }
                                System.out.println("AHORA, DIGITE 3 PARA TERMINAR LA MISION");
                                tres = Integer.parseInt(sc.nextLine());
                                if (tres == 3) {
                                    System.out.println("MISION EN EL ORIENTE DE LA LUNA FINALIZADA");
                                    break;
                                } else {
                                    System.out.println("MISION FINALIZADA AUTOMATICAMENTE");
                                    break;
                                }
                            }
                        }
                    }
                    if (lugarExploracion == 5) {
                        for (e = 0; e < lunaOccidente.length; e++) {
                            if (e == 2) {
                                System.out.println("EL ROBOT: " + robot + ", HA LLEGADO A EXPLORAR LO POSIBLE DE EXPLORACION DE LA LUNA OCCIDENTAL");
                                System.out.println("EL ROBOT ENVIO LOS SIGUIENTES DATOS: ");
                                System.out.println(Arrays.deepToString(lunaOccidente));
                                System.out.println("EL RECORRIDO EXPLORADO LO MARCO CON 1, PERO MOSTRO QUE EL CAMINO MAS COMPLICADO ERA EL MARCADO CON 2, MIENTRAS QUE EL CAMINO 0 ES DESCONOCIDO");
                                System.out.println("DIGITE 2 PARA RETIRAR AL ROBOT DE LA ZONA");
                                dos = Integer.parseInt(sc.nextLine());
                                if (dos == 2) {
                                    System.out.println("RETIRANDO AL ROBOT: " + robot + ", DE EL OCCIDENTE DE LA LUNA");
                                } else {
                                    System.out.println("RETIRANDO FORZOSAMENTE AL ROBOT: " + robot + ", DE EL OCCIDENTE DE LA LUNA");
                                }
                                System.out.println("AHORA, DIGITE 3 PARA TERMINAR LA MISION");
                                tres = Integer.parseInt(sc.nextLine());
                                if (tres == 3) {
                                    System.out.println("MISION EN EL OCCIDENTE DE LA LUNA FINALIZADA");
                                    break;
                                } else {
                                    System.out.println("MISION FINALIZADA AUTOMATICAMENTE");
                                    break;
                                }
                            }
                        }
                    }

                } else {
                    System.out.println("USUARIO NO PERMITIDO");
                    break;
                }

            case 2:
                System.out.println("PARA INICIAR OTRA MISION, ESCRIBA SU NOMBRE COMPLETO A EXCEPCION DE SU ULTIMO APELLIDO EN MAYUSCULAS, Y SIN TILDES: ");
                datos = sc.nextLine();
                if (datos.equals(datos)) {
                    System.out.println("BIENVENIDO NUEVAMENTE SR. " + datos);
                    System.out.println("ASIGNAR ROBOT A OTRA MISION");
                    System.out.println("ID ROBOT USA: " + getIdRobotUno());
                    System.out.println("ID ROBOT RUSSIA: " + getIdRobotDos());
                    System.out.println("ID ROBOT CHINA: " + getIdRobotTres());
                    System.out.println("ID ROBOT INDIA: " + getIdRobotCuatro());
                    System.out.println("ID ROBOT GERMANY: " + getIdRobotCinco());
                    System.out.println("ELIJA SU ROBOT PARA LLEVAR A CABO OTRA EXPLORACION");
                    robot = Integer.parseInt(sc.nextLine());
                    if (robot == getIdRobotUno() || robot == getIdRobotDos() || robot == getIdRobotTres() || robot == getIdRobotCuatro() || robot == getIdRobotCinco()) {
                        System.out.println("USTED ELIGIO EL ROBOT: " + robot);
                    } else {
                        System.out.println("ROBOT INEXISTENTE");
                        break;
                    }
                    System.out.println("LUGARES DE EXPLORACION");
                    System.out.println("NORTE DE LA LUNA, DIGITE: 1");
                    System.out.println("SUR DE LA LUNA, DIGITE: 2");
                    System.out.println("CENTRO DE LA LUNA, DIGITE: 3");
                    System.out.println("ORIENTE DE LA LUNA, DIGITE: 4");
                    System.out.println("OCCIDENTE DE LA LUNA, DIGITE: 5");
                    System.out.println("AHORA ELIJA SU LUGAR DE EXPLORACION");
                    lugarExploracion = Integer.parseInt(sc.nextLine());
                    if (lugarExploracion == 1 || lugarExploracion == 2 || lugarExploracion == 3 || lugarExploracion == 4 || lugarExploracion == 5) {
                        System.out.println("USTED ELIGIO EL LUGAR: " + lugarExploracion);
                    } else {
                        System.out.println("LUGAR DE EXPLORACION INEXISTENTE");
                        break;
                    }
                    if (lugarExploracion == 1) {
                        for (i = 0; i < lunaNorte.length; i++) {
                            if (i == 2) {
                                System.out.println("EL ROBOT: " + robot + ", HA LLEGADO A EXPLORAR LO POSIBLE DE EXPLORACION DE LA LUNA NORTE");
                                System.out.println("EL ROBOT ENVIO LOS SIGUIENTES DATOS: ");
                                System.out.println(Arrays.deepToString(lunaNorte));
                                System.out.println("EL RECORRIDO EXPLORADO LO MARCO CON 1, PERO MOSTRO QUE EL CAMINO MAS COMPLICADO ERA EL MARCADO CON 2, MIENTRAS QUE EL CAMINO 0 ES DESCONOCIDO");
                                System.out.println("DIGITE 2 PARA RETIRAR AL ROBOT DE LA ZONA");
                                dos = Integer.parseInt(sc.nextLine());
                                if (dos == 2) {
                                    System.out.println("RETIRANDO AL ROBOT: " + robot + ", DE EL NORTE DE LA LUNA");

                                } else {
                                    System.out.println("RETIRANDO FORZOSAMENTE AL ROBOT: " + robot + ", DE EL NORTE DE LA LUNA");

                                }
                                System.out.println("AHORA, DIGITE 3 PARA TERMINAR LA MISION");
                                tres = Integer.parseInt(sc.nextLine());
                                if (tres == 3) {
                                    System.out.println("MISION EN EL NORTE DE LA LUNA FINALIZADA");
                                    break;
                                } else {
                                    System.out.println("MISION FINALIZADA AUTOMATICAMENTE");
                                    break;
                                }
                            }
                        }

                    }
                    if (lugarExploracion == 2) {
                        for (o = 0; o < lunaSur.length; o++) {
                            if (o == 2) {
                                System.out.println("EL ROBOT: " + robot + ", HA LLEGADO A EXPLORAR LO POSIBLE DE EXPLORACION DE LA LUNA SUR");
                                System.out.println("EL ROBOT ENVIO LOS SIGUIENTES DATOS: ");
                                System.out.println(Arrays.deepToString(lunaSur));
                                System.out.println("EL RECORRIDO EXPLORADO LO MARCO CON 1, PERO MOSTRO QUE EL CAMINO MAS COMPLICADO ERA EL MARCADO CON 2, MIENTRAS QUE EL CAMINO 0 ES DESCONOCIDO");
                                System.out.println("DIGITE 2 PARA RETIRAR AL ROBOT DE LA ZONA");
                                dos = Integer.parseInt(sc.nextLine());
                                if (dos == 2) {
                                    System.out.println("RETIRANDO AL ROBOT: " + robot + ", DE EL SUR DE LA LUNA");
                                } else {
                                    System.out.println("RETIRANDO FORZOSAMENTE AL ROBOT: " + robot + ", DE EL SUR DE LA LUNA");
                                }
                                System.out.println("AHORA, DIGITE 3 PARA TERMINAR LA MISION");
                                tres = Integer.parseInt(sc.nextLine());
                                if (tres == 3) {
                                    System.out.println("MISION EN EL SUR DE LA LUNA FINALIZADA");
                                    break;
                                } else {
                                    System.out.println("MISION FINALIZADA AUTOMATICAMENTE");
                                    break;
                                }
                            }

                        }
                    }
                    if (lugarExploracion == 3) {
                        for (u = 0; u < lunaCentro.length; u++) {
                            System.out.println("EL ROBOT: " + robot + ", HA LLEGADO A EXPLORAR COMPLETAMENTE EL CENTRO DE LA LUNA");
                            System.out.println("EL ROBOT ENVIO LOS SIGUIENTES DATOS: ");
                            System.out.println(Arrays.deepToString(lunaCentro));
                            System.out.println("EL RECORRIDO FUE EXITOSO, YA QUE EL ROBOT SUELE MARCAR EL PASO CON 1 CUANDO ES ACCESIBLE, Y CUANDO EL CAMINO SE VA PONIENDO MAS COMPLICADO, EL ROBOT LO SUELE SEÑALAR CON 2, Y 0 CUANDO ES DESCONOCIDO");
                            System.out.println("DIGITE 2 PARA RETIRAR AL ROBOT DE LA ZONA");
                            dos = Integer.parseInt(sc.nextLine());
                            if (dos == 2) {
                                System.out.println("RETIRANDO AL ROBOT: " + robot + ", DE EL CENTRO DE LA LUNA");
                            } else {
                                System.out.println("RETIRANDO FORZOSAMENTE AL ROBOT: " + robot + ", DE EL CENTRO DE LA LUNA");
                            }
                            System.out.println("AHORA, DIGITE 3 PARA TERMINAR LA MISION");
                            tres = Integer.parseInt(sc.nextLine());
                            if (tres == 3) {
                                System.out.println("MISION EN EL CENTRO DE LA LUNA FINALIZADA");
                                break;
                            } else {
                                System.out.println("MISION FINALIZADA AUTOMATICAMENTE");
                                break;
                            }
                        }
                    }
                    if (lugarExploracion == 4) {
                        for (a = 0; a < lunaOriente.length; a++) {
                            if (a == 2) {
                                System.out.println("EL ROBOT: " + robot + ", HA LLEGADO A EXPLORAR LO POSIBLE DE EXPLORACION DE LA LUNA ORIENTAL");
                                System.out.println("EL ROBOT ENVIO LOS SIGUIENTES DATOS: ");
                                System.out.println(Arrays.deepToString(lunaOriente));
                                System.out.println("EL RECORRIDO EXPLORADO LO MARCO CON 1, PERO MOSTRO QUE EL CAMINO MAS COMPLICADO ERA EL MARCADO CON 2, MIENTRAS QUE EL CAMINO 0 ES DESCONOCIDO");
                                System.out.println("DIGITE 2 PARA RETIRAR AL ROBOT DE LA ZONA");
                                dos = Integer.parseInt(sc.nextLine());
                                if (dos == 2) {
                                    System.out.println("RETIRANDO AL ROBOT: " + robot + ", DE EL ORIENTE DE LA LUNA");
                                } else {
                                    System.out.println("RETIRANDO FORZOSAMENTE AL ROBOT: " + robot + ", DE EL ORIENTE DE LA LUNA");
                                }
                                System.out.println("AHORA, DIGITE 3 PARA TERMINAR LA MISION");
                                tres = Integer.parseInt(sc.nextLine());
                                if (tres == 3) {
                                    System.out.println("MISION EN EL ORIENTE DE LA LUNA FINALIZADA");
                                    break;
                                } else {
                                    System.out.println("MISION FINALIZADA AUTOMATICAMENTE");
                                    break;
                                }
                            }
                        }
                    }
                    if (lugarExploracion == 5) {
                        for (e = 0; e < lunaOccidente.length; e++) {
                            if (e == 2) {
                                System.out.println("EL ROBOT: " + robot + ", HA LLEGADO A EXPLORAR LO POSIBLE DE EXPLORACION DE LA LUNA OCCIDENTAL");
                                System.out.println("EL ROBOT ENVIO LOS SIGUIENTES DATOS: ");
                                System.out.println(Arrays.deepToString(lunaOccidente));
                                System.out.println("EL RECORRIDO EXPLORADO LO MARCO CON 1, PERO MOSTRO QUE EL CAMINO MAS COMPLICADO ERA EL MARCADO CON 2, MIENTRAS QUE EL CAMINO 0 ES DESCONOCIDO");
                                System.out.println("DIGITE 2 PARA RETIRAR AL ROBOT DE LA ZONA");
                                dos = Integer.parseInt(sc.nextLine());
                                if (dos == 2) {
                                    System.out.println("RETIRANDO AL ROBOT: " + robot + ", DE EL OCCIDENTE DE LA LUNA");
                                } else {
                                    System.out.println("RETIRANDO FORZOSAMENTE AL ROBOT: " + robot + ", DE EL OCCIDENTE DE LA LUNA");
                                }
                                System.out.println("AHORA, DIGITE 3 PARA TERMINAR LA MISION");
                                tres = Integer.parseInt(sc.nextLine());
                                if (tres == 3) {
                                    System.out.println("MISION EN EL OCCIDENTE DE LA LUNA FINALIZADA");
                                    break;
                                } else {
                                    System.out.println("MISION FINALIZADA AUTOMATICAMENTE");
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("USUARIO NO PERMITIDO");
                    break;
                }

            case 3:
                System.out.println("CARACTERISTICAS DE LOS ROBOTS");
                System.out.println("ID ROBOT USA: " + getIdRobotUno());
                System.out.println("ID ROBOT RUSSIA: " + getIdRobotDos());
                System.out.println("ID ROBOT CHINA: " + getIdRobotTres());
                System.out.println("ID ROBOT INDIA: " + getIdRobotCuatro());
                System.out.println("ID ROBOT GERMANY: " + getIdRobotCinco());
                System.out.println("DIGITE LA ID DEL ROBOT PARA CONOCER ACERCA DE SU HISTORIAL: ");
                int historial = Integer.parseInt(sc.nextLine());
                if (historial == getIdRobotUno()) {
                    System.out.println("ROBOT USA");
                    System.out.println("GENERACION DEL ROBOT: " + getGeneracionRobotUno());
                    System.out.println("PORCENTAJE DE BATERIA/EFICACIA: " + getPorcentajeBateriaRobotUno());
                    System.out.println("EL ROBOT 101010, FUE DISEÑADO POR LA NASA Y SPACE X");
                    System.out.println("EL ROBOT 101010, NACIO CON EL FIN DE REVOLUCIONAR LAS INVESTIGACIONES ESPACIALES ESTADOUNIDENSES");
                    System.out.println("EL PRIMERO EN PROPONER ESTE ROBOT, FUE EL PRESIDENTE BARACK OBAMA EN 2010");
                    break;
                } else if (historial == getIdRobotDos()) {
                    System.out.println("ROBOT RUSSIA");
                    System.out.println("GENERACION DEL ROBOT: " + getGeneracionRobotDos());
                    System.out.println("PORCENTAJE DE BATERIA/EFICACIA: " + getPorcentajeBateriaRobotDos());
                    System.out.println("EL ROBOT 202020, FUE DISEÑADO EN LA ANTIGUA UNION SOVIETICA");
                    System.out.println("EL ROBOT 202020, NACIO CON EL FIN DE COMPETIR EN LAS INVESTIGACIONES ESPACIALES EN CONTRA DE ESTADOS UNIDOS");
                    System.out.println("EL ROBOT 202020, FUE LLEVADO A CABO POR EL PRESIDENTE DE LA ANTIGUA URSS, MIJAIL GORBACHOV EN 1980");
                    break;
                } else if (historial == getIdRobotTres()) {
                    System.out.println("ROBOT CHINA");
                    System.out.println("GENERACION DEL ROBOT: " + getGeneracionRobotTres());
                    System.out.println("PORCENTAJE DE BATERIA/EFICACIA: " + getPorcentajeBateriaRobotTres());
                    System.out.println("EL ROBOT 303030, FUE DISEÑADO EN LA CHINA DE MAO ZEDONG");
                    System.out.println("EL ROBOT 303030, NACIO CON EL FIN DE REFORZAR LAS INVESTIGACIONES ESPACIALE ASIATICAS, DE LA MANO DE COREA DEL NORTE");
                    System.out.println("EL ROBOT 303030, FUE PUESTO EN MARCHA POR EL PRESIDENTE CHINO MAO ZEDONG, Y EL PRESIDENTE NORCOREANO KIM JONG IL EN 1975");
                    break;
                } else if (historial == getIdRobotCuatro()) {
                    System.out.println("ROBOT INDIA");
                    System.out.println("GENERACION DEL ROBOT: " + getGeneracionRobotCuatro());
                    System.out.println("PORCENTAJE DE BATERIA/EFICACIA: " + getPorcentajeBateriaRobotCuatro());
                    System.out.println("EL ROBOT 404040, NACIO DESPUES DE LA INDIA COLONIAL");
                    System.out.println("EL ROBOT 404040, NACIO CON EL FIN DE INDEPENDIZARSE DE LA INFLUENCIA BRITANICA A INICIOS DEL SIGLO XX");
                    System.out.println("EL ROBOT 404040, FUE CREADO EN HONOR A LOS IDEALES REVOLUCIONARIOS DE EL INDIO MAHATMA GANDHI EN 1950");
                    break;
                } else if (historial == getIdRobotCinco()) {
                    System.out.println("ROBOT GERMANY");
                    System.out.println("GENERACION DEL ROBOT: " + getGeneracionRobotCinco());
                    System.out.println("PORCENTAJE DE BATERIA/EFICACIA: " + getPorcentajeBateriaRobotCinco());
                    System.out.println("EL ROBOT 505050, NACIO DESPUES DE UNA ALEMANIA DESTRUIDA A CAUSA DE 2 GUERRAS MUNDIALES");
                    System.out.println("EL ROBOT 505050, FUE UNA DE LAS BASES DE LA ALEMANIA DE LA ACTUALIDAD");
                    System.out.println("EL ROBOT 505050, DIO SU PRIMER PASO EN 1948, SIN EMBARGO, ADOLF HITLER FUE EL QUIEN REALMENTE PUSO EN MARCHA ESTE PROYECTO");
                    break;
                } else {
                    System.out.println("ID INEXISTENTE");
                    break;
                }
            default:
                break;

        }

    }

    public String getDatos() {
        return datos;
    }

    public int getIdRobotUno() {
        return idRobotUno;
    }

    public int getIdRobotDos() {
        return idRobotDos;
    }

    public int getIdRobotTres() {
        return idRobotTres;
    }

    public int getIdRobotCuatro() {
        return idRobotCuatro;
    }

    public int getIdRobotCinco() {
        return idRobotCinco;
    }

    public int getGeneracionRobotUno() {
        return generacionRobotUno;
    }

    public int getGeneracionRobotDos() {
        return generacionRobotDos;
    }

    public int getGeneracionRobotTres() {
        return generacionRobotTres;
    }

    public int getGeneracionRobotCuatro() {
        return generacionRobotCuatro;
    }

    public int getGeneracionRobotCinco() {
        return generacionRobotCinco;
    }

    public String getPorcentajeBateriaRobotUno() {
        return porcentajeBateriaRobotUno;
    }

    public String getPorcentajeBateriaRobotDos() {
        return porcentajeBateriaRobotDos;
    }

    public String getPorcentajeBateriaRobotTres() {
        return porcentajeBateriaRobotTres;
    }

    public String getPorcentajeBateriaRobotCuatro() {
        return porcentajeBateriaRobotCuatro;
    }

    public String getPorcentajeBateriaRobotCinco() {
        return porcentajeBateriaRobotCinco;
    }

}

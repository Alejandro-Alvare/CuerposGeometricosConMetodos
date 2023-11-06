import java.util.Scanner;

public class CuerposGeometricosConMetodos {

    static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
         int opc = MostrarMenu();
         desarrollarPrisma(opc);    desarrollarZonaEsferica(opc);       desarrollarHexaedro(opc);     desarrollarTroncoDePiramide(opc);
         desarrollarCilindro(opc);  desarrollarCasqueteEsferico(opc);   desarrollarOctaedro(opc);     desarrollarSalir(opc);
         desarrollarPiramide(opc);  desarrollarHusoYcunaEsferica(opc);  desarrollarDodecaedro(opc);
         desarrollarCono(opc);      desarrollarOrtoedro(opc);           desarrollarIcosaedro(opc);
         desarrollarEsfera(opc);    desarrollarTetraedro(opc);          desarrollarTroncoDeCono(opc);
    }

    public static int MostrarMenu(){
        System.out.println("Seleccione el cuerpo geometrico:");
        System.out.println("1.  Prisma");
        System.out.println("2.  Cilindro");
        System.out.println("3.  Piramide");
        System.out.println("4.  Cono");
        System.out.println("5.  Esfera");
        System.out.println("6.  Zona esférica");
        System.out.println("7.  Casquete esférico");
        System.out.println("8.  Huso esférico y cuña esférica");
        System.out.println("9.  Ortoedro");
        System.out.println("10. Tetraedro");
        System.out.println("11. Hexaedro");
        System.out.println("12. Octaedro");
        System.out.println("13. Dodecaedro");
        System.out.println("14. Icosaedro");
        System.out.println("15. Tronco de cono");
        System.out.println("16. Tronco de pirámide");
        System.out.println("17. Salir");

        int opc = lector.nextInt();
        return opc;
    }
    public static void desarrollarPrisma(int opc){
        switch (opc){
            case 1:
            System.out.println("1. Prisma");
            System.out.print("Cantidad de lados: ");
                int n = lector.nextInt();
                System.out.print("Longitud de los lados: ");
                double l = lector.nextDouble();
                System.out.print("Altura: ");
                double h = lector.nextDouble();
                System.out.println("El area lateral es " + calcularAreaLateral(n,l,h));
                System.out.println("El area total es " + calcularAreaTotal(n,l,h));
                System.out.println("El volumen es " + calcularVolumen(n,l,h));
                break;

            default:
                break;
                
               
        }
                
    }
    
            public static double calcularAreaLateral(int n,double l,double h){
            return (n*l*h);
        }
        public static double calcularAreaTotal(int n,double l, double h){
            double alfa = (360/n)*(Math.PI/180);
            double apotema = l/(2*Math.tan(alfa/2));
            double areaBase = ((n*l)*apotema)/2;
            return areaBase;
        }
        public static double calcularVolumen(int n, double l, double h){
            double alfa = (360/n)*(Math.PI/180);
            double apotema = l/(2*Math.tan(alfa/2));
            double areaBase = ((n*l)*apotema)/2;
            return (areaBase*h);
        }

        public static void desarrollarCilindro(int opc){
            switch (opc){
                case 2:
                System.out.println("2. Cilindro");
                System.out.print("Radio: ");
                int r = lector.nextInt();
                System.out.print("Altura: ");
                double h = lector.nextDouble();

                System.out.println("El Area Lateral es " +calcularAreaLateral(r, h) );
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El Area Total es " + calcularAreaTotal(r, h));
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El volumen es " + calcularVolumen( r, h));
                break;

                default:
                break;
        

            }
        }

        public static double CalcularAreaLateral(int r, double h){
            return (2 * Math.PI * r * h);
        }
        public static double CalcularAreaTotal(int r, double h){
            double areaBase = Math.PI * Math.pow(r, 2);
            return (2 * areaBase);
        }
        public static double CalcularVolumen(int r, double h){
            double areaBase = Math.PI * Math.pow(r, 2);
            return (areaBase * h);
        }

        public static void desarrollarPiramide(int opc){
            switch (opc){
                case 3:
                System.out.println("3. Piramide");
                System.out.print("Cantidad de lados: ");
                int n = lector.nextInt();
                System.out.print("Perimetro de la base: ");
                double p = lector.nextDouble();
                System.out.print("Altura: ");
                double h = lector.nextDouble();
                System.out.print("Longitud de lados: ");
                double l = lector.nextDouble();

                
        System.out.println("El Area Lateral es " + calcularAreaLateral(n, p, l, h));
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("El Area Total es " + calcularAreaTotal(n, p, l, h) );
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
        System.out.println("El Volumen es " + calcularVolumen(n, p, l, h));
        break;
         default:
         break;

            }
        }

        public static double calcularAreaLateral(int n, double p, double l, double h){
            double delta = (Math.PI/180) * (360/n);
            double apotema = l / (2 * Math.tan((delta)/2));
            double ApotemaPiramide = Math.pow(h, 2) + Math.pow(apotema, 2);
            return (p * ApotemaPiramide) / 2;
        }
        public static double calcularAreaTotal(int n, double p, double l, double h){
            double areaBase = p * h;
            return areaBase;

        }
        public static double calcularVolumen(int n, double p, double l, double h){
            return (p * h) / 2;
        }

        public static void desarrollarCono(int opc){
            switch (opc){
                case 4:
                System.out.println("4. Cono");
                System.out.print("Radio: ");
                int r = lector.nextInt();
                System.out.print("Altura: ");
                double h = lector.nextDouble();

                System.out.println("El Area Lateral es " + calcularAreaLateral(r, h));
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El Area Total es " + calcularAreaTotal(r, h) );
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El Volumen es " + calcularVolumen(r, h));

                break;
                default:
                break;

            }
        }
        public static double calcularAreaLateral(int r, double h){
            double Generatriz = Math.pow(h, 2) + Math.pow(r, 2);
            return (Math.PI * r * Generatriz);

        }
        public static double calcularAreaTotal(int r, double h){
            double areaBase = Math.PI * Math.pow(r, 2);
            return areaBase;
        }
        public static double calcularVolumen(int r, double h){
            return ((Math.PI * Math.pow(r, 2) * h) / 3); 
        }
     
         public static void desarrollarEsfera(int opc){
            switch(opc){
                 case 5:
                 System.out.println("5. Esfera");
                 System.out.print("Radio: ");
                 int r = lector.nextInt();

                 System.out.println("El Area es " + calcularArea(r));
                 System.out.println(":::::::::::::::::::::::::::::::::::");
                 System.out.println("El volumen es " + calcularVolumen(r));

                 break;
                 default:
                 break;
            }
         } 
         public static double calcularArea(int r){
            double Area = 4 * Math.PI * (Math.pow(r, 2));
            return Area;
         }
         public static double calcularVolumen(int r){
            double Volumen = (4 / 3) * Math.PI * Math.pow(r, 3);
            return Volumen;
         }

         public static void desarrollarZonaEsferica(int opc){
            switch(opc){
                case 6:
                System.out.println("6.  Zona esférica");
                System.out.print("Altura: ");
                double h = lector.nextDouble();
                System.out.print("Radio Mayor: ");
                int R = lector.nextInt();
                System.out.print("Radio: ");
                int r = lector.nextInt();

                System.out.println("El Area es " + calcularArea(h, R, r));
                System.out.println(":::::::::::::::::::::::::::::::::::::::");
                System.out.println("El volumen es " + calcularVolumen(h, R, r));

                break;
                default:
                break;
            }
         }
         public static double calcularArea(double h, int R, int r){
            double Area = (2 * Math.PI * R * h);
            return Area;
         }
         public static double calcularVolumen(double h, int R, int r){
            double lota = Math.pow(h, 2);
            double chi = (3 * Math.pow(r, 2));
            double alpha = (3 * Math.pow(r, 2));
            double Volumen = Math.PI * h * ((lota) + (chi) + (alpha)) / 6;
            return Volumen;
         }

         public static void desarrollarCasqueteEsferico(int opc){
            switch (opc){
                case 7:
                System.out.println("7.  Casquete esférico");
                System.out.print("Radio Mayor: ");
                int R = lector.nextInt();
                System.out.print("Altura: ");
                double h = lector.nextDouble();

                System.out.println("El Area es " + calcularArea(h, R));
                System.out.println(":::::::::::::::::::::::::::::::::::::::");
                System.out.println("El volumen es " + calcularVolumen(h, R));

                break;
                default:
                break;

            }
         }

         public static double calcularArea(double h, int R){
            double Area = (2 * Math.PI * R * h);
            return Area;
         }
         public static double calcularVolumen(double h, int R){
            double xi = (3 * R);
            double Volumen = Math.PI * Math.pow(h, 2) * ((xi) - h) / 3;
            return Volumen;
         }

         public static void desarrollarHusoYcunaEsferica(int opc){
            switch (opc){
                case 8:
                System.out.println("8.  Huso esférico y cuña esférica");
                System.out.print("Radio: ");
                int r = lector.nextInt();
                System.out.print("Numero de grados: ");
                double NG = lector.nextDouble();

                System.out.println("El Area es " + calcularAreaHuso(r, NG));
                System.out.println(":::::::::::::::::::::::::::::::::::::::");
                System.out.println("El volumen es " + calcularVolumenCuna(r, NG));

                break;
                default:
                break;

            }
         }

        public static double calcularAreaHuso(int r, double NG){
            double AreaHuso = 4 * Math.PI * Math.pow(r, 2) * NG / 360;
            return AreaHuso;
        }
        public static double calcularVolumenCuna(int r, double NG){
            double nu = Math.PI * Math.pow(r, 3);
            double VolumenCuna = 4 / 3 * ((nu) * NG) / 360;
            return VolumenCuna;
        }

        public static void desarrollarOrtoedro(int opc){
            switch (opc){
                case 9:
                System.out.println("9.  Ortoedro");
                System.out.print("Medida A: ");
                double MA = lector.nextDouble();
                System.out.print("Medida B: ");
                double MB = lector.nextDouble();
                System.out.print("Medida C: ");
                double MC = lector.nextDouble();

                System.out.println("El Area es " + calcularArea(MA, MB, MC));
                System.out.println(":::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El Volumen es " + calcularVolumen(MA, MB, MC));
                System.out.println(":::::::::::::::::::::::::::::::::::::::::");
                System.out.println("La Diagonal es " + calcularDiagonal(MA, MB, MC));

                break;
                default:
                break;

            }
        }
        public static double calcularArea(double MA, double MB, double MC){
            double zeta = (MA * MB);
            double eta = (MA * MC);
            double tau = (MB * MC);
            double Area = 2 * ((zeta) * (eta) * (tau));
            return Area;
        }
        public static double calcularVolumen(double MA, double MB, double MC){
            double Volumen = MA * MB * MC;
            return Volumen;
        }
        public static double calcularDiagonal(double MA, double MB, double MC){
            double Kappa = (MA * MA);
            double theta = (MB * MB);
            double sigma = (MC * MC);
            double omega = ((Kappa) + (theta) + (sigma));
            double Diagonal = Math.sqrt((omega));
            return Diagonal;
        }

        public static void desarrollarTetraedro(int opc){
            switch (opc){
                case 10:
                System.out.println("10. Tetraedro");
                System.out.print("Longitud de las aristas: ");
                double LGA = lector.nextDouble();

                System.out.println("El Area es " + CalcularArea(LGA));
                System.out.println(":::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El Volumen es " + CalcularVolumen(LGA));
                System.out.println(":::::::::::::::::::::::::::::::::::::::::");
                System.out.println("La Diagonal es " + calcularAltura(LGA));
                break;
                default:
                break;

            }
        }
        
        public static double CalcularArea(double LGA){
            double Area = Math.pow(LGA, 2) * Math.sqrt(3);
            return Area;
        }
        public static double CalcularVolumen(double LGA){
            double Volumen = Math.sqrt(2) / 12 * Math.pow(LGA, 2);
            return Volumen;
        }
        public static double calcularAltura(double LGA){
            double Altura = LGA * (Math.sqrt(6) / 3);
            return Altura;
        }

         public static void desarrollarHexaedro(int opc){
            switch (opc){
                case 11:
                System.out.println("11. Hexaedro");
                System.out.print("Longitud de Aristas: ");
                double LGA = lector.nextDouble();

                System.out.println("El Area es " + calcularArea(LGA));
                System.out.println(":::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El Volumen es " + calcularVolumen(LGA));
                System.out.println(":::::::::::::::::::::::::::::::::::::::::");
                System.out.println("La Diagonal es " + calcularDiagonal(LGA));

                break;
                default:
                break;
            }
        }
        public static double calcularArea(double LGA){
            double Area = 6 * Math.pow(LGA, 2);
            return Area;
        }
        public static double calcularVolumen(double LGA){
            double Volumen = Math.pow(LGA, 3);
            return Volumen;
        }
        public static double calcularDiagonal(double LGA){
            double Diagonal = LGA * Math.sqrt(3);
            return Diagonal;
        }

        public static void desarrollarOctaedro(int opc){
            switch (opc) {
                case 12:
                System.out.println("12. Octaedro");
                System.out.print("Longitud de Aristas: ");
                double LGA = lector.nextDouble();

                System.out.println("El Area es " + calculararea(LGA));
                System.out.println(":::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El Volumen es " + calcularvolumen(LGA));

                break;
                default:
                break;
                    
                    
            }
        }
        public static double calculararea(double LGA){
            double Area = 2 * Math.pow(LGA, 2) * Math.sqrt(3);
            return Area;
        }
        public static double calcularvolumen(double LGA){
            double Volumen = Math.sqrt(2) / 3 * Math.pow(LGA, 3);
            return Volumen;
        }
        
        public static void desarrollarDodecaedro(int opc){
            switch (opc){
                case 13:
                System.out.println("13. Dodecaedro");
                System.out.print("Longitud de aristas: ");
                double LGA = lector.nextDouble();
                System.out.print("Valor de la apotema: ");
                double Apo = lector.nextDouble();
                System.out.print("Longitud del lado pentagonal: ");
                double LGP = lector.nextDouble();

                System.out.println("El Area Pentagonal es " + calcularAreaPentagonal(LGA, Apo, LGP));
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El Area es " + calcularAreaDode(LGA, Apo, LGP));
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El Volumen es " + calcularVolumenDode(LGA, Apo, LGP));

                break;
                default:
                break;
            }
        }
           public static double calcularAreaPentagonal(double LGA, double Apo, double LGP){
            double APenta = 5 * LGP * Apo / 2;
            return APenta;

        }
        public static double calcularAreaDode(double LGA, double Apo, double LGP){
            double epsilon = (25 + (10 * Math.sqrt(5)));
            double Area = 3 * (Math.pow(LGA, 2)) * Math.sqrt(epsilon);
            return Area;
        }
        public static double calcularVolumenDode(double LGA, double Apo, double LGP){
            double Volumen = (15 + 7 * Math.sqrt(5)) * Math.pow(LGA, 3) / 4;
            return Volumen;
        }
        
        public static void desarrollarIcosaedro(int opc){
            switch (opc){
                case 14:
                System.out.println("14. Icosaedro");
                System.out.print("Longitud de las aristas: ");
                double LGA = lector.nextDouble();

                System.out.println("El Area es " + calcularAreaIco(LGA));
                System.out.println(":::::::::::::::::::::::::::::::::::::::");
                System.out.println("El Volumen es " + calcularVolumenIco(LGA));

                break;
                default:
                break;
            }
        }

        public static double calcularAreaIco(double LGA){
            double Area = 5 * (Math.pow(LGA, 2) * Math.sqrt(3));
            return Area;
        }
        public static double calcularVolumenIco(double LGA){
            double Volumen = 5 * (3 + Math.sqrt(5) * Math.pow(LGA, 3)) / 12;
            return Volumen;
        }

        public static void desarrollarTroncoDeCono(int opc){
            switch (opc){
                case 15:
                System.out.println("15. Tronco de cono");
                System.out.print("Valor de la Altura: ");
                double h = lector.nextDouble();
                System.out.print("Radio mayor: ");
                int R = lector.nextInt();
                System.out.print("Radio menor: ");
                int r = lector.nextInt();

                System.out.println("El Area Lateral es " + calcularAreaLateral(h, R, r));
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El Area Total es " + calcularAreaTotal(h, R, r));
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El volumen es " + calcularVolumenTDC(h, R, r));

                break; 
                default:
                break;
            }
        }
        public static double calcularAreaLateral(double h, int R, int r){
            double rat = Math.pow(R - r, 2);
            double Generatriz = Math.sqrt(Math.pow(h, 2) + rat);
            double AreaLateral = Math.PI * Generatriz * (R + r);
            return AreaLateral;
        }
        public static double calcularAreaTotal(double h, int R, int r){
            //AreaBaseMayor + AreaBaseMenor
            double AreaBaseMayorTAreaBaseMenor = Math.PI * (Math.pow(R, 2) + Math.pow(r, 2));
            double rat = Math.pow(R - r, 2);
            double Generatriz = Math.sqrt(Math.pow(h, 2) + rat);
            double AreaTotal = Math.PI * Generatriz * (R + r);
            return(AreaTotal + AreaBaseMayorTAreaBaseMenor);
        }
        public static double calcularVolumenTDC(double h, int R, int r){
            double Volumen = Math.PI * h / 3 * (Math.pow(R, 2) + Math.pow(r, 2) + R * r);
            return Volumen;
        }

        public static void desarrollarTroncoDePiramide(int opc){
            switch (opc){
                case 16:
                System.out.println("16. Tronco de pirámide");
                System.out.print("Valor de la apotema: ");
                double Apo = lector.nextDouble();
                System.out.print("Perimetro base mayor: ");
                double PBM = lector.nextDouble();
                System.out.print("Perimetro base menor: ");
                double PBm = lector.nextDouble();
                System.out.print("Altura: ");
                double h = lector.nextDouble();
                System.out.print("Area base mayor: ");
                double ABM = lector.nextDouble();
                System.out.print("Area base menor: ");
                double ABm = lector.nextDouble();

                System.out.println("El Area lateral es " + calcularAreaLateral(Apo, PBM, PBm, h, ABM, ABm));
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El Area Total es " + calcularAreaTotal(Apo, PBM, PBm, h, ABM, ABm));
                System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("El Volumen es " + calcularVolumen(Apo, PBM, PBm, h, ABM, ABm));

                break;
                default:
                break;

            }
        }
        public static double calcularAreaLateral(double Apo, double PBM, double PBm, double h, double ABM, double ABm){
            double AreaLateral = PBM + PBm / 2 * Apo;
            return AreaLateral;
        }
        public static double calcularAreaTotal(double Apo, double PBM, double PBm, double h, double ABM, double ABm){
            double PI = ABM + ABm;
            double AreaTotal = PBM + PBm / 2 * Apo;
            return(AreaTotal + PI);
        }
        public static double calcularVolumen(double Apo, double PBM, double PBm, double h, double ABM, double ABm){
            double Volumen = h / 3 * (ABM + ABm + Math.sqrt(ABM * ABm));
            return Volumen;
        }
     
       public static void desarrollarSalir(int opc){
        switch (opc){
            case 17:
            System.out.println("17. Salir");

            break;

            default:
                System.out.println("Opcion incorrecta/no valida.");
                System.out.println("Saliendo de la App");
                break;


        }


       }

    
        

        

    }

        

        


package LechuCV;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		
		String nombre = "";
		String puestoActual = "";
		String sobreMi = "";
		ArrayList<Experiencia> experiencia = new ArrayList<Experiencia>();
		ArrayList<Educacion> educacion = new ArrayList<Educacion>();
		ArrayList<Habilidad> habilidades = new ArrayList<Habilidad>();
		
		int numExperiencia = 0;
		String anInicio = "";
		String anFin = "";
		String nombreEmpresa = "";
		String descripcionPuesto = "";
		int numTituEduca = 0;
		String nombreTitulo = "";
		String nombreUniversidad = "";
		String descripTitulo = "";
		int numHabilidades = 0;
		String nombreHabilidad = "";
		String porHabilidad = "";
		String direccion = "";
		String telefono = "";
		String correoElectronico = "";
		String web = "";
		String nickFacebook = "";
		String nickTwitter = "";
		String nickYoutube = "";
		String nickLinkedin = "";
		
		
		System.out.println("*************************************");
		System.out.println("Bienvenido/a al creador de CV en JAVA");
		System.out.println("*************************************");
		
		System.out.println("Nombre: ");
		nombre = sc.nextLine();
		System.out.println("***************");
		System.out.println("Puesto Actual: ");
		System.out.println("***************");
		puestoActual = sc.nextLine();
		System.out.println("**********");
		System.out.println("Dirección: ");
		System.out.println("***********");
		direccion = sc.nextLine();
		System.out.println("**********");
		System.out.println("Teléfono: ");
		System.out.println("***********");
		telefono = sc.nextLine();
		System.out.println("**********");
		System.out.println("Correo Electrónico: ");
		System.out.println("***********");
		correoElectronico = sc.nextLine();
		System.out.println("**********");
		System.out.println("Web: ");
		System.out.println("***********");
		web = sc.nextLine();
		System.out.println("**********");
		System.out.println("Nick Facebook: ");
		System.out.println("***********");
		nickFacebook = sc.nextLine();
		System.out.println("**********");
		System.out.println("Nick Twitter: ");
		System.out.println("***********");
		nickTwitter = sc.nextLine();
		System.out.println("**********");
		System.out.println("Nick YouTube: ");
		System.out.println("***********");
		nickYoutube = sc.nextLine();
		System.out.println("**********");
		System.out.println("Nick Linkedin: ");
		System.out.println("***********");
		nickLinkedin = sc.nextLine();
		System.out.println("**********");
		System.out.println("Sobre mi: ");
		System.out.println("***********");
		sobreMi = sc.nextLine();
		System.out.println("****************************************");
		System.out.println("¿En cuantos trabajos ha estado hantes?: ");
		System.out.println("****************************************");
		numExperiencia = sn.nextInt();
		System.out.println("************************************");
		for (int i = 0; i < numExperiencia; i++) {
			System.out.println("----- Tranajo Nº " + (i+1) + " -----");
			System.out.println("Año de inicio: ");
			anInicio = sc.nextLine();
			System.out.println("********************************************");
			System.out.println("Año de fin (En caso de Actual dejar vacío): ");
			anFin = sc.nextLine();
			System.out.println("**********************");
			System.out.println("Nombre de la empresa: ");
			nombreEmpresa = sc.nextLine();
			System.out.println("********************");
			System.out.println("Descripción Puesto: ");
			descripcionPuesto = sc.nextLine();
			System.out.println("********************");
			if(anFin.isBlank()) {
				anFin = "Puesto Actual";
			}
			Experiencia experienciaTemp = new Experiencia(anInicio,anFin,nombreEmpresa,descripcionPuesto);
			experiencia.add(experienciaTemp);
			System.out.println("************************************");
		}
		
		System.out.println("¿Cuántos títulos educativos tiene?: ");
		numTituEduca = sn.nextInt();
		System.out.println("************************************");
		for (int i = 0; i < numTituEduca; i++) {
			System.out.println("----- Título Nº " + (i+1) + " -----");
			System.out.println("Año de inicio: ");
			anInicio = sc.nextLine();
			System.out.println("***************");
			System.out.println("Año de fin (En caso de Actual dejar vacío): ");
			anFin = sc.nextLine();
			System.out.println("*******************");
			System.out.println("Nombre del Título: ");
			nombreTitulo = sc.nextLine();
			System.out.println("**************************");
			System.out.println("Nombre de la Universidad: ");
			nombreUniversidad = sc.nextLine();
			System.out.println("************************");
			System.out.println("Descripción del título: ");
			descripTitulo = sc.nextLine();
			System.out.println("************************");
			
			
			if(anFin.isEmpty()) {
				anFin = "Puesto Actual";
			}
			Educacion educacionTemp = new Educacion(anInicio,anFin,nombreTitulo,nombreUniversidad,descripTitulo);
			educacion.add(educacionTemp);
			System.out.println("*****************************");
		}
		
		System.out.println("¿Cuántas habilidades tiene?: ");
		numHabilidades = sn.nextInt();
		
		for (int i = 0; i < numHabilidades; i++) {
			System.out.println("----- Habilidad Nº " + (i+1) + " -----");
			System.out.println("Nombre: ");
			//LIMITAR EL NÚMERO DE CARACTERES
			nombreHabilidad = sc.nextLine();
			System.out.println("***************");
			System.out.println("Porcentaje de habilidad: ");
			porHabilidad = sc.nextLine();
			System.out.println("***************");
			Habilidad habilidadTemp = new Habilidad(nombreHabilidad,porHabilidad);
			habilidades.add(habilidadTemp);
			System.out.println("*****************************");
			
		}
		
		
		int opcHobby = 0;
		
		ArrayList<String> hobbyes = new ArrayList<String>();
		System.out.println("********* Selecione 4 HOBBYS de la siguiente lista *********");
		System.out.println("0) Videojuegos");
		System.out.println("1) Leer");
		System.out.println("2) Música");
		System.out.println("3) Naturaleza");
		System.out.println("4) Ciencia");
		System.out.println("5) Viajar");
		System.out.println("6) Espacio");
		for (int i = 0; i < 4; i++) {
			System.out.println("******* Hobby " + i + " *******");
			opcHobby = sn.nextInt();
			switch (opcHobby) {
				case 0:
					if (!hobbyes.contains("<i class=\"fas fa-gamepad\"></i>")) {
						hobbyes.add("<i class=\"fas fa-gamepad\"></i>");
						System.out.println("Ha seleccionado: Videojuegos");
					}else {
						System.out.println("Ese Hobby ya ha sido seleccionado.");
						i--;
					}
					break;
				case 1:
					if (!hobbyes.contains("<i class=\"fas fa-book\"></i>")) {
						hobbyes.add("<i class=\"fas fa-book\"></i>");
						System.out.println("Ha seleccionado: Leer");
					}else {
						System.out.println("Ese Hobby ya ha sido seleccionado.");
						i--;
					}
					break;
				case 2:
					if (!hobbyes.contains("<i class=\"fas fa-music\"></i>")) {
						hobbyes.add("<i class=\"fas fa-music\"></i>");
						System.out.println("Ha seleccionado: Música");
					}else {
						System.out.println("Ese Hobby ya ha sido seleccionado.");
						i--;
					}
					break;
				case 3:
					if (!hobbyes.contains("<i class=\"fab fa-pagelines\"></i>")) {
						hobbyes.add("<i class=\"fab fa-pagelines\"></i>");
						System.out.println("Ha seleccionado: Naturaleza");
					}else {
						System.out.println("Ese Hobby ya ha sido seleccionado.");
						i--;
					}
					break;
				case 4:
					if (!hobbyes.contains("<i class=\"fas fa-vial\"></i>")) {
						hobbyes.add("<i class=\"fas fa-vial\"></i>");
						System.out.println("Ha seleccionado: Ciencia");
					}else {
						System.out.println("Ese Hobby ya ha sido seleccionado.");
						i--;
					}
					break;
				case 5:
					if (!hobbyes.contains("<i class=\"fas fa-plane-departure\"></i>")) {
						hobbyes.add("<i class=\"fas fa-plane-departure\"></i>");
						System.out.println("Ha seleccionado: Viajar");
					}else {
						System.out.println("Ese Hobby ya ha sido seleccionado.");
						i--;
					}
					break;
				case 6:
					if (!hobbyes.contains("<i class=\"fas fa-rocket\"></i>")) {
						hobbyes.add("<i class=\"fas fa-rocket\"></i>");
						System.out.println("Ha seleccionado: Espacio");
					}else {
						System.out.println("Ese Hobby ya ha sido seleccionado.");
						i--;
					}
					break;
			}
			
		}
		
		String hobbysFinales = "";
		for (int i = 0; i < hobbyes.size(); i++) {
			hobbysFinales = hobbysFinales + "<li>" + hobbyes.get(i) + "</li>\r\n";
		}
		
		int opc = 0;
		do {
			System.out.println("********* Selecione una opción *********");
			System.out.println("1) Generar CV");
			System.out.println("2) Cambiar Color Principal del CV");
			System.out.println("3) Salir");
			opc = sn.nextInt();
			
			switch (opc) {
				case 1:
					String ruta = "Modelo1/Index.html";
					File fichero = new File(ruta);
					
					String linea = "<!DOCTYPE html>\r\n"
							+ "<html lang=\"en\">\r\n"
							+ "<head>\r\n"
							+ "	<meta charset=\"iso-8859-1\">\r\n"
							+ "	<title>Currículum - " + nombre + "</title>\r\n"
							+ "	<link rel=\"stylesheet\" href=\"styles.css\">\r\n"
							+ "	<script src=\"https://kit.fontawesome.com/b99e675b6e.js\"></script>\r\n"
							+ "</head>\r\n"
							+ "<body>\r\n"
							+ "\r\n"
							+ "<div class=\"resume\">\r\n"
							+ "   <div class=\"resume_left\">\r\n"
							+ "     <div class=\"resume_profile\">\r\n"
							+ "       <img src=\"https://i.imgur.com/eCijVBe.png\" alt=\"profile_pic\">\r\n"
							+ "     </div>\r\n"
							+ "     <div class=\"resume_content\">\r\n"
							+ "       <div class=\"resume_item resume_info\">\r\n"
							+ "         <div class=\"title\">\r\n"
							+ "           <p class=\"bold\">"+ nombre + "</p>\r\n"
							+ "           <p class=\"regular\">" + puestoActual +"</p>\r\n"
							+ "         </div>\r\n"
							+ "         <ul>\r\n"
							+ "           <li>\r\n"
							+ "             <div class=\"icon\">\r\n"
							+ "               <i class=\"fas fa-map-signs\"></i>\r\n"
							+ "             </div>\r\n"
							+ "             <div class=\"data\">\r\n"
							+ "               "+ direccion +"\r\n"
							+ "             </div>\r\n"
							+ "           </li>\r\n"
							+ "           <li>\r\n"
							+ "             <div class=\"icon\">\r\n"
							+ "               <i class=\"fas fa-mobile-alt\"></i>\r\n"
							+ "             </div>\r\n"
							+ "             <div class=\"data\">\r\n"
							+ "               "+ telefono +"\r\n"
							+ "             </div>\r\n"
							+ "           </li>\r\n"
							+ "           <li>\r\n"
							+ "             <div class=\"icon\">\r\n"
							+ "               <i class=\"fas fa-envelope\"></i>\r\n"
							+ "             </div>\r\n"
							+ "             <div class=\"data\">\r\n"
							+ "               "+ correoElectronico +"\r\n"
							+ "             </div>\r\n"
							+ "           </li>\r\n"
							+ "           <li>\r\n"
							+ "             <div class=\"icon\">\r\n"
							+ "               <i class=\"fab fa-weebly\"></i>\r\n"
							+ "             </div>\r\n"
							+ "             <div class=\"data\">\r\n"
							+ "               "+ web +"\r\n"
							+ "             </div>\r\n"
							+ "           </li>\r\n"
							+ "         </ul>\r\n"
							+ "       </div>\r\n"
							+ "       <div class=\"resume_item resume_skills\">\r\n"
							+ "         <div class=\"title\">\r\n"
							+ "           <p class=\"bold\">Habilidades</p>\r\n"
							+ "         </div>\r\n"
							+ "         <ul>\r\n";
							linea = linea + Main.habilidades(habilidades);
							linea = linea 
							+ "         </ul>\r\n"
							+ "       </div>\r\n"
							+ "       <div class=\"resume_item resume_social\">\r\n"
							+ "         <div class=\"title\">\r\n"
							+ "           <p class=\"bold\">Social</p>\r\n"
							+ "         </div>\r\n"
							+ "         <ul>\r\n";
							 if (!nickFacebook.isEmpty()) {
							linea = linea
							+ "           <li>\r\n"
							+ "             <div class=\"icon\">\r\n"
							+ "               <i class=\"fab fa-facebook-square\"></i>\r\n"
							+ "             </div>\r\n"
							+ "             <div class=\"data\">\r\n"
							+ "               <p class=\"semi-bold\">Facebook</p>\r\n"
							+ "               <p>"+ nickFacebook + "@facebook</p>\r\n"
							+ "             </div>\r\n"
							+ "           </li>\r\n";
							 }
							 if (!nickTwitter.isEmpty()) {
							linea = linea
							+ "           <li>\r\n"
							+ "             <div class=\"icon\">\r\n"
							+ "               <i class=\"fab fa-twitter-square\"></i>\r\n"
							+ "             </div>\r\n"
							+ "             <div class=\"data\">\r\n"
							+ "               <p class=\"semi-bold\">Twitter</p>\r\n"
							+ "               <p>"+ nickTwitter +"@twitter</p>\r\n"
							+ "             </div>\r\n"
							+ "           </li>\r\n";
							 }
							 if (!nickYoutube.isEmpty()) {
							linea = linea
							+ "           <li>\r\n"
							+ "             <div class=\"icon\">\r\n"
							+ "               <i class=\"fab fa-youtube\"></i>\r\n"
							+ "             </div>\r\n"
							+ "             <div class=\"data\">\r\n"
							+ "               <p class=\"semi-bold\">Youtube</p>\r\n"
							+ "               <p>"+ nickYoutube +"@youtube</p>\r\n"
							+ "             </div>\r\n"
							+ "           </li>\r\n";
							 }
							 if (!nickLinkedin.isEmpty()) {
							linea = linea
							+ "           <li>\r\n"
							+ "             <div class=\"icon\">\r\n"
							+ "               <i class=\"fab fa-linkedin\"></i>\r\n"
							+ "             </div>\r\n"
							+ "             <div class=\"data\">\r\n"
							+ "               <p class=\"semi-bold\">Linkedin</p>\r\n"
							+ "               <p>"+ nickLinkedin +"@linkedin</p>\r\n"
							+ "             </div>\r\n"
							+ "           </li>\r\n";
							}
							linea = linea
							+ "         </ul>\r\n"
							+ "       </div>\r\n"
							+ "     </div>\r\n"
							+ "  </div>\r\n"
							+ "  <div class=\"resume_right\">\r\n"
							+ "    <div class=\"resume_item resume_about\">\r\n"
							+ "        <div class=\"title\">\r\n"
							+ "           <p class=\"bold\">Sobre mi</p>\r\n"
							+ "         </div>\r\n"
							+ "        <p>" + sobreMi + "</p>\r\n"
							+ "    </div>\r\n"
							+ "    <div class=\"resume_item resume_work\">\r\n"
							+ "        <div class=\"title\">\r\n"
							+ "           <p class=\"bold\">EXPERIENCIA LABORAL</p>\r\n"
							+ "         </div>\r\n"
							+ "        <ul>\r\n";
							linea = linea + Main.experiencia(experiencia);
							linea = linea
							+ "        </ul>\r\n"
							+ "    </div>\r\n"
							+ "    <div class=\"resume_item resume_education\">\r\n"
							+ "      <div class=\"title\">\r\n"
							+ "           <p class=\"bold\">Educación</p>\r\n"
							+ "         </div>\r\n"
							+ "      <ul>\r\n";
							linea = linea + Main.educacion(educacion);
							linea= linea
							+ "        </ul>\r\n"
							+ "    </div>\r\n"
							+ "    <div class=\"resume_item resume_hobby\">\r\n"
							+ "      <div class=\"title\">\r\n"
							+ "           <p class=\"bold\">Hobby</p>\r\n"
							+ "         </div>\r\n"
							+ "       <ul>\r\n"
							+ hobbysFinales
							+ "      </ul>\r\n"
							+ "    </div>\r\n"
							+ "  </div>\r\n"
							+ "</div>\r\n"
							+ "\r\n"
							+ "</body>\r\n"
							+ "</html>";
							
							try {
								BufferedWriter bw = new BufferedWriter(new FileWriter(fichero, false));
								bw.write(linea);
								bw.close();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
							System.out.println("¡¡Felicidades!!, su CV se ha generado correctamente en: " + fichero.getAbsolutePath());
							System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
							break;
				case 2:
					int opc2 = 0;
					System.out.println("********** Seleccione un color para el CV **********");
					System.out.println("1) Azul");
					System.out.println("2) Rojo");
					System.out.println("3) Verde");
					System.out.println("4) Amarillo");
					System.out.println("5) Rosa");
					opc2 = sn.nextInt();
					
					switch (opc2) {
						case 1:
							Main.generarCss("#0bb5f4", "#009fd9", "#b1eaff");
							System.out.println("**** Color cambiado: Azul ****");
							System.out.println("**** Recuerde volver a generar el CV para ver los cambios ****");
							break;
						case 2:
							Main.generarCss("#914848", "#6b3636", "#f0f0f0");
							System.out.println("**** Color cambiado: Rojo ****");
							System.out.println("**** Recuerde volver a generar el CV para ver los cambios ****");
							break;
						case 3:
							Main.generarCss("#579148", "#46753a", "#f0f0f0");
							System.out.println("**** Color cambiado: Verde ****");
							System.out.println("**** Recuerde volver a generar el CV para ver los cambios ****");
							break;
						case 4:
							Main.generarCss("#8c9148", "#75793b", "#f0f0f0");
							System.out.println("**** Color cambiado: Amarillo ****");
							System.out.println("**** Recuerde volver a generar el CV para ver los cambios ****");
							break;
						case 5:
							Main.generarCss("#8b4891", "#632e68", "#f0f0f0");
							System.out.println("**** Color cambiado: Rosa ****");
							System.out.println("**** Recuerde volver a generar el CV para ver los cambios ****");
							break;
						
					}
					break;

				case 3:
					System.out.println("Saliendo...");
					break;
				default:
					System.out.println("*******************************");
					System.out.println("Esta opción no está contemplada");
					System.out.println("*******************************");
					
					
			}
				
		}while(opc!=3);
	}
	
	public static void generarCss(String color, String color2, String color3){
		
		String ruta = "Modelo1/styles.css";
		File fichero = new File(ruta);
		
		String linea = "@import url(\"https://fonts.googleapis.com/css?family=Montserrat:400,500,700&display=swap\");\r\n"
				+ "\r\n"
				+ "* {\r\n"
				+ "  margin: 0;\r\n"
				+ "  padding: 0;\r\n"
				+ "  box-sizing: border-box;\r\n"
				+ "  list-style: none;\r\n"
				+ "  font-family: \"Montserrat\", sans-serif;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "body {\r\n"
				+ "  background: #585c68;\r\n"
				+ "  font-size: 14px;\r\n"
				+ "  line-height: 22px;\r\n"
				+ "  color: #555555;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".bold {\r\n"
				+ "  font-weight: 700;\r\n"
				+ "  font-size: 20px;\r\n"
				+ "  text-transform: uppercase;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".semi-bold {\r\n"
				+ "  font-weight: 500;\r\n"
				+ "  font-size: 16px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume {\r\n"
				+ "  width: 800px;\r\n"
				+ "  height: auto;\r\n"
				+ "  display: flex;\r\n"
				+ "  margin: 50px auto;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_left {\r\n"
				+ "  width: 280px;\r\n"
				+ "  background:"+ color +";\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_left .resume_profile {\r\n"
				+ "  width: 100%;\r\n"
				+ "  height: 280px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_left .resume_profile img {\r\n"
				+ "  width: 100%;\r\n"
				+ "  height: 100%;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_left .resume_content {\r\n"
				+ "  padding: 0 25px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .title {\r\n"
				+ "  margin-bottom: 20px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_left .bold {\r\n"
				+ "  color: #fff;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_left .regular {\r\n"
				+ "  color:" + color3 + ";\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_item {\r\n"
				+ "  padding: 25px 0;\r\n"
				+ "  border-bottom: 2px solid" + color3 + ";\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_left .resume_item:last-child,\r\n"
				+ ".resume .resume_right .resume_item:last-child {\r\n"
				+ "  border-bottom: 0px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_left ul li {\r\n"
				+ "  display: flex;\r\n"
				+ "  margin-bottom: 10px;\r\n"
				+ "  align-items: center;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_left ul li:last-child {\r\n"
				+ "  margin-bottom: 0;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_left ul li .icon {\r\n"
				+ "  width: 35px;\r\n"
				+ "  height: 35px;\r\n"
				+ "  background: #fff;\r\n"
				+ "  color:"+ color +";\r\n"
				+ "  border-radius: 50%;\r\n"
				+ "  margin-right: 15px;\r\n"
				+ "  font-size: 16px;\r\n"
				+ "  position: relative;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .icon i,\r\n"
				+ ".resume .resume_right .resume_hobby ul li i {\r\n"
				+ "  position: absolute;\r\n"
				+ "  top: 50%;\r\n"
				+ "  left: 50%;\r\n"
				+ "  transform: translate(-50%, -50%);\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_left ul li .data {\r\n"
				+ "  color:" + color3+ ";\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_left .resume_skills ul li {\r\n"
				+ "  display: flex;\r\n"
				+ "  margin-bottom: 10px;\r\n"
				+ "  color:" + color3 + ";\r\n"
				+ "  justify-content: space-between;\r\n"
				+ "  align-items: center;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_left .resume_skills ul li .skill_name {\r\n"
				+ "  width: 25%;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_left .resume_skills ul li .skill_progress {\r\n"
				+ "  width: 60%;\r\n"
				+ "  margin: 0 5px;\r\n"
				+ "  height: 5px;\r\n"
				+ "  background:" + color2 +";\r\n"
				+ "  position: relative;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_left .resume_skills ul li .skill_per {\r\n"
				+ "  width: 15%;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_left .resume_skills ul li .skill_progress span {\r\n"
				+ "  position: absolute;\r\n"
				+ "  top: 0;\r\n"
				+ "  left: 0;\r\n"
				+ "  height: 100%;\r\n"
				+ "  background: #fff;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_left .resume_social .semi-bold {\r\n"
				+ "  color: #fff;\r\n"
				+ "  margin-bottom: 3px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_right {\r\n"
				+ "  width: 520px;\r\n"
				+ "  background: #fff;\r\n"
				+ "  padding: 25px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_right .bold {\r\n"
				+ "  color:" + color + ";\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_right .resume_work ul,\r\n"
				+ ".resume .resume_right .resume_education ul {\r\n"
				+ "  padding-left: 40px;\r\n"
				+ "  overflow: hidden;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_right ul li {\r\n"
				+ "  position: relative;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_right ul li .date {\r\n"
				+ "  font-size: 16px;\r\n"
				+ "  font-weight: 500;\r\n"
				+ "  margin-bottom: 15px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_right ul li .info {\r\n"
				+ "  margin-bottom: 20px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_right ul li:last-child .info {\r\n"
				+ "  margin-bottom: 0;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_right .resume_work ul li:before,\r\n"
				+ ".resume .resume_right .resume_education ul li:before {\r\n"
				+ "  content: \"\";\r\n"
				+ "  position: absolute;\r\n"
				+ "  top: 5px;\r\n"
				+ "  left: -25px;\r\n"
				+ "  width: 6px;\r\n"
				+ "  height: 6px;\r\n"
				+ "  border-radius: 50%;\r\n"
				+ "  border: 2px solid" + color + ";\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_right .resume_work ul li:after,\r\n"
				+ ".resume .resume_right .resume_education ul li:after {\r\n"
				+ "  content: \"\";\r\n"
				+ "  position: absolute;\r\n"
				+ "  top: 14px;\r\n"
				+ "  left: -21px;\r\n"
				+ "  width: 2px;\r\n"
				+ "  height: 115px;\r\n"
				+ "  background:" + color +";\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_right .resume_hobby ul {\r\n"
				+ "  display: flex;\r\n"
				+ "  justify-content: space-between;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_right .resume_hobby ul li {\r\n"
				+ "  width: 80px;\r\n"
				+ "  height: 80px;\r\n"
				+ "  border: 2px solid" + color + ";\r\n"
				+ "  border-radius: 50%;\r\n"
				+ "  position: relative;\r\n"
				+ "  color:" + color + ";\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_right .resume_hobby ul li i {\r\n"
				+ "  font-size: 30px;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_right .resume_hobby ul li:before {\r\n"
				+ "  content: \"\";\r\n"
				+ "  position: absolute;\r\n"
				+ "  top: 40px;\r\n"
				+ "  right: -52px;\r\n"
				+ "  width: 50px;\r\n"
				+ "  height: 2px;\r\n"
				+ "  background:" + color + ";\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ ".resume .resume_right .resume_hobby ul li:last-child:before {\r\n"
				+ "  display: none;\r\n"
				+ "}\r\n"
				+ "";
		
				try {
					BufferedWriter bw = new BufferedWriter(new FileWriter(fichero, false));
					bw.write(linea);
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}
	
	
	public static String habilidades(ArrayList<Habilidad> habilidades){
		String linea = "";
		for (int i = 0; i < habilidades.size(); i++) {
			linea = linea
			+ "           <li>\r\n"
			+ "             <div class=\"skill_name\">\r\n"
			+                habilidades.get(i).getNombreHabilidad() + "\r\n"
			+ "             </div>\r\n"
			+ "             <div class=\"skill_progress\">\r\n"
			+ "               <span style=\"width: " + habilidades.get(i).getPorHabilidad() +"%\"></span>\r\n"
			+ "             </div>\r\n"
			+ "             <div class=\"skill_per\"> " + habilidades.get(i).getPorHabilidad() + "%</div>\r\n"
			+ "           </li>";
		}
		return linea;
	}
	
	public static String experiencia(ArrayList<Experiencia> experiencia){
		String linea = "";
		for (int i = 0; i < experiencia.size(); i++) {
			linea = linea
			+ "            <li>\r\n"
			+ "                <div class=\"date\">"+ experiencia.get(i).getAnoInicio() + " - " +  experiencia.get(i).getAnoFin() +  "</div> \r\n"
			+ "                <div class=\"info\">\r\n"
			+ "                     <p class=\"semi-bold\">"+ experiencia.get(i).getNombreEmpresa() + "</p> \r\n"
			+ "                  <p>" + experiencia.get(i).getDescPuesto() + "</p>\r\n"
			+ "                </div>\r\n"
			+ "            </li>";
		}
		return linea;
	}
	
	public static String educacion(ArrayList<Educacion> educacion){
		String linea = "";
		for (int i = 0; i < educacion.size(); i++) {
			linea = linea
			+ "<li>\r\n"
			+ "                <div class=\"date\">" + educacion.get(i).getAnoInicio()  + " - " +  educacion.get(i).getAnoFin() + "</div> \r\n"
			+ "                <div class=\"info\">\r\n"
			+ "                     <p class=\"semi-bold\">" + educacion.get(i).getNombreTitulo() +" (" + educacion.get(i).getNombreUniver() + ")" +"</p> \r\n"
			+ "                  <p>"+ educacion.get(i).getDescTitulo() +"</p>\r\n"
			+ "                </div>\r\n"
			+ "            </li>";
		}
		return linea;
	}

}


package clases;

import java.util.StringTokenizer;


public class Respuestas {
    
 String respuestas[] = {
 
     "Una vez al año",
     "2300 años",
     "En el año 1844",
     "Por los seres humanos",
     "Juicio investigador.",
     "Cristo Jesús",
     "Daniel 8 14",
     "Si después de los 2300 años",
     "Querubines",
     "El que es injusto lo siga siendo y el que es justo que lo siga practicando",
     "Intercediendo ante el padre por nosotros",
     "El juicio donde los libros serán abiertos",
     "Porque Jesucristo es nuestro abogado",
     "Todas las anteriores",
     "La única forma de que el ser humano tenga contacto con Dios",
     "Símbolo de la justicia de cristo",
     "Representan a todas las huestes angelicales que observan atentamente la voluntad de Dios",
     "La separación de Dios por causa de los pecados",
     "La muerte del hijo de Dios por los pecadores",
     "Yom kippur",
     "Satanás",
     "Símbolo de la cruz",
     "El santuario terrenal es un modelo del celestial",
     "Moisés",
     "La vida perfecta y sin mancha de cristo como hombre",
     "El espíritu santo",
     "Símbolo de la obra de cristo en la tierra",
     "VERDADERO"
 
 
 };   
    
     
 String posibles[] = {
 
 "Todos los días,Cada 6 meses,Una vez al año,Cada semana",
 "1000 años,1300 años,2000 años,2300 años",
 "En el año 1844,En el año 1868,En el año 1902,En el año 1921.",
 "Por los adventistas,Por los seres humanos,Por la paz mundial,Por los judíos",           
 "Visita de ángeles,Unción del espíritu santo,Juicio investigador,Plan profético",
 "Apóstol Pedro,Cristo Jesús,Espíritu Santo,Moisés", 
 "Daniel 8 14,Daniel 7 12,Daniel 10 17,Daniel 15 2",
 "Si después de los 2300 años,No pues siendo un lugar celestial no lo necesita,Depende de la decisión que Dios tome,El santuario ya está siendo purificado",
 "Querubín,Querubines,Querubines,Querubines",
 "Que todos adoren a Dios el rey de reyes por la eternidad,Que cada uno de los seres humanos sean salvos por misericordia,El que es injusto lo siga siendo y el que es justo que lo siga practicando,El injusto servirá a Dios para su perdón y el justo le ayudara",
 "Poniéndonos a prueba,Juzgando nuestros pecados,Intercediendo ante el padre por nosotros,Meditando en qué hacer",
 "Una nueva tierra para los seres humanos,El juicio donde los libros serán abiertos,Un sueño donde veremos lo que siempre anhelamos,La transformación de la tierra en un nuevo cielo",
 "Porque todos seremos salvos finalmente,Ninguno será condenado en el juicio,Ninguno se perderá e ira al cielo por misericordia,Porque Jesucristo es nuestro abogado",
 "Al cielo,Al lugar santo,Al lugar santísimo,Todas las anteriores",
 "Porque cristo desea ser juez,La única forma de que el ser humano tenga contacto con Dios,Protocolos celestiales,La necesidad de Cristo para juzgar al humano",
 "La presencia de los ángeles,Símbolo de la perfección de Dios,Símbolo de la justicia de cristo,Llamamiento del espíritu santo",
 "Representan a todas las huestes angelicales que observan atentamente la voluntad de Dios,Representaban la omnipresencia de Dios,Representaba la bondad de Dios hacia los hombres,Representaba la hermandad que tenían los ángeles en el cielo",
 "La diferenciación de los dos lugares,La separación de Dios por causa de los pecados,La reconciliación de Dios con su pueblo,La jerarquización de la divinidad ante el pecado del hombre",
 "Muerte del pecado,Nuevo pacto para con Dios,La muerte del hijo de Dios por los pecadores,La resurrección del hijo de Dios",
 "Hal halim,Al jalali,Dam yurel,Yom kippur",
 "Los Ángeles,El espíritu santo,Satanás,Los elegidos",
 "Símbolo del poder de Dios,Símbolo de la cruz,Símbolo de la unción,Símbolo de reconciliación",
 "Que los dos santuarios son hechos por Dios,Los dos santuarios eran idénticamente iguales,Moisés habito en los dos santuarios,El santuario terrenal es un modelo del celestial",
 "Aarón,Abraham,Moisés,Jacob",
 "La vida perfecta y sin mancha de cristo como hombre,La vida abundante ofrecida por Dios,La renovación del pacto con Dios,Símbolo de los diez mandamientos",
 "Los pecados del hombre,El espíritu santo,La reconciliación,La santidad de cristo",
 "Símbolo de reverencia a Dios,Símbolo de gratitud por sus bondades,Símbolo de la obra de cristo en la tierra,Ninguna de las anteriores",
 "VERDADERO,FALSO",
 
 };
 
 
 public String getRespuestas(int posicion){
 
 return respuestas[posicion];
 
 }
 
 public String[] separa( String cadena, String separador){
 
 StringTokenizer token = new StringTokenizer(cadena,separador);
     
 String[] aux = new String[4];
 int i = 0;
 
 while(token.hasMoreTokens()){
 
 aux[i] = token.nextToken();
 
 i++;
     
 }
 
 return aux;
 }
 
 public String[] setRespuestas(int posicion){
 
 String s1 = posibles[posicion];
 
 String[] s2 = separa(s1,",");
 
 return s2;
 
 
 }
 
 
 
}

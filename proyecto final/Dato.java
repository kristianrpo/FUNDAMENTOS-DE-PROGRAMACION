/**
 * Esta clase determina los atributos de los objetos que seran leidos del csv y seran guardados
 * 
 * @author Felipe Martinez, Kristian Retrepo y Luisa Álvarez 
 * @version 1.0
 * 
 */


public class Dato
{
  private String station;
  private String name;
  private String country;
  private String date;
  private double prcp;
  private double tavg;
  private double tmax;
  private double tmin;


  /**
   * Este es el constructor por defecto
   */
  public Dato(){}
  /**
   * Constructor de Dato con todos los atributos de la clase Dato
   */
  public Dato(String station, String name, String country, String date, double prcp, double tavg, double tmax, double tmin)
  {
    this.station =station;
    this.name = name;
    this.country = country;
    this.date = date;
    this.prcp = prcp;
    this.tavg = tavg;
    this.tmax = tmax;
    this.tmin = tmin;
  }
  
  /**
   * Contenedor getter station
   * @return valor de station
   */
  public String getStation()
  {
    return this.station;
  }

  /**
   * Contenedor getter name
   * @return valor de name
   */
  public String getName()
  {
    return this.name;
  }
  
  /**
   * Contenedor getter country
   * @return valor de country
   */
  public String getCountry()
  {
    return this.country;
  }
  
  /**
   * Contenedor getter date
   * @return valor de date
   */
  public String getDate()
  {
    return this.date;
  }
  
  /**
   * Contenedor getter prcp
   * @return valor de prcp
   */
  public double getPrcp()
  {
    return this.prcp;
  }
  
  /**
   * Contenedor getter tavg
   * @return valor de tavg
   */
  public double getTavg()
  {
    return this.tavg;
  }
  
  /**
   * Contenedor getter tmax
   * @return valor de tmax
   */
  public double getTmax()
  {
    return this.tmax;
  }
  
  /**
   * Contenedor getter tmin
   * @return valor de tmin
   */
  public double getTmin()
  {
    return this.tmin;
  }

  /**
   * Contenedor del modificador de station
   * @param valor de station
   */
  public void setStation(String station)
  {
    this.station = station;
  }

  /**
   * Contenedor del modificador de name
   * @param valor de name
   */
  public void setName(String name)
  {
    this.name = name;
  }

  /**
   * Contenedor del modificador de country
   * @param valor de country
   */
  public void setCountry(String country)
  {
    this.country = country;
  }
  
  /**
   * Contenedor del modificador de date
   * @param valor de date
   */
  public void setDate(String date)
  {
    this.date = date;
  }
  
  /**
   * Contenedor del modificador de prcp
   * @param valor de prcp
   */
  public void setPrcp(double prcp)
  {
    this.prcp = prcp;
  }
  
  /**
   * Contenedor del modificador de tavg
   * @param valor de tavg
   */
  public void setTavg(double tavg)
  {
    this.tavg = tavg;
  }
  
  /**
   * Contenedor del modificador de tmax
   * @param valor de tmax
   */
  public void setTmax(double tmax)
  {
    this.tmax = tmax;
  }
  
  /**
   * Contenedor del modificador de tmin
   * @param valor de tmin
   */
  public void setTmin(double tmin)
  {
    this.tmin = tmin;
  }
}

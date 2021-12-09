public class HealthCard{
  private long healthCardNumber;
  private String versionCode;
  private final String DEFAULT_VERSION = "AB";
  private final long DEFAULT_NUMBER = 1234567890l;

  public HealthCard(){
    this.healthCardNumber = DEFAULT_NUMBER;
    this.versionCode = DEFAULT_VERSION;
  }
  public HealthCard(long healthCardNumber, String versionCode){
    this.healthCardNumber = healthCardNumber;
    this.versionCode = versionCode;
  }
  public long getHealthCardNumber(){
    return healthCardNumber;
  }
  public String getVersionCode(){
    return versionCode;
  }
  public String toString(){
    return healthCardNumber + versionCode;
  }
}
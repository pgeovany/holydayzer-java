import java.util.HashMap;
import java.util.Map;

public class Holidays {
  private HashMap<String, String> holidays = new HashMap<String, String>();

  public void setHoliday(String date, String name) {
    this.holidays.put(date, name);
  }

  public void getHolidays() {
    for(Map.Entry<String,String> set: this.holidays.entrySet()) {
      System.out.println(set.getKey() + " => " + set.getValue());
    }
  }

  public void getHolidayByDate(String date) {
    String holiday = this.holidays.get(date);

    if (holiday != null) {
      System.out.println(holiday);
    } else {
      System.out.println("Não existe nenhum feriado com essa data!");
    }
  }
}

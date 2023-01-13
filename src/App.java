public class App {
    public static void main(String[] args) throws Exception {
        Holidays brazilianHoliadays = new Holidays();
        brazilianHoliadays.setHoliday("01/01/2023", "Confraterinzação mundial");
        brazilianHoliadays.setHoliday("21/02/2023", "Carnaval");
        brazilianHoliadays.setHoliday("17/04/2023", "Páscoa");
        brazilianHoliadays.setHoliday("01/05/2023", "Tiradentes");
        brazilianHoliadays.setHoliday("08/06/2023", "Corpus Christi");
        brazilianHoliadays.setHoliday("07/09/2023", "Independência do Brasil");
        brazilianHoliadays.setHoliday("12/10/2023", "Nossa Senhora Aparecida");
        brazilianHoliadays.setHoliday("02/11/2023", "Finados");
        brazilianHoliadays.setHoliday("15/11/2023", "Proclamação da República");
        brazilianHoliadays.setHoliday("25/12/2023", "Natal");

        // imprime todos os feriados
        brazilianHoliadays.getHolidays();

        // imprime um feriado existente na lista
        brazilianHoliadays.getHolidayByDate("01/01/2023");

        // imprime a mensagem de que o feriado não existe
        brazilianHoliadays.getHolidayByDate("01/01/2022");
    }
}

package MainController.Maksim;

public class Controller {
    public static void main(String[] args) {
        Car car = new Car();
        Controller controller = new Controller();
        System.out.println(controller.getAllZero("0193120-9sd-09fads-09gasd09asd9-0"));
        car.setColor(CarColor.WHITE);
        System.out.println(controller.getNumberFromString("213123125151"));
        //  System.out.println(controller.getNumberFromString("f9023uq4ri 9-iur09=q0"));
        System.out.println(controller.getAllSpaces("oirq 3oir4i23409231i04 9i12093 i109=23ib0=429"));
        System.out.println(controller.getStringInReverseOrder("Hello World!"));
        System.out.println(controller.getSumNumbOfStr("99999"));
    }

    public Long getNumberFromString(String s) {
        try {
            return Long.parseLong(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (long) -1;
    }

    public Integer getAllZero(String s) {
        char[] temp = s.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (temp[i] == '0') {
                count++;
            }
        }
        return count;
    }

    public Integer getAllSpaces(String s) {
        char[] temp = s.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (temp[i] == ' ') {
                count++;
            }
        }
        return count;
    }

    public String getStringInReverseOrder(String s) {
        char[] tempArr = s.toCharArray();
        StringBuilder returnString = new StringBuilder();
        for (int i = tempArr.length - 1; i >= 0; i--) {
            returnString.append(tempArr[i]);
        }
        return returnString.toString();
    }

    public Integer getSumNumbOfStr(String s) {
        int sum = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            sum += Character.digit(ch[i], 10);
        }
        return sum;
    }
}

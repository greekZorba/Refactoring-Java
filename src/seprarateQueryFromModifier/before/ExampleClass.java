package seprarateQueryFromModifier.before;

/**
 * 보안 시스템의 침입자 이름을 알려주고 경고 메시지를 보내는 함수이다.
 * 이 함수의 규칙은 침입자가 둘 이상일 때도 경고가 한 번만 송신되어야 한다는 점이다.
 *
 * */
public class ExampleClass {

    void checkSecurity(String[] people) {
        String found = foundMiscreant(people);
        someLaterCode(found);
    }

    /**
     * 해당 메서드는 sendAlert라는 상태변경 메서드와
     * 침입자 이름(값)을 반환하는 메서드가 동시에 존재한다.
     * */
    String foundMiscreant(String[] people) {

        for (int i = 0; i < people.length; i++) {

            if(people[i].equals("minsu")) {
                sendAlert();
                return "minsu";
            }

            if(people[i].equals("ironMan")) {
                sendAlert();
                return "ironMan";
            }
        }

        return "";
    }

    void sendAlert(){
        // send alert when intruder enter
    }

    void someLaterCode(String found) {
        // some later logic
    }


    public static void main(String[] args) {
        ExampleClass example = new ExampleClass();
        String[] people = new String[]{"zorba", "minsu", "ironMan"};
        example.checkSecurity(people);
    }
}

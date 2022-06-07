public class Course {
    String result;
    private int fence;
    //private int pit;
    
    public Course (int fence, int pit){
        this.fence = fence;
        //this.pit = pit;
    }
    public String doIt(Team team) {
        result = "Команда номер: " + team.getName()+ " " + '\n';
        for (Participant participant: team.getPeoples()) {
            result += "имя участника:" + participant.getName() + " " + '\n';
            int value = participant.getHasMaxJumpHeight();
            value = participant.getHasMaxJumpLength();
            testFence(value);
            //testPit(value);
        }
        return result;
    }
    private void testFence(int value) {
        if(value>fence) result += "Забор преодолён " + '\n';
        else if(value<fence) result +="Забор не преодолён" + '\n';  // не могу вспомнить, как вывести на экран "забор не преодолен" при несоблюдении условия
    }
    //private void testPit (int value) {
        //if(value>pit) result += "Яма перепрыгнута" + '\n';

    }



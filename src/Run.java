public class Run {
    public static void main(String[] args) {
        Participant[] participant = new Participant[4];
        participant[0] = new Participant("Mary",1, 1);
        participant[1] = new Participant("Bob", 3, 2);
        participant[2] = new Participant("Alex", 1, 2);
        participant[3] = new Participant("John", 2, 2);
        Team team = new Team("Команда1", participant);

        Course course = new Course(1,3);
        String result = course.doIt(team);
        System.out.println(result);

    }
}

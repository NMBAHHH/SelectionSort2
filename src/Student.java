public class Student implements Comparable<Student> {
    private  String name;
    private  int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student another){
        if(this.score < another.score)
            return -1;
        else if(this.score == another.score)
            return 0;
        return 1;
    }

    @Override
    public String toString(){
        return String.format("Student(name: %s, score: %d)",name, score);

    }
}


